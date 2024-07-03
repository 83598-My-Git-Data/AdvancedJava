package com.sunbeam.dao;

import static com.sunbeam.utils.HibernateUtils.getFactory;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.sunbeam.entities.User;

public class UserDaoImpl implements userDao {

	@Override
	public String signUp(User user) {
		// TODO Auto-generated method stub
		// user - TRANSIENT
		String mesg = "user registration failed!!!!";
		// 1. get Session from SessionFactory
		/*
		 * API of SessionFactory public Session openSession() throws HibernateException
		 * OR public Session getCurrentSession() throws HibernateException SF (session
		 * factory) will check for the existing session If absent , creates n rets it to
		 * the caller. o.w(otherwise) rets the existing session to the caller. Such a
		 * session is auto closed upon tx boundary(commit | rollback)
		 */
		Session session = getFactory().getCurrentSession();
		// 2. Begin a transaction
		/*
		 * Session API org.hibernate.Transacation beginTransaction() throws HibExc.
		 */
		Transaction tx = session.beginTransaction();
		try {
			// CRUD operation
			/*
			 * Session API public Serializable save(Object o) throws HibernateException
			 * 
			 */
			session.persist(user);
			// user - PERSISTENT - part of L1 cache
			// => success
			tx.commit();// insert query --persistent entity gains DB id upon commit
			// session.close() -> L1 cache is destroyed n db cn rets to the DBCP
			mesg = "user registered successfully , with ID" + user.getId();
		} catch (RuntimeException e) {
			// rollback tx
			if (tx != null)
				tx.rollback();
			// re throw the same exc to the caller
			throw e;
		}
		// user - DETACHED (from L1 cache)
		return mesg;
	}
	;
	}
	
	


