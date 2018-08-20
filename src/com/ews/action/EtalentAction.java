package com.ews.action;

import java.util.ArrayList;
import java.util.List;

import com.ews.bean.Etalent;
import com.ews.service.IEtalentService;

public class EtalentAction extends EwsAction {
	private Etalent etalent;
	private IEtalentService<Etalent> etalentService;
	private List listEtalents = new ArrayList();
	public List getListEtalents() {
		return listEtalents;
	}
	public void setListEtalents(List listEtalents) {
		this.listEtalents = listEtalents;
	}
	public Etalent getEtalent() {
		return etalent;
	}
	public void setEtalent(Etalent etalent) {
		this.etalent = etalent;
	}
	public void setEtalentService(IEtalentService<Etalent> etalentService) {
		this.etalentService = etalentService;
	}

	/**
	 * É¾³ý
	 * */
	public String delete(){
		try {
			etalent = etalentService.find(Etalent.class, etalent.getTaid());
			etalentService.delete(etalent);
			listEtalents = etalentService.list("from Etalent where tajid="+etalent.getEjobs().getJid());
		} catch (Exception e) {
			// TODO: handle exception
		}
		return "delete";
	}
	/**
	 * ÏêÇé
	 * */
	public String details(){
		try {
			etalent = etalentService.find(Etalent.class, etalent.getTaid());
		} catch (Exception e) {
			// TODO: handle exception
		}
		return "details";
	}
}
