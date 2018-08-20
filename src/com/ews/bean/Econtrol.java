package com.ews.bean;

/**
 * Econtrol entity. @author MyEclipse Persistence Tools
 */

public class Econtrol implements java.io.Serializable {

	// Fields

	private Integer coid;
	private Emodel emodel;
	private Echannels echannels;
	private String cotitle;
	private String courl;
	private String coabout;
	private String coname;
	private Integer cotype;
	private Integer contenttype;
	private String config;

	// Constructors

	/** default constructor */
	public Econtrol() {
	}

	/** full constructor */
	public Econtrol(Emodel emodel, Echannels echannels, String cotitle,
			String courl, String coabout, String coname, Integer cotype,
			Integer contenttype, String config) {
		this.emodel = emodel;
		this.echannels = echannels;
		this.cotitle = cotitle;
		this.courl = courl;
		this.coabout = coabout;
		this.coname = coname;
		this.cotype = cotype;
		this.contenttype = contenttype;
		this.config = config;
	}

	// Property accessors

	public Integer getCoid() {
		return this.coid;
	}

	public void setCoid(Integer coid) {
		this.coid = coid;
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

	public String getCotitle() {
		return this.cotitle;
	}

	public void setCotitle(String cotitle) {
		this.cotitle = cotitle;
	}

	public String getCourl() {
		return this.courl;
	}

	public void setCourl(String courl) {
		this.courl = courl;
	}

	public String getCoabout() {
		return this.coabout;
	}

	public void setCoabout(String coabout) {
		this.coabout = coabout;
	}

	public String getConame() {
		return this.coname;
	}

	public void setConame(String coname) {
		this.coname = coname;
	}

	public Integer getCotype() {
		return this.cotype;
	}

	public void setCotype(Integer cotype) {
		this.cotype = cotype;
	}

	public Integer getContenttype() {
		return this.contenttype;
	}

	public void setContenttype(Integer contenttype) {
		this.contenttype = contenttype;
	}

	public String getConfig() {
		return this.config;
	}

	public void setConfig(String config) {
		this.config = config;
	}

}