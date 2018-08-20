package com.ews.bean;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

/**
 * Estyle entity. @author MyEclipse Persistence Tools
 */

public class Estyle implements java.io.Serializable {

	// Fields

	private Integer sid;
	private String stitle;
	private String sabout;
	private Short sdefault;
	private String scss;
	private Timestamp saddtime;
	private Set etemplates = new HashSet(0);

	// Constructors

	/** default constructor */
	public Estyle() {
	}

	/** full constructor */
	public Estyle(String stitle, String sabout, Short sdefault, String scss,
			Timestamp saddtime, Set etemplates) {
		this.stitle = stitle;
		this.sabout = sabout;
		this.sdefault = sdefault;
		this.scss = scss;
		this.saddtime = saddtime;
		this.etemplates = etemplates;
	}

	// Property accessors

	public Integer getSid() {
		return this.sid;
	}

	public void setSid(Integer sid) {
		this.sid = sid;
	}

	public String getStitle() {
		return this.stitle;
	}

	public void setStitle(String stitle) {
		this.stitle = stitle;
	}

	public String getSabout() {
		return this.sabout;
	}

	public void setSabout(String sabout) {
		this.sabout = sabout;
	}

	public Short getSdefault() {
		return this.sdefault;
	}

	public void setSdefault(Short sdefault) {
		this.sdefault = sdefault;
	}

	public String getScss() {
		return this.scss;
	}

	public void setScss(String scss) {
		this.scss = scss;
	}

	public Timestamp getSaddtime() {
		return this.saddtime;
	}

	public void setSaddtime(Timestamp saddtime) {
		this.saddtime = saddtime;
	}

	public Set getEtemplates() {
		return this.etemplates;
	}

	public void setEtemplates(Set etemplates) {
		this.etemplates = etemplates;
	}

}