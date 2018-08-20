package com.ews.service;

import com.ews.bean.Eauser;

public interface IEauserService<T extends Eauser> extends IService<T> {
	public T getEauser(String username, String password);
}
