package com.ews.bean;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

/**
 * Eadzone entity. @author MyEclipse Persistence Tools
 */

public class Eadzone implements java.io.Serializable {

	// Fields

	private Integer azid;
	private Integer azchid;
	private String azincludeadid;
	private String zatitle;
	private String azjstitle;
	private String azintro;
	private Integer aztype;
	private Integer azset;
	private Integer azwidth;
	private Integer azheight;
	private Short azdisplay;
	private Integer azshowtype;
	private Timestamp updatetime;
	private Set eads = new HashSet(0);

	// Constructors

	/** default constructor */
	public Eadzone() {
	}

	/** full constructor */
	public Eadzone(Integer azchid, String azincludeadid, String zatitle,
			String azjstitle, String azintro, Integer aztype, Integer azset,
			Integer azwidth, Integer azheight, Short azdisplay,
			Integer azshowtype, Timestamp updatetime, Set eads) {
		this.azchid = azchid;
		this.azincludeadid = azincludeadid;
		this.zatitle = zatitle;
		this.azjstitle = azjstitle;
		this.azintro = azintro;
		this.aztype = aztype;
		this.azset = azset;
		this.azwidth = azwidth;
		this.azheight = azheight;
		this.azdisplay = azdisplay;
		this.azshowtype = azshowtype;
		this.updatetime = updatetime;
		this.eads = eads;
	}

	// Property accessors

	public Integer getAzid() {
		return this.azid;
	}

	public void setAzid(Integer azid) {
		this.azid = azid;
	}

	public Integer getAzchid() {
		return this.azchid;
	}

	public void setAzchid(Integer azchid) {
		this.azchid = azchid;
	}

	public String getAzincludeadid() {
		return this.azincludeadid;
	}

	public void setAzincludeadid(String azincludeadid) {
		this.azincludeadid = azincludeadid;
	}

	public String getZatitle() {
		return this.zatitle;
	}

	public void setZatitle(String zatitle) {
		this.zatitle = zatitle;
	}

	public String getAzjstitle() {
		return this.azjstitle;
	}

	public void setAzjstitle(String azjstitle) {
		this.azjstitle = azjstitle;
	}

	public String getAzintro() {
		return this.azintro;
	}

	public void setAzintro(String azintro) {
		this.azintro = azintro;
	}

	public Integer getAztype() {
		return this.aztype;
	}

	public void setAztype(Integer aztype) {
		this.aztype = aztype;
	}

	public Integer getAzset() {
		return this.azset;
	}

	public void setAzset(Integer azset) {
		this.azset = azset;
	}

	public Integer getAzwidth() {
		return this.azwidth;
	}

	public void setAzwidth(Integer azwidth) {
		this.azwidth = azwidth;
	}

	public Integer getAzheight() {
		return this.azheight;
	}

	public void setAzheight(Integer azheight) {
		this.azheight = azheight;
	}

	public Short getAzdisplay() {
		return this.azdisplay;
	}

	public void setAzdisplay(Short azdisplay) {
		this.azdisplay = azdisplay;
	}

	public Integer getAzshowtype() {
		return this.azshowtype;
	}

	public void setAzshowtype(Integer azshowtype) {
		this.azshowtype = azshowtype;
	}

	public Timestamp getUpdatetime() {
		return this.updatetime;
	}

	public void setUpdatetime(Timestamp updatetime) {
		this.updatetime = updatetime;
	}

	public Set getEads() {
		return this.eads;
	}

	public void setEads(Set eads) {
		this.eads = eads;
	}

}