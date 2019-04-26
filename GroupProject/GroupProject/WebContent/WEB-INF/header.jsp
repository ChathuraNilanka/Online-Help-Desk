<%@ page import="GroupProject.Model.Users" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="assets/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Abhaya+Libre&amp;subset=sinhala">
    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Alegreya+Sans">
    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Alegreya+Sans+SC">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/animate.css/3.5.2/animate.min.css">
    <link rel="stylesheet" href="assets/css/styles.css">
</head>

<body style="background-image:url(&quot;assets/img/header.png&quot;);background-repeat:no-repeat;background-size:cover;background-position:top;width:1366;height:150;">
    <div class="float-right" style="width:300;height:auto;background-color:rgba(255,255,255,0.53);padding:0;padding-right:0;padding-left:0;font-size:23px;padding-top:0;margin:0;margin-top:0;margin-right:0;">
        <% Users user = (Users) session.getAttribute("currentUser"); %>
			<% if(user.getFirstName().isEmpty()) { %>
				<a href="Login.html">Log in</a>
			<%} else { %>
				<a href="viewUser.jsp"><%= user.getFirstName() %></a>
			<% } %>
    </div>
    <script src="assets/js/jquery.min.js"></script>
    <script src="assets/bootstrap/js/bootstrap.min.js"></script>
    <script src="assets/js/bs-animation.js"></script>
</body>

</html>