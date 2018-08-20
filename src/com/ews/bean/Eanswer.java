package com.ews.bean;

/**
 * Eanswer entity. @author MyEclipse Persistence Tools
 */

public class Eanswer implements java.io.Serializable {

	// Fields

	private Integer anid;
	private Equestion equestion;
	private String antitle;
	private Integer anquvote;

	// Constructors

	/** default constructor */
	public Eanswer() {
	}

	/** full constructor */
	public Eanswer(Equestion equestion, String antitle, Integer anquvote) {
		this.equestion = equestion;
		this.antitle = antitle;
		this.anquvote = anquvote;
	}

	// Property accessors

	public Integer getAnid() {
		return this.anid;
	}

	public void setAnid(Integer anid) {
		this.anid = anid;
	}

	public Equestion getEquestion() {
		return this.equestion;
	}

	public void setEquestion(Equestion equestion) {
		this.equestion = equestion;
	}

	public String getAntitle() {
		return this.antitle;
	}

	public void setAntitle(String antitle) {
		this.antitle = antitle;
	}

	public Integer getAnquvote() {
		return this.anquvote;
	}

	public void setAnquvote(Integer anquvote) {
		this.anquvote = anquvote;
	}

}