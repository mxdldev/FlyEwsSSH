package com.ews.bean;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

/**
 * Eusertype entity. @author MyEclipse Persistence Tools
 */

public class Eusertype implements java.io.Serializable {

	// Fields

	private Integer utid;
	private String uttitle;
	private Integer utorder;
	private Short utdisplay;
	private Timestamp utaddtime;
	private Set eusers = new HashSet(0);

	// Constructors

	/** default constructor */
	public Eusertype() {
	}

	/** full constructor */
	public Eusertype(String uttitle, Integer utorder, Short utdisplay,
			Timestamp utaddtime, Set eusers) {
		this.uttitle = uttitle;
		this.utorder = utorder;
		this.utdisplay = utdisplay;
		this.utaddtime = utaddtime;
		this.eusers = eusers;
	}

	// Property accessors

	public Integer getUtid() {
		return this.utid;
	}

	public void setUtid(Integer utid) {
		this.utid = utid;
	}

	public String getUttitle() {
		return this.uttitle;
	}

	public void setUttitle(String uttitle) {
		this.uttitle = uttitle;
	}

	public Integer getUtorder() {
		return this.utorder;
	}

	public void setUtorder(Integer utorder) {
		this.utorder = utorder;
	}

	public Short getUtdisplay() {
		return this.utdisplay;
	}

	public void setUtdisplay(Short utdisplay) {
		this.utdisplay = utdisplay;
	}

	public Timestamp getUtaddtime() {
		return this.utaddtime;
	}

	public void setUtaddtime(Timestamp utaddtime) {
		this.utaddtime = utaddtime;
	}

	public Set getEusers() {
		return this.eusers;
	}

	public void setEusers(Set eusers) {
		this.eusers = eusers;
	}

}