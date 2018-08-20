package com.ews.bean;

import java.sql.Timestamp;

/**
 * Enotice entity. @author MyEclipse Persistence Tools
 */

public class Enotice implements java.io.Serializable {

	// Fields

	private Integer notid;
	private Integer notorder;
	private Integer notdisplay;
	private String nottitle;
	private String nottext;
	private Timestamp notaddtime;
	private Timestamp notedittime;
	private Timestamp notlasttime;

	// Constructors

	/** default constructor */
	public Enotice() {
	}

	/** full constructor */
	public Enotice(Integer notorder, Integer notdisplay, String nottitle,
			String nottext, Timestamp notaddtime, Timestamp notedittime,
			Timestamp notlasttime) {
		this.notorder = notorder;
		this.notdisplay = notdisplay;
		this.nottitle = nottitle;
		this.nottext = nottext;
		this.notaddtime = notaddtime;
		this.notedittime = notedittime;
		this.notlasttime = notlasttime;
	}

	// Property accessors

	public Integer getNotid() {
		return this.notid;
	}

	public void setNotid(Integer notid) {
		this.notid = notid;
	}

	public Integer getNotorder() {
		return this.notorder;
	}

	public void setNotorder(Integer notorder) {
		this.notorder = notorder;
	}

	public Integer getNotdisplay() {
		return this.notdisplay;
	}

	public void setNotdisplay(Integer notdisplay) {
		this.notdisplay = notdisplay;
	}

	public String getNottitle() {
		return this.nottitle;
	}

	public void setNottitle(String nottitle) {
		this.nottitle = nottitle;
	}

	public String getNottext() {
		return this.nottext;
	}

	public void setNottext(String nottext) {
		this.nottext = nottext;
	}

	public Timestamp getNotaddtime() {
		return this.notaddtime;
	}

	public void setNotaddtime(Timestamp notaddtime) {
		this.notaddtime = notaddtime;
	}

	public Timestamp getNotedittime() {
		return this.notedittime;
	}

	public void setNotedittime(Timestamp notedittime) {
		this.notedittime = notedittime;
	}

	public Timestamp getNotlasttime() {
		return this.notlasttime;
	}

	public void setNotlasttime(Timestamp notlasttime) {
		this.notlasttime = notlasttime;
	}

}