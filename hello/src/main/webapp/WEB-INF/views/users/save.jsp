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
	<link rel="stylesheet" type="text/css" href="assets/css/bootstrap.min.css">

  </head>
  
  <body>
  		<div class="container">
  			<div class="row">
  				<div class="panel panel-default">
  					<div class="panel-heading">Users List <a href="users/save" class="btn btn-primary btn-sm pull-right" style="margin-top:-5px;">Add</a></div>
  					<div class="panel-body">
  						<form class="form-horizontal" role="form" action="users/save" method="post" enctype="multipart/form-data">
						  <div class="form-group">
						    <label  class="col-sm-2 control-label">Username</label>
						    <div class="col-sm-4">
						      <input type="text" class="form-control"  name="username" placeholder="Username">
						    </div>
						  </div>
						  <div class="form-group">
						    <label class="col-sm-2 control-label">Password</label>
						    <div class="col-sm-4">
						      <input type="password" class="form-control" name="password" placeholder="Password">
						    </div>
						  </div>
						  
						  <div class="form-group">
						    <label  class="col-sm-2 control-label">Email</label>
						    <div class="col-sm-4">
						      <input type="text" class="form-control" name="email"  placeholder="Email">
						    </div>
						  </div>
						  <div class="form-group">
						    <label  class="col-sm-2 control-label">Age</label>
						    <div class="col-sm-4">
						      <input type="text" class="form-control" name="age"  placeholder="Age">
						    </div>
						  </div>
						  <div class="form-group">
						    <label  class="col-sm-2 control-label">Head</label>
						    <div class="col-sm-4">
						      <input type="file" class="form-control" name="file" >
						    </div>
						  </div>
						  
						  <div class="form-group">
						    <div class="col-sm-offset-2 col-sm-4">
						      <button type="submit" class="btn btn-default">Submit</button>
						      <button type="reset" class="btn btn-warning">Reset</button>
						    </div>
						  </div>
						</form>
  					</div>
  				</div>
  			</div>
  		</div>
    	
  </body>
</html>
