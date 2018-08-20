package com.ews.bean;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Emroot entity. @author MyEclipse Persistence Tools
 */

public class Emroot implements java.io.Serializable {

	// Fields

	private Integer mrid;
	private Integer mrorder;
	private String mrtitle;
	private Short mrdisplay;
	private Timestamp mraddtime;
	private List<Emsub> emsubs = new ArrayList();

	// Constructors

	/** default constructor */
	public Emroot() {
	}

	/** full constructor */
	public Emroot(Integer mrorder, String mrtitle, Short mrdisplay,
			Timestamp mraddtime, List<Emsub> emsubs) {
		this.mrorder = mrorder;
		this.mrtitle = mrtitle;
		this.mrdisplay = mrdisplay;
		this.mraddtime = mraddtime;
		this.emsubs = emsubs;
	}

	// Property accessors

	public Integer getMrid() {
		return this.mrid;
	}

	public void setMrid(Integer mrid) {
		this.mrid = mrid;
	}

	public Integer getMrorder() {
		return this.mrorder;
	}

	public void setMrorder(Integer mrorder) {
		this.mrorder = mrorder;
	}

	public String getMrtitle() {
		return this.mrtitle;
	}

	public void setMrtitle(String mrtitle) {
		this.mrtitle = mrtitle;
	}

	public Short getMrdisplay() {
		return this.mrdisplay;
	}

	public void setMrdisplay(Short mrdisplay) {
		this.mrdisplay = mrdisplay;
	}

	public Timestamp getMraddtime() {
		return this.mraddtime;
	}

	public void setMraddtime(Timestamp mraddtime) {
		this.mraddtime = mraddtime;
	}

	public List<Emsub> getEmsubs() {
		return this.emsubs;
	}

	public void setEmsubs(List<Emsub> emsubs) {
		this.emsubs = emsubs;
	}

}