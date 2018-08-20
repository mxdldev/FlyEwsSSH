package com.ews.action;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


import com.ews.bean.Efavorites;
import com.ews.bean.Euser;
import com.ews.service.IEfavoritesService;
import com.ews.service.IEuserService;
import com.ews.util.EauserHelper;
import com.ews.util.EauserUtil;
import com.ews.util.Pagination;

public class EfavoritesAction extends EwsAction{	
	private IEfavoritesService efavoritesService;
	private IEuserService euserService;	
	private Efavorites efavorites;
	private List<Efavorites> listEfavorites;
	private int type;	 
	private String gxl;
	public String getGxl() {
		return gxl;
	}
	public void setGxl(String gxl) {
		this.gxl = gxl;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public String getR() {
		return r;
	}
	public void setR(String r) {
		this.r = r;
	}
	private String r;

	public void setEuserService(IEuserService euserService) {
		this.euserService = euserService;
	}	
	public Efavorites getEfavorites() {
		return efavorites;
	}

	public void setEfavorites(Efavorites efavorites) {
		this.efavorites = efavorites;
	}

	public List<Efavorites> getListEfavorites() {
		return listEfavorites;
	}

	public void setListEfavorites(List<Efavorites> listEfavorites) {
		this.listEfavorites = listEfavorites;
	}

	public void setEfavoritesService(IEfavoritesService efavoritesService) {
		this.efavoritesService = efavoritesService;
	}
	public String add(){
		Euser euser = new Euser();
		euser = (Euser) euserService.find(Euser.class, 1);
		efavorites.setEuser(euser);
		efavorites.setFaaddtime(new Timestamp(System.currentTimeMillis()));
		efavoritesService.create(efavorites);
		return "list";
	}
	public String list(){		
		Pagination pagination = new Pagination(request, response);			
		int recordCount = efavoritesService.list("from Efavorites").size();
		pagination.setRecordCount(recordCount);
		listEfavorites = efavoritesService.list("from Efavorites", pagination.getFirstResult(), pagination.getPageSize(), null);
		request.setAttribute("pagination", pagination);
		return "listback";
	}
	public String delete(){
		int id = Integer.parseInt(request.getParameter("id"));
		efavorites = (Efavorites) efavoritesService.find(Efavorites.class, id);
		efavoritesService.delete(efavorites);
		return "list";
	}
	public String test() throws IOException{
		/*if(EauserUtil.getEauser()==null){
			try {
				response.getWriter().print("no");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else{
			try {
				response.getWriter().print(EauserUtil.getEauser().getUserName());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}		
		return null;*/
		 String aa = null ;
		 String[] bb = new String[100];
		 List list = new ArrayList();
		 int k = 0; 
		String path=request.getSession().getServletContext().getRealPath("\\member\\index.jsp");
		File file=new File(path);
        if(!file.exists()||file.isDirectory())
            throw new FileNotFoundException();
        BufferedReader br=new BufferedReader(new FileReader(file));
        String temp=null;
        StringBuffer sb=new StringBuffer();
        temp=br.readLine();
        while(temp!=null){
            sb.append(temp);
            temp=br.readLine();
        }
       //System.out.println(sb.toString());
       Pattern pattern = Pattern.compile("\\$\\{(\\w+)\\}");
		Matcher matcher = pattern.matcher(sb.toString());
		if(matcher.find()){
			  matcher.reset();
			  while (matcher.find()){
			   aa = matcher.group(1);
			  // System.out.println(aa);
			   list.add(k++, aa);
			//  bb[k++] = aa;
			  }
		}else {
			  System.out.println("[ERROR] NOT FOUND!");
		}		
		//bb[0] = "$1_3_5";
		//bb[1] = "$1_3_6";
		for(int i=0;i<list.size();i++){
			System.out.println(list.get(i));
			request.setAttribute(list.get(i).toString(),"ok1ffffaa");
		}
		this.type = 2;
		 if(type == 1) this.gxl ="/member/index.jsp";
		 else if (type == 2) this.gxl ="/user_error.jsp";
		//this.gxl = "/member/index.jsp";
		  return "success";
		//return null;
		// return new String("","/user/system/userOrder.jsp",false);
		 //return "lsit"
		
		//request.setAttribute(bb[1].toString(),"ok1ffffaasssssssssssssss");
		//request.setAttribute("2_2","okfffffffffff1");
		//return "index";
	}
	

}
