package com.ews.bean;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

/**
 * Eduties entity. @author MyEclipse Persistence Tools
 */

public class Eduties implements java.io.Serializable {

	// Fields

	private Integer duid;
	private String dutitle;
	private Timestamp duaddtime;
	private Set estaffies = new HashSet(0);

	// Constructors

	/** default constructor */
	public Eduties() {
	}

	/** full constructor */
	public Eduties(String dutitle, Timestamp duaddtime, Set estaffies) {
		this.dutitle = dutitle;
		this.duaddtime = duaddtime;
		this.estaffies = estaffies;
	}

	// Property accessors

	public Integer getDuid() {
		return this.duid;
	}

	public void setDuid(Integer duid) {
		this.duid = duid;
	}

	public String getDutitle() {
		return this.dutitle;
	}

	public void setDutitle(String dutitle) {
		this.dutitle = dutitle;
	}

	public Timestamp getDuaddtime() {
		return this.duaddtime;
	}

	public void setDuaddtime(Timestamp duaddtime) {
		this.duaddtime = duaddtime;
	}

	public Set getEstaffies() {
		return this.estaffies;
	}

	public void setEstaffies(Set estaffies) {
		this.estaffies = estaffies;
	}

}