package com.ews.action;

import java.util.ArrayList;
import java.util.List;

import com.ews.bean.Eagrouptype;
import com.ews.service.IEagrouptypeService;

public class EagrouptypeAction extends EwsAction{
	private Eagrouptype eagrouptype;
	private IEagrouptypeService<Eagrouptype> eagrouptypeService;
	private List listEagrouptype = new ArrayList();
	public List getListEagrouptype() {
		return listEagrouptype;
	}
	public void setListEagrouptype(List listEagrouptype) {
		this.listEagrouptype = listEagrouptype;
	}
	public Eagrouptype getEagrouptype() {
		return eagrouptype;
	}
	public void setEagrouptype(Eagrouptype eagrouptype) {
		this.eagrouptype = eagrouptype;
	}
	public void setEagrouptypeService(
			IEagrouptypeService<Eagrouptype> eagrouptypeService) {
		this.eagrouptypeService = eagrouptypeService;
	}
	
	/**
	 * 查询所有数据
	 * */
	public String findList(){
		listEagrouptype = eagrouptypeService.list("from Eagrouptype");
		System.out.println("OK"+listEagrouptype.size());
		return "findList";
	}
}
