<%@ page import="GroupProject.Model.Users" %>
<%@ page import="java.util.*"%>
<%@ page import="GroupProject.Services.IUsers,GroupProject.Services.IUserImpl" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>All Users</title>
    <link rel="stylesheet" href="assets1/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Abhaya+Libre&amp;subset=sinhala">
    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Aclonica">
    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Alegreya+Sans">
    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Alegreya+Sans+SC">
    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,700">
    <link rel="stylesheet" href="assets1/css/Header-Blue.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/animate.css/3.5.2/animate.min.css">
    <link rel="stylesheet" href="assets1/css/Login-Form-Clean.css">
    <link rel="stylesheet" href="assets1/css/styles.css">
</head>

<body style="background-image:url(&quot;img/bg.jpg&quot;);background-size:cover;">
	<% IUsers iu = new IUserImpl(); 
		ArrayList<Users> usersList = iu.getUsers();
	%>
    <div style="width:1366;height:auto;">
        <div class="container" style="width:1366px;margin:0;margin-top:0;padding:0;max-width:none;">
            <div class="row" style="margin:0;height:auto;background-image:url(&quot;assets1/img/header.png&quot;);background-repeat:no-repeat;background-size:cover;"><a href="#" style="background-color:rgba(0,0,0,0.1);width:auto;height:auto;padding-top:2px;margin-left:1273px;font-size:20px;padding-bottom:2px;padding-right:10px;padding-left:11px;margin-top:56px;margin-bottom:56px;color:rgb(0,0,0);font-family:'Alegreya Sans SC', sans-serif;">.</a></div>
            <div
                class="row" style="width:1366px;margin-right:0;margin-left:0;max-width:1366px;">
                <div class="col-md-4" style="width:300px;padding:0;margin:0px;padding-left:0px;max-width:300px;">
                    <div class="row" style="width:300px;margin:0;margin-top:0;padding-left:0;margin-left:0;"><a href="#" data-bs-hover-animate="pulse" style="color:rgb(2,6,11);background-color:rgba(0,0,0,0.1);font-size:31px;font-family:'Alegreya Sans SC', sans-serif;padding-left:0;padding-right:0;width:300px;">&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;Home &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;&nbsp;</a></div>
                    <div
                        class="row" style="width:300;margin:0;"><a href="#" data-bs-hover-animate="pulse" style="color:rgb(1,6,11);background-color:rgba(0,0,0,0.1);padding:0;padding-left:0;font-size:31px;font-family:'Alegreya Sans SC', sans-serif;padding-right:0;width:300px;">&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; My Profile &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;&nbsp;</a></div>
        </div>
        <div class="col-md-4 offset-xl-0" style="width:366px;padding:0;max-width:366px;height:auto;">
			<% for ( Users user : usersList) { %>
				<div style="margin-top:10px;margin-left:10px;margin-bottom:10px;font-size:18px;">
                	<%= user.getUid() %> <%= user.getFirstName() %> <%= user.getLastName() %>
                	<a style="margin-left:70px;margin-right:10px;font-size:18px;">edit</a><a href="#" style="margin-left:50px;margin-right:10px;font-size:18px;">delete</a>
			    </div>
			<% } %>
       </div>
    </div>
    </div>
    </div>
    <script src="assets1/js/jquery.min.js"></script>
    <script src="assets1/bootstrap/js/bootstrap.min.js"></script>
    <script src="assets1/js/bs-animation.js"></script>
</body>

</html>