package com.ews.action;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import com.ews.bean.Emroot;
import com.ews.bean.Emsub;
import com.ews.service.IEmrootService;
import com.ews.service.IEmsubService;

public class EmsubAction extends EwsAction{	
	private IEmrootService<Emroot> emrootService;
	private IEmsubService emsubService;
	private Emsub msub;
	private List<Emroot> listEmroots;
	public List<Emroot> getListEmroots() {
		return listEmroots;
	}

	public void setListEmroots(List<Emroot> listEmroots) {
		this.listEmroots = listEmroots;
	}

	public void setEmrootService(IEmrootService<Emroot> emrootService) {
		this.emrootService = emrootService;
	}

	public Emsub getMsub() {
		return msub;
	}

	public void setMsub(Emsub msub) {
		this.msub = msub;
	}
	
	
	
	public void setEmsubService(IEmsubService emsubService) {
		this.emsubService = emsubService;
	}
	
	//显示添加
	public String showadd(){
		listEmroots = emrootService.list("from Emroot where mrdisplay=0 order by mrorder,mrid desc");
		return "showadd";
	}
	//添加
	public String add(){
		String msmrid = request.getParameter("msub.msmrid");
		Emroot emroot = emrootService.find(Emroot.class, Integer.parseInt(msmrid));
		msub.setEmroot(emroot);
		msub.setMsaddtime(new Timestamp(System.currentTimeMillis()));
		emsubService.create(msub);
		return "listback";
	}
	//修改显示
	public String editshow(){
		int id = Integer.parseInt(request.getParameter("id"));
		msub = (Emsub) emsubService.find(Emsub.class, id);
		listEmroots = emrootService.list("from Emroot where mrdisplay=0 order by mrorder,mrid desc");
		return "edit";
	}
	//修改
	public String edit(){
		String msmrid = request.getParameter("msub.msmrid");
		Emroot emroot = emrootService.find(Emroot.class, Integer.parseInt(msmrid));
		msub.setEmroot(emroot);
		emsubService.update(msub);
		return "listback";
	}
	//删除
	public String del(){
		int id = Integer.parseInt(request.getParameter("id"));
		msub = (Emsub) emsubService.find(Emsub.class, id);
		emsubService.delete(msub);
		return "listback";
	}
	//隐藏显示
	public String dis(){
		int id = Integer.parseInt(request.getParameter("id"));
		short dis = (short) Integer.parseInt(request.getParameter("dis"));
		msub = (Emsub) emsubService.find(Emsub.class, id);
		msub.setMsdisplay(dis);
		emsubService.update(msub);
		return "listback";
	}
	


}
