package com.ews.bean;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

/**
 * Etemplatetype entity. @author MyEclipse Persistence Tools
 */

public class Etemplatetype implements java.io.Serializable {

	// Fields

	private Integer ttid;
	private String tttitle;
	private Timestamp ttaddtime;
	private Set etemplates = new HashSet(0);

	// Constructors

	/** default constructor */
	public Etemplatetype() {
	}

	/** full constructor */
	public Etemplatetype(String tttitle, Timestamp ttaddtime, Set etemplates) {
		this.tttitle = tttitle;
		this.ttaddtime = ttaddtime;
		this.etemplates = etemplates;
	}

	// Property accessors

	public Integer getTtid() {
		return this.ttid;
	}

	public void setTtid(Integer ttid) {
		this.ttid = ttid;
	}

	public String getTttitle() {
		return this.tttitle;
	}

	public void setTttitle(String tttitle) {
		this.tttitle = tttitle;
	}

	public Timestamp getTtaddtime() {
		return this.ttaddtime;
	}

	public void setTtaddtime(Timestamp ttaddtime) {
		this.ttaddtime = ttaddtime;
	}

	public Set getEtemplates() {
		return this.etemplates;
	}

	public void setEtemplates(Set etemplates) {
		this.etemplates = etemplates;
	}

}