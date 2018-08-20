package com.ews.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;
import com.opensymphony.xwork2.ActionSupport;

public class EwsAction extends ActionSupport implements ServletRequestAware, ServletResponseAware{
	private static final long serialVersionUID = 1L;
	HttpServletRequest request;
	HttpServletResponse response;
	public String ewsurl;		
	public void setServletRequest(HttpServletRequest request) {
		this.request = request;		
	}
	public void setServletResponse(HttpServletResponse response) {		
		this.response = response;
	}
	public String getEwsurl() {
		return ewsurl;
	}
	public void setEwsurl(String ewsurl) {
		this.ewsurl = ewsurl;
	}
}
