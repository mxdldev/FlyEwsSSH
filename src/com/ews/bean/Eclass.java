package com.ews.bean;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

/**
 * Eclass entity. @author MyEclipse Persistence Tools
 */

public class Eclass implements java.io.Serializable {

	// Fields

	private Integer cid;
	private Integer cpid;
	private Integer corder;
	private String ctitle;
	private Short cdisplay;
	private Integer cmid;
	private Integer cchid;
	private Timestamp caddtime;
	private Set emessages = new HashSet(0);
	private Set eproducts = new HashSet(0);
	private Set evideos = new HashSet(0);
	private Set elinkses = new HashSet(0);

	// Constructors

	/** default constructor */
	public Eclass() {
	}

	/** full constructor */
	public Eclass(Integer cpid, Integer corder, String ctitle, Short cdisplay,
			Integer cmid, Integer cchid, Timestamp caddtime, Set emessages,
			Set eproducts, Set evideos, Set elinkses) {
		this.cpid = cpid;
		this.corder = corder;
		this.ctitle = ctitle;
		this.cdisplay = cdisplay;
		this.cmid = cmid;
		this.cchid = cchid;
		this.caddtime = caddtime;
		this.emessages = emessages;
		this.eproducts = eproducts;
		this.evideos = evideos;
		this.elinkses = elinkses;
	}

	// Property accessors

	public Integer getCid() {
		return this.cid;
	}

	public void setCid(Integer cid) {
		this.cid = cid;
	}

	public Integer getCpid() {
		return this.cpid;
	}

	public void setCpid(Integer cpid) {
		this.cpid = cpid;
	}

	public Integer getCorder() {
		return this.corder;
	}

	public void setCorder(Integer corder) {
		this.corder = corder;
	}

	public String getCtitle() {
		return this.ctitle;
	}

	public void setCtitle(String ctitle) {
		this.ctitle = ctitle;
	}

	public Short getCdisplay() {
		return this.cdisplay;
	}

	public void setCdisplay(Short cdisplay) {
		this.cdisplay = cdisplay;
	}

	public Integer getCmid() {
		return this.cmid;
	}

	public void setCmid(Integer cmid) {
		this.cmid = cmid;
	}

	public Integer getCchid() {
		return this.cchid;
	}

	public void setCchid(Integer cchid) {
		this.cchid = cchid;
	}

	public Timestamp getCaddtime() {
		return this.caddtime;
	}

	public void setCaddtime(Timestamp caddtime) {
		this.caddtime = caddtime;
	}

	public Set getEmessages() {
		return this.emessages;
	}

	public void setEmessages(Set emessages) {
		this.emessages = emessages;
	}

	public Set getEproducts() {
		return this.eproducts;
	}

	public void setEproducts(Set eproducts) {
		this.eproducts = eproducts;
	}

	public Set getEvideos() {
		return this.evideos;
	}

	public void setEvideos(Set evideos) {
		this.evideos = evideos;
	}

	public Set getElinkses() {
		return this.elinkses;
	}

	public void setElinkses(Set elinkses) {
		this.elinkses = elinkses;
	}

}