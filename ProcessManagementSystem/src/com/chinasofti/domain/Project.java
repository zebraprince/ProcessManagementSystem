package com.chinasofti.domain;

/**
 * Project entity.
 * 
 * @author MyEclipse Persistence Tools
 */

public class Project implements java.io.Serializable {

	// Fields

	private Integer pid;
	private Integer uid;
	private String pname;
	private Integer state;
	private String firdate;
	private String firtime;
	private Integer firtype;
	private Float fircost;
	private String firgoal;
	private Integer firfirId;
	private String firfirop;
	private Integer firsecId;
	private String firsecop;
	private Integer firthiId;
	private String firthiop;
	private Integer firfouId;
	private String firfouop;
	private Integer firfivId;
	private String firfivop;
	private String firpasdate;
	private String suffer;
	private String coo;
	private String startdate;
	private String enddate;
	private String personA;
	private String personB;
	private Float proinvest;
	private String secdate;
	private Integer secfirId;
	private String secfirop;
	private Integer secsecId;
	private String secsecop;
	private Integer secthiId;
	private String sechtiop;
	private Integer secfouId;
	private String secfouop;
	private Integer secfivId;
	private String secfivop;
	private String secpasdate;
	private Float costrep;
	private Integer prorep;
	private String thidate;
	private Integer thifirId;
	private String thifirop;
	private Integer thisecId;
	private String thisecop;
	private Integer thithiId;
	private String thithiop;
	private Integer thifouId;
	private String thifouop;
	private Integer thifivId;
	private String thifivop;
	private String thipasdate;
	private String foudic;
	private String foudate;
	private Integer foufirId;
	private String foufirop;
	private Integer fousecId;
	private String fousecop;
	private Integer fouthiId;
	private String fouthiop;
	private Integer foufouId;
	private String foufouop;
	private Integer foufivId;
	private String foufivop;
	private String foupasdate;
	private Integer degree;
	private String fivedate;
	private Integer fivfirId;
	private String fivfirop;
	private Integer fivsecId;
	private String fivsecop;
	private Integer fivthiId;
	private String fivthiop;
	private Integer fivfouId;
	private String fivfouop;
	private Integer fivfivId;
	private String fivfivop;
	private String fivpasdate;
	private String a;
	private String b;
	private String c;
	private String d;
	private String e;
	private String f;
	private String g;
	private String h;
	private String i;
	private String j;
	private String k;
	private String l;
	private String m;
	private String n;

	// Constructors

	/** default constructor */
	public Project() {
	}

	/** full constructor */
	public Project(Integer uid, String pname, Integer state, String firdate,
			String firtime, Integer firtype, Float fircost, String firgoal,
			Integer firfirId, String firfirop, Integer firsecId,
			String firsecop, Integer firthiId, String firthiop,
			Integer firfouId, String firfouop, Integer firfivId,
			String firfivop, String firpasdate, String suffer, String coo,
			String startdate, String enddate, String personA, String personB,
			Float proinvest, String secdate, Integer secfirId, String secfirop,
			Integer secsecId, String secsecop, Integer secthiId,
			String sechtiop, Integer secfouId, String secfouop,
			Integer secfivId, String secfivop, String secpasdate,
			Float costrep, Integer prorep, String thidate, Integer thifirId,
			String thifirop, Integer thisecId, String thisecop,
			Integer thithiId, String thithiop, Integer thifouId,
			String thifouop, Integer thifivId, String thifivop,
			String thipasdate, String foudic, String foudate, Integer foufirId,
			String foufirop, Integer fousecId, String fousecop,
			Integer fouthiId, String fouthiop, Integer foufouId,
			String foufouop, Integer foufivId, String foufivop,
			String foupasdate, Integer degree, String fivedate,
			Integer fivfirId, String fivfirop, Integer fivsecId,
			String fivsecop, Integer fivthiId, String fivthiop,
			Integer fivfouId, String fivfouop, Integer fivfivId,
			String fivfivop, String fivpasdate, String a, String b, String c,
			String d, String e, String f, String g, String h, String i,
			String j, String k, String l, String m, String n) {
		this.uid = uid;
		this.pname = pname;
		this.state = state;
		this.firdate = firdate;
		this.firtime = firtime;
		this.firtype = firtype;
		this.fircost = fircost;
		this.firgoal = firgoal;
		this.firfirId = firfirId;
		this.firfirop = firfirop;
		this.firsecId = firsecId;
		this.firsecop = firsecop;
		this.firthiId = firthiId;
		this.firthiop = firthiop;
		this.firfouId = firfouId;
		this.firfouop = firfouop;
		this.firfivId = firfivId;
		this.firfivop = firfivop;
		this.firpasdate = firpasdate;
		this.suffer = suffer;
		this.coo = coo;
		this.startdate = startdate;
		this.enddate = enddate;
		this.personA = personA;
		this.personB = personB;
		this.proinvest = proinvest;
		this.secdate = secdate;
		this.secfirId = secfirId;
		this.secfirop = secfirop;
		this.secsecId = secsecId;
		this.secsecop = secsecop;
		this.secthiId = secthiId;
		this.sechtiop = sechtiop;
		this.secfouId = secfouId;
		this.secfouop = secfouop;
		this.secfivId = secfivId;
		this.secfivop = secfivop;
		this.secpasdate = secpasdate;
		this.costrep = costrep;
		this.prorep = prorep;
		this.thidate = thidate;
		this.thifirId = thifirId;
		this.thifirop = thifirop;
		this.thisecId = thisecId;
		this.thisecop = thisecop;
		this.thithiId = thithiId;
		this.thithiop = thithiop;
		this.thifouId = thifouId;
		this.thifouop = thifouop;
		this.thifivId = thifivId;
		this.thifivop = thifivop;
		this.thipasdate = thipasdate;
		this.foudic = foudic;
		this.foudate = foudate;
		this.foufirId = foufirId;
		this.foufirop = foufirop;
		this.fousecId = fousecId;
		this.fousecop = fousecop;
		this.fouthiId = fouthiId;
		this.fouthiop = fouthiop;
		this.foufouId = foufouId;
		this.foufouop = foufouop;
		this.foufivId = foufivId;
		this.foufivop = foufivop;
		this.foupasdate = foupasdate;
		this.degree = degree;
		this.fivedate = fivedate;
		this.fivfirId = fivfirId;
		this.fivfirop = fivfirop;
		this.fivsecId = fivsecId;
		this.fivsecop = fivsecop;
		this.fivthiId = fivthiId;
		this.fivthiop = fivthiop;
		this.fivfouId = fivfouId;
		this.fivfouop = fivfouop;
		this.fivfivId = fivfivId;
		this.fivfivop = fivfivop;
		this.fivpasdate = fivpasdate;
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
		this.e = e;
		this.f = f;
		this.g = g;
		this.h = h;
		this.i = i;
		this.j = j;
		this.k = k;
		this.l = l;
		this.m = m;
		this.n = n;
	}

	// Property accessors
	
	public boolean equals(Project p){
		return (this.pid).equals(p.pid);
	}

	public Integer getPid() {
		return this.pid;
	}

	public void setPid(Integer pid) {
		this.pid = pid;
	}

	public Integer getUid() {
		return this.uid;
	}

	public void setUid(Integer uid) {
		this.uid = uid;
	}

	public String getPname() {
		return this.pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public Integer getState() {
		return this.state;
	}

	public void setState(Integer state) {
		this.state = state;
	}

	public String getFirdate() {
		return this.firdate;
	}

	public void setFirdate(String firdate) {
		this.firdate = firdate;
	}

	public String getFirtime() {
		return this.firtime;
	}

	public void setFirtime(String firtime) {
		this.firtime = firtime;
	}

	public Integer getFirtype() {
		return this.firtype;
	}

	public void setFirtype(Integer firtype) {
		this.firtype = firtype;
	}

	public Float getFircost() {
		return this.fircost;
	}

	public void setFircost(Float fircost) {
		this.fircost = fircost;
	}

	public String getFirgoal() {
		return this.firgoal;
	}

	public void setFirgoal(String firgoal) {
		this.firgoal = firgoal;
	}

	public Integer getFirfirId() {
		return this.firfirId;
	}

	public void setFirfirId(Integer firfirId) {
		this.firfirId = firfirId;
	}

	public String getFirfirop() {
		return this.firfirop;
	}

	public void setFirfirop(String firfirop) {
		this.firfirop = firfirop;
	}

	public Integer getFirsecId() {
		return this.firsecId;
	}

	public void setFirsecId(Integer firsecId) {
		this.firsecId = firsecId;
	}

	public String getFirsecop() {
		return this.firsecop;
	}

	public void setFirsecop(String firsecop) {
		this.firsecop = firsecop;
	}

	public Integer getFirthiId() {
		return this.firthiId;
	}

	public void setFirthiId(Integer firthiId) {
		this.firthiId = firthiId;
	}

	public String getFirthiop() {
		return this.firthiop;
	}

	public void setFirthiop(String firthiop) {
		this.firthiop = firthiop;
	}

	public Integer getFirfouId() {
		return this.firfouId;
	}

	public void setFirfouId(Integer firfouId) {
		this.firfouId = firfouId;
	}

	public String getFirfouop() {
		return this.firfouop;
	}

	public void setFirfouop(String firfouop) {
		this.firfouop = firfouop;
	}

	public Integer getFirfivId() {
		return this.firfivId;
	}

	public void setFirfivId(Integer firfivId) {
		this.firfivId = firfivId;
	}

	public String getFirfivop() {
		return this.firfivop;
	}

	public void setFirfivop(String firfivop) {
		this.firfivop = firfivop;
	}

	public String getFirpasdate() {
		return this.firpasdate;
	}

	public void setFirpasdate(String firpasdate) {
		this.firpasdate = firpasdate;
	}

	public String getSuffer() {
		return this.suffer;
	}

	public void setSuffer(String suffer) {
		this.suffer = suffer;
	}

	public String getCoo() {
		return this.coo;
	}

	public void setCoo(String coo) {
		this.coo = coo;
	}

	public String getStartdate() {
		return this.startdate;
	}

	public void setStartdate(String startdate) {
		this.startdate = startdate;
	}

	public String getEnddate() {
		return this.enddate;
	}

	public void setEnddate(String enddate) {
		this.enddate = enddate;
	}

	public String getPersonA() {
		return this.personA;
	}

	public void setPersonA(String personA) {
		this.personA = personA;
	}

	public String getPersonB() {
		return this.personB;
	}

	public void setPersonB(String personB) {
		this.personB = personB;
	}

	public Float getProinvest() {
		return this.proinvest;
	}

	public void setProinvest(Float proinvest) {
		this.proinvest = proinvest;
	}

	public String getSecdate() {
		return this.secdate;
	}

	public void setSecdate(String secdate) {
		this.secdate = secdate;
	}

	public Integer getSecfirId() {
		return this.secfirId;
	}

	public void setSecfirId(Integer secfirId) {
		this.secfirId = secfirId;
	}

	public String getSecfirop() {
		return this.secfirop;
	}

	public void setSecfirop(String secfirop) {
		this.secfirop = secfirop;
	}

	public Integer getSecsecId() {
		return this.secsecId;
	}

	public void setSecsecId(Integer secsecId) {
		this.secsecId = secsecId;
	}

	public String getSecsecop() {
		return this.secsecop;
	}

	public void setSecsecop(String secsecop) {
		this.secsecop = secsecop;
	}

	public Integer getSecthiId() {
		return this.secthiId;
	}

	public void setSecthiId(Integer secthiId) {
		this.secthiId = secthiId;
	}

	public String getSechtiop() {
		return this.sechtiop;
	}

	public void setSechtiop(String sechtiop) {
		this.sechtiop = sechtiop;
	}

	public Integer getSecfouId() {
		return this.secfouId;
	}

	public void setSecfouId(Integer secfouId) {
		this.secfouId = secfouId;
	}

	public String getSecfouop() {
		return this.secfouop;
	}

	public void setSecfouop(String secfouop) {
		this.secfouop = secfouop;
	}

	public Integer getSecfivId() {
		return this.secfivId;
	}

	public void setSecfivId(Integer secfivId) {
		this.secfivId = secfivId;
	}

	public String getSecfivop() {
		return this.secfivop;
	}

	public void setSecfivop(String secfivop) {
		this.secfivop = secfivop;
	}

	public String getSecpasdate() {
		return this.secpasdate;
	}

	public void setSecpasdate(String secpasdate) {
		this.secpasdate = secpasdate;
	}

	public Float getCostrep() {
		return this.costrep;
	}

	public void setCostrep(Float costrep) {
		this.costrep = costrep;
	}

	public Integer getProrep() {
		return this.prorep;
	}

	public void setProrep(Integer prorep) {
		this.prorep = prorep;
	}

	public String getThidate() {
		return this.thidate;
	}

	public void setThidate(String thidate) {
		this.thidate = thidate;
	}

	public Integer getThifirId() {
		return this.thifirId;
	}

	public void setThifirId(Integer thifirId) {
		this.thifirId = thifirId;
	}

	public String getThifirop() {
		return this.thifirop;
	}

	public void setThifirop(String thifirop) {
		this.thifirop = thifirop;
	}

	public Integer getThisecId() {
		return this.thisecId;
	}

	public void setThisecId(Integer thisecId) {
		this.thisecId = thisecId;
	}

	public String getThisecop() {
		return this.thisecop;
	}

	public void setThisecop(String thisecop) {
		this.thisecop = thisecop;
	}

	public Integer getThithiId() {
		return this.thithiId;
	}

	public void setThithiId(Integer thithiId) {
		this.thithiId = thithiId;
	}

	public String getThithiop() {
		return this.thithiop;
	}

	public void setThithiop(String thithiop) {
		this.thithiop = thithiop;
	}

	public Integer getThifouId() {
		return this.thifouId;
	}

	public void setThifouId(Integer thifouId) {
		this.thifouId = thifouId;
	}

	public String getThifouop() {
		return this.thifouop;
	}

	public void setThifouop(String thifouop) {
		this.thifouop = thifouop;
	}

	public Integer getThifivId() {
		return this.thifivId;
	}

	public void setThifivId(Integer thifivId) {
		this.thifivId = thifivId;
	}

	public String getThifivop() {
		return this.thifivop;
	}

	public void setThifivop(String thifivop) {
		this.thifivop = thifivop;
	}

	public String getThipasdate() {
		return this.thipasdate;
	}

	public void setThipasdate(String thipasdate) {
		this.thipasdate = thipasdate;
	}

	public String getFoudic() {
		return this.foudic;
	}

	public void setFoudic(String foudic) {
		this.foudic = foudic;
	}

	public String getFoudate() {
		return this.foudate;
	}

	public void setFoudate(String foudate) {
		this.foudate = foudate;
	}

	public Integer getFoufirId() {
		return this.foufirId;
	}

	public void setFoufirId(Integer foufirId) {
		this.foufirId = foufirId;
	}

	public String getFoufirop() {
		return this.foufirop;
	}

	public void setFoufirop(String foufirop) {
		this.foufirop = foufirop;
	}

	public Integer getFousecId() {
		return this.fousecId;
	}

	public void setFousecId(Integer fousecId) {
		this.fousecId = fousecId;
	}

	public String getFousecop() {
		return this.fousecop;
	}

	public void setFousecop(String fousecop) {
		this.fousecop = fousecop;
	}

	public Integer getFouthiId() {
		return this.fouthiId;
	}

	public void setFouthiId(Integer fouthiId) {
		this.fouthiId = fouthiId;
	}

	public String getFouthiop() {
		return this.fouthiop;
	}

	public void setFouthiop(String fouthiop) {
		this.fouthiop = fouthiop;
	}

	public Integer getFoufouId() {
		return this.foufouId;
	}

	public void setFoufouId(Integer foufouId) {
		this.foufouId = foufouId;
	}

	public String getFoufouop() {
		return this.foufouop;
	}

	public void setFoufouop(String foufouop) {
		this.foufouop = foufouop;
	}

	public Integer getFoufivId() {
		return this.foufivId;
	}

	public void setFoufivId(Integer foufivId) {
		this.foufivId = foufivId;
	}

	public String getFoufivop() {
		return this.foufivop;
	}

	public void setFoufivop(String foufivop) {
		this.foufivop = foufivop;
	}

	public String getFoupasdate() {
		return this.foupasdate;
	}

	public void setFoupasdate(String foupasdate) {
		this.foupasdate = foupasdate;
	}

	public Integer getDegree() {
		return this.degree;
	}

	public void setDegree(Integer degree) {
		this.degree = degree;
	}

	public String getFivedate() {
		return this.fivedate;
	}

	public void setFivedate(String fivedate) {
		this.fivedate = fivedate;
	}

	public Integer getFivfirId() {
		return this.fivfirId;
	}

	public void setFivfirId(Integer fivfirId) {
		this.fivfirId = fivfirId;
	}

	public String getFivfirop() {
		return this.fivfirop;
	}

	public void setFivfirop(String fivfirop) {
		this.fivfirop = fivfirop;
	}

	public Integer getFivsecId() {
		return this.fivsecId;
	}

	public void setFivsecId(Integer fivsecId) {
		this.fivsecId = fivsecId;
	}

	public String getFivsecop() {
		return this.fivsecop;
	}

	public void setFivsecop(String fivsecop) {
		this.fivsecop = fivsecop;
	}

	public Integer getFivthiId() {
		return this.fivthiId;
	}

	public void setFivthiId(Integer fivthiId) {
		this.fivthiId = fivthiId;
	}

	public String getFivthiop() {
		return this.fivthiop;
	}

	public void setFivthiop(String fivthiop) {
		this.fivthiop = fivthiop;
	}

	public Integer getFivfouId() {
		return this.fivfouId;
	}

	public void setFivfouId(Integer fivfouId) {
		this.fivfouId = fivfouId;
	}

	public String getFivfouop() {
		return this.fivfouop;
	}

	public void setFivfouop(String fivfouop) {
		this.fivfouop = fivfouop;
	}

	public Integer getFivfivId() {
		return this.fivfivId;
	}

	public void setFivfivId(Integer fivfivId) {
		this.fivfivId = fivfivId;
	}

	public String getFivfivop() {
		return this.fivfivop;
	}

	public void setFivfivop(String fivfivop) {
		this.fivfivop = fivfivop;
	}

	public String getFivpasdate() {
		return this.fivpasdate;
	}

	public void setFivpasdate(String fivpasdate) {
		this.fivpasdate = fivpasdate;
	}

	public String getA() {
		return this.a;
	}

	public void setA(String a) {
		this.a = a;
	}

	public String getB() {
		return this.b;
	}

	public void setB(String b) {
		this.b = b;
	}

	public String getC() {
		return this.c;
	}

	public void setC(String c) {
		this.c = c;
	}

	public String getD() {
		return this.d;
	}

	public void setD(String d) {
		this.d = d;
	}

	public String getE() {
		return this.e;
	}

	public void setE(String e) {
		this.e = e;
	}

	public String getF() {
		return this.f;
	}

	public void setF(String f) {
		this.f = f;
	}

	public String getG() {
		return this.g;
	}

	public void setG(String g) {
		this.g = g;
	}

	public String getH() {
		return this.h;
	}

	public void setH(String h) {
		this.h = h;
	}

	public String getI() {
		return this.i;
	}

	public void setI(String i) {
		this.i = i;
	}

	public String getJ() {
		return this.j;
	}

	public void setJ(String j) {
		this.j = j;
	}

	public String getK() {
		return this.k;
	}

	public void setK(String k) {
		this.k = k;
	}

	public String getL() {
		return this.l;
	}

	public void setL(String l) {
		this.l = l;
	}

	public String getM() {
		return this.m;
	}

	public void setM(String m) {
		this.m = m;
	}

	public String getN() {
		return this.n;
	}

	public void setN(String n) {
		this.n = n;
	}

}