package com.ews.bean;

import java.sql.Timestamp;

/**
 * Efavorites entity. @author MyEclipse Persistence Tools
 */

public class Efavorites implements java.io.Serializable {

	// Fields

	private Integer faid;
	private Euser euser;
	private String fatitle;
	private String faurl;
	private Timestamp faaddtime;

	// Constructors

	/** default constructor */
	public Efavorites() {
	}

	/** full constructor */
	public Efavorites(Euser euser, String fatitle, String faurl,
			Timestamp faaddtime) {
		this.euser = euser;
		this.fatitle = fatitle;
		this.faurl = faurl;
		this.faaddtime = faaddtime;
	}

	// Property accessors

	public Integer getFaid() {
		return this.faid;
	}

	public void setFaid(Integer faid) {
		this.faid = faid;
	}

	public Euser getEuser() {
		return this.euser;
	}

	public void setEuser(Euser euser) {
		this.euser = euser;
	}

	public String getFatitle() {
		return this.fatitle;
	}

	public void setFatitle(String fatitle) {
		this.fatitle = fatitle;
	}

	public String getFaurl() {
		return this.faurl;
	}

	public void setFaurl(String faurl) {
		this.faurl = faurl;
	}

	public Timestamp getFaaddtime() {
		return this.faaddtime;
	}

	public void setFaaddtime(Timestamp faaddtime) {
		this.faaddtime = faaddtime;
	}

}