package com.ews.action;

import java.util.List;

import com.ews.bean.Emroot;
import com.ews.bean.Emsub;
import com.ews.service.IEmrootService;

public class TreeAction extends EwsAction{
	private IEmrootService emrootService;
	private List<Emroot> listEmroot;
	private List<Emsub> listEmsub;
	public void setEmrootService(IEmrootService emrootService) {
		this.emrootService = emrootService;
	}
	public List<Emroot> getListEmroot() {
		return listEmroot;
	}
	public void setListEmroot(List<Emroot> listEmroot) {
		this.listEmroot = listEmroot;
	}

	public List<Emsub> getListEmsub() {
		return listEmsub;
	}

	public void setListEmsub(List<Emsub> listEmsub) {
		this.listEmsub = listEmsub;
	}
	public String[] getTree(String tree){		
		listEmroot = emrootService.list("from Emroot order by mrorder,mrid desc");
		String[] arrTree = new String[listEmroot.size()];
		String strEmroot = "";
		String strEmsub = "";
		int k = 1 ;
		for(int i=0;i<listEmroot.size();i++){			
			strEmroot = listEmroot.get(i).getMrtitle();
			listEmsub = (List<Emsub>) listEmroot.get(i).getEmsubs();
			for(int j=0;j<listEmsub.size();j++){
				if(listEmsub.get(j).getMsdisplay()==0){
					if(j==listEmsub.size()-1){
						strEmsub = strEmsub+listEmsub.get(j).getMstitle()+"|"+listEmsub.get(j).getMsurl();	
					}else{
						strEmsub = strEmsub+listEmsub.get(j).getMstitle()+"|"+listEmsub.get(j).getMsurl()+"#";	
					}
				}		
			}		
			arrTree[i] = k+++"#"+k+++"#"+k+++"#"+strEmroot+"$"+strEmsub;
			strEmroot = "";
			strEmsub = "";
		}		
		return arrTree;
	}
	
	public String list(){		
		listEmroot = emrootService.list("from Emroot order by mrorder,mrid desc");
		String[] arrTree = new String[listEmroot.size()];
		String strEmroot = "";
		String strEmsub = "";
		int k = 1 ;
		for(int i=0;i<listEmroot.size();i++){			
			strEmroot = listEmroot.get(i).getMrtitle();
			listEmsub = (List<Emsub>) listEmroot.get(i).getEmsubs();
			for(int j=0;j<listEmsub.size();j++){
				if(listEmsub.get(j).getMsdisplay()==0){
					if(j==listEmsub.size()-1){
						strEmsub = strEmsub+listEmsub.get(j).getMstitle()+"|"+listEmsub.get(j).getMsurl();	
					}else{
						strEmsub = strEmsub+listEmsub.get(j).getMstitle()+"|"+listEmsub.get(j).getMsurl()+"#";	
					}
				}		
			}		
			System.out.println(k+++"#"+k+++"#"+k+++"#"+strEmroot+"$"+strEmsub);
			strEmroot = "";
			strEmsub = "";
		}		
		return null;
	}	
}
