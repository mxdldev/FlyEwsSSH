package com.ews.service;

import java.util.List;


import com.ews.bean.Eauser;
import com.ews.util.MD5Util;

public class EauserService<T extends Eauser> extends Service<T> implements IEauserService<T> {

	@SuppressWarnings("unchecked")
	public T getEauser(String username, String password) {		
		List<T> list = this.getDao().list("from Eauser t where t.aname='"+username+"' and t.adeleted=0");
		if (list.size() > 0){			
			T eauser = list.get(0);
			if(eauser.getApass().equals(MD5Util.md5s(password))){
				return eauser;
			}else{
				return null;
			}
		}else{			
			return null;
		}	
	}
}
