<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Admin</title>
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
    <div style="width:1366;height:auto;">
        <div class="container" style="width:1366px;margin:0;margin-top:0;padding:0;max-width:none;">
            <div class="row" style="margin:0;height:auto;background-image:url(&quot;assets1/img/header.png&quot;);background-repeat:no-repeat;background-size:cover;"><a href="#" style="background-color:rgba(0,0,0,0.1);width:auto;height:auto;padding-top:2px;margin-left:1273px;font-size:20px;padding-bottom:2px;padding-right:10px;padding-left:11px;margin-top:56px;margin-bottom:56px;color:rgb(0,0,0);font-family:'Alegreya Sans SC', sans-serif;"></a></div>
            <div
                class="row" style="width:1366px;margin-right:0;margin-left:0;max-width:1366px;margin-top:45px;margin-bottom:45px;">
                <div data-bs-hover-animate="bounce" style="width:300px;height:250px;color:rgba(0,0,0,0.1);background-color:rgba(0,0,0,0.1);margin-left:116.5px;margin-bottom:20px;">
                    <p style="color:#000000;font-size:35px;margin-left:53px;margin-top:65px;margin-bottom:25px;font-family:Aclonica, sans-serif;">My Profile</p><a href="viewUser.jsp" data-bs-hover-animate="flash" style="color:rgb(0,0,0);background-color:rgba(0,0,0,0.1);padding:10px;padding-right:15px;padding-left:15px;margin-left:110px;font-weight:normal;font-size:23px;">View</a></div>
                <div
                    data-bs-hover-animate="bounce" style="width:300px;height:250px;color:rgba(0,0,0,0.1);background-color:rgba(0,0,0,0.1);margin-left:116.5px;margin-bottom:20px;">
                    <p style="color:#000000;font-size:35px;margin-left:34px;margin-top:65px;margin-bottom:26px;font-family:Aclonica, sans-serif;">View Notices</p><a href="showNotices.jsp" data-bs-hover-animate="flash" style="color:rgb(0,0,0);background-color:rgba(0,0,0,0.1);padding:10px;padding-right:15px;padding-left:15px;margin-left:110px;font-weight:normal;font-size:23px;">View</a></div>
        <div
            data-bs-hover-animate="bounce" style="width:300px;height:250px;color:rgba(0,0,0,0.1);background-color:rgba(0,0,0,0.1);margin-left:116.5px;margin-bottom:20px;">
            <p style="color:#000000;font-size:35px;margin-left:50px;margin-top:65px;margin-bottom:26px;font-family:Aclonica, sans-serif;">View Users</p><a href="allusers.jsp" data-bs-hover-animate="flash" style="color:rgb(0,0,0);background-color:rgba(0,0,0,0.1);padding:10px;padding-right:15px;padding-left:15px;margin-left:110px;font-weight:normal;font-size:23px;">View</a></div>
    </div>
    <div class="row" style="margin:0px;font-size:23px;">
        <div data-bs-hover-animate="bounce" style="width:300px;height:250px;color:rgba(0,0,0,0.1);background-color:rgba(0,0,0,0.1);margin-left:116.5px;margin-bottom:20px;">
            <p style="color:#000000;font-size:35px;margin-left:65px;margin-top:65px;margin-bottom:26px;font-family:Aclonica, sans-serif;">Add User</p><a href="Reg.jsp" data-bs-hover-animate="flash" style="color:rgb(0,0,0);background-color:rgba(0,0,0,0.1);padding:10px;padding-right:15px;padding-left:15px;margin-left:70px;font-weight:normal;font-size:23px;">Enter Details</a></div>
        <div
            data-bs-hover-animate="bounce" style="width:300px;height:250px;color:rgba(0,0,0,0.1);background-color:rgba(0,0,0,0.1);margin-left:116.5px;margin-bottom:20px;">
            <p style="color:#000000;font-size:35px;margin-left:50px;margin-top:65px;margin-bottom:26px;font-family:Aclonica, sans-serif;">Add Notice</p><a href="addNotice.jsp" data-bs-hover-animate="flash" style="color:rgb(0,0,0);background-color:rgba(0,0,0,0.1);padding:10px;padding-right:15px;padding-left:15px;margin-left:74px;font-weight:normal;font-size:23px;">Enter Details</a></div>
    <div
        data-bs-hover-animate="bounce" style="width:300px;height:250px;color:rgba(0,0,0,0.1);background-color:rgba(0,0,0,0.1);margin-left:116.5px;margin-bottom:20px;">
        <p style="color:#000000;font-size:35px;margin-left:80px;margin-top:65px;margin-bottom:26px;font-family:Aclonica, sans-serif;">Reports</p><a href="ReportTest.jsp" data-bs-hover-animate="flash" style="color:rgb(0,0,0);background-color:rgba(0,0,0,0.1);padding:10px;padding-right:15px;padding-left:15px;margin-left:95px;font-weight:normal;">Generate</a></div>
        </div>
        </div>
        </div>
        <script src="assets1/js/jquery.min.js"></script>
        <script src="assets1/bootstrap/js/bootstrap.min.js"></script>
        <script src="assets1/js/bs-animation.js"></script>
</body>

</html>