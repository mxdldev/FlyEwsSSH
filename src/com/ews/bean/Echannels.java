package com.ews.bean;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

/**
 * Echannels entity. @author MyEclipse Persistence Tools
 */

public class Echannels implements java.io.Serializable {

	// Fields

	private Integer chid;
	private Emodel emodel;
	private Integer chpid;
	private Integer chorder;
	private String chtitle;
	private String chvatue;
	private String chabout;
	private String chpic;
	private Short chdisplay;
	private Short chisuser;
	private Integer chutid;
	private Short chcontribute;
	private String chtarget;
	private Short chother;
	private String chlink;
	private String churl;
	private Short chaudit;
	private String chkey;
	private Integer chno;
	private Integer chnew;
	private Short chindex;
	private Integer chindexno;
	private Integer chscroll;
	private Integer chtid;
	private Short chsurvey;
	private Integer chmessage;
	private Integer chindexstyle;
	private Integer chliststyle;
	private Timestamp chaddtime;
	private Set emessages = new HashSet(0);
	private Set eproducts = new HashSet(0);
	private Set econtrols = new HashSet(0);
	private Set enewses = new HashSet(0);
	private Set elinkses = new HashSet(0);
	private Set evideos = new HashSet(0);
	private Set etemplates = new HashSet(0);
	private Set eapersonfuncs = new HashSet(0);

	// Constructors

	/** default constructor */
	public Echannels() {
	}

	/** full constructor */
	public Echannels(Emodel emodel, Integer chpid, Integer chorder,
			String chtitle, String chvatue, String chabout, String chpic,
			Short chdisplay, Short chisuser, Integer chutid,
			Short chcontribute, String chtarget, Short chother, String chlink,
			String churl, Short chaudit, String chkey, Integer chno,
			Integer chnew, Short chindex, Integer chindexno, Integer chscroll,
			Integer chtid, Short chsurvey, Integer chmessage,
			Integer chindexstyle, Integer chliststyle, Timestamp chaddtime,
			Set emessages, Set eproducts, Set econtrols, Set enewses,
			Set elinkses, Set evideos, Set etemplates, Set eapersonfuncs) {
		this.emodel = emodel;
		this.chpid = chpid;
		this.chorder = chorder;
		this.chtitle = chtitle;
		this.chvatue = chvatue;
		this.chabout = chabout;
		this.chpic = chpic;
		this.chdisplay = chdisplay;
		this.chisuser = chisuser;
		this.chutid = chutid;
		this.chcontribute = chcontribute;
		this.chtarget = chtarget;
		this.chother = chother;
		this.chlink = chlink;
		this.churl = churl;
		this.chaudit = chaudit;
		this.chkey = chkey;
		this.chno = chno;
		this.chnew = chnew;
		this.chindex = chindex;
		this.chindexno = chindexno;
		this.chscroll = chscroll;
		this.chtid = chtid;
		this.chsurvey = chsurvey;
		this.chmessage = chmessage;
		this.chindexstyle = chindexstyle;
		this.chliststyle = chliststyle;
		this.chaddtime = chaddtime;
		this.emessages = emessages;
		this.eproducts = eproducts;
		this.econtrols = econtrols;
		this.enewses = enewses;
		this.elinkses = elinkses;
		this.evideos = evideos;
		this.etemplates = etemplates;
		this.eapersonfuncs = eapersonfuncs;
	}

	// Property accessors

	public Integer getChid() {
		return this.chid;
	}

	public void setChid(Integer chid) {
		this.chid = chid;
	}

	public Emodel getEmodel() {
		return this.emodel;
	}

	public void setEmodel(Emodel emodel) {
		this.emodel = emodel;
	}

	public Integer getChpid() {
		return this.chpid;
	}

	public void setChpid(Integer chpid) {
		this.chpid = chpid;
	}

	public Integer getChorder() {
		return this.chorder;
	}

	public void setChorder(Integer chorder) {
		this.chorder = chorder;
	}

	public String getChtitle() {
		return this.chtitle;
	}

	public void setChtitle(String chtitle) {
		this.chtitle = chtitle;
	}

	public String getChvatue() {
		return this.chvatue;
	}

	public void setChvatue(String chvatue) {
		this.chvatue = chvatue;
	}

	public String getChabout() {
		return this.chabout;
	}

	public void setChabout(String chabout) {
		this.chabout = chabout;
	}

	public String getChpic() {
		return this.chpic;
	}

	public void setChpic(String chpic) {
		this.chpic = chpic;
	}

	public Short getChdisplay() {
		return this.chdisplay;
	}

	public void setChdisplay(Short chdisplay) {
		this.chdisplay = chdisplay;
	}

	public Short getChisuser() {
		return this.chisuser;
	}

	public void setChisuser(Short chisuser) {
		this.chisuser = chisuser;
	}

	public Integer getChutid() {
		return this.chutid;
	}

	public void setChutid(Integer chutid) {
		this.chutid = chutid;
	}

	public Short getChcontribute() {
		return this.chcontribute;
	}

	public void setChcontribute(Short chcontribute) {
		this.chcontribute = chcontribute;
	}

	public String getChtarget() {
		return this.chtarget;
	}

	public void setChtarget(String chtarget) {
		this.chtarget = chtarget;
	}

	public Short getChother() {
		return this.chother;
	}

	public void setChother(Short chother) {
		this.chother = chother;
	}

	public String getChlink() {
		return this.chlink;
	}

	public void setChlink(String chlink) {
		this.chlink = chlink;
	}

	public String getChurl() {
		return this.churl;
	}

	public void setChurl(String churl) {
		this.churl = churl;
	}

	public Short getChaudit() {
		return this.chaudit;
	}

	public void setChaudit(Short chaudit) {
		this.chaudit = chaudit;
	}

	public String getChkey() {
		return this.chkey;
	}

	public void setChkey(String chkey) {
		this.chkey = chkey;
	}

	public Integer getChno() {
		return this.chno;
	}

	public void setChno(Integer chno) {
		this.chno = chno;
	}

	public Integer getChnew() {
		return this.chnew;
	}

	public void setChnew(Integer chnew) {
		this.chnew = chnew;
	}

	public Short getChindex() {
		return this.chindex;
	}

	public void setChindex(Short chindex) {
		this.chindex = chindex;
	}

	public Integer getChindexno() {
		return this.chindexno;
	}

	public void setChindexno(Integer chindexno) {
		this.chindexno = chindexno;
	}

	public Integer getChscroll() {
		return this.chscroll;
	}

	public void setChscroll(Integer chscroll) {
		this.chscroll = chscroll;
	}

	public Integer getChtid() {
		return this.chtid;
	}

	public void setChtid(Integer chtid) {
		this.chtid = chtid;
	}

	public Short getChsurvey() {
		return this.chsurvey;
	}

	public void setChsurvey(Short chsurvey) {
		this.chsurvey = chsurvey;
	}

	public Integer getChmessage() {
		return this.chmessage;
	}

	public void setChmessage(Integer chmessage) {
		this.chmessage = chmessage;
	}

	public Integer getChindexstyle() {
		return this.chindexstyle;
	}

	public void setChindexstyle(Integer chindexstyle) {
		this.chindexstyle = chindexstyle;
	}

	public Integer getChliststyle() {
		return this.chliststyle;
	}

	public void setChliststyle(Integer chliststyle) {
		this.chliststyle = chliststyle;
	}

	public Timestamp getChaddtime() {
		return this.chaddtime;
	}

	public void setChaddtime(Timestamp chaddtime) {
		this.chaddtime = chaddtime;
	}

	public Set getEmessages() {
		return this.emessages;
	}

	public void setEmessages(Set emessages) {
		this.emessages = emessages;
	}

	public Set getEproducts() {
		return this.eproducts;
	}

	public void setEproducts(Set eproducts) {
		this.eproducts = eproducts;
	}

	public Set getEcontrols() {
		return this.econtrols;
	}

	public void setEcontrols(Set econtrols) {
		this.econtrols = econtrols;
	}

	public Set getEnewses() {
		return this.enewses;
	}

	public void setEnewses(Set enewses) {
		this.enewses = enewses;
	}

	public Set getElinkses() {
		return this.elinkses;
	}

	public void setElinkses(Set elinkses) {
		this.elinkses = elinkses;
	}

	public Set getEvideos() {
		return this.evideos;
	}

	public void setEvideos(Set evideos) {
		this.evideos = evideos;
	}

	public Set getEtemplates() {
		return this.etemplates;
	}

	public void setEtemplates(Set etemplates) {
		this.etemplates = etemplates;
	}

	public Set getEapersonfuncs() {
		return this.eapersonfuncs;
	}

	public void setEapersonfuncs(Set eapersonfuncs) {
		this.eapersonfuncs = eapersonfuncs;
	}

}