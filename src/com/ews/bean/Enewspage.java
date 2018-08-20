package com.ews.bean;

/**
 * Enewspage entity. @author MyEclipse Persistence Tools
 */

public class Enewspage implements java.io.Serializable {

	// Fields

	private Integer npid;
	private Enews enews;
	private Integer nppage;
	private String nptext;

	// Constructors

	/** default constructor */
	public Enewspage() {
	}

	/** full constructor */
	public Enewspage(Enews enews, Integer nppage, String nptext) {
		this.enews = enews;
		this.nppage = nppage;
		this.nptext = nptext;
	}

	// Property accessors

	public Integer getNpid() {
		return this.npid;
	}

	public void setNpid(Integer npid) {
		this.npid = npid;
	}

	public Enews getEnews() {
		return this.enews;
	}

	public void setEnews(Enews enews) {
		this.enews = enews;
	}

	public Integer getNppage() {
		return this.nppage;
	}

	public void setNppage(Integer nppage) {
		this.nppage = nppage;
	}

	public String getNptext() {
		return this.nptext;
	}

	public void setNptext(String nptext) {
		this.nptext = nptext;
	}

}