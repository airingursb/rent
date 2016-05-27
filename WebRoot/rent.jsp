<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
String equipmentId = request.getParameter("equipmentId");
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'rent.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<meta name="viewport" id="viewport" content="width=device-width, initial-scale=1">
	<meta http-equiv="Content-Type" content="text/html;charset=UTF-8">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
    <form class="form-horizontal" action="rent.action" method="post">
    <fieldset>
      <div id="legend" class="">
        <legend class="">租借设备</legend>
      </div>
      <div class="control-group">
      <label class="control-label" for="input01">设备Id：${param.equipmentId}</label>
      <div class="controls">
            <input type="hidden" name="equipmentId" value="${param.equipmentId}" class="input-xlarge">
          </div>
      </div>
    <div class="control-group">

          <!-- Text input-->
          <label class="control-label" for="input01">学号</label>
          <div class="controls">
            <input type="text" placeholder="请输入学号" class="input-xlarge" name="userId">
          </div>
        </div>

    <div class="control-group">

          <!-- Text input-->
          <label class="control-label" for="input01">姓名</label>
          <div class="controls">
            <input type="text" placeholder="请输入姓名" class="input-xlarge" name="username">
          </div>
        </div>

    <div class="control-group">
          <!-- Button -->
          <div class="controls">
            <button class="btn btn-success">提交</button>
          </div>
        </div>
    </fieldset>
</form>
  </body>
</html>
