package com.ews.action;

import java.util.ArrayList;
import java.util.List;

import com.ews.service.IEadService;
import com.ews.util.Pagination;

public class EadAction extends EwsAction{
	private IEadService  eadService;
    private List listEad=new ArrayList();
	
	public void setEadService(IEadService eadService) {
		this.eadService = eadService;
	}
	/**
	 * ¹ã¸æ±í
	 */
	
	public String list()
	{
		System.out.println("----------ff----------");
		Pagination pagination=new Pagination(request, response);
		int count=eadService.getTotalCount("select count(t) from Ead t",null);
		pagination.setRecordCount(count);
		listEad=eadService.list(" from Ead",pagination.getFirstResult(),pagination.getPageSize(),null);
		request.setAttribute("pagination", pagination);
		return "list";
	}
	public List getListEad() {
		return listEad;
	}
	public void setListEad(List listEad) {
		this.listEad = listEad;
	}

}
