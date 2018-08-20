package com.ews.bean;

import java.sql.Timestamp;

/**
 * Eproduct entity. @author MyEclipse Persistence Tools
 */

public class Eproduct implements java.io.Serializable {

	// Fields

	private Integer proid;
	private Echannels echannels;
	private Eclass eclass;
	private Integer proorder;
	private String protitle;
	private String promodel;
	private String prointro;
	private String producer;
	private String protrade;
	private String proabout;
	private String protext;
	private String propic;
	private Double price;
	private String unit;
	private Short projack;
	private Short prohot;
	private Short prorecommend;
	private Short prodisplay;
	private Integer prohit;
	private String prorar;
	private Timestamp promodiftime;
	private Timestamp proaddtime;

	// Constructors

	/** default constructor */
	public Eproduct() {
	}

	/** full constructor */
	public Eproduct(Echannels echannels, Eclass eclass, Integer proorder,
			String protitle, String promodel, String prointro, String producer,
			String protrade, String proabout, String protext, String propic,
			Double price, String unit, Short projack, Short prohot,
			Short prorecommend, Short prodisplay, Integer prohit,
			String prorar, Timestamp promodiftime, Timestamp proaddtime) {
		this.echannels = echannels;
		this.eclass = eclass;
		this.proorder = proorder;
		this.protitle = protitle;
		this.promodel = promodel;
		this.prointro = prointro;
		this.producer = producer;
		this.protrade = protrade;
		this.proabout = proabout;
		this.protext = protext;
		this.propic = propic;
		this.price = price;
		this.unit = unit;
		this.projack = projack;
		this.prohot = prohot;
		this.prorecommend = prorecommend;
		this.prodisplay = prodisplay;
		this.prohit = prohit;
		this.prorar = prorar;
		this.promodiftime = promodiftime;
		this.proaddtime = proaddtime;
	}

	// Property accessors

	public Integer getProid() {
		return this.proid;
	}

	public void setProid(Integer proid) {
		this.proid = proid;
	}

	public Echannels getEchannels() {
		return this.echannels;
	}

	public void setEchannels(Echannels echannels) {
		this.echannels = echannels;
	}

	public Eclass getEclass() {
		return this.eclass;
	}

	public void setEclass(Eclass eclass) {
		this.eclass = eclass;
	}

	public Integer getProorder() {
		return this.proorder;
	}

	public void setProorder(Integer proorder) {
		this.proorder = proorder;
	}

	public String getProtitle() {
		return this.protitle;
	}

	public void setProtitle(String protitle) {
		this.protitle = protitle;
	}

	public String getPromodel() {
		return this.promodel;
	}

	public void setPromodel(String promodel) {
		this.promodel = promodel;
	}

	public String getProintro() {
		return this.prointro;
	}

	public void setProintro(String prointro) {
		this.prointro = prointro;
	}

	public String getProducer() {
		return this.producer;
	}

	public void setProducer(String producer) {
		this.producer = producer;
	}

	public String getProtrade() {
		return this.protrade;
	}

	public void setProtrade(String protrade) {
		this.protrade = protrade;
	}

	public String getProabout() {
		return this.proabout;
	}

	public void setProabout(String proabout) {
		this.proabout = proabout;
	}

	public String getProtext() {
		return this.protext;
	}

	public void setProtext(String protext) {
		this.protext = protext;
	}

	public String getPropic() {
		return this.propic;
	}

	public void setPropic(String propic) {
		this.propic = propic;
	}

	public Double getPrice() {
		return this.price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getUnit() {
		return this.unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public Short getProjack() {
		return this.projack;
	}

	public void setProjack(Short projack) {
		this.projack = projack;
	}

	public Short getProhot() {
		return this.prohot;
	}

	public void setProhot(Short prohot) {
		this.prohot = prohot;
	}

	public Short getProrecommend() {
		return this.prorecommend;
	}

	public void setProrecommend(Short prorecommend) {
		this.prorecommend = prorecommend;
	}

	public Short getProdisplay() {
		return this.prodisplay;
	}

	public void setProdisplay(Short prodisplay) {
		this.prodisplay = prodisplay;
	}

	public Integer getProhit() {
		return this.prohit;
	}

	public void setProhit(Integer prohit) {
		this.prohit = prohit;
	}

	public String getProrar() {
		return this.prorar;
	}

	public void setProrar(String prorar) {
		this.prorar = prorar;
	}

	public Timestamp getPromodiftime() {
		return this.promodiftime;
	}

	public void setPromodiftime(Timestamp promodiftime) {
		this.promodiftime = promodiftime;
	}

	public Timestamp getProaddtime() {
		return this.proaddtime;
	}

	public void setProaddtime(Timestamp proaddtime) {
		this.proaddtime = proaddtime;
	}

}