package com.ews.action;

import java.util.ArrayList;
import java.util.List;

import com.ews.service.IEchannelsService;
import com.ews.util.Pagination;

public class EchannelsAction extends EwsAction {
	private IEchannelsService echannelsService;
    private List listEchannels=new ArrayList();
	public List getListEchannels() {
		return listEchannels;
	}
	public void setListEchannels(List listEchannels) {
		this.listEchannels = listEchannels;
	}
	public void setEchannelsService(IEchannelsService echannelsService) {
		this.echannelsService = echannelsService;
	}
  /**
   * ÆµµÀ
   */
	
	
	public String list()
	{
		Pagination pagination=new Pagination(request, response);
		int count=echannelsService.getTotalCount("select count(t) from Echannels t",null);
		pagination.setRecordCount(count);
		listEchannels=echannelsService.list(" from Echannels",pagination.getFirstResult(),pagination.getPageSize(),null);
		request.setAttribute("pagination", pagination);
		return null;
	}
}
