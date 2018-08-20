package com.ews.bean;

import java.sql.Timestamp;

/**
 * Etemplate entity. @author MyEclipse Persistence Tools
 */

public class Etemplate implements java.io.Serializable {

	// Fields

	private Integer tid;
	private Emodel emodel;
	private Echannels echannels;
	private Etemplatetype etemplatetype;
	private Estyle estyle;
	private String ttitle;
	private Short tdefault;
	private String turl;
	private String taction;
	private String tcontrol;
	private Timestamp taddtime;

	// Constructors

	/** default constructor */
	public Etemplate() {
	}

	/** full constructor */
	public Etemplate(Emodel emodel, Echannels echannels,
			Etemplatetype etemplatetype, Estyle estyle, String ttitle,
			Short tdefault, String turl, String taction, String tcontrol,
			Timestamp taddtime) {
		this.emodel = emodel;
		this.echannels = echannels;
		this.etemplatetype = etemplatetype;
		this.estyle = estyle;
		this.ttitle = ttitle;
		this.tdefault = tdefault;
		this.turl = turl;
		this.taction = taction;
		this.tcontrol = tcontrol;
		this.taddtime = taddtime;
	}

	// Property accessors

	public Integer getTid() {
		return this.tid;
	}

	public void setTid(Integer tid) {
		this.tid = tid;
	}

	public Emodel getEmodel() {
		return this.emodel;
	}

	public void setEmodel(Emodel emodel) {
		this.emodel = emodel;
	}

	public Echannels getEchannels() {
		return this.echannels;
	}

	public void setEchannels(Echannels echannels) {
		this.echannels = echannels;
	}

	public Etemplatetype getEtemplatetype() {
		return this.etemplatetype;
	}

	public void setEtemplatetype(Etemplatetype etemplatetype) {
		this.etemplatetype = etemplatetype;
	}

	public Estyle getEstyle() {
		return this.estyle;
	}

	public void setEstyle(Estyle estyle) {
		this.estyle = estyle;
	}

	public String getTtitle() {
		return this.ttitle;
	}

	public void setTtitle(String ttitle) {
		this.ttitle = ttitle;
	}

	public Short getTdefault() {
		return this.tdefault;
	}

	public void setTdefault(Short tdefault) {
		this.tdefault = tdefault;
	}

	public String getTurl() {
		return this.turl;
	}

	public void setTurl(String turl) {
		this.turl = turl;
	}

	public String getTaction() {
		return this.taction;
	}

	public void setTaction(String taction) {
		this.taction = taction;
	}

	public String getTcontrol() {
		return this.tcontrol;
	}

	public void setTcontrol(String tcontrol) {
		this.tcontrol = tcontrol;
	}

	public Timestamp getTaddtime() {
		return this.taddtime;
	}

	public void setTaddtime(Timestamp taddtime) {
		this.taddtime = taddtime;
	}

}