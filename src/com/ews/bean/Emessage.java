package com.ews.bean;

import java.sql.Timestamp;

/**
 * Emessage entity. @author MyEclipse Persistence Tools
 */

public class Emessage implements java.io.Serializable {

	// Fields

	private Integer meid;
	private Eclass eclass;
	private Echannels echannels;
	private Integer mepid;
	private String metitle;
	private String metext;
	private String mename;
	private Integer meauserid;
	private Integer meuserid;
	private String mereply;
	private Timestamp memodiftime;
	private Timestamp meaddtime;

	// Constructors

	/** default constructor */
	public Emessage() {
	}

	/** full constructor */
	public Emessage(Eclass eclass, Echannels echannels, Integer mepid,
			String metitle, String metext, String mename, Integer meauserid,
			Integer meuserid, String mereply, Timestamp memodiftime,
			Timestamp meaddtime) {
		this.eclass = eclass;
		this.echannels = echannels;
		this.mepid = mepid;
		this.metitle = metitle;
		this.metext = metext;
		this.mename = mename;
		this.meauserid = meauserid;
		this.meuserid = meuserid;
		this.mereply = mereply;
		this.memodiftime = memodiftime;
		this.meaddtime = meaddtime;
	}

	// Property accessors

	public Integer getMeid() {
		return this.meid;
	}

	public void setMeid(Integer meid) {
		this.meid = meid;
	}

	public Eclass getEclass() {
		return this.eclass;
	}

	public void setEclass(Eclass eclass) {
		this.eclass = eclass;
	}

	public Echannels getEchannels() {
		return this.echannels;
	}

	public void setEchannels(Echannels echannels) {
		this.echannels = echannels;
	}

	public Integer getMepid() {
		return this.mepid;
	}

	public void setMepid(Integer mepid) {
		this.mepid = mepid;
	}

	public String getMetitle() {
		return this.metitle;
	}

	public void setMetitle(String metitle) {
		this.metitle = metitle;
	}

	public String getMetext() {
		return this.metext;
	}

	public void setMetext(String metext) {
		this.metext = metext;
	}

	public String getMename() {
		return this.mename;
	}

	public void setMename(String mename) {
		this.mename = mename;
	}

	public Integer getMeauserid() {
		return this.meauserid;
	}

	public void setMeauserid(Integer meauserid) {
		this.meauserid = meauserid;
	}

	public Integer getMeuserid() {
		return this.meuserid;
	}

	public void setMeuserid(Integer meuserid) {
		this.meuserid = meuserid;
	}

	public String getMereply() {
		return this.mereply;
	}

	public void setMereply(String mereply) {
		this.mereply = mereply;
	}

	public Timestamp getMemodiftime() {
		return this.memodiftime;
	}

	public void setMemodiftime(Timestamp memodiftime) {
		this.memodiftime = memodiftime;
	}

	public Timestamp getMeaddtime() {
		return this.meaddtime;
	}

	public void setMeaddtime(Timestamp meaddtime) {
		this.meaddtime = meaddtime;
	}

}