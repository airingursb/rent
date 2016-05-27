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

public class ReturnAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1695504885198332597L;
	private JsonResponse jsonResponse = new JsonResponse();

	private int password;

	public String execute() throws IOException {
		
		Gson gson = new Gson();
		ActionContext ctx = ActionContext.getContext();
		HttpServletResponse response = (HttpServletResponse)ctx.get(ServletActionContext.HTTP_RESPONSE);  
		response.setContentType("text/json"); 
		response.setCharacterEncoding("UTF-8"); 
		PrintWriter out = response.getWriter();
		
		RentDao dao = new RentDaoImpl();
		
		Rent rent = dao.getRent(password);
		rent.setRentStat(0);
		
		EquipmentDao equiDao = new EquipmentDaoImpl();
		Equipment equipment = rent.getEquipment();
		equipment.setEquipmentStat(0);
		equiDao.saveEquipment(equipment);
		
		Date time = new Date();
		Timestamp ts = new Timestamp(time.getTime());
		rent.setBackTime(ts);
		
		dao.back(rent);
		
		jsonResponse.setStatus(1);
		out.println(gson.toJson(jsonResponse));
		return null;
	}

	public int getPassword() {
		return password;
	}

	public void setPassword(int password) {
		this.password = password;
	}
}
