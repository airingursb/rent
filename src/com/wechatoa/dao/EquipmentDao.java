package com.wechatoa.dao;

import com.wechatoa.entity.Equipment;

public interface EquipmentDao {

	public Equipment getEquipment(int equipmentId);
	
	public void saveEquipment(Equipment equipment);
}
