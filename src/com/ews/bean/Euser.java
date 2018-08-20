package com.ews.bean;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

/**
 * Euser entity. @author MyEclipse Persistence Tools
 */

public class Euser implements java.io.Serializable {

	// Fields

	private Integer uid;
	private Eusertype eusertype;
	private String uname;
	private String upass;
	private String uemail;
	private Integer utype;
	private String utname;
	private String uip;
	private Timestamp ulasttime;
	private String uimage;
	private Timestamp uaddtime;
	private Set efavoriteses = new HashSet(0);

	// Constructors

	/** default constructor */
	public Euser() {
	}

	/** full constructor */
	public Euser(Eusertype eusertype, String uname, String upass,
			String uemail, Integer utype, String utname, String uip,
			Timestamp ulasttime, String uimage, Timestamp uaddtime,
			Set efavoriteses) {
		this.eusertype = eusertype;
		this.uname = uname;
		this.upass = upass;
		this.uemail = uemail;
		this.utype = utype;
		this.utname = utname;
		this.uip = uip;
		this.ulasttime = ulasttime;
		this.uimage = uimage;
		this.uaddtime = uaddtime;
		this.efavoriteses = efavoriteses;
	}

	// Property accessors

	public Integer getUid() {
		return this.uid;
	}

	public void setUid(Integer uid) {
		this.uid = uid;
	}

	public Eusertype getEusertype() {
		return this.eusertype;
	}

	public void setEusertype(Eusertype eusertype) {
		this.eusertype = eusertype;
	}

	public String getUname() {
		return this.uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getUpass() {
		return this.upass;
	}

	public void setUpass(String upass) {
		this.upass = upass;
	}

	public String getUemail() {
		return this.uemail;
	}

	public void setUemail(String uemail) {
		this.uemail = uemail;
	}

	public Integer getUtype() {
		return this.utype;
	}

	public void setUtype(Integer utype) {
		this.utype = utype;
	}

	public String getUtname() {
		return this.utname;
	}

	public void setUtname(String utname) {
		this.utname = utname;
	}

	public String getUip() {
		return this.uip;
	}

	public void setUip(String uip) {
		this.uip = uip;
	}

	public Timestamp getUlasttime() {
		return this.ulasttime;
	}

	public void setUlasttime(Timestamp ulasttime) {
		this.ulasttime = ulasttime;
	}

	public String getUimage() {
		return this.uimage;
	}

	public void setUimage(String uimage) {
		this.uimage = uimage;
	}

	public Timestamp getUaddtime() {
		return this.uaddtime;
	}

	public void setUaddtime(Timestamp uaddtime) {
		this.uaddtime = uaddtime;
	}

	public Set getEfavoriteses() {
		return this.efavoriteses;
	}

	public void setEfavoriteses(Set efavoriteses) {
		this.efavoriteses = efavoriteses;
	}

}