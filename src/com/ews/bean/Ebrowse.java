package com.ews.bean;

import java.sql.Timestamp;

/**
 * Ebrowse entity. @author MyEclipse Persistence Tools
 */

public class Ebrowse implements java.io.Serializable {

	// Fields

	private Integer brid;
	private Timestamp brdate;
	private Integer brview;

	// Constructors

	/** default constructor */
	public Ebrowse() {
	}

	/** full constructor */
	public Ebrowse(Timestamp brdate, Integer brview) {
		this.brdate = brdate;
		this.brview = brview;
	}

	// Property accessors

	public Integer getBrid() {
		return this.brid;
	}

	public void setBrid(Integer brid) {
		this.brid = brid;
	}

	public Timestamp getBrdate() {
		return this.brdate;
	}

	public void setBrdate(Timestamp brdate) {
		this.brdate = brdate;
	}

	public Integer getBrview() {
		return this.brview;
	}

	public void setBrview(Integer brview) {
		this.brview = brview;
	}

}