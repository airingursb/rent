package com.wechatoa.entity;

import java.sql.Timestamp;

/**
 * Rent entity. @author MyEclipse Persistence Tools
 */

public class Rent implements java.io.Serializable {

	// Fields

	private Integer id;
	private Equipment equipment;
	private Integer userId;
	private String username;
	private Timestamp rentTime;
	private Integer rentStat;
	private Integer password;
	private Timestamp backTime;

	// Constructors

	/** default constructor */
	public Rent() {
	}

	/** full constructor */
	public Rent(Equipment equipment, Integer userId, String username,
			Timestamp rentTime, Integer rentStat, Integer password,
			Timestamp backTime) {
		this.equipment = equipment;
		this.userId = userId;
		this.username = username;
		this.rentTime = rentTime;
		this.rentStat = rentStat;
		this.password = password;
		this.backTime = backTime;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Equipment getEquipment() {
		return this.equipment;
	}

	public void setEquipment(Equipment equipment) {
		this.equipment = equipment;
	}

	public Integer getUserId() {
		return this.userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Timestamp getRentTime() {
		return this.rentTime;
	}

	public void setRentTime(Timestamp rentTime) {
		this.rentTime = rentTime;
	}

	public Integer getRentStat() {
		return this.rentStat;
	}

	public void setRentStat(Integer rentStat) {
		this.rentStat = rentStat;
	}

	public Integer getPassword() {
		return this.password;
	}

	public void setPassword(Integer password) {
		this.password = password;
	}

	public Timestamp getBackTime() {
		return this.backTime;
	}

	public void setBackTime(Timestamp backTime) {
		this.backTime = backTime;
	}

}