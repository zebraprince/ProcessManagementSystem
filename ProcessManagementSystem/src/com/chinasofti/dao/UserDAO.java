package com.chinasofti.dao;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.chinasofti.domain.User;

/**
 * A data access object (DAO) providing persistence and search support for User
 * entities. Transaction control of the save(), update() and delete() operations
 * can directly support Spring container-managed transactions or they can be
 * augmented to handle user-managed Spring transactions. Each of these methods
 * provides additional information for how to configure it for the desired type
 * of transaction control.
 * 
 * @see com.chinasofti.domain.User
 * @author MyEclipse Persistence Tools
 */

public class UserDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(UserDAO.class);
	// property constants
	public static final String UNAME = "uname";
	public static final String PASSWORD = "password";
	public static final String REALNAME = "realname";
	public static final String DUTY = "duty";
	public static final String POSITION = "position";
	public static final String SUBCOM = "subcom";
	public static final String DEP = "dep";
	public static final String ADR = "adr";
	public static final String TEL = "tel";
	public static final String A = "a";
	public static final String B = "b";
	public static final String C = "c";
	public static final String D = "d";
	public static final String E = "e";

	protected void initDao() {
		// do nothing
	}

	public void save(User transientInstance) {
		log.debug("saving User instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(User persistentInstance) {
		log.debug("deleting User instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public User findById(java.lang.Integer id) {
		log.debug("getting User instance with id: " + id);
		try {
			User instance = (User) getHibernateTemplate().get(
					"com.chinasofti.domain.User", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(User instance) {
		log.debug("finding User instance by example");
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
		log.debug("finding User instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from User as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByUname(Object uname) {
		return findByProperty(UNAME, uname);
	}

	public List findByPassword(Object password) {
		return findByProperty(PASSWORD, password);
	}

	public List findByRealname(Object realname) {
		return findByProperty(REALNAME, realname);
	}

	public List findByDuty(Object duty) {
		return findByProperty(DUTY, duty);
	}

	public List findByPosition(Object position) {
		return findByProperty(POSITION, position);
	}

	public List findBySubcom(Object subcom) {
		return findByProperty(SUBCOM, subcom);
	}

	public List findByDep(Object dep) {
		return findByProperty(DEP, dep);
	}

	public List findByAdr(Object adr) {
		return findByProperty(ADR, adr);
	}

	public List findByTel(Object tel) {
		return findByProperty(TEL, tel);
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

	public List findAll() {
		log.debug("finding all User instances");
		try {
			String queryString = "from User";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public User merge(User detachedInstance) {
		log.debug("merging User instance");
		try {
			User result = (User) getHibernateTemplate().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(User instance) {
		log.debug("attaching dirty User instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(User instance) {
		log.debug("attaching clean User instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static UserDAO getFromApplicationContext(ApplicationContext ctx) {
		return (UserDAO) ctx.getBean("UserDAO");
	}
}