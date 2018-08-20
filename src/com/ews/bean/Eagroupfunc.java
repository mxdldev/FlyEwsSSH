package com.ews.bean;

import java.sql.Timestamp;

/**
 * Eagroupfunc entity. @author MyEclipse Persistence Tools
 */

public class Eagroupfunc implements java.io.Serializable {

	// Fields

	private Integer agfid;
	private Eagrouptype eagrouptype;
	private Integer amrid;
	private Integer amsid;
	private Integer achid;
	private Short addf;
	private Short uptf;
	private Short delf;
	private Short self;
	private Short lockf;
	private Short setf;
	private Short rtnf;
	private Timestamp agfaddtime;

	// Constructors

	/** default constructor */
	public Eagroupfunc() {
	}

	/** full constructor */
	public Eagroupfunc(Eagrouptype eagrouptype, Integer amrid, Integer amsid,
			Integer achid, Short addf, Short uptf, Short delf, Short self,
			Short lockf, Short setf, Short rtnf, Timestamp agfaddtime) {
		this.eagrouptype = eagrouptype;
		this.amrid = amrid;
		this.amsid = amsid;
		this.achid = achid;
		this.addf = addf;
		this.uptf = uptf;
		this.delf = delf;
		this.self = self;
		this.lockf = lockf;
		this.setf = setf;
		this.rtnf = rtnf;
		this.agfaddtime = agfaddtime;
	}

	// Property accessors

	public Integer getAgfid() {
		return this.agfid;
	}

	public void setAgfid(Integer agfid) {
		this.agfid = agfid;
	}

	public Eagrouptype getEagrouptype() {
		return this.eagrouptype;
	}

	public void setEagrouptype(Eagrouptype eagrouptype) {
		this.eagrouptype = eagrouptype;
	}

	public Integer getAmrid() {
		return this.amrid;
	}

	public void setAmrid(Integer amrid) {
		this.amrid = amrid;
	}

	public Integer getAmsid() {
		return this.amsid;
	}

	public void setAmsid(Integer amsid) {
		this.amsid = amsid;
	}

	public Integer getAchid() {
		return this.achid;
	}

	public void setAchid(Integer achid) {
		this.achid = achid;
	}

	public Short getAddf() {
		return this.addf;
	}

	public void setAddf(Short addf) {
		this.addf = addf;
	}

	public Short getUptf() {
		return this.uptf;
	}

	public void setUptf(Short uptf) {
		this.uptf = uptf;
	}

	public Short getDelf() {
		return this.delf;
	}

	public void setDelf(Short delf) {
		this.delf = delf;
	}

	public Short getSelf() {
		return this.self;
	}

	public void setSelf(Short self) {
		this.self = self;
	}

	public Short getLockf() {
		return this.lockf;
	}

	public void setLockf(Short lockf) {
		this.lockf = lockf;
	}

	public Short getSetf() {
		return this.setf;
	}

	public void setSetf(Short setf) {
		this.setf = setf;
	}

	public Short getRtnf() {
		return this.rtnf;
	}

	public void setRtnf(Short rtnf) {
		this.rtnf = rtnf;
	}

	public Timestamp getAgfaddtime() {
		return this.agfaddtime;
	}

	public void setAgfaddtime(Timestamp agfaddtime) {
		this.agfaddtime = agfaddtime;
	}

}