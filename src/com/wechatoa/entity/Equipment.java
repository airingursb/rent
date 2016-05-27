package com.wechatoa.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * Equipment entity. @author MyEclipse Persistence Tools
 */

public class Equipment implements java.io.Serializable {

	// Fields

	private Integer id;
	private String name;
	private Integer equipmentStat;
	private Set rents = new HashSet(0);

	// Constructors

	/** default constructor */
	public Equipment() {
	}

	/** full constructor */
	public Equipment(String name, Integer equipmentStat, Set rents) {
		this.name = name;
		this.equipmentStat = equipmentStat;
		this.rents = rents;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getEquipmentStat() {
		return this.equipmentStat;
	}

	public void setEquipmentStat(Integer equipmentStat) {
		this.equipmentStat = equipmentStat;
	}

	public Set getRents() {
		return this.rents;
	}

	public void setRents(Set rents) {
		this.rents = rents;
	}

}