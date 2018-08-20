package com.ews.bean;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

/**
 * Ejobs entity. @author MyEclipse Persistence Tools
 */

public class Ejobs implements java.io.Serializable {

	// Fields

	private Integer jid;
	private Integer jorder;
	private String jtitle;
	private Integer jchid;
	private Short jdisplay;
	private String jpeople;
	private String jdeal;
	private Timestamp jstart;
	private Timestamp jend;
	private String jaddr;
	private String jcontent;
	private Set etalents = new HashSet(0);

	// Constructors

	/** default constructor */
	public Ejobs() {
	}

	/** full constructor */
	public Ejobs(Integer jorder, String jtitle, Integer jchid, Short jdisplay,
			String jpeople, String jdeal, Timestamp jstart, Timestamp jend,
			String jaddr, String jcontent, Set etalents) {
		this.jorder = jorder;
		this.jtitle = jtitle;
		this.jchid = jchid;
		this.jdisplay = jdisplay;
		this.jpeople = jpeople;
		this.jdeal = jdeal;
		this.jstart = jstart;
		this.jend = jend;
		this.jaddr = jaddr;
		this.jcontent = jcontent;
		this.etalents = etalents;
	}

	// Property accessors

	public Integer getJid() {
		return this.jid;
	}

	public void setJid(Integer jid) {
		this.jid = jid;
	}

	public Integer getJorder() {
		return this.jorder;
	}

	public void setJorder(Integer jorder) {
		this.jorder = jorder;
	}

	public String getJtitle() {
		return this.jtitle;
	}

	public void setJtitle(String jtitle) {
		this.jtitle = jtitle;
	}

	public Integer getJchid() {
		return this.jchid;
	}

	public void setJchid(Integer jchid) {
		this.jchid = jchid;
	}

	public Short getJdisplay() {
		return this.jdisplay;
	}

	public void setJdisplay(Short jdisplay) {
		this.jdisplay = jdisplay;
	}

	public String getJpeople() {
		return this.jpeople;
	}

	public void setJpeople(String jpeople) {
		this.jpeople = jpeople;
	}

	public String getJdeal() {
		return this.jdeal;
	}

	public void setJdeal(String jdeal) {
		this.jdeal = jdeal;
	}

	public Timestamp getJstart() {
		return this.jstart;
	}

	public void setJstart(Timestamp jstart) {
		this.jstart = jstart;
	}

	public Timestamp getJend() {
		return this.jend;
	}

	public void setJend(Timestamp jend) {
		this.jend = jend;
	}

	public String getJaddr() {
		return this.jaddr;
	}

	public void setJaddr(String jaddr) {
		this.jaddr = jaddr;
	}

	public String getJcontent() {
		return this.jcontent;
	}

	public void setJcontent(String jcontent) {
		this.jcontent = jcontent;
	}

	public Set getEtalents() {
		return this.etalents;
	}

	public void setEtalents(Set etalents) {
		this.etalents = etalents;
	}

}