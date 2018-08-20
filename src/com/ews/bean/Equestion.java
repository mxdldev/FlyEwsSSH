package com.ews.bean;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

/**
 * Equestion entity. @author MyEclipse Persistence Tools
 */

public class Equestion implements java.io.Serializable {

	// Fields

	private Integer quid;
	private Integer quchid;
	private Integer quorder;
	private String qutitle;
	private Integer quvote;
	private Timestamp qustart;
	private Timestamp quend;
	private Short qudisplay;
	private Timestamp quaddtime;
	private Set eanswers = new HashSet(0);

	// Constructors

	/** default constructor */
	public Equestion() {
	}

	/** full constructor */
	public Equestion(Integer quchid, Integer quorder, String qutitle,
			Integer quvote, Timestamp qustart, Timestamp quend,
			Short qudisplay, Timestamp quaddtime, Set eanswers) {
		this.quchid = quchid;
		this.quorder = quorder;
		this.qutitle = qutitle;
		this.quvote = quvote;
		this.qustart = qustart;
		this.quend = quend;
		this.qudisplay = qudisplay;
		this.quaddtime = quaddtime;
		this.eanswers = eanswers;
	}

	// Property accessors

	public Integer getQuid() {
		return this.quid;
	}

	public void setQuid(Integer quid) {
		this.quid = quid;
	}

	public Integer getQuchid() {
		return this.quchid;
	}

	public void setQuchid(Integer quchid) {
		this.quchid = quchid;
	}

	public Integer getQuorder() {
		return this.quorder;
	}

	public void setQuorder(Integer quorder) {
		this.quorder = quorder;
	}

	public String getQutitle() {
		return this.qutitle;
	}

	public void setQutitle(String qutitle) {
		this.qutitle = qutitle;
	}

	public Integer getQuvote() {
		return this.quvote;
	}

	public void setQuvote(Integer quvote) {
		this.quvote = quvote;
	}

	public Timestamp getQustart() {
		return this.qustart;
	}

	public void setQustart(Timestamp qustart) {
		this.qustart = qustart;
	}

	public Timestamp getQuend() {
		return this.quend;
	}

	public void setQuend(Timestamp quend) {
		this.quend = quend;
	}

	public Short getQudisplay() {
		return this.qudisplay;
	}

	public void setQudisplay(Short qudisplay) {
		this.qudisplay = qudisplay;
	}

	public Timestamp getQuaddtime() {
		return this.quaddtime;
	}

	public void setQuaddtime(Timestamp quaddtime) {
		this.quaddtime = quaddtime;
	}

	public Set getEanswers() {
		return this.eanswers;
	}

	public void setEanswers(Set eanswers) {
		this.eanswers = eanswers;
	}

}