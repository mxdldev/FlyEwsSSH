
package com.ews.dao;


import java.util.List;
import org.hibernate.Query;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;


public class Dao<T> extends HibernateDaoSupport implements IDao<T> {

	@SuppressWarnings("unchecked")
	public T find(Class<T> clazz, int id) {
		return (T) getHibernateTemplate().get(clazz, id);
	}

	public void create(T baseBean) {
		getHibernateTemplate().persist(baseBean);
	}

	public Query createQuery(String hql) {
		return getSession().createQuery(hql);
	}

	public void delete(T baseBean) {
		getHibernateTemplate().delete(baseBean);
	}

	@SuppressWarnings("unchecked")
	public List<T> list(String hql) {
		return getHibernateTemplate().find(hql);
	}

	public int getTotalCount(String hql, Object... params) {
		Query query = createQuery(hql);
		for (int i = 0; params != null && i < params.length; i++)
			query.setParameter(i + 1, params[i]);
		Object obj = createQuery(hql).uniqueResult();
		return ((Long) obj).intValue();
	}

	@SuppressWarnings("unchecked")
	public List<T> list(String hql, int firstResult, int maxResults,
			Object... params) {
		Query query = createQuery(hql);
		for (int i = 0; params != null && i < params.length; i++)
			query.setParameter(i + 1, params[i]);
		List<T> list = createQuery(hql).setFirstResult(firstResult)
				.setMaxResults(maxResults).list();
		return list;
	}

	public void save(T baseBean) {
		getHibernateTemplate().save(baseBean);
	}

	public void update(T baseBean) {
		getHibernateTemplate().update(baseBean);
		
	}
}
