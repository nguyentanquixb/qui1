//package com.web.dao.impl;
//
//import java.util.List;
//
//import org.hibernate.Session;
//import org.hibernate.SessionFactory;
//import org.hibernate.Transaction;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Repository;
//
//import com.web.dao.HoatDongDAO;
//import com.web.entities.HoatDong;
//
//@Repository("hoatdongDAO ")
//public class HoatDongImpl implements HoatDongDAO {
//	@Autowired
//	private SessionFactory sessionFactory;
//
//	public List<HoatDong> findAll() {
//		List<HoatDong> result = null;
//		Session session = sessionFactory.openSession();
//		Transaction transaction = null;
//		try {
//			transaction = session.beginTransaction();
//			result = session.createQuery("FROM hoatdong").list();
//		} catch (Exception e) {
//			transaction.rollback();
//
//		} finally {
//			session.close();
//		}
//
//		return result;
//	}
//
//}
