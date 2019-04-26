<%@ page import="GroupProject.Model.Users" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>

<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>My Profile</title>
    <link rel="stylesheet" href="assets/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Abhaya+Libre&amp;subset=sinhala">
    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Alegreya+Sans">
    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Alegreya+Sans+SC">
    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,700">
    <link rel="stylesheet" href="assets/css/Header-Blue.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/animate.css/3.5.2/animate.min.css">
    <link rel="stylesheet" href="assets/css/styles.css">
</head>

<body style="width:1366;height:auto;background-image:url(&quot;img/bg.jpg&quot;);background-repeat:repeat;background-size:cover;">
	<% Users userT=(Users) session.getAttribute("currentUser"); %>
    <div style="width:1366;height:auto;">
        <div class="container" style="width:1366px;margin:0;margin-top:0;padding:0;max-width:none;">
            <div class="row" style="margin:0;height:auto;background-image:url(&quot;img/header.png&quot;);background-repeat:no-repeat;background-size:cover;">
				<% if(userT.getFirstName().isEmpty()) { %>			
					<a href="login.html" style="background-color:#cacaca;width:auto;height:auto;padding-top:2px;margin-left:1273px;font-size:20px;padding-bottom:2px;padding-right:10px;padding-left:11px;margin-top:56px;margin-bottom:56px;color:rgb(0,0,0);font-family:'Alegreya Sans SC', sans-serif;">Login</a>
				<%} else { %>
					<a href="viewUser.jsp" style="background-color:#cacaca;width:auto;height:auto;padding-top:2px;margin-left:1273px;font-size:20px;padding-bottom:2px;padding-right:10px;padding-left:11px;margin-top:56px;margin-bottom:56px;color:rgb(0,0,0);font-family:'Alegreya Sans SC', sans-serif;"><%= userT.getFirstName() %></a>
				<% } %>
			</div>
            <div
                class="row" style="width:1366px;margin-right:0;margin-left:0;max-width:1366px;">
                <div class="col-md-4" style="width:300px;padding:0;margin:0px;padding-left:0px;max-width:300px;">
                    <div class="row" style="width:300px;margin:0;margin-top:0;padding-left:0;margin-left:0;"><a href="#" data-bs-hover-animate="pulse" style="color:rgb(2,6,11);background-color:#cacaca;font-size:31px;font-family:'Alegreya Sans SC', sans-serif;padding-left:0;padding-right:0;width:300px;">&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;Home &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;&nbsp;</a></div>
                    <div
                        class="row" style="width:300;margin:0;"><a href="viewUser.jsp" data-bs-hover-animate="pulse" style="color:rgb(1,6,11);background-color:#cacaca;padding:0;padding-left:0;font-size:31px;font-family:'Alegreya Sans SC', sans-serif;padding-right:0;width:300px;">&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; My Profile &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;&nbsp;</a></div>
                <div
                    class="row" style="width:300;margin:0;"><a href="#" data-bs-hover-animate="pulse" style="color:rgb(2,6,11);background-color:#cacaca;font-size:31px;font-family:'Alegreya Sans SC', sans-serif;padding-left:0;padding-right:0;width:300px;">&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;Ask A Question &nbsp; &nbsp; &nbsp; &nbsp;&nbsp;</a></div>
    </div>
    <div class="col-md-4" style="width:700px;padding:0;max-width:none;height:auto;">
		<% if ( userT.getGender().equals("Male")) { %>
        	<img src="img/male-prof.png" style="margin-left:0;margin-bottom:0;padding-left:73px;padding-bottom:28px;padding-top:16px;">
		<% } else if(userT.getGender().equals("Female")) { %>
			<img src="img/female-prof.jpg" style="margin-left:0;margin-bottom:0;padding-left:73px;padding-bottom:28px;padding-top:16px;">
        <% } %>
        <div class="table-responsive" style="margin:0;margin-top:0;width:400px;margin-left:150px;margin-right:150px;height:auto;">
            <table class="table">
                <thead>
                    <tr></tr>
                </thead>
                <tbody>
                    <tr>
                        <td style="font-size:15px;padding-left:36px;padding-right:12px;width:150px;">First Name</td>
                        <td style="width:170;font-size:20px;"><%= userT.getFirstName() %></td>
                    </tr>
                    <tr>
                        <td style="width:150;font-size:15px;padding-left:36px;">Last Name</td>
                        <td style="width:170;font-size:20px;"><%= userT.getLastName() %></td>
                    </tr>
                    <tr>
                        <td style="width:150;font-size:15px;padding-left:36px;">User ID</td>
                        <td style="width:170;font-size:20px;"><%= userT.getUid() %></td>
                    </tr>
                    <tr>
                        <td style="width:150;font-size:15px;padding-left:36px;">E-mail</td>
                        <td style="width:170;font-size:20px;"><%= userT.getEmail() %></td>
                    </tr>
                    <tr>
                        <td style="width:150;font-size:15px;padding-left:36px;">Gender</td>
                        <td style="width:170;font-size:20px;"><%= userT.getGender() %></td>
                    </tr>
                    <tr>
                        <td style="width:150;font-size:15px;padding-left:36px;">Home town</td>
                        <td style="width:170;font-size:20px;"><%= userT.getHometown() %></td>
                    </tr>
                </tbody>
            </table>
        </div>
    </div>
    <div class="col-md-4" style="width:366px;padding:0;max-width:366px;height:auto;">
        <div class="row" style="margin:0;"><a href="editUser.jsp" data-bs-hover-animate="bounce" style="color:rgb(2,6,11);background-color:#cacaca;font-size:31px;font-family:'Alegreya Sans SC', sans-serif;padding-left:0;padding-right:0;width:366px;">&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;Edit Profile &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;&nbsp;</a></div>
        <div class="row" style="margin:0;"><a href="deleteUser.jsp" data-bs-hover-animate="bounce" style="color:rgb(2,6,11);background-color:#cacaca;font-size:30px;font-family:'Alegreya Sans SC', sans-serif;padding-left:0;padding-right:0;width:366px;">&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; Deactivate &nbsp;Account &nbsp; &nbsp; &nbsp;</a></div>
        <div class="row" style="margin:0;"><a href="logout.jsp" data-bs-hover-animate="bounce" style="color:rgb(2,6,11);background-color:#cacaca;font-size:31px;font-family:'Alegreya Sans SC', sans-serif;padding-left:0;padding-right:0;width:366px;">&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;Log out &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;&nbsp;</a></div>
    </div>
    </div>
    </div>
    </div>
    <script src="assets/js/jquery.min.js"></script>
    <script src="assets/bootstrap/js/bootstrap.min.js"></script>
    <script src="assets/js/bs-animation.js"></script>
</body>

</html>