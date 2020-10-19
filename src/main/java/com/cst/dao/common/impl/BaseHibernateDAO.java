package com.cst.dao.common.impl;

import com.cst.dao.common.BaseDAOSupport;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.io.Serializable;
import java.util.List;

@Transactional
public abstract class BaseHibernateDAO<T> implements BaseDAOSupport<T> {

	@Autowired
    SessionFactory sessionFactory;

	protected Session getSession() {
		return sessionFactory.getCurrentSession();
	}

	public T save(T t) {
		Session session = getSession();
		session.save(t);
		return t;
	}

	public T get(Class<T> t, Serializable id) {
		Session session = getSession();
		T t1 = session.get(t, id);
		return t.cast(t1);
	}

	public void delete(T t) {
		Session session = getSession();
		session.delete(t);
	}

	public void merge(T t) {
		Session session = getSession();
		session.merge(t);
	}

	public void update(T t) {
		Session session = getSession();
		session.update(t);
	}

	public List<T> getRecordsList(Class<T> t) {
		Session currentSession = getSession();
		CriteriaBuilder criteriaBuilder = currentSession.getCriteriaBuilder();
		CriteriaQuery criteriaQuery = criteriaBuilder.createQuery(t);
		Root<T> root = criteriaQuery.from(t);
		criteriaQuery.select(root);
		Query query = currentSession.createQuery(criteriaQuery);
		return query.getResultList();
	}

}
