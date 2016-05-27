package com.wechatoa.dao;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.wechatoa.entity.Rent;
import com.wechatoa.util.HibernateSessionFactory;

public class RentDaoImpl implements RentDao {

	private Transaction transaction;
	
	@Override
	public void rent(Rent rent) {
		Session session = HibernateSessionFactory.getSession();
		try{
			transaction = session.beginTransaction();
			session.save(rent);
			transaction.commit();
		}catch(Exception e){
			transaction.rollback();
			System.out.println("save Failed!");
			e.printStackTrace();
		}finally{
			HibernateSessionFactory.closeSession();
		}	
	}

	@Override
	public void back(Rent rent) {
		Session session = HibernateSessionFactory.getSession();
		try{
			transaction = session.beginTransaction();
			session.update(rent);
			transaction.commit();
		}catch(Exception e){
			transaction.rollback();
			System.out.println("save Failed!");
			e.printStackTrace();
		}finally{
			HibernateSessionFactory.closeSession();
		}
	}

	@Override
	public Rent getRent(int password) {
		Session session = HibernateSessionFactory.getSession();
		String hql = "from Rent as a where a.password='" + password + "'";
		Query query = (Query) session.createQuery(hql);
		Rent rent = (Rent) query.uniqueResult(); 
		return rent;
	}

}
