package com.ews.action;

import java.util.ArrayList;
import java.util.List;

import com.ews.bean.Eadzone;
import com.ews.service.IEadzoneService;
import com.ews.service.IEchannelsService;
import com.ews.util.Pagination;

public class EadzoneAction extends EwsAction {
	private IEadzoneService eadzoneService;
	private IEchannelsService echannelsService;
	private List listEchannels = new ArrayList();
    private Eadzone eadzone;
	public Eadzone getEadzone() {
		return eadzone;
	}

	public void setEadzone(Eadzone eadzone) {
		this.eadzone = eadzone;
	}

	public List getListEchannels() {
		return listEchannels;
	}

	public void setListEchannels(List listEchannels) {
		this.listEchannels = listEchannels;
	}

	public void setEchannelsService(IEchannelsService echannelsService) {
		this.echannelsService = echannelsService;
	}

	private List listEadzone = new ArrayList();

	public List getListEadzone() {
		return listEadzone;
	}

	public void setListEadzone(List listEadzone) {
		this.listEadzone = listEadzone;
	}

	public void setEadzoneService(IEadzoneService eadzoneService) {
		this.eadzoneService = eadzoneService;
	}

	/**
	 * 广告位表 列表
	 */
	public String list() {
		System.out.println("--------------------");
		Pagination pagination = new Pagination(request, response);
		int count = eadzoneService.getTotalCount(
				"select count(t) from Eadzone t", null);
		pagination.setRecordCount(count);
		System.out.println(count + "============");
		listEadzone = eadzoneService.list(" from Eadzone", pagination
				.getFirstResult(), pagination.getPageSize(), null);
		request.setAttribute("pagination", pagination);
		return "list";
	}

	/**
	 * 查询频道的名称
	 */
	public String findChannelsName() {
		Pagination pagination = new Pagination(request, response);
		listEchannels = echannelsService.list(" from Echannels", pagination
				.getFirstResult(), pagination.getPageSize(), null);
		request.setAttribute("pagination", pagination);
		return "findAddEad";
	}
	/**
	 * 添加广告位
	 */
	
	public String add()
	{
		eadzone.setAzset(1);
		eadzoneService.save(eadzone);
		return list();
	}
	/**
	 * 修改广告位
	 */
	public String initEdit()
	{
	
		eadzone= (Eadzone) eadzoneService.find(Eadzone.class,eadzone.getAzid() );
		return "initEdit";
	}
	public String update()
	{
		eadzone.setAzset(1);
		System.out.println(eadzone.getAzdisplay()+"============================");
		eadzoneService.update(eadzone);
		return list();
	}
	
	public String delete()
	{
		eadzone= (Eadzone)eadzoneService.find(Eadzone.class,eadzone.getAzid() );
		eadzoneService.delete(eadzone);
		return list();
	}
	
	
}
