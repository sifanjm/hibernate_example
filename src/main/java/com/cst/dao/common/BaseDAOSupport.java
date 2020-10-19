package com.cst.dao.common;

import java.io.Serializable;
import java.util.List;

public interface BaseDAOSupport<T> {

	public T save(T t);

	public T get(Class<T> t, Serializable id);

	public void delete(T t);

	public void merge(T t);

	public void update(T t);

	public List<T> getRecordsList(Class<T> t);

}
