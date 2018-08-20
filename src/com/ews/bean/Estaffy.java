package com.ews.bean;

import java.sql.Timestamp;

/**
 * Estaffy entity. @author MyEclipse Persistence Tools
 */

public class Estaffy implements java.io.Serializable {

	// Fields

	private Integer stid;
	private Eduties eduties;
	private Edepart edepart;
	private Integer storder;
	private String stname;
	private String stno;
	private String stpic;
	private Timestamp staddtime;

	// Constructors

	/** default constructor */
	public Estaffy() {
	}

	/** full constructor */
	public Estaffy(Eduties eduties, Edepart edepart, Integer storder,
			String stname, String stno, String stpic, Timestamp staddtime) {
		this.eduties = eduties;
		this.edepart = edepart;
		this.storder = storder;
		this.stname = stname;
		this.stno = stno;
		this.stpic = stpic;
		this.staddtime = staddtime;
	}

	// Property accessors

	public Integer getStid() {
		return this.stid;
	}

	public void setStid(Integer stid) {
		this.stid = stid;
	}

	public Eduties getEduties() {
		return this.eduties;
	}

	public void setEduties(Eduties eduties) {
		this.eduties = eduties;
	}

	public Edepart getEdepart() {
		return this.edepart;
	}

	public void setEdepart(Edepart edepart) {
		this.edepart = edepart;
	}

	public Integer getStorder() {
		return this.storder;
	}

	public void setStorder(Integer storder) {
		this.storder = storder;
	}

	public String getStname() {
		return this.stname;
	}

	public void setStname(String stname) {
		this.stname = stname;
	}

	public String getStno() {
		return this.stno;
	}

	public void setStno(String stno) {
		this.stno = stno;
	}

	public String getStpic() {
		return this.stpic;
	}

	public void setStpic(String stpic) {
		this.stpic = stpic;
	}

	public Timestamp getStaddtime() {
		return this.staddtime;
	}

	public void setStaddtime(Timestamp staddtime) {
		this.staddtime = staddtime;
	}

}