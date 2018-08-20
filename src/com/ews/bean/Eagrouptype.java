package com.ews.bean;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

/**
 * Eagrouptype entity. @author MyEclipse Persistence Tools
 */

public class Eagrouptype implements java.io.Serializable {

	// Fields

	private Integer agtid;
	private String agtname;
	private Short agtflag;
	private Short agtdisplay;
	private Timestamp agtaddtime;
	private Set eausers = new HashSet(0);
	private Set eagroupfuncs = new HashSet(0);

	// Constructors

	/** default constructor */
	public Eagrouptype() {
	}

	/** full constructor */
	public Eagrouptype(String agtname, Short agtflag, Short agtdisplay,
			Timestamp agtaddtime, Set eausers, Set eagroupfuncs) {
		this.agtname = agtname;
		this.agtflag = agtflag;
		this.agtdisplay = agtdisplay;
		this.agtaddtime = agtaddtime;
		this.eausers = eausers;
		this.eagroupfuncs = eagroupfuncs;
	}

	// Property accessors

	public Integer getAgtid() {
		return this.agtid;
	}

	public void setAgtid(Integer agtid) {
		this.agtid = agtid;
	}

	public String getAgtname() {
		return this.agtname;
	}

	public void setAgtname(String agtname) {
		this.agtname = agtname;
	}

	public Short getAgtflag() {
		return this.agtflag;
	}

	public void setAgtflag(Short agtflag) {
		this.agtflag = agtflag;
	}

	public Short getAgtdisplay() {
		return this.agtdisplay;
	}

	public void setAgtdisplay(Short agtdisplay) {
		this.agtdisplay = agtdisplay;
	}

	public Timestamp getAgtaddtime() {
		return this.agtaddtime;
	}

	public void setAgtaddtime(Timestamp agtaddtime) {
		this.agtaddtime = agtaddtime;
	}

	public Set getEausers() {
		return this.eausers;
	}

	public void setEausers(Set eausers) {
		this.eausers = eausers;
	}

	public Set getEagroupfuncs() {
		return this.eagroupfuncs;
	}

	public void setEagroupfuncs(Set eagroupfuncs) {
		this.eagroupfuncs = eagroupfuncs;
	}

}