package com.ews.service;

import java.util.List;

import com.ews.dao.IDao;
public class Service<T> implements IService<T> {

	protected IDao<T> dao;

	public IDao<T> getDao() {
		return dao;
	}

	public void setDao(IDao<T> dao) {
		this.dao = dao;
	}

	public T find(Class<T> clazz, int id) {
		return dao.find(clazz, id);
	}

	public void create(T baseBean){
		dao.create(baseBean);
	};

	public void delete(T baseBean) {
		dao.delete(baseBean);
	}

	public int getTotalCount(String hql, Object... params) {
		return dao.getTotalCount(hql, params);
	}

	public void save(T baseBean) {
		dao.save(baseBean);
	}

	public List<T> list(String hql) {
		return dao.list(hql);
	}

	public List<T> list(String hql, int firstResult, int maxSize,
			Object... params) {
		return dao.list(hql, firstResult, maxSize, params);
	}

	public void update(T baseBean) {
		// TODO Auto-generated method stub
		dao.update(baseBean);
	}
}
