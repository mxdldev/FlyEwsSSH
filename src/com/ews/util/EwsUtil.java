package com.ews.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.struts2.ServletActionContext;

public class EwsUtil {
	public static List getDataControl(String path) throws IOException{		
		List dataControl = new ArrayList();			
		int k = 0;
		String filePath = ServletActionContext.getServletContext().getRealPath(path);
		File file=new File(filePath);
		if(!file.exists()||file.isDirectory()){
	        	throw new FileNotFoundException();
	    }else{
	    	String tempStr = null;
        	BufferedReader br = new BufferedReader(new FileReader(file));            
            StringBuffer sb = new StringBuffer();           
			tempStr = br.readLine();			
            while(tempStr!=null){
                sb.append(tempStr);               
				tempStr = br.readLine();				
            }
            Pattern pattern = Pattern.compile("\\$\\{(\\w+)\\}");
    		Matcher matcher = pattern.matcher(sb.toString());
    		if(matcher.find()){
    			  matcher.reset();
    			  while (matcher.find()){    			  
    				  dataControl.add(k++, matcher.group(1));      				 
    				
    			  }
    		}else{
    			  System.out.println("dataControl not found!");
    		}	            
	    }		
    	return dataControl;
	}
	public static String formatDate(Date dt, int classsort) {
		SimpleDateFormat sf = new SimpleDateFormat();
		String dateString = "";
		switch (classsort) {
		case 1:
			sf = new SimpleDateFormat("MM-dd");
			dateString = sf.format(dt);
			break;
		case 2:
			sf = new SimpleDateFormat("MM月-dd日");
			dateString = sf.format(dt);
			break;	
		case 3:
			sf = new SimpleDateFormat("yyyy-MM-dd");			
			dateString = sf.format(dt);
			break;		
		case 4:
			sf = new SimpleDateFormat("yyyy年MM月dd日");
			dateString = sf.format(dt);
			break;
		default:
			sf = new SimpleDateFormat("yyyyMMdd");
			dateString = sf.format(dt);
			break;	
		}
		return dateString;
	}
}
