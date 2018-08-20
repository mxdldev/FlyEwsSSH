package com.ews.bean;

import java.sql.Timestamp;

/**
 * Etalent entity. @author MyEclipse Persistence Tools
 */

public class Etalent implements java.io.Serializable {

	// Fields

	private Integer taid;
	private Ejobs ejobs;
	private String tatitle;
	private String taname;
	private String tasex;
	private String tastature;
	private String taarea;
	private Timestamp tabirthday;
	private String tafolk;
	private String taavoirdupois;
	private String tamarriage;
	private String taidentity;
	private String tatel;
	private String taemail;
	private String taaddr;
	private String taqq;
	private String tacert;
	private String taspecialty;
	private String taschool;
	private String tatype;
	private String tadeal;
	private String taworkyear;
	private String tatoworktime;
	private String taeducate;
	private String tawork;
	private String taskill;
	private String taother;
	private String tapic;
	private Timestamp taaddtime;

	// Constructors

	/** default constructor */
	public Etalent() {
	}

	/** full constructor */
	public Etalent(Ejobs ejobs, String tatitle, String taname, String tasex,
			String tastature, String taarea, Timestamp tabirthday,
			String tafolk, String taavoirdupois, String tamarriage,
			String taidentity, String tatel, String taemail, String taaddr,
			String taqq, String tacert, String taspecialty, String taschool,
			String tatype, String tadeal, String taworkyear,
			String tatoworktime, String taeducate, String tawork,
			String taskill, String taother, String tapic, Timestamp taaddtime) {
		this.ejobs = ejobs;
		this.tatitle = tatitle;
		this.taname = taname;
		this.tasex = tasex;
		this.tastature = tastature;
		this.taarea = taarea;
		this.tabirthday = tabirthday;
		this.tafolk = tafolk;
		this.taavoirdupois = taavoirdupois;
		this.tamarriage = tamarriage;
		this.taidentity = taidentity;
		this.tatel = tatel;
		this.taemail = taemail;
		this.taaddr = taaddr;
		this.taqq = taqq;
		this.tacert = tacert;
		this.taspecialty = taspecialty;
		this.taschool = taschool;
		this.tatype = tatype;
		this.tadeal = tadeal;
		this.taworkyear = taworkyear;
		this.tatoworktime = tatoworktime;
		this.taeducate = taeducate;
		this.tawork = tawork;
		this.taskill = taskill;
		this.taother = taother;
		this.tapic = tapic;
		this.taaddtime = taaddtime;
	}

	// Property accessors

	public Integer getTaid() {
		return this.taid;
	}

	public void setTaid(Integer taid) {
		this.taid = taid;
	}

	public Ejobs getEjobs() {
		return this.ejobs;
	}

	public void setEjobs(Ejobs ejobs) {
		this.ejobs = ejobs;
	}

	public String getTatitle() {
		return this.tatitle;
	}

	public void setTatitle(String tatitle) {
		this.tatitle = tatitle;
	}

	public String getTaname() {
		return this.taname;
	}

	public void setTaname(String taname) {
		this.taname = taname;
	}

	public String getTasex() {
		return this.tasex;
	}

	public void setTasex(String tasex) {
		this.tasex = tasex;
	}

	public String getTastature() {
		return this.tastature;
	}

	public void setTastature(String tastature) {
		this.tastature = tastature;
	}

	public String getTaarea() {
		return this.taarea;
	}

	public void setTaarea(String taarea) {
		this.taarea = taarea;
	}

	public Timestamp getTabirthday() {
		return this.tabirthday;
	}

	public void setTabirthday(Timestamp tabirthday) {
		this.tabirthday = tabirthday;
	}

	public String getTafolk() {
		return this.tafolk;
	}

	public void setTafolk(String tafolk) {
		this.tafolk = tafolk;
	}

	public String getTaavoirdupois() {
		return this.taavoirdupois;
	}

	public void setTaavoirdupois(String taavoirdupois) {
		this.taavoirdupois = taavoirdupois;
	}

	public String getTamarriage() {
		return this.tamarriage;
	}

	public void setTamarriage(String tamarriage) {
		this.tamarriage = tamarriage;
	}

	public String getTaidentity() {
		return this.taidentity;
	}

	public void setTaidentity(String taidentity) {
		this.taidentity = taidentity;
	}

	public String getTatel() {
		return this.tatel;
	}

	public void setTatel(String tatel) {
		this.tatel = tatel;
	}

	public String getTaemail() {
		return this.taemail;
	}

	public void setTaemail(String taemail) {
		this.taemail = taemail;
	}

	public String getTaaddr() {
		return this.taaddr;
	}

	public void setTaaddr(String taaddr) {
		this.taaddr = taaddr;
	}

	public String getTaqq() {
		return this.taqq;
	}

	public void setTaqq(String taqq) {
		this.taqq = taqq;
	}

	public String getTacert() {
		return this.tacert;
	}

	public void setTacert(String tacert) {
		this.tacert = tacert;
	}

	public String getTaspecialty() {
		return this.taspecialty;
	}

	public void setTaspecialty(String taspecialty) {
		this.taspecialty = taspecialty;
	}

	public String getTaschool() {
		return this.taschool;
	}

	public void setTaschool(String taschool) {
		this.taschool = taschool;
	}

	public String getTatype() {
		return this.tatype;
	}

	public void setTatype(String tatype) {
		this.tatype = tatype;
	}

	public String getTadeal() {
		return this.tadeal;
	}

	public void setTadeal(String tadeal) {
		this.tadeal = tadeal;
	}

	public String getTaworkyear() {
		return this.taworkyear;
	}

	public void setTaworkyear(String taworkyear) {
		this.taworkyear = taworkyear;
	}

	public String getTatoworktime() {
		return this.tatoworktime;
	}

	public void setTatoworktime(String tatoworktime) {
		this.tatoworktime = tatoworktime;
	}

	public String getTaeducate() {
		return this.taeducate;
	}

	public void setTaeducate(String taeducate) {
		this.taeducate = taeducate;
	}

	public String getTawork() {
		return this.tawork;
	}

	public void setTawork(String tawork) {
		this.tawork = tawork;
	}

	public String getTaskill() {
		return this.taskill;
	}

	public void setTaskill(String taskill) {
		this.taskill = taskill;
	}

	public String getTaother() {
		return this.taother;
	}

	public void setTaother(String taother) {
		this.taother = taother;
	}

	public String getTapic() {
		return this.tapic;
	}

	public void setTapic(String tapic) {
		this.tapic = tapic;
	}

	public Timestamp getTaaddtime() {
		return this.taaddtime;
	}

	public void setTaaddtime(Timestamp taaddtime) {
		this.taaddtime = taaddtime;
	}

}