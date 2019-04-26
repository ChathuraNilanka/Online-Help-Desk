<!DOCTYPE html>
<html>

<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Login</title>
    <link rel="stylesheet" href="assets1/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Abhaya+Libre&amp;subset=sinhala">
    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Alegreya+Sans">
    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Alegreya+Sans+SC">
    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,700">
    <link rel="stylesheet" href="assets1/css/Header-Blue.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/animate.css/3.5.2/animate.min.css">
    <link rel="stylesheet" href="assets1/css/Login-Form-Clean.css">
    <link rel="stylesheet" href="assets1/css/styles.css">
</head>

<body style="width:1366px;height:768px;max-height:auto;background-image:url(&quot;img/bg.jpg&quot;);background-size:cover;background-repeat:no-repeat;">
    <div style="height:auto;">
        <div class="container" style="margin-right:0px;margin-left:0px;width:1366px;max-width:1366px;padding-right:0px;padding-left:0px;">
            <div class="row" style="width:1366px;margin:0px;">
                <div class="col-md-12" style="width:1366px;padding-right:0px;padding-left:0px;">
                    <div class="row" style="margin:0;height:auto;background-image:url(&quot;assets1/img/header.png&quot;);background-repeat:no-repeat;background-size:cover;width:1366px;"><a href="login.jsp" style="background-color:#cacaca;width:auto;height:auto;padding-top:2px;margin-left:1273px;font-size:20px;padding-bottom:2px;padding-right:10px;padding-left:11px;margin-top:56px;margin-bottom:56px;color:rgb(0,0,0);font-family:'Alegreya Sans SC', sans-serif;">Log In</a></div>
                </div>
            </div>
            <div class="row" style="width:1366px;margin:0px;">
                <div class="col-md-12" style="margin-left:0px;">
                    <div class="table-responsive" style="width:400px;margin-left:450px;margin-right:0px;margin-top:140px;">
                        <form action="Login" method="post">
						<table class="table">
                            <thead>
                                <tr></tr>
                            </thead>
                            <tbody>
                                <tr style="margin-left:0px;">
                                    <td style="width:200px;margin-left:0px;padding-left:50px;font-size:17px;">User ID</td>
                                    <td style="font-size:17px;"><input type="text" name="uid"></td>
                                </tr>
                                <tr>
                                    <td style="width:200px;padding-left:50px;font-size:17px;">Password</td>
                                    <td style="font-size:17px;"><input type="password" name="password"></td>
                                </tr>
                            </tbody>
                        </table>
                    	</div><button type="submit" class="btn btn-primary" type="button" style="margin-left:500px;background-color:rgba(0,0,0,0.1);color:#000000;font-size:17px;font-weight:bold;font-style:normal;margin-right:0px;">Login</button>
						</form>
					<p style="margin-left:500px;margin-top:13px;">Do not have an account?&nbsp;<a href="Reg.jsp">Sign up here.</a></p>
                </div>
            </div>
        </div>
    </div>
    <script src="assets1/js/jquery.min.js"></script>
    <script src="assets1/bootstrap/js/bootstrap.min.js"></script>
    <script src="assets1/js/bs-animation.js"></script>
</body>

</html>