package com.ews.action;


import java.util.List;
import com.ews.bean.Ealog;
import com.ews.service.IEalogService;


public class EalogAction extends EwsAction{
	
	private IEalogService ealogService;
	private Ealog ealog;
	public Ealog getEalog() {
		return ealog;
	}

	public void setEalog(Ealog ealog) {
		this.ealog = ealog;
	}
	private List<Ealog> listEalog;
	
	
	public List<Ealog> getListEalog() {
		return listEalog;
	}
	public void setListEalog(List<Ealog> listEalog) {
		this.listEalog = listEalog;
	}
	public void setEalogService(IEalogService ealogService) {
		this.ealogService = ealogService;
	}
	public String login(){
		System.out.println("ok");
		ealog = (Ealog)ealogService.find(Ealog.class, 1);
		System.out.print(ealog.getAlname());		
		return null;
		//return "succ";
	}

}
