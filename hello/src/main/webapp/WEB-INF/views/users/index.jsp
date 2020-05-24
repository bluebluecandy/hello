<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>Users Index</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<link rel="stylesheet" type="text/css" href="./assets/css/bootstrap.min.css">

  </head>
  
  <body>
  		<div class="container">
  			<div class="row">
  				<div class="panel panel-default">
  					<div class="panel-heading">Users List <a href="users/save" class="btn btn-primary btn-sm pull-right" style="margin-top:-5px;">Add</a></div>
  					<table class="table table-hover table-bordered">
			    		<tr>
			    			<th>ID</th>
			    			<!-- <th>Head</th> -->
			    			<th>Username</th>
			    			<th>PWD</th>
			    			<th>Email</th>
			    			<th>Age</th>
			    			<th>Operation</th>
			    		</tr>
			    		<c:forEach items="${users }" var="user">
			    			<tr>
				    			<td>${user.id }</td>
				    			<%-- <td><img src="${user.head}" style="width:30px;height:30px"/></td> --%>
				    			<td>${user.username }</td>
				    			<td>${user.password }</td>
				    			<td>${user.email }</td>
				    			<td>${user.age }</td>
				    			<td>Add|Delete|Update|Test</td>
				    		</tr>
			    		</c:forEach>
			    	</table>
  				</div>
  			</div>
  		</div>
    	
  </body>
</html>
