package com.ews.bean;

/**
 * Elabel entity. @author MyEclipse Persistence Tools
 */

public class Elabel implements java.io.Serializable {

	// Fields

	private Integer laid;
	private String laname;
	private String laclass;
	private Integer latype;
	private Integer pagenum;
	private String laabout;
	private String laurl;

	// Constructors

	/** default constructor */
	public Elabel() {
	}

	/** full constructor */
	public Elabel(String laname, String laclass, Integer latype,
			Integer pagenum, String laabout, String laurl) {
		this.laname = laname;
		this.laclass = laclass;
		this.latype = latype;
		this.pagenum = pagenum;
		this.laabout = laabout;
		this.laurl = laurl;
	}

	// Property accessors

	public Integer getLaid() {
		return this.laid;
	}

	public void setLaid(Integer laid) {
		this.laid = laid;
	}

	public String getLaname() {
		return this.laname;
	}

	public void setLaname(String laname) {
		this.laname = laname;
	}

	public String getLaclass() {
		return this.laclass;
	}

	public void setLaclass(String laclass) {
		this.laclass = laclass;
	}

	public Integer getLatype() {
		return this.latype;
	}

	public void setLatype(Integer latype) {
		this.latype = latype;
	}

	public Integer getPagenum() {
		return this.pagenum;
	}

	public void setPagenum(Integer pagenum) {
		this.pagenum = pagenum;
	}

	public String getLaabout() {
		return this.laabout;
	}

	public void setLaabout(String laabout) {
		this.laabout = laabout;
	}

	public String getLaurl() {
		return this.laurl;
	}

	public void setLaurl(String laurl) {
		this.laurl = laurl;
	}

}