package com.wechatoa.dao;

import com.wechatoa.entity.Rent;

public interface RentDao {

	public void rent(Rent rent);
	
	public void back(Rent rent);
	
	public Rent getRent(int password);
	
}
