package com.ews.dao;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.hibernate.Query;

public interface IDao<T> {

	public T find(Class<T> clazz, int id);

	public void create(T baseBean);

	public void save(T baseBean);
	
	public void update(T baseBean);

	public void delete(T baseBean);
	
	public List<T> list(String hql);

	public int getTotalCount(String hql, Object... params);

	public List<T> list(String hql, int firstResult, int maxSize,
			Object... params);

	public Query createQuery(String hql);	
}
