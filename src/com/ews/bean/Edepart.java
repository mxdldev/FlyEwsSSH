package com.ews.bean;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

/**
 * Edepart entity. @author MyEclipse Persistence Tools
 */

public class Edepart implements java.io.Serializable {

	// Fields

	private Integer deid;
	private String detitle;
	private Timestamp deaddtime;
	private Set estaffies = new HashSet(0);

	// Constructors

	/** default constructor */
	public Edepart() {
	}

	/** full constructor */
	public Edepart(String detitle, Timestamp deaddtime, Set estaffies) {
		this.detitle = detitle;
		this.deaddtime = deaddtime;
		this.estaffies = estaffies;
	}

	// Property accessors

	public Integer getDeid() {
		return this.deid;
	}

	public void setDeid(Integer deid) {
		this.deid = deid;
	}

	public String getDetitle() {
		return this.detitle;
	}

	public void setDetitle(String detitle) {
		this.detitle = detitle;
	}

	public Timestamp getDeaddtime() {
		return this.deaddtime;
	}

	public void setDeaddtime(Timestamp deaddtime) {
		this.deaddtime = deaddtime;
	}

	public Set getEstaffies() {
		return this.estaffies;
	}

	public void setEstaffies(Set estaffies) {
		this.estaffies = estaffies;
	}

}