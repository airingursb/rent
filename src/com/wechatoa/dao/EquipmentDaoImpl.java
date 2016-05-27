package com.wechatoa.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.wechatoa.entity.Equipment;
import com.wechatoa.util.HibernateSessionFactory;

public class EquipmentDaoImpl implements EquipmentDao {
	
	private Transaction transaction;

	@Override
	public Equipment getEquipment(int equipmentId) {
		Session session = HibernateSessionFactory.getSession();
		return (Equipment)session.load(Equipment.class, equipmentId);
	}
	
	@Override
	public void saveEquipment(Equipment equipment) {
		Session session = HibernateSessionFactory.getSession();
		try{
			transaction = session.beginTransaction();
			session.update(equipment);
			transaction.commit();
		}catch(Exception e){
			transaction.rollback();
			System.out.println("save Failed!");
			e.printStackTrace();
		}finally{
			HibernateSessionFactory.closeSession();
		}
	}

}
