package com.ews.service;

import java.util.List;

public interface IService<T> {

	public T find(Class<T> clazz, int id);

	public void create(T baseBean);

	public void save(T baseBean);
    
	public void update(T baseBean);
	
	public void delete(T baseBean);

	public List<T> list(String hql);

	public int getTotalCount(String hql, Object... params);

	public List<T> list(String hql, int firstResult, int maxSize,
			Object... params);
}
