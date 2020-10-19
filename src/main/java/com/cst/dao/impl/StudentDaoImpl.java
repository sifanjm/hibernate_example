package com.cst.dao.impl;

import com.cst.dao.StudentDao;
import com.cst.dao.common.impl.BaseHibernateDAO;
import com.cst.model.Student;
import org.springframework.stereotype.Repository;

@Repository
public class StudentDaoImpl extends BaseHibernateDAO<Student> implements StudentDao {
}
