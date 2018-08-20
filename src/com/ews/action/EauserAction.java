package com.ews.action;

import java.io.PrintWriter;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import com.ews.bean.Eagrouptype;
import com.ews.bean.Eauser;
import com.ews.service.IEagrouptypeService;
import com.ews.service.IEauserService;
import com.ews.util.EauserUtil;
import com.ews.util.MD5Util;
import com.ews.util.Pagination;

public class EauserAction extends EwsAction {
	private IEauserService eauserService;
	private IEagrouptypeService<Eagrouptype> eagrouptypeService;
	private Eauser eauser;
	private List listEauser = new ArrayList();
	private List listEagrouptype = new ArrayList();

	public List getListEagrouptype() {
		return listEagrouptype;
	}

	public void setListEagrouptype(List listEagrouptype) {
		this.listEagrouptype = listEagrouptype;
	}

	public List getListEauser() {
		return listEauser;
	}

	public void setListEauser(List listEauser) {
		this.listEauser = listEauser;
	}

	public IEauserService getEauserService() {
		return eauserService;
	}

	public void setEagrouptypeService(
			IEagrouptypeService<Eagrouptype> eagrouptypeService) {
		this.eagrouptypeService = eagrouptypeService;
	}
	public void setEauserService(IEauserService eauserService) {
		this.eauserService = eauserService;
	}

	public Eauser getEauser() {
		return eauser;
	}

	public void setEauser(Eauser eauser) {
		this.eauser = eauser;
	}

	/**
	 * 
	 * @throws Exception
	 * */
	public String login() throws Exception {
		Eauser loginEauer = new Eauser();
		PrintWriter pw = response.getWriter();
		String aname = eauser.getAname().trim();
		String apass = eauser.getApass().trim();
		String code = eauser.getValidateCode().trim();
		String tureCode = (String) request.getSession().getAttribute(
				"randomCode");
		if (tureCode.equals(code)) {
			loginEauer = eauserService.getEauser(aname, apass);
			if (loginEauer == null) {
				System.out.println("nono");
				pw.print("{success:true,msg:'noname'}");
			} else {
				EauserUtil.setEauser(loginEauer);
				pw.print("{success:true,msg:'ok'}");
			}
		} else {
			pw.print("{success:true,msg:'nocode'}");
		}
		return null;
	}

	/**
	 * 
	 * @throws Exception
	 * */
	public String logout() throws Exception {
		if (EauserUtil.getEauser() != null) {
			EauserUtil.removeEause();
		}
		response.sendRedirect("ewssite/index.jsp");
		return null;
	}

	/**
	 * 查询所有管理员
	 * 
	 * @throws Exception
	 * */
	public String findList() {
		try {
			Pagination pagination = new Pagination(request, response);
			int recordCount = eauserService.list("from Eauser").size();
			pagination.setRecordCount(recordCount);
			listEauser = eauserService.list("from Eauser", pagination
					.getFirstResult(), pagination.getPageSize(), null);
			request.setAttribute("pagination", pagination);
		} catch (Exception e) {
			// TODO: handle exception
		}
		return "findList";
	}

	/**
	 * 添加管理员
	 * 
	 * @throws Exception
	 * */
	public String add() {
		try {
			eauser.setAaddtime(new Timestamp(System.currentTimeMillis()));
			String ip = request.getHeader("x-forwarded-for");
			if (ip == null || ip.length() == 0
					|| "unknown".equalsIgnoreCase(ip)) {
				ip = request.getHeader("Proxy-Client-IP");
				}
			if (ip == null || ip.length() == 0
					|| "unknown".equalsIgnoreCase(ip)) {
				ip = request.getHeader("WL-Proxy-Client-IP");
			}
			if (ip == null || ip.length() == 0
					|| "unknown".equalsIgnoreCase(ip)) {
				ip = request.getRemoteAddr();
			}
			eauser.setAip(ip);
			eauser.setApass(MD5Util.md5s(eauser.getApass()));
			eauserService.save(eauser);
		} catch (Exception e) {
			// TODO: handle exception
		}
		return "add";
	}
	/**
	 * 管理员状态    启用/禁用
	 * 
	 * @throws Exception
	 * */
	public String atype() {
		try {
			eauser = (Eauser)eauserService.find(Eauser.class, eauser.getAid());
			String atype = eauser.getAtype().toString();
//			System.out.println(atype);
			if(atype.equals("0")){
				eauser.setAtype(Short.valueOf("1"));
			}else{
				eauser.setAtype(Short.valueOf("0"));
			}
			eauserService.update(eauser);
		} catch (Exception e) {
			// TODO: handle exception
		}
		return "atype";
	}
	/**
	 * 删除管理员
	 * 
	 * @throws Exception
	 * */
	public String delete() {
		try {
			eauser = (Eauser)eauserService.find(Eauser.class, eauser.getAid());
			eauserService.delete(eauser);
		} catch (Exception e) {
			// TODO: handle exception
		}
		return "delete";
	}
	/**
	 * 删除管理员
	 * 
	 * @throws Exception
	 * */
	public String initEdit() {
		try {
			eauser = (Eauser)eauserService.find(Eauser.class, eauser.getAid());
			listEagrouptype = eagrouptypeService.list("from Eagrouptype");
		} catch (Exception e) {
			// TODO: handle exception
		}
		return "initEdit";
	}
	/**
	 * 修改管理员
	 * 
	 * @throws Exception
	 * */
	public String edit() {
		try {
			eauser.setApass(MD5Util.md5s(eauser.getApass()));
			eauserService.update(eauser);
		} catch (Exception e) {
			// TODO: handle exception
		}
		return "edit";
	}
	/**
	 * 初始化修改密码页面
	 * 
	 * @throws Exception
	 * */
	public String initChangeApass() {
		eauser.setApass(MD5Util.md5s(eauser.getApass()));
		eauserService.update(eauser);
		System.out.println("----------!");
		try {
		} catch (Exception e) {
			// TODO: handle exception
		}
		return "initChangeApass";
	}
	/**
	 * 修改密码
	 * 
	 * @throws Exception
	 * */
	public String changeApass() {
		eauser.setApass(MD5Util.md5s(eauser.getApass()));
		eauserService.update(eauser);
		System.out.println("----------!");
		try {
		} catch (Exception e) {
			// TODO: handle exception
		}
		return "changeApass";
	}
}
