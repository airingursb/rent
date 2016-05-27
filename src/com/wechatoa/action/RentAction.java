package com.wechatoa.action;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Timestamp;
import java.util.Date;

import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;

import com.google.gson.Gson;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.wechatoa.dao.EquipmentDao;
import com.wechatoa.dao.EquipmentDaoImpl;
import com.wechatoa.dao.RentDao;
import com.wechatoa.dao.RentDaoImpl;
import com.wechatoa.entity.Equipment;
import com.wechatoa.entity.Rent;
import com.wechatoa.util.JsonResponse;

public class RentAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4169725654771994962L;

	private JsonResponse jsonResponse = new JsonResponse();
	
	private int equipmentId;
	private int userId;
	private String username;
	
	public String execute() throws IOException {
				
		Gson gson = new Gson();
		ActionContext ctx = ActionContext.getContext();
		HttpServletResponse response = (HttpServletResponse)ctx.get(ServletActionContext.HTTP_RESPONSE);  
		response.setContentType("text/json"); 
		response.setCharacterEncoding("UTF-8"); 
		PrintWriter out = response.getWriter();
		
		RentDao dao = new RentDaoImpl();
		EquipmentDao equiDao = new EquipmentDaoImpl();
		Rent rent = new Rent();
		Equipment equipment = equiDao.getEquipment(equipmentId);
		equipment.setEquipmentStat(1);
		equiDao.saveEquipment(equipment);
		
		rent.setEquipment(equipment);
		rent.setUserId(userId);
		rent.setUsername(username);
		rent.setRentStat(1);
		
		int password = (int)(Math.random()*89999999 + 10000000);
		rent.setPassword(password);
		
		Date time = new Date();
		Timestamp ts = new Timestamp(time.getTime());
		rent.setRentTime(ts);
		
		dao.rent(rent);
		jsonResponse.setStatus(password);
		out.println(gson.toJson(jsonResponse));
		return null;
	}
	
	public JsonResponse getJsonResponse() {
		return jsonResponse;
	}
	public void setJsonResponse(JsonResponse jsonResponse) {
		this.jsonResponse = jsonResponse;
	}
	public int getEquipmentId() {
		return equipmentId;
	}
	public void setEquipmentId(int equipmentId) {
		this.equipmentId = equipmentId;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	
	
}
