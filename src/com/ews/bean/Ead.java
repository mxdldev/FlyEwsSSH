package com.ews.bean;

import java.sql.Timestamp;

/**
 * Ead entity. @author MyEclipse Persistence Tools
 */

public class Ead implements java.io.Serializable {

	// Fields

	private Integer adid;
	private Eadzone eadzone;
	private Short adtype;
	private String adtitle;
	private String adimgurl;
	private Integer adimgwidth;
	private Integer adimgheight;
	private Short adflashwmode;
	private String adintro;
	private String adlinkurl;
	private String adlinkalt;
	private Integer adorder;
	private Short adiscount;
	private Integer adcount;
	private Short adisclick;
	private Integer adclick;
	private Short addisplay;
	private Timestamp adaddtime;

	// Constructors

	/** default constructor */
	public Ead() {
	}

	/** full constructor */
	public Ead(Eadzone eadzone, Short adtype, String adtitle, String adimgurl,
			Integer adimgwidth, Integer adimgheight, Short adflashwmode,
			String adintro, String adlinkurl, String adlinkalt,
			Integer adorder, Short adiscount, Integer adcount, Short adisclick,
			Integer adclick, Short addisplay, Timestamp adaddtime) {
		this.eadzone = eadzone;
		this.adtype = adtype;
		this.adtitle = adtitle;
		this.adimgurl = adimgurl;
		this.adimgwidth = adimgwidth;
		this.adimgheight = adimgheight;
		this.adflashwmode = adflashwmode;
		this.adintro = adintro;
		this.adlinkurl = adlinkurl;
		this.adlinkalt = adlinkalt;
		this.adorder = adorder;
		this.adiscount = adiscount;
		this.adcount = adcount;
		this.adisclick = adisclick;
		this.adclick = adclick;
		this.addisplay = addisplay;
		this.adaddtime = adaddtime;
	}

	// Property accessors

	public Integer getAdid() {
		return this.adid;
	}

	public void setAdid(Integer adid) {
		this.adid = adid;
	}

	public Eadzone getEadzone() {
		return this.eadzone;
	}

	public void setEadzone(Eadzone eadzone) {
		this.eadzone = eadzone;
	}

	public Short getAdtype() {
		return this.adtype;
	}

	public void setAdtype(Short adtype) {
		this.adtype = adtype;
	}

	public String getAdtitle() {
		return this.adtitle;
	}

	public void setAdtitle(String adtitle) {
		this.adtitle = adtitle;
	}

	public String getAdimgurl() {
		return this.adimgurl;
	}

	public void setAdimgurl(String adimgurl) {
		this.adimgurl = adimgurl;
	}

	public Integer getAdimgwidth() {
		return this.adimgwidth;
	}

	public void setAdimgwidth(Integer adimgwidth) {
		this.adimgwidth = adimgwidth;
	}

	public Integer getAdimgheight() {
		return this.adimgheight;
	}

	public void setAdimgheight(Integer adimgheight) {
		this.adimgheight = adimgheight;
	}

	public Short getAdflashwmode() {
		return this.adflashwmode;
	}

	public void setAdflashwmode(Short adflashwmode) {
		this.adflashwmode = adflashwmode;
	}

	public String getAdintro() {
		return this.adintro;
	}

	public void setAdintro(String adintro) {
		this.adintro = adintro;
	}

	public String getAdlinkurl() {
		return this.adlinkurl;
	}

	public void setAdlinkurl(String adlinkurl) {
		this.adlinkurl = adlinkurl;
	}

	public String getAdlinkalt() {
		return this.adlinkalt;
	}

	public void setAdlinkalt(String adlinkalt) {
		this.adlinkalt = adlinkalt;
	}

	public Integer getAdorder() {
		return this.adorder;
	}

	public void setAdorder(Integer adorder) {
		this.adorder = adorder;
	}

	public Short getAdiscount() {
		return this.adiscount;
	}

	public void setAdiscount(Short adiscount) {
		this.adiscount = adiscount;
	}

	public Integer getAdcount() {
		return this.adcount;
	}

	public void setAdcount(Integer adcount) {
		this.adcount = adcount;
	}

	public Short getAdisclick() {
		return this.adisclick;
	}

	public void setAdisclick(Short adisclick) {
		this.adisclick = adisclick;
	}

	public Integer getAdclick() {
		return this.adclick;
	}

	public void setAdclick(Integer adclick) {
		this.adclick = adclick;
	}

	public Short getAddisplay() {
		return this.addisplay;
	}

	public void setAddisplay(Short addisplay) {
		this.addisplay = addisplay;
	}

	public Timestamp getAdaddtime() {
		return this.adaddtime;
	}

	public void setAdaddtime(Timestamp adaddtime) {
		this.adaddtime = adaddtime;
	}

}