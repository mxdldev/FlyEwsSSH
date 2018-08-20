package com.ews.bean;

/**
 * Einfo entity. @author MyEclipse Persistence Tools
 */

public class Einfo implements java.io.Serializable {

	// Fields

	private Integer id;
	private String webname;
	private String webdomain;
	private Short publish;
	private String publishurl;
	private Short type;
	private String keywork;
	private String description;
	private Short userreg;
	private Short emailopen;
	private Short userlog;
	private Short comment;
	private Short code;
	private Short statis;
	private Short seal;
	private String emailservices;
	private String systememail;
	private String emailuser;
	private String emailpass;
	private Short metype;
	private Short ncisuser;
	private Integer fano;

	// Constructors

	/** default constructor */
	public Einfo() {
	}

	/** full constructor */
	public Einfo(String webname, String webdomain, Short publish,
			String publishurl, Short type, String keywork, String description,
			Short userreg, Short emailopen, Short userlog, Short comment,
			Short code, Short statis, Short seal, String emailservices,
			String systememail, String emailuser, String emailpass,
			Short metype, Short ncisuser, Integer fano) {
		this.webname = webname;
		this.webdomain = webdomain;
		this.publish = publish;
		this.publishurl = publishurl;
		this.type = type;
		this.keywork = keywork;
		this.description = description;
		this.userreg = userreg;
		this.emailopen = emailopen;
		this.userlog = userlog;
		this.comment = comment;
		this.code = code;
		this.statis = statis;
		this.seal = seal;
		this.emailservices = emailservices;
		this.systememail = systememail;
		this.emailuser = emailuser;
		this.emailpass = emailpass;
		this.metype = metype;
		this.ncisuser = ncisuser;
		this.fano = fano;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getWebname() {
		return this.webname;
	}

	public void setWebname(String webname) {
		this.webname = webname;
	}

	public String getWebdomain() {
		return this.webdomain;
	}

	public void setWebdomain(String webdomain) {
		this.webdomain = webdomain;
	}

	public Short getPublish() {
		return this.publish;
	}

	public void setPublish(Short publish) {
		this.publish = publish;
	}

	public String getPublishurl() {
		return this.publishurl;
	}

	public void setPublishurl(String publishurl) {
		this.publishurl = publishurl;
	}

	public Short getType() {
		return this.type;
	}

	public void setType(Short type) {
		this.type = type;
	}

	public String getKeywork() {
		return this.keywork;
	}

	public void setKeywork(String keywork) {
		this.keywork = keywork;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Short getUserreg() {
		return this.userreg;
	}

	public void setUserreg(Short userreg) {
		this.userreg = userreg;
	}

	public Short getEmailopen() {
		return this.emailopen;
	}

	public void setEmailopen(Short emailopen) {
		this.emailopen = emailopen;
	}

	public Short getUserlog() {
		return this.userlog;
	}

	public void setUserlog(Short userlog) {
		this.userlog = userlog;
	}

	public Short getComment() {
		return this.comment;
	}

	public void setComment(Short comment) {
		this.comment = comment;
	}

	public Short getCode() {
		return this.code;
	}

	public void setCode(Short code) {
		this.code = code;
	}

	public Short getStatis() {
		return this.statis;
	}

	public void setStatis(Short statis) {
		this.statis = statis;
	}

	public Short getSeal() {
		return this.seal;
	}

	public void setSeal(Short seal) {
		this.seal = seal;
	}

	public String getEmailservices() {
		return this.emailservices;
	}

	public void setEmailservices(String emailservices) {
		this.emailservices = emailservices;
	}

	public String getSystememail() {
		return this.systememail;
	}

	public void setSystememail(String systememail) {
		this.systememail = systememail;
	}

	public String getEmailuser() {
		return this.emailuser;
	}

	public void setEmailuser(String emailuser) {
		this.emailuser = emailuser;
	}

	public String getEmailpass() {
		return this.emailpass;
	}

	public void setEmailpass(String emailpass) {
		this.emailpass = emailpass;
	}

	public Short getMetype() {
		return this.metype;
	}

	public void setMetype(Short metype) {
		this.metype = metype;
	}

	public Short getNcisuser() {
		return this.ncisuser;
	}

	public void setNcisuser(Short ncisuser) {
		this.ncisuser = ncisuser;
	}

	public Integer getFano() {
		return this.fano;
	}

	public void setFano(Integer fano) {
		this.fano = fano;
	}

}