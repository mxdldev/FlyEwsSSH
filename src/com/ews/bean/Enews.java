package com.ews.bean;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

/**
 * Enews entity. @author MyEclipse Persistence Tools
 */

public class Enews implements java.io.Serializable {

	// Fields

	private Integer nid;
	private Echannels echannels;
	private Integer norder;
	private String nchtitle;
	private String nochtitleall;
	private String nctitle;
	private String ntitle;
	private String nstitle;
	private String ntext;
	private Short nbtitle;
	private Short nititle;
	private String ncolor;
	private String nabout;
	private String nkey;
	private String nwriter;
	private Short nauser;
	private String nsource;
	private String ntype;
	private String nqurl;
	private Short nhead;
	private Short njack;
	private Short nhot;
	private Short nrecommend;
	private Short npics;
	private Short nimage;
	private String npic;
	private Short nchome;
	private Short nindex;
	private Short nevaluation;
	private Integer nstatus;
	private Integer nhit;
	private Short npage;
	private String nrelated;
	private String nrar;
	private Timestamp nmodiftime;
	private Timestamp nmaturity;
	private Integer nauserid;
	private Integer nuserid;
	private Timestamp naddtime;
	private Set enewspages = new HashSet(0);
	private Set enewscomments = new HashSet(0);

	// Constructors

	/** default constructor */
	public Enews() {
	}

	/** full constructor */
	public Enews(Echannels echannels, Integer norder, String nchtitle,
			String nochtitleall, String nctitle, String ntitle, String nstitle,
			String ntext, Short nbtitle, Short nititle, String ncolor,
			String nabout, String nkey, String nwriter, Short nauser,
			String nsource, String ntype, String nqurl, Short nhead,
			Short njack, Short nhot, Short nrecommend, Short npics,
			Short nimage, String npic, Short nchome, Short nindex,
			Short nevaluation, Integer nstatus, Integer nhit, Short npage,
			String nrelated, String nrar, Timestamp nmodiftime,
			Timestamp nmaturity, Integer nauserid, Integer nuserid,
			Timestamp naddtime, Set enewspages, Set enewscomments) {
		this.echannels = echannels;
		this.norder = norder;
		this.nchtitle = nchtitle;
		this.nochtitleall = nochtitleall;
		this.nctitle = nctitle;
		this.ntitle = ntitle;
		this.nstitle = nstitle;
		this.ntext = ntext;
		this.nbtitle = nbtitle;
		this.nititle = nititle;
		this.ncolor = ncolor;
		this.nabout = nabout;
		this.nkey = nkey;
		this.nwriter = nwriter;
		this.nauser = nauser;
		this.nsource = nsource;
		this.ntype = ntype;
		this.nqurl = nqurl;
		this.nhead = nhead;
		this.njack = njack;
		this.nhot = nhot;
		this.nrecommend = nrecommend;
		this.npics = npics;
		this.nimage = nimage;
		this.npic = npic;
		this.nchome = nchome;
		this.nindex = nindex;
		this.nevaluation = nevaluation;
		this.nstatus = nstatus;
		this.nhit = nhit;
		this.npage = npage;
		this.nrelated = nrelated;
		this.nrar = nrar;
		this.nmodiftime = nmodiftime;
		this.nmaturity = nmaturity;
		this.nauserid = nauserid;
		this.nuserid = nuserid;
		this.naddtime = naddtime;
		this.enewspages = enewspages;
		this.enewscomments = enewscomments;
	}

	// Property accessors

	public Integer getNid() {
		return this.nid;
	}

	public void setNid(Integer nid) {
		this.nid = nid;
	}

	public Echannels getEchannels() {
		return this.echannels;
	}

	public void setEchannels(Echannels echannels) {
		this.echannels = echannels;
	}

	public Integer getNorder() {
		return this.norder;
	}

	public void setNorder(Integer norder) {
		this.norder = norder;
	}

	public String getNchtitle() {
		return this.nchtitle;
	}

	public void setNchtitle(String nchtitle) {
		this.nchtitle = nchtitle;
	}

	public String getNochtitleall() {
		return this.nochtitleall;
	}

	public void setNochtitleall(String nochtitleall) {
		this.nochtitleall = nochtitleall;
	}

	public String getNctitle() {
		return this.nctitle;
	}

	public void setNctitle(String nctitle) {
		this.nctitle = nctitle;
	}

	public String getNtitle() {
		return this.ntitle;
	}

	public void setNtitle(String ntitle) {
		this.ntitle = ntitle;
	}

	public String getNstitle() {
		return this.nstitle;
	}

	public void setNstitle(String nstitle) {
		this.nstitle = nstitle;
	}

	public String getNtext() {
		return this.ntext;
	}

	public void setNtext(String ntext) {
		this.ntext = ntext;
	}

	public Short getNbtitle() {
		return this.nbtitle;
	}

	public void setNbtitle(Short nbtitle) {
		this.nbtitle = nbtitle;
	}

	public Short getNititle() {
		return this.nititle;
	}

	public void setNititle(Short nititle) {
		this.nititle = nititle;
	}

	public String getNcolor() {
		return this.ncolor;
	}

	public void setNcolor(String ncolor) {
		this.ncolor = ncolor;
	}

	public String getNabout() {
		return this.nabout;
	}

	public void setNabout(String nabout) {
		this.nabout = nabout;
	}

	public String getNkey() {
		return this.nkey;
	}

	public void setNkey(String nkey) {
		this.nkey = nkey;
	}

	public String getNwriter() {
		return this.nwriter;
	}

	public void setNwriter(String nwriter) {
		this.nwriter = nwriter;
	}

	public Short getNauser() {
		return this.nauser;
	}

	public void setNauser(Short nauser) {
		this.nauser = nauser;
	}

	public String getNsource() {
		return this.nsource;
	}

	public void setNsource(String nsource) {
		this.nsource = nsource;
	}

	public String getNtype() {
		return this.ntype;
	}

	public void setNtype(String ntype) {
		this.ntype = ntype;
	}

	public String getNqurl() {
		return this.nqurl;
	}

	public void setNqurl(String nqurl) {
		this.nqurl = nqurl;
	}

	public Short getNhead() {
		return this.nhead;
	}

	public void setNhead(Short nhead) {
		this.nhead = nhead;
	}

	public Short getNjack() {
		return this.njack;
	}

	public void setNjack(Short njack) {
		this.njack = njack;
	}

	public Short getNhot() {
		return this.nhot;
	}

	public void setNhot(Short nhot) {
		this.nhot = nhot;
	}

	public Short getNrecommend() {
		return this.nrecommend;
	}

	public void setNrecommend(Short nrecommend) {
		this.nrecommend = nrecommend;
	}

	public Short getNpics() {
		return this.npics;
	}

	public void setNpics(Short npics) {
		this.npics = npics;
	}

	public Short getNimage() {
		return this.nimage;
	}

	public void setNimage(Short nimage) {
		this.nimage = nimage;
	}

	public String getNpic() {
		return this.npic;
	}

	public void setNpic(String npic) {
		this.npic = npic;
	}

	public Short getNchome() {
		return this.nchome;
	}

	public void setNchome(Short nchome) {
		this.nchome = nchome;
	}

	public Short getNindex() {
		return this.nindex;
	}

	public void setNindex(Short nindex) {
		this.nindex = nindex;
	}

	public Short getNevaluation() {
		return this.nevaluation;
	}

	public void setNevaluation(Short nevaluation) {
		this.nevaluation = nevaluation;
	}

	public Integer getNstatus() {
		return this.nstatus;
	}

	public void setNstatus(Integer nstatus) {
		this.nstatus = nstatus;
	}

	public Integer getNhit() {
		return this.nhit;
	}

	public void setNhit(Integer nhit) {
		this.nhit = nhit;
	}

	public Short getNpage() {
		return this.npage;
	}

	public void setNpage(Short npage) {
		this.npage = npage;
	}

	public String getNrelated() {
		return this.nrelated;
	}

	public void setNrelated(String nrelated) {
		this.nrelated = nrelated;
	}

	public String getNrar() {
		return this.nrar;
	}

	public void setNrar(String nrar) {
		this.nrar = nrar;
	}

	public Timestamp getNmodiftime() {
		return this.nmodiftime;
	}

	public void setNmodiftime(Timestamp nmodiftime) {
		this.nmodiftime = nmodiftime;
	}

	public Timestamp getNmaturity() {
		return this.nmaturity;
	}

	public void setNmaturity(Timestamp nmaturity) {
		this.nmaturity = nmaturity;
	}

	public Integer getNauserid() {
		return this.nauserid;
	}

	public void setNauserid(Integer nauserid) {
		this.nauserid = nauserid;
	}

	public Integer getNuserid() {
		return this.nuserid;
	}

	public void setNuserid(Integer nuserid) {
		this.nuserid = nuserid;
	}

	public Timestamp getNaddtime() {
		return this.naddtime;
	}

	public void setNaddtime(Timestamp naddtime) {
		this.naddtime = naddtime;
	}

	public Set getEnewspages() {
		return this.enewspages;
	}

	public void setEnewspages(Set enewspages) {
		this.enewspages = enewspages;
	}

	public Set getEnewscomments() {
		return this.enewscomments;
	}

	public void setEnewscomments(Set enewscomments) {
		this.enewscomments = enewscomments;
	}

}