<%@ page import="GroupProject.Model.Notice" %>
<%@ page import="java.util.*" %>
<%@ page import="GroupProject.Services.*" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>

	<% 
				INoticeService in = new NoticeServiceImpl();
				ArrayList<Notice> arrayList = in.getNotice();
	%>


    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Display Notices</title>
    <link rel="stylesheet" href="assets/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Abhaya+Libre&amp;subset=sinhala">
    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Alegreya+Sans">
    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Alegreya+Sans+SC">
    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,700">
    <link rel="stylesheet" href="assets/css/Header-Blue.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/animate.css/3.5.2/animate.min.css">
    <link rel="stylesheet" href="assets/css/Login-Form-Clean.css">
    <link rel="stylesheet" href="assets/css/styles.css">
    
    <style>
    
	.notice td{
		padding: 10px;
	}


	</style>
    
</head>

<body style="width:1366;height:auto;background-image:url(&quot;assets/img/36588536-blur-images.jpg&quot;);background-repeat:repeat;background-size:cover;">
    <div>
        <div>
            <div class="row" style="margin:0;height:auto;background-image:url(&quot;assets/img/header.png&quot;);background-repeat:no-repeat;background-size:cover;"><a href="#" style="background-color:#cacaca;width:auto;height:auto;padding-top:2px;margin-left:1273px;font-size:20px;padding-bottom:2px;padding-right:10px;padding-left:11px;margin-top:56px;margin-bottom:56px;color:rgb(0,0,0);font-family:'Alegreya Sans SC', sans-serif;"></a></div>
            <div
                class="row" style="width:1366px;margin-right:0;margin-left:0;max-width:1366px;">
                <div class="col-md-4" style="width:300px;padding:0;margin:0px;padding-left:0px;max-width:300px;">
                    <div class="row" style="width:300px;margin:0;margin-top:0;padding-left:0;margin-left:0;"><a href="admin.jsp" data-bs-hover-animate="pulse" style="color:rgb(2,6,11);background-color:rgba(0,0,0,0.1);font-size:31px;font-family:'Alegreya Sans SC', sans-serif;padding-left:0;padding-right:0;width:300px;">&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;Home &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;&nbsp;</a></div>
                    <div
                        class="row" style="width:300;margin:0;"><a href="viewUser.jsp" data-bs-hover-animate="pulse" style="color:rgb(1,6,11);background-color:rgba(0,0,0,0.1);padding:0;padding-left:0;font-size:31px;font-family:'Alegreya Sans SC', sans-serif;padding-right:0;width:300px;">&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; My Profile &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;&nbsp;</a></div>
        </div>
        
        
        
        <div class="notice" style="max-width: 900px; height: auto; overflow: auto; margin: auto; margin-bottom: 20px;">
        
        	<h1 align="center">Display Notices</h1>
        	<div style="width: 900px;">
        	<%
						for(Notice notice : arrayList) {
						%>
						<div style="width:609px; min-height:100px; text-align: center; border: 1px solid black; margin: auto">
							 <%=notice.getNoticeContent()%>
						</div>
						<%} %>
 
        </div>
  
        	
        	
        
        
        </div>
        
        
        
    </div>
    </div>
    </div>
    <script src="assets/js/jquery.min.js"></script>
    <script src="assets/bootstrap/js/bootstrap.min.js"></script>
    <script src="assets/js/bs-animation.js"></script>
</body>

</html>