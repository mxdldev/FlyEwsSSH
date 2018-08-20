package com.ews.bean;

import java.sql.Timestamp;

/**
 * Enewscomment entity. @author MyEclipse Persistence Tools
 */

public class Enewscomment implements java.io.Serializable {

	// Fields

	private Integer ncid;
	private Enews enews;
	private String ncname;
	private Short ncisuser;
	private String nctext;
	private Short ncdeleted;
	private Short ncdisplay;
	private Timestamp ncaddtime;

	// Constructors

	/** default constructor */
	public Enewscomment() {
	}

	/** full constructor */
	public Enewscomment(Enews enews, String ncname, Short ncisuser,
			String nctext, Short ncdeleted, Short ncdisplay, Timestamp ncaddtime) {
		this.enews = enews;
		this.ncname = ncname;
		this.ncisuser = ncisuser;
		this.nctext = nctext;
		this.ncdeleted = ncdeleted;
		this.ncdisplay = ncdisplay;
		this.ncaddtime = ncaddtime;
	}

	// Property accessors

	public Integer getNcid() {
		return this.ncid;
	}

	public void setNcid(Integer ncid) {
		this.ncid = ncid;
	}

	public Enews getEnews() {
		return this.enews;
	}

	public void setEnews(Enews enews) {
		this.enews = enews;
	}

	public String getNcname() {
		return this.ncname;
	}

	public void setNcname(String ncname) {
		this.ncname = ncname;
	}

	public Short getNcisuser() {
		return this.ncisuser;
	}

	public void setNcisuser(Short ncisuser) {
		this.ncisuser = ncisuser;
	}

	public String getNctext() {
		return this.nctext;
	}

	public void setNctext(String nctext) {
		this.nctext = nctext;
	}

	public Short getNcdeleted() {
		return this.ncdeleted;
	}

	public void setNcdeleted(Short ncdeleted) {
		this.ncdeleted = ncdeleted;
	}

	public Short getNcdisplay() {
		return this.ncdisplay;
	}

	public void setNcdisplay(Short ncdisplay) {
		this.ncdisplay = ncdisplay;
	}

	public Timestamp getNcaddtime() {
		return this.ncaddtime;
	}

	public void setNcaddtime(Timestamp ncaddtime) {
		this.ncaddtime = ncaddtime;
	}

}