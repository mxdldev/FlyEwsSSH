package com.ews.bean;

import java.sql.Timestamp;

/**
 * Ealog entity. @author MyEclipse Persistence Tools
 */

public class Ealog implements java.io.Serializable {

	// Fields

	private Integer alid;
	private String alname;
	private String alip;
	private String altype;
	private String altitle;
	private String aloperation;
	private Timestamp aladdtime;

	// Constructors

	/** default constructor */
	public Ealog() {
	}

	/** full constructor */
	public Ealog(String alname, String alip, String altype, String altitle,
			String aloperation, Timestamp aladdtime) {
		this.alname = alname;
		this.alip = alip;
		this.altype = altype;
		this.altitle = altitle;
		this.aloperation = aloperation;
		this.aladdtime = aladdtime;
	}

	// Property accessors

	public Integer getAlid() {
		return this.alid;
	}

	public void setAlid(Integer alid) {
		this.alid = alid;
	}

	public String getAlname() {
		return this.alname;
	}

	public void setAlname(String alname) {
		this.alname = alname;
	}

	public String getAlip() {
		return this.alip;
	}

	public void setAlip(String alip) {
		this.alip = alip;
	}

	public String getAltype() {
		return this.altype;
	}

	public void setAltype(String altype) {
		this.altype = altype;
	}

	public String getAltitle() {
		return this.altitle;
	}

	public void setAltitle(String altitle) {
		this.altitle = altitle;
	}

	public String getAloperation() {
		return this.aloperation;
	}

	public void setAloperation(String aloperation) {
		this.aloperation = aloperation;
	}

	public Timestamp getAladdtime() {
		return this.aladdtime;
	}

	public void setAladdtime(Timestamp aladdtime) {
		this.aladdtime = aladdtime;
	}

}