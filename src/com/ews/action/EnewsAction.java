package com.ews.action;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.ews.bean.Enews;
import com.ews.service.IEnewsService;
import com.ews.util.EwsUtil;

public class EnewsAction extends EwsAction {
	private IEnewsService enewsService;
	private Enews enews;
	private List<Enews> listEnews;
	private List<Enews> listPicEnews;		
	public void setEnewsService(IEnewsService enewsService) {
		this.enewsService = enewsService;
	}
	public Enews getEnews() {
		return enews;
	}
	public void setEnews(Enews enews) {
		this.enews = enews;
	}
	public List<Enews> getListEnews() {
		return listEnews;
	}
	public void setListEnews(List<Enews> listEnews) {
		this.listEnews = listEnews;
	}
	public List<Enews> getListPicEnews() {
		return listPicEnews;
	}
	public void setListPicEnews(List<Enews> listPicEnews) {
		this.listPicEnews = listPicEnews;
	}
	public String list() throws IOException{
		String path = "skin/article/index.jsp";
		List dataControl = EwsUtil.getDataControl(path);	
        if(dataControl.size()>0){
        	for(int i=0;i<dataControl.size();i++){
        		String boxStr  = (String) dataControl.get(i);
        		String[] boxArr = boxStr.split("_");        		
        		Integer[] boxInt =  new Integer[boxArr.length-1];
        		String sqlStr = "";
        		String sqlPicStr = "";
        		for(int k = 0;k<boxArr.length-1;k++){
        			boxInt[k] = Integer.parseInt(boxArr[k+1]);        			
        		}        		
        		sqlStr = "from Enews where ";        	
    			if(boxInt[0]>0){
    				sqlStr = sqlStr + "nchid="+boxInt[0];
    			}
    			if(boxInt[2]==0){
    				sqlStr = sqlStr + "and nhead=1";
    			}else{
    				sqlStr = sqlStr + "and nhead=0";
    			}
    			if(boxInt[3]==0){
    				sqlStr = sqlStr + "and njack=1";
    			}else{
    				sqlStr = sqlStr + "and njack=0";
    			}
    			if(boxInt[4]==0){
    				sqlStr = sqlStr + "and nhot=1";
    			}else{
    				sqlStr = sqlStr + "and nhot=0";
    			}
    			if(boxInt[5]==0){
    				sqlStr = sqlStr + "and nrecommend=1";
    			}else{
    				sqlStr = sqlStr + "and nrecommend=0";
    			}
    			if(boxInt[6]==0){
    				sqlStr = sqlStr + "and npics=1";
    			}else{
    				sqlStr = sqlStr + "and npics=0";
    			}
    			if(boxInt[7]==0){
    				sqlStr = sqlStr + "and nimage=1";
    			}else{
    				sqlStr = sqlStr + "and nimage=0";
    			}
    			if(boxInt[8]==0){
    				sqlStr = sqlStr + "and nstatus=0 order by norder asc,nid desc";
    			}else{
    				sqlStr = sqlStr + "and nstatus=0 order by norder desc,nid desc";
    			}    			    			
    			listEnews = enewsService.list(sqlStr);
    			if(boxInt[15]==3||boxInt[15]==4||boxInt[15]==5){
    				sqlPicStr = "from Enews where npics=0 and nstatus=0 order by norder desc,nid desc";
    				listPicEnews = enewsService.list(sqlPicStr);
    			}
    			if(!listEnews.isEmpty()){ 
    				List<Enews> newEnews;
    				List<Enews> newPicEnews = null;
    				if(listEnews.size()>boxInt[1]){
    					newEnews = listEnews.subList(0, boxInt[1]);
    				}else{
    					newEnews = listEnews;
    				}
    				if(!listPicEnews.isEmpty()){
    					if(boxInt[15]==5){
    						if(listEnews.size()>3){
    							newPicEnews = listPicEnews.subList(0, 3);
    						}else{
    							newPicEnews = listPicEnews;
    						}
    					}else{
    						newPicEnews = listPicEnews.subList(0, 1);
    					}
    				}
    				StringBuffer buffer = new StringBuffer();
    				//=================================================================================
    				if(boxInt[15]==1||boxInt[15]==2){
    					buffer.append("<table width=\"100%\" border=\"0\" cellspacing=\"2\" cellpadding=\"1\"><tr>");
        				for(int j=0;j<newEnews.size();j++){
        					StringBuffer title = new StringBuffer();   
        					if(boxInt[13]>0){
        						title.append("<img src=\"skin/images/new.gif\" />");
        					}
        					if(boxInt[14]>0){
        						title.append("<img src=\"skin/images/hot.gif\" />");
        					}
        					if(newEnews.get(j).getNtitle().length() > boxInt[9]){    						
        						title.append(newEnews.get(j).getNtitle().substring(0, boxInt[9])+"..");
        					}else{
        						title.append(newEnews.get(j).getNtitle());
        					}
        					if(boxInt[11]>0){
        						title.append(newEnews.get(j).getNhit());
        					}    				
        					buffer.append("<td><a href='#'>"+title.toString()+"</a></td>");
        					if(boxInt[12]!=0){
        						String dateStr = EwsUtil.formatDate(newEnews.get(j).getNaddtime(), boxInt[12]);
        						buffer.append("<td>"+dateStr+"</td>");
        					}
        					if(boxInt[15]==1){    						
        	    					buffer.append("</tr><tr>");    	    				
        					}else if(boxInt[15]==2){
        						if(j%2==1){
        	    					buffer.append("</tr><tr>");
        	    				}
        					}  	
        				}
        			    buffer.append("</tr></table>");   
    				}    				
    			    //=====================================================================================
    				if(boxInt[15]==3){
    					buffer.append("<table width=\"100%\" border=\"0\" cellspacing=\"2\" cellpadding=\"1\">");
    					buffer.append("<tr>");
    					if(newPicEnews.size()>0){  
    						buffer.append("<td>");
    						buffer.append("<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">");
    						buffer.append("<tr><td align=\"center\"><img src="+newPicEnews.get(0).getNpic()+" width=\""+ boxInt[16]+" height=\""+ boxInt[17]+"\"/></td></tr>");
    						buffer.append("<tr><td align=\"center\">"+newPicEnews.get(0).getNctitle().substring(0, 5)+"</td></tr>");
    						buffer.append("</table>");
    						buffer.append("</td>");
    					}    					
    					buffer.append("<td>");
    					//---------------
    					buffer.append("<table width=\"100%\" border=\"0\" cellspacing=\"2\" cellpadding=\"1\">");
        				for(int j=0;j<newEnews.size();j++){
        					StringBuffer title = new StringBuffer();   
        					if(boxInt[13]>0){
        						title.append("<img src=\"skin/images/new.gif\" />");
        					}
        					if(boxInt[14]>0){
        						title.append("<img src=\"skin/images/hot.gif\" />");
        					}
        					if(newEnews.get(j).getNtitle().length() > boxInt[9]){    						
        						title.append(newEnews.get(j).getNtitle().substring(0, boxInt[9])+"..");
        					}else{
        						title.append(newEnews.get(j).getNtitle());
        					}
        					if(boxInt[11]>0){
        						title.append(newEnews.get(j).getNhit());
        					}    				
        					buffer.append("<tr><td><a href='#'>"+title.toString()+"</a></td>");
        					if(boxInt[12]!=0){
        						String dateStr = EwsUtil.formatDate(newEnews.get(j).getNaddtime(), boxInt[12]);
        						buffer.append("<td>"+dateStr+"</td></tr>");
        					}
        					
        				}
        			    buffer.append("</table>");   
    					//---------------
    					buffer.append("</td>");
    					buffer.append("</tr>");
    					buffer.append("</table>");
    				}
    				//=====================================================================================
    			    request.setAttribute(boxStr, buffer.toString());    			   
    			}
    			boxStr = "";
    			boxArr = null;
    			boxInt = null;
    			sqlStr = "";    			
    		}        	
        }
        this.ewsurl = path;
		return "ewsurl";		
	}
	
}
