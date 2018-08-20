package com.ews.bean;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

/**
 * Emodel entity. @author MyEclipse Persistence Tools
 */

public class Emodel implements java.io.Serializable {

	// Fields

	private Integer mid;
	private Integer morder;
	private String mtitle;
	private Short mdisplay;
	private String murl;
	private Short mclass;
	private Short mdeleted;
	private Timestamp maddtime;
	private Set econtrols = new HashSet(0);
	private Set etemplates = new HashSet(0);
	private Set echannelses = new HashSet(0);

	// Constructors

	/** default constructor */
	public Emodel() {
	}

	/** full constructor */
	public Emodel(Integer morder, String mtitle, Short mdisplay, String murl,
			Short mclass, Short mdeleted, Timestamp maddtime, Set econtrols,
			Set etemplates, Set echannelses) {
		this.morder = morder;
		this.mtitle = mtitle;
		this.mdisplay = mdisplay;
		this.murl = murl;
		this.mclass = mclass;
		this.mdeleted = mdeleted;
		this.maddtime = maddtime;
		this.econtrols = econtrols;
		this.etemplates = etemplates;
		this.echannelses = echannelses;
	}

	// Property accessors

	public Integer getMid() {
		return this.mid;
	}

	public void setMid(Integer mid) {
		this.mid = mid;
	}

	public Integer getMorder() {
		return this.morder;
	}

	public void setMorder(Integer morder) {
		this.morder = morder;
	}

	public String getMtitle() {
		return this.mtitle;
	}

	public void setMtitle(String mtitle) {
		this.mtitle = mtitle;
	}

	public Short getMdisplay() {
		return this.mdisplay;
	}

	public void setMdisplay(Short mdisplay) {
		this.mdisplay = mdisplay;
	}

	public String getMurl() {
		return this.murl;
	}

	public void setMurl(String murl) {
		this.murl = murl;
	}

	public Short getMclass() {
		return this.mclass;
	}

	public void setMclass(Short mclass) {
		this.mclass = mclass;
	}

	public Short getMdeleted() {
		return this.mdeleted;
	}

	public void setMdeleted(Short mdeleted) {
		this.mdeleted = mdeleted;
	}

	public Timestamp getMaddtime() {
		return this.maddtime;
	}

	public void setMaddtime(Timestamp maddtime) {
		this.maddtime = maddtime;
	}

	public Set getEcontrols() {
		return this.econtrols;
	}

	public void setEcontrols(Set econtrols) {
		this.econtrols = econtrols;
	}

	public Set getEtemplates() {
		return this.etemplates;
	}

	public void setEtemplates(Set etemplates) {
		this.etemplates = etemplates;
	}

	public Set getEchannelses() {
		return this.echannelses;
	}

	public void setEchannelses(Set echannelses) {
		this.echannelses = echannelses;
	}

}