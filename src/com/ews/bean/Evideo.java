package com.ews.bean;

import java.sql.Timestamp;

/**
 * Evideo entity. @author MyEclipse Persistence Tools
 */

public class Evideo implements java.io.Serializable {

	// Fields

	private Integer vid;
	private Eclass eclass;
	private Echannels echannels;
	private Integer vorder;
	private String vtitle;
	private String vpic;
	private Short bdisplay;
	private Short vindex;
	private String vurl;
	private Timestamp vaddtime;

	// Constructors

	/** default constructor */
	public Evideo() {
	}

	/** full constructor */
	public Evideo(Eclass eclass, Echannels echannels, Integer vorder,
			String vtitle, String vpic, Short bdisplay, Short vindex,
			String vurl, Timestamp vaddtime) {
		this.eclass = eclass;
		this.echannels = echannels;
		this.vorder = vorder;
		this.vtitle = vtitle;
		this.vpic = vpic;
		this.bdisplay = bdisplay;
		this.vindex = vindex;
		this.vurl = vurl;
		this.vaddtime = vaddtime;
	}

	// Property accessors

	public Integer getVid() {
		return this.vid;
	}

	public void setVid(Integer vid) {
		this.vid = vid;
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

	public Integer getVorder() {
		return this.vorder;
	}

	public void setVorder(Integer vorder) {
		this.vorder = vorder;
	}

	public String getVtitle() {
		return this.vtitle;
	}

	public void setVtitle(String vtitle) {
		this.vtitle = vtitle;
	}

	public String getVpic() {
		return this.vpic;
	}

	public void setVpic(String vpic) {
		this.vpic = vpic;
	}

	public Short getBdisplay() {
		return this.bdisplay;
	}

	public void setBdisplay(Short bdisplay) {
		this.bdisplay = bdisplay;
	}

	public Short getVindex() {
		return this.vindex;
	}

	public void setVindex(Short vindex) {
		this.vindex = vindex;
	}

	public String getVurl() {
		return this.vurl;
	}

	public void setVurl(String vurl) {
		this.vurl = vurl;
	}

	public Timestamp getVaddtime() {
		return this.vaddtime;
	}

	public void setVaddtime(Timestamp vaddtime) {
		this.vaddtime = vaddtime;
	}

}