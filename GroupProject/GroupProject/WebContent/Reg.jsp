<!DOCTYPE html>
<html>

<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Register</title>
    <link rel="stylesheet" href="assets1/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Abhaya+Libre&amp;subset=sinhala">
    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Alegreya+Sans">
    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Alegreya+Sans+SC">
    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,700">
    <link rel="stylesheet" href="assets1/css/Header-Blue.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/animate.css/3.5.2/animate.min.css">
    <link rel="stylesheet" href="assets1/css/styles.css">
</head>

<body style="width:1366;height:auto;background-image:url(&quot;img/bg.jpg&quot;);background-repeat:repeat;background-size:cover;">
    <div style="width:1366;height:auto;">
        <div class="container" style="width:1366px;margin:0;margin-top:0;padding:0;max-width:none;">
            <div class="row" style="margin:0;height:auto;background-image:url(&quot;assets1/img/header.png&quot;);background-repeat:no-repeat;background-size:cover;"><a href="login.jsp" style="background-color:#cacaca;width:auto;height:auto;padding-top:2px;margin-left:1273px;font-size:20px;padding-bottom:2px;padding-right:10px;padding-left:11px;margin-top:56px;margin-bottom:56px;color:rgb(0,0,0);font-family:'Alegreya Sans SC', sans-serif;">Log In</a></div>
            <div
                class="row" style="width:1366px;margin-right:0;margin-left:0;max-width:1366px;">
                <div class="col-md-4" style="width:300px;padding:0;margin:0px;padding-left:0px;max-width:300px;">
                    <div class="row" style="width:300px;margin:0;margin-top:0;padding-left:0;margin-left:0;"><a href="#" data-bs-hover-animate="pulse" style="color:rgb(2,6,11);background-color:rgba(0,0,0,0.1);font-size:31px;font-family:'Alegreya Sans SC', sans-serif;padding-left:0;padding-right:0;width:300px;">&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;Home &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;&nbsp;</a></div>
                    <div
                        class="row" style="width:300;margin:0;"><a href="#" data-bs-hover-animate="pulse" style="color:rgb(1,6,11);background-color:rgba(0,0,0,0.1);padding:0;padding-left:0;font-size:31px;font-family:'Alegreya Sans SC', sans-serif;padding-right:0;width:300px;">&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; My Profile &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;&nbsp;</a></div>
                <div
                    class="row" style="width:300;margin:0;"><a href="#" data-bs-hover-animate="pulse" style="color:rgb(2,6,11);background-color:rgba(0,0,0,0.1);font-size:31px;font-family:'Alegreya Sans SC', sans-serif;padding-left:0;padding-right:0;width:300px;">&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;Ask A Question &nbsp; &nbsp; &nbsp; &nbsp;&nbsp;</a></div>
    </div>
    <div class="col-md-4" style="width:700px;padding:0;max-width:none;height:auto;"><img src="img/images.png" style="width:150px;margin-left:291px;margin-bottom:50px;margin-top:50px;">
        <div class="table-responsive" style="margin:0;margin-top:0;width:390px;margin-left:150px;margin-right:150px;height:auto;background-color:rgba(0,0,0,0.1);">
            <form action="addUser" method="post">
			<table class="table">
                <thead>
                    <tr></tr>
                </thead>
                <tbody>
                    <tr>
                        <td style="font-size:17px;padding-left:36px;padding-right:12px;width:150px;">First Name</td>
                        <td style="width:170;font-size:20px;"><input type="text" name="firstname"></td>
                    </tr>
                    <tr>
                        <td style="width:150;font-size:17px;padding-left:36px;">Last Name</td>
                        <td style="width:170;font-size:20px;"><input type="text" name="lastname"></td>
                    </tr>
                    <tr>
                        <td style="width:150;font-size:17px;padding-left:36px;">Password</td>
                        <td style="width:170;font-size:20px;"><input type="password" name="password"></td>
                    </tr>
                    <tr>
                        <td style="width:150;font-size:17px;padding-left:36px;">E-mail</td>
                        <td style="width:170;font-size:20px;"><input type="email" name="email"></td>
                    </tr>
                    <tr>
                        <td style="width:150;font-size:17px;padding-left:36px;">Gender</td>
                        <td style="width:170;font-size:20px;">
							<input type="radio" name="gender" value="Male">Male
							<input type="radio" name="gender" value="Female">Female
						</td>
                    </tr>
                    <tr>
                        <td style="width:150;font-size:17px;padding-left:36px;">Home town</td>
                        <td style="width:170;font-size:20px;"><input type="text" name="hometown"></td>
                    </tr>
					<tr>
                        <td style="width:150;font-size:17px;padding-left:36px;">Type</td>
                        <td style="width:170;font-size:20px;">
							<input type="radio" name="type" value="Tech">Tech
							<input type="radio" name="type" value="User">Ordinary User
						</td>
                    </tr>
                </tbody>
            </table>
            </div><input type="submit" class="btn btn-primary" type="button" style="margin-left:160px;margin-top:27px;background-color:rgba(255,255,255,0.2);margin-bottom:20px;"></div>
    		</form>
    <div class="col-md-4 offset-xl-0" style="width:366px;padding:0;max-width:366px;height:auto;"><img src="img/sidepic.png" style="width:240px;background-color:rgba(0,0,0,0.1);margin-top:115px;margin-left:30px;"></div>
    </div>
    </div>
    </div>
    <script src="assets1/js/jquery.min.js"></script>
    <script src="assets1/bootstrap/js/bootstrap.min.js"></script>
    <script src="assets1/js/bs-animation.js"></script>
</body>

</html>