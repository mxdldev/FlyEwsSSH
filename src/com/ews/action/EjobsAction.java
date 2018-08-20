package com.ews.action;

import java.util.ArrayList;
import java.util.List;

import com.ews.bean.Ejobs;
import com.ews.bean.Etalent;
import com.ews.service.IEjobsService;
import com.ews.service.IEtalentService;
import com.ews.util.Pagination;

public class EjobsAction extends EwsAction {

	private Ejobs ejobs;
	private IEjobsService<Ejobs> ejobsService;
	private IEtalentService<Etalent> etalentService;
	private List listEjobs = new ArrayList();
	private List listEtalents = new ArrayList();
	//数据类型问题，声明了中间字段
	private String jdisplay; 
	private Etalent etalent;

	public Etalent getEtalent() {
		return etalent;
	}

	public void setEtalent(Etalent etalent) {
		this.etalent = etalent;
	}

	public String getJdisplay() {
		return jdisplay;
	}

	public void setJdisplay(String jdisplay) {
		this.jdisplay = jdisplay;
	}

	public List getListEjobs() {
		return listEjobs;
	}

	public void setListEjobs(List listEjobs) {
		this.listEjobs = listEjobs;
	}

	public Ejobs getEjobs() {
		return ejobs;
	}

	public void setEjobs(Ejobs ejobs) {
		this.ejobs = ejobs;
	}

	public void setEjobsService(IEjobsService<Ejobs> ejobsService) {
		this.ejobsService = ejobsService;
	}

	public void setEtalentService(IEtalentService<Etalent> etalentService) {
		this.etalentService = etalentService;
	}

	public List getListEtalents() {
		return listEtalents;
	}

	public void setListEtalents(List listEtalents) {
		this.listEtalents = listEtalents;
	}
	/**
	 * Ejobs
	 * 
	 * 招聘信息列表
	 * 
	 * */
	public String findList() {
		try {
			Pagination pagination = new Pagination(request, response);	
			int recordCount = ejobsService.list("from Ejobs").size();
			pagination.setRecordCount(recordCount);
			listEjobs = ejobsService.list("from Ejobs order by jorder,jid DESC", pagination.getFirstResult(), pagination.getPageSize(), null);
			request.setAttribute("pagination", pagination);
			//获得应聘数量
			
//			System.out.println(listEjobs.size());
		} catch (Exception e) {
			// TODO: handle exception
		}
		return "findList";
	}
	/**
	 * Ejobs
	 * 
	 * 添加招聘信息
	 * 
	 * */
	public String add() {
		try {
			ejobs.setJdisplay(Short.valueOf(jdisplay));
			ejobsService.save(ejobs);
		} catch (Exception e) {
			// TODO: handle exception
		}
		return "add";
	}
	/**
	 * Ejobs
	 * 
	 * 删除招聘信息
	 * 
	 * */
	public String delete() {
		try {
			ejobs = ejobsService.find(Ejobs.class, ejobs.getJid());
			ejobsService.delete(ejobs);
		} catch (Exception e) {
			// TODO: handle exception
		}
		return "delete";
	}
	/**
	 * Ejobs
	 * 
	 * 初始化修改招聘信息
	 * 
	 * */
	public String initEdit() {
		try {
			ejobs = ejobsService.find(Ejobs.class, ejobs.getJid());
		} catch (Exception e) {
			// TODO: handle exception
		}
		return "initEdit";
	}
	/**
	 * Ejobs
	 * 
	 * 修改招聘信息
	 * 
	 * */
	public String edit() {
		try {
			ejobs.setJdisplay(Short.valueOf(jdisplay));
			ejobsService.update(ejobs);
		} catch (Exception e) {
			// TODO: handle exception
		}
		return "edit";
	}
	/**
	 * Ejobs
	 * 
	 * 展示详情
	 * 
	 * */
	public String details() {
		try {
			listEtalents = etalentService.list("from Etalent where tajid="+ejobs.getJid());
		} catch (Exception e) {
			// TODO: handle exception
		}
		return "details";
	}
	/**
	 * Ejobs
	 * 
	 * 显示/隐藏
	 * 
	 * */
	public String jdisplay() {
		try {
			String flag = ejobs.getJdisplay().toString();
			System.out.println(flag);
			ejobs = ejobsService.find(Ejobs.class,ejobs.getJid());
			if(flag.equals("0")){
				ejobs.setJdisplay(Short.valueOf("1"));	
			}else{
				ejobs.setJdisplay(Short.valueOf("0"));
			}
			ejobsService.update(ejobs);
		} catch (Exception e) {
			// TODO: handle exception
		}
		return "jdisplay";
	}
}
