package com.ews.bean;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

/**
 * Emsub entity. @author MyEclipse Persistence Tools
 */

public class Emsub implements java.io.Serializable {

	// Fields

	private Integer msid;
	private Emroot emroot;
	private Integer msorder;
	private String mstitle;
	private Short msdisplay;
	private String msurl;
	private Timestamp msaddtime;
	private Set eapersonfuncs = new HashSet(0);

	// Constructors

	/** default constructor */
	public Emsub() {
	}

	/** full constructor */
	public Emsub(Emroot emroot, Integer msorder, String mstitle,
			Short msdisplay, String msurl, Timestamp msaddtime,
			Set eapersonfuncs) {
		this.emroot = emroot;
		this.msorder = msorder;
		this.mstitle = mstitle;
		this.msdisplay = msdisplay;
		this.msurl = msurl;
		this.msaddtime = msaddtime;
		this.eapersonfuncs = eapersonfuncs;
	}

	// Property accessors

	public Integer getMsid() {
		return this.msid;
	}

	public void setMsid(Integer msid) {
		this.msid = msid;
	}

	public Emroot getEmroot() {
		return this.emroot;
	}

	public void setEmroot(Emroot emroot) {
		this.emroot = emroot;
	}

	public Integer getMsorder() {
		return this.msorder;
	}

	public void setMsorder(Integer msorder) {
		this.msorder = msorder;
	}

	public String getMstitle() {
		return this.mstitle;
	}

	public void setMstitle(String mstitle) {
		this.mstitle = mstitle;
	}

	public Short getMsdisplay() {
		return this.msdisplay;
	}

	public void setMsdisplay(Short msdisplay) {
		this.msdisplay = msdisplay;
	}

	public String getMsurl() {
		return this.msurl;
	}

	public void setMsurl(String msurl) {
		this.msurl = msurl;
	}

	public Timestamp getMsaddtime() {
		return this.msaddtime;
	}

	public void setMsaddtime(Timestamp msaddtime) {
		this.msaddtime = msaddtime;
	}

	public Set getEapersonfuncs() {
		return this.eapersonfuncs;
	}

	public void setEapersonfuncs(Set eapersonfuncs) {
		this.eapersonfuncs = eapersonfuncs;
	}

}