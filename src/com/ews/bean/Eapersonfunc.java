package com.ews.bean;

import java.sql.Timestamp;

/**
 * Eapersonfunc entity. @author MyEclipse Persistence Tools
 */

public class Eapersonfunc implements java.io.Serializable {

	// Fields

	private Integer apfid;
	private Eauser eauser;
	private Echannels echannels;
	private Emsub emsub;
	private Integer amrid;
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
	public Eapersonfunc() {
	}

	/** full constructor */
	public Eapersonfunc(Eauser eauser, Echannels echannels, Emsub emsub,
			Integer amrid, Short addf, Short uptf, Short delf, Short self,
			Short lockf, Short setf, Short rtnf, Timestamp agfaddtime) {
		this.eauser = eauser;
		this.echannels = echannels;
		this.emsub = emsub;
		this.amrid = amrid;
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

	public Integer getApfid() {
		return this.apfid;
	}

	public void setApfid(Integer apfid) {
		this.apfid = apfid;
	}

	public Eauser getEauser() {
		return this.eauser;
	}

	public void setEauser(Eauser eauser) {
		this.eauser = eauser;
	}

	public Echannels getEchannels() {
		return this.echannels;
	}

	public void setEchannels(Echannels echannels) {
		this.echannels = echannels;
	}

	public Emsub getEmsub() {
		return this.emsub;
	}

	public void setEmsub(Emsub emsub) {
		this.emsub = emsub;
	}

	public Integer getAmrid() {
		return this.amrid;
	}

	public void setAmrid(Integer amrid) {
		this.amrid = amrid;
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