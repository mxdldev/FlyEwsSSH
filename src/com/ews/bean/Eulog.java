package com.ews.bean;

import java.sql.Timestamp;

/**
 * Eulog entity. @author MyEclipse Persistence Tools
 */

public class Eulog implements java.io.Serializable {

	// Fields

	private Integer ulid;
	private String ulname;
	private String ulip;
	private String ultype;
	private String ultitle;
	private String uloperation;
	private Timestamp uladdtime;

	// Constructors

	/** default constructor */
	public Eulog() {
	}

	/** full constructor */
	public Eulog(String ulname, String ulip, String ultype, String ultitle,
			String uloperation, Timestamp uladdtime) {
		this.ulname = ulname;
		this.ulip = ulip;
		this.ultype = ultype;
		this.ultitle = ultitle;
		this.uloperation = uloperation;
		this.uladdtime = uladdtime;
	}

	// Property accessors

	public Integer getUlid() {
		return this.ulid;
	}

	public void setUlid(Integer ulid) {
		this.ulid = ulid;
	}

	public String getUlname() {
		return this.ulname;
	}

	public void setUlname(String ulname) {
		this.ulname = ulname;
	}

	public String getUlip() {
		return this.ulip;
	}

	public void setUlip(String ulip) {
		this.ulip = ulip;
	}

	public String getUltype() {
		return this.ultype;
	}

	public void setUltype(String ultype) {
		this.ultype = ultype;
	}

	public String getUltitle() {
		return this.ultitle;
	}

	public void setUltitle(String ultitle) {
		this.ultitle = ultitle;
	}

	public String getUloperation() {
		return this.uloperation;
	}

	public void setUloperation(String uloperation) {
		this.uloperation = uloperation;
	}

	public Timestamp getUladdtime() {
		return this.uladdtime;
	}

	public void setUladdtime(Timestamp uladdtime) {
		this.uladdtime = uladdtime;
	}

}