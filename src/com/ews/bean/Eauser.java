package com.ews.bean;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

/**
 * Eauser entity. @author MyEclipse Persistence Tools
 */

public class Eauser implements java.io.Serializable {

	// Fields

	private Integer aid;
	private Eagrouptype eagrouptype;
	private String aname;
	private String apass;
	private String atname;
	private Short atype;
	private Short adeleted;
	private String aip;
	private Timestamp alasttime;
	private Timestamp aaddtime;
	private String validateCode;	
	private Set eapersonfuncs = new HashSet(0);

	// Constructors

	/** default constructor */
	public Eauser() {
	}

	/** full constructor */
	public Eauser(Eagrouptype eagrouptype, String aname, String apass,
			String atname, Short atype, Short adeleted, String aip,
			Timestamp alasttime, Timestamp aaddtime, Set eapersonfuncs) {
		this.eagrouptype = eagrouptype;
		this.aname = aname;
		this.apass = apass;
		this.atname = atname;
		this.atype = atype;
		this.adeleted = adeleted;
		this.aip = aip;
		this.alasttime = alasttime;
		this.aaddtime = aaddtime;
		this.eapersonfuncs = eapersonfuncs;
	}

	// Property accessors

	public Integer getAid() {
		return this.aid;
	}

	public void setAid(Integer aid) {
		this.aid = aid;
	}

	public Eagrouptype getEagrouptype() {
		return this.eagrouptype;
	}

	public void setEagrouptype(Eagrouptype eagrouptype) {
		this.eagrouptype = eagrouptype;
	}

	public String getAname() {
		return this.aname;
	}

	public void setAname(String aname) {
		this.aname = aname;
	}

	public String getApass() {
		return this.apass;
	}

	public void setApass(String apass) {
		this.apass = apass;
	}

	public String getAtname() {
		return this.atname;
	}

	public void setAtname(String atname) {
		this.atname = atname;
	}

	public Short getAtype() {
		return this.atype;
	}

	public void setAtype(Short atype) {
		this.atype = atype;
	}

	public Short getAdeleted() {
		return this.adeleted;
	}

	public void setAdeleted(Short adeleted) {
		this.adeleted = adeleted;
	}

	public String getAip() {
		return this.aip;
	}

	public void setAip(String aip) {
		this.aip = aip;
	}

	public Timestamp getAlasttime() {
		return this.alasttime;
	}

	public void setAlasttime(Timestamp alasttime) {
		this.alasttime = alasttime;
	}

	public Timestamp getAaddtime() {
		return this.aaddtime;
	}

	public void setAaddtime(Timestamp aaddtime) {
		this.aaddtime = aaddtime;
	}

	public Set getEapersonfuncs() {
		return this.eapersonfuncs;
	}

	public void setEapersonfuncs(Set eapersonfuncs) {
		this.eapersonfuncs = eapersonfuncs;
	}
	public String getValidateCode() {
		return validateCode;
	}

	public void setValidateCode(String validateCode) {
		this.validateCode = validateCode;
	}

}