package com.chinasofti.dao;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.chinasofti.domain.Project;

/**
 * A data access object (DAO) providing persistence and search support for
 * Project entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.chinasofti.domain.Project
 * @author MyEclipse Persistence Tools
 */

public class ProjectDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(ProjectDAO.class);
	// property constants
	public static final String UID = "uid";
	public static final String PNAME = "pname";
	public static final String STATE = "state";
	public static final String FIRDATE = "firdate";
	public static final String FIRTIME = "firtime";
	public static final String FIRTYPE = "firtype";
	public static final String FIRCOST = "fircost";
	public static final String FIRGOAL = "firgoal";
	public static final String FIRFIR_ID = "firfirId";
	public static final String FIRFIROP = "firfirop";
	public static final String FIRSEC_ID = "firsecId";
	public static final String FIRSECOP = "firsecop";
	public static final String FIRTHI_ID = "firthiId";
	public static final String FIRTHIOP = "firthiop";
	public static final String FIRFOU_ID = "firfouId";
	public static final String FIRFOUOP = "firfouop";
	public static final String FIRFIV_ID = "firfivId";
	public static final String FIRFIVOP = "firfivop";
	public static final String FIRPASDATE = "firpasdate";
	public static final String SUFFER = "suffer";
	public static final String COO = "coo";
	public static final String STARTDATE = "startdate";
	public static final String ENDDATE = "enddate";
	public static final String PERSON_A = "personA";
	public static final String PERSON_B = "personB";
	public static final String PROINVEST = "proinvest";
	public static final String SECDATE = "secdate";
	public static final String SECFIR_ID = "secfirId";
	public static final String SECFIROP = "secfirop";
	public static final String SECSEC_ID = "secsecId";
	public static final String SECSECOP = "secsecop";
	public static final String SECTHI_ID = "secthiId";
	public static final String SECHTIOP = "sechtiop";
	public static final String SECFOU_ID = "secfouId";
	public static final String SECFOUOP = "secfouop";
	public static final String SECFIV_ID = "secfivId";
	public static final String SECFIVOP = "secfivop";
	public static final String SECPASDATE = "secpasdate";
	public static final String COSTREP = "costrep";
	public static final String PROREP = "prorep";
	public static final String THIDATE = "thidate";
	public static final String THIFIR_ID = "thifirId";
	public static final String THIFIROP = "thifirop";
	public static final String THISEC_ID = "thisecId";
	public static final String THISECOP = "thisecop";
	public static final String THITHI_ID = "thithiId";
	public static final String THITHIOP = "thithiop";
	public static final String THIFOU_ID = "thifouId";
	public static final String THIFOUOP = "thifouop";
	public static final String THIFIV_ID = "thifivId";
	public static final String THIFIVOP = "thifivop";
	public static final String THIPASDATE = "thipasdate";
	public static final String FOUDIC = "foudic";
	public static final String FOUDATE = "foudate";
	public static final String FOUFIR_ID = "foufirId";
	public static final String FOUFIROP = "foufirop";
	public static final String FOUSEC_ID = "fousecId";
	public static final String FOUSECOP = "fousecop";
	public static final String FOUTHI_ID = "fouthiId";
	public static final String FOUTHIOP = "fouthiop";
	public static final String FOUFOU_ID = "foufouId";
	public static final String FOUFOUOP = "foufouop";
	public static final String FOUFIV_ID = "foufivId";
	public static final String FOUFIVOP = "foufivop";
	public static final String FOUPASDATE = "foupasdate";
	public static final String DEGREE = "degree";
	public static final String FIVEDATE = "fivedate";
	public static final String FIVFIR_ID = "fivfirId";
	public static final String FIVFIROP = "fivfirop";
	public static final String FIVSEC_ID = "fivsecId";
	public static final String FIVSECOP = "fivsecop";
	public static final String FIVTHI_ID = "fivthiId";
	public static final String FIVTHIOP = "fivthiop";
	public static final String FIVFOU_ID = "fivfouId";
	public static final String FIVFOUOP = "fivfouop";
	public static final String FIVFIV_ID = "fivfivId";
	public static final String FIVFIVOP = "fivfivop";
	public static final String FIVPASDATE = "fivpasdate";
	public static final String A = "a";
	public static final String B = "b";
	public static final String C = "c";
	public static final String D = "d";
	public static final String E = "e";
	public static final String F = "f";
	public static final String G = "g";
	public static final String H = "h";
	public static final String I = "i";
	public static final String J = "j";
	public static final String K = "k";
	public static final String L = "l";
	public static final String M = "m";
	public static final String N = "n";

	protected void initDao() {
		// do nothing
	}

	public void save(Project transientInstance) {
		log.debug("saving Project instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Project persistentInstance) {
		log.debug("deleting Project instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Project findById(java.lang.Integer id) {
		log.debug("getting Project instance with id: " + id);
		try {
			Project instance = (Project) getHibernateTemplate().get(
					"com.chinasofti.domain.Project", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Project instance) {
		log.debug("finding Project instance by example");
		try {
			List results = getHibernateTemplate().findByExample(instance);
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding Project instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Project as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByUid(Object uid) {
		return findByProperty(UID, uid);
	}

	public List findByPname(Object pname) {
		return findByProperty(PNAME, pname);
	}

	public List findByState(Object state) {
		return findByProperty(STATE, state);
	}

	public List findByFirdate(Object firdate) {
		return findByProperty(FIRDATE, firdate);
	}

	public List findByFirtime(Object firtime) {
		return findByProperty(FIRTIME, firtime);
	}

	public List findByFirtype(Object firtype) {
		return findByProperty(FIRTYPE, firtype);
	}

	public List findByFircost(Object fircost) {
		return findByProperty(FIRCOST, fircost);
	}

	public List findByFirgoal(Object firgoal) {
		return findByProperty(FIRGOAL, firgoal);
	}

	public List findByFirfirId(Object firfirId) {
		return findByProperty(FIRFIR_ID, firfirId);
	}

	public List findByFirfirop(Object firfirop) {
		return findByProperty(FIRFIROP, firfirop);
	}

	public List findByFirsecId(Object firsecId) {
		return findByProperty(FIRSEC_ID, firsecId);
	}

	public List findByFirsecop(Object firsecop) {
		return findByProperty(FIRSECOP, firsecop);
	}

	public List findByFirthiId(Object firthiId) {
		return findByProperty(FIRTHI_ID, firthiId);
	}

	public List findByFirthiop(Object firthiop) {
		return findByProperty(FIRTHIOP, firthiop);
	}

	public List findByFirfouId(Object firfouId) {
		return findByProperty(FIRFOU_ID, firfouId);
	}

	public List findByFirfouop(Object firfouop) {
		return findByProperty(FIRFOUOP, firfouop);
	}

	public List findByFirfivId(Object firfivId) {
		return findByProperty(FIRFIV_ID, firfivId);
	}

	public List findByFirfivop(Object firfivop) {
		return findByProperty(FIRFIVOP, firfivop);
	}

	public List findByFirpasdate(Object firpasdate) {
		return findByProperty(FIRPASDATE, firpasdate);
	}

	public List findBySuffer(Object suffer) {
		return findByProperty(SUFFER, suffer);
	}

	public List findByCoo(Object coo) {
		return findByProperty(COO, coo);
	}

	public List findByStartdate(Object startdate) {
		return findByProperty(STARTDATE, startdate);
	}

	public List findByEnddate(Object enddate) {
		return findByProperty(ENDDATE, enddate);
	}

	public List findByPersonA(Object personA) {
		return findByProperty(PERSON_A, personA);
	}

	public List findByPersonB(Object personB) {
		return findByProperty(PERSON_B, personB);
	}

	public List findByProinvest(Object proinvest) {
		return findByProperty(PROINVEST, proinvest);
	}

	public List findBySecdate(Object secdate) {
		return findByProperty(SECDATE, secdate);
	}

	public List findBySecfirId(Object secfirId) {
		return findByProperty(SECFIR_ID, secfirId);
	}

	public List findBySecfirop(Object secfirop) {
		return findByProperty(SECFIROP, secfirop);
	}

	public List findBySecsecId(Object secsecId) {
		return findByProperty(SECSEC_ID, secsecId);
	}

	public List findBySecsecop(Object secsecop) {
		return findByProperty(SECSECOP, secsecop);
	}

	public List findBySecthiId(Object secthiId) {
		return findByProperty(SECTHI_ID, secthiId);
	}

	public List findBySechtiop(Object sechtiop) {
		return findByProperty(SECHTIOP, sechtiop);
	}

	public List findBySecfouId(Object secfouId) {
		return findByProperty(SECFOU_ID, secfouId);
	}

	public List findBySecfouop(Object secfouop) {
		return findByProperty(SECFOUOP, secfouop);
	}

	public List findBySecfivId(Object secfivId) {
		return findByProperty(SECFIV_ID, secfivId);
	}

	public List findBySecfivop(Object secfivop) {
		return findByProperty(SECFIVOP, secfivop);
	}

	public List findBySecpasdate(Object secpasdate) {
		return findByProperty(SECPASDATE, secpasdate);
	}

	public List findByCostrep(Object costrep) {
		return findByProperty(COSTREP, costrep);
	}

	public List findByProrep(Object prorep) {
		return findByProperty(PROREP, prorep);
	}

	public List findByThidate(Object thidate) {
		return findByProperty(THIDATE, thidate);
	}

	public List findByThifirId(Object thifirId) {
		return findByProperty(THIFIR_ID, thifirId);
	}

	public List findByThifirop(Object thifirop) {
		return findByProperty(THIFIROP, thifirop);
	}

	public List findByThisecId(Object thisecId) {
		return findByProperty(THISEC_ID, thisecId);
	}

	public List findByThisecop(Object thisecop) {
		return findByProperty(THISECOP, thisecop);
	}

	public List findByThithiId(Object thithiId) {
		return findByProperty(THITHI_ID, thithiId);
	}

	public List findByThithiop(Object thithiop) {
		return findByProperty(THITHIOP, thithiop);
	}

	public List findByThifouId(Object thifouId) {
		return findByProperty(THIFOU_ID, thifouId);
	}

	public List findByThifouop(Object thifouop) {
		return findByProperty(THIFOUOP, thifouop);
	}

	public List findByThifivId(Object thifivId) {
		return findByProperty(THIFIV_ID, thifivId);
	}

	public List findByThifivop(Object thifivop) {
		return findByProperty(THIFIVOP, thifivop);
	}

	public List findByThipasdate(Object thipasdate) {
		return findByProperty(THIPASDATE, thipasdate);
	}

	public List findByFoudic(Object foudic) {
		return findByProperty(FOUDIC, foudic);
	}

	public List findByFoudate(Object foudate) {
		return findByProperty(FOUDATE, foudate);
	}

	public List findByFoufirId(Object foufirId) {
		return findByProperty(FOUFIR_ID, foufirId);
	}

	public List findByFoufirop(Object foufirop) {
		return findByProperty(FOUFIROP, foufirop);
	}

	public List findByFousecId(Object fousecId) {
		return findByProperty(FOUSEC_ID, fousecId);
	}

	public List findByFousecop(Object fousecop) {
		return findByProperty(FOUSECOP, fousecop);
	}

	public List findByFouthiId(Object fouthiId) {
		return findByProperty(FOUTHI_ID, fouthiId);
	}

	public List findByFouthiop(Object fouthiop) {
		return findByProperty(FOUTHIOP, fouthiop);
	}

	public List findByFoufouId(Object foufouId) {
		return findByProperty(FOUFOU_ID, foufouId);
	}

	public List findByFoufouop(Object foufouop) {
		return findByProperty(FOUFOUOP, foufouop);
	}

	public List findByFoufivId(Object foufivId) {
		return findByProperty(FOUFIV_ID, foufivId);
	}

	public List findByFoufivop(Object foufivop) {
		return findByProperty(FOUFIVOP, foufivop);
	}

	public List findByFoupasdate(Object foupasdate) {
		return findByProperty(FOUPASDATE, foupasdate);
	}

	public List findByDegree(Object degree) {
		return findByProperty(DEGREE, degree);
	}

	public List findByFivedate(Object fivedate) {
		return findByProperty(FIVEDATE, fivedate);
	}

	public List findByFivfirId(Object fivfirId) {
		return findByProperty(FIVFIR_ID, fivfirId);
	}

	public List findByFivfirop(Object fivfirop) {
		return findByProperty(FIVFIROP, fivfirop);
	}

	public List findByFivsecId(Object fivsecId) {
		return findByProperty(FIVSEC_ID, fivsecId);
	}

	public List findByFivsecop(Object fivsecop) {
		return findByProperty(FIVSECOP, fivsecop);
	}

	public List findByFivthiId(Object fivthiId) {
		return findByProperty(FIVTHI_ID, fivthiId);
	}

	public List findByFivthiop(Object fivthiop) {
		return findByProperty(FIVTHIOP, fivthiop);
	}

	public List findByFivfouId(Object fivfouId) {
		return findByProperty(FIVFOU_ID, fivfouId);
	}

	public List findByFivfouop(Object fivfouop) {
		return findByProperty(FIVFOUOP, fivfouop);
	}

	public List findByFivfivId(Object fivfivId) {
		return findByProperty(FIVFIV_ID, fivfivId);
	}

	public List findByFivfivop(Object fivfivop) {
		return findByProperty(FIVFIVOP, fivfivop);
	}

	public List findByFivpasdate(Object fivpasdate) {
		return findByProperty(FIVPASDATE, fivpasdate);
	}

	public List findByA(Object a) {
		return findByProperty(A, a);
	}

	public List findByB(Object b) {
		return findByProperty(B, b);
	}

	public List findByC(Object c) {
		return findByProperty(C, c);
	}

	public List findByD(Object d) {
		return findByProperty(D, d);
	}

	public List findByE(Object e) {
		return findByProperty(E, e);
	}

	public List findByF(Object f) {
		return findByProperty(F, f);
	}

	public List findByG(Object g) {
		return findByProperty(G, g);
	}

	public List findByH(Object h) {
		return findByProperty(H, h);
	}

	public List findByI(Object i) {
		return findByProperty(I, i);
	}

	public List findByJ(Object j) {
		return findByProperty(J, j);
	}

	public List findByK(Object k) {
		return findByProperty(K, k);
	}

	public List findByL(Object l) {
		return findByProperty(L, l);
	}

	public List findByM(Object m) {
		return findByProperty(M, m);
	}

	public List findByN(Object n) {
		return findByProperty(N, n);
	}

	public List findAll() {
		log.debug("finding all Project instances");
		try {
			String queryString = "from Project";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Project merge(Project detachedInstance) {
		log.debug("merging Project instance");
		try {
			Project result = (Project) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Project instance) {
		log.debug("attaching dirty Project instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Project instance) {
		log.debug("attaching clean Project instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static ProjectDAO getFromApplicationContext(ApplicationContext ctx) {
		return (ProjectDAO) ctx.getBean("ProjectDAO");
	}
}