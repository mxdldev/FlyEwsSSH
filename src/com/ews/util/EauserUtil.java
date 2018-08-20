package com.ews.util;

import org.apache.struts2.ServletActionContext;

import com.ews.bean.Eauser;

public class EauserUtil {
	public static final String EAUSER_INFO = "eauserInfo";
	public static EauserInfo getEauser(){
		return (EauserInfo)ServletActionContext.getRequest().getSession().getAttribute(EAUSER_INFO);
	}
	public static void setEauser(EauserInfo eauserInfo){
		ServletActionContext.getRequest().getSession().setAttribute(EAUSER_INFO, eauserInfo);
	}
	public static void setEauser(Eauser eauser){
		EauserInfo eauserInfo = new  EauserInfo();
		eauserInfo.setUserId(eauser.getAid());
		eauserInfo.setUserName(eauser.getAname());
		eauserInfo.setUserTName(eauser.getAtname());
		setEauser(eauserInfo);
	}
	public static void removeEause(){
		ServletActionContext.getRequest().getSession().removeAttribute(EAUSER_INFO);
	}
}
