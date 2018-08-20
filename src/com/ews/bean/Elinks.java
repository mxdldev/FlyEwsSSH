package com.ews.bean;

import java.sql.Timestamp;

/**
 * Elinks entity. @author MyEclipse Persistence Tools
 */

public class Elinks implements java.io.Serializable {

	// Fields

	private Integer lid;
	private Eclass eclass;
	private Echannels echannels;
	private Integer lorder;
	private String ltitle;
	private String lpic;
	private Short ldisplay;
	private Integer lindex;
	private String lurl;
	private Timestamp laddtime;

	// Constructors

	/** default constructor */
	public Elinks() {
	}

	/** full constructor */
	public Elinks(Eclass eclass, Echannels echannels, Integer lorder,
			String ltitle, String lpic, Short ldisplay, Integer lindex,
			String lurl, Timestamp laddtime) {
		this.eclass = eclass;
		this.echannels = echannels;
		this.lorder = lorder;
		this.ltitle = ltitle;
		this.lpic = lpic;
		this.ldisplay = ldisplay;
		this.lindex = lindex;
		this.lurl = lurl;
		this.laddtime = laddtime;
	}

	// Property accessors

	public Integer getLid() {
		return this.lid;
	}

	public void setLid(Integer lid) {
		this.lid = lid;
	}

	public Eclass getEclass() {
		return this.eclass;
	}

	public void setEclass(Eclass eclass) {
		this.eclass = eclass;
	}

	public Echannels getEchannels() {
		return this.echannels;
	}

	public void setEchannels(Echannels echannels) {
		this.echannels = echannels;
	}

	public Integer getLorder() {
		return this.lorder;
	}

	public void setLorder(Integer lorder) {
		this.lorder = lorder;
	}

	public String getLtitle() {
		return this.ltitle;
	}

	public void setLtitle(String ltitle) {
		this.ltitle = ltitle;
	}

	public String getLpic() {
		return this.lpic;
	}

	public void setLpic(String lpic) {
		this.lpic = lpic;
	}

	public Short getLdisplay() {
		return this.ldisplay;
	}

	public void setLdisplay(Short ldisplay) {
		this.ldisplay = ldisplay;
	}

	public Integer getLindex() {
		return this.lindex;
	}

	public void setLindex(Integer lindex) {
		this.lindex = lindex;
	}

	public String getLurl() {
		return this.lurl;
	}

	public void setLurl(String lurl) {
		this.lurl = lurl;
	}

	public Timestamp getLaddtime() {
		return this.laddtime;
	}

	public void setLaddtime(Timestamp laddtime) {
		this.laddtime = laddtime;
	}

}