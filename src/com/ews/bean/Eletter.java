package com.ews.bean;

import java.sql.Timestamp;

/**
 * Eletter entity. @author MyEclipse Persistence Tools
 */

public class Eletter implements java.io.Serializable {

	// Fields

	private Integer leid;
	private Integer loutuid;
	private Integer loutauid;
	private Integer linuid;
	private Integer linauid;
	private String letitle;
	private String lecontent;
	private Short loutdeleted;
	private Short lindeleted;
	private Timestamp leaddtime;

	// Constructors

	/** default constructor */
	public Eletter() {
	}

	/** full constructor */
	public Eletter(Integer loutuid, Integer loutauid, Integer linuid,
			Integer linauid, String letitle, String lecontent,
			Short loutdeleted, Short lindeleted, Timestamp leaddtime) {
		this.loutuid = loutuid;
		this.loutauid = loutauid;
		this.linuid = linuid;
		this.linauid = linauid;
		this.letitle = letitle;
		this.lecontent = lecontent;
		this.loutdeleted = loutdeleted;
		this.lindeleted = lindeleted;
		this.leaddtime = leaddtime;
	}

	// Property accessors

	public Integer getLeid() {
		return this.leid;
	}

	public void setLeid(Integer leid) {
		this.leid = leid;
	}

	public Integer getLoutuid() {
		return this.loutuid;
	}

	public void setLoutuid(Integer loutuid) {
		this.loutuid = loutuid;
	}

	public Integer getLoutauid() {
		return this.loutauid;
	}

	public void setLoutauid(Integer loutauid) {
		this.loutauid = loutauid;
	}

	public Integer getLinuid() {
		return this.linuid;
	}

	public void setLinuid(Integer linuid) {
		this.linuid = linuid;
	}

	public Integer getLinauid() {
		return this.linauid;
	}

	public void setLinauid(Integer linauid) {
		this.linauid = linauid;
	}

	public String getLetitle() {
		return this.letitle;
	}

	public void setLetitle(String letitle) {
		this.letitle = letitle;
	}

	public String getLecontent() {
		return this.lecontent;
	}

	public void setLecontent(String lecontent) {
		this.lecontent = lecontent;
	}

	public Short getLoutdeleted() {
		return this.loutdeleted;
	}

	public void setLoutdeleted(Short loutdeleted) {
		this.loutdeleted = loutdeleted;
	}

	public Short getLindeleted() {
		return this.lindeleted;
	}

	public void setLindeleted(Short lindeleted) {
		this.lindeleted = lindeleted;
	}

	public Timestamp getLeaddtime() {
		return this.leaddtime;
	}

	public void setLeaddtime(Timestamp leaddtime) {
		this.leaddtime = leaddtime;
	}

}