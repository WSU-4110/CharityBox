﻿<!DOCTYPE html>

<html lang="en" xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta charset="utf-8" />
    <link rel="stylesheet" href="charities.css">
    <link href="https://fonts.googleapis.com/css?family=Oswald&display=swap" rel="stylesheet">
    <link href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet">
    <title>CharityBox Home</title>
</head>
<body>
    <h1>CharityBox</h1>
    <!--Navigation Bar-->
    <nav>
        <ul>
            <li><a>FAQ</a></li>
            <li><a href="feedbackform.html">Feedback Form</a></li>
            <li><a href="contactform.html">Contact Us</a></li>
            <li><a>Login</a></li>
            <li>
                <a>About Us</a>
            </li>
            <li><a href="index.html">Home</a></li>
        </ul>
    </nav>
   <!--Navigation Bar-->
   
    <!--Form Page-->
    <div class="centerprop">
    <h1> <center> Contact Form </center> </h1>
    <p> <center> Please fill out the form below for any questions or concerns you may have! </center> </p>
    <div class="contactform">
        <form id="contactform" method="post" action="function.php">
           <!-- <label for="myFname"> First Name: </label></label>-->
            <input type="text" name="myFname" class="form-control" placeholder="First Name" required><br>
       
           <!--   <label for="myLname"> Last Name: </label> </label>-->
            <input type="text" name="myLname" class="form-control"  placeholder="Last Name" required><br>
      
          <!--   <label for="myEmail"> E-mail: </label> -->
            <input type="text" name="myEmail" class="form-control"  placeholder="Email" required><br>
            
            <!--   <label for="myComments"> Contact Us: </label> -->
            <textarea name="myComments" class="form-control" placeholder="Enter comments here" cols="20" rows="2" required></textarea>
                  

            <input type="submit" name="submit" class="form-control submit" value="SUBMIT">
        </form>
    </div>
    </div>
    <!--Form Page-->

   <!--Footer Bar-->
    <footer>
        <div class="wrapper">
            <div class="social">
                <ul>
                    <li class="fa-icon">
                        <i class="fa fa-facebook-f"></i>
                    </li>
                    <li class="fa-icon">
                        <i class="fa fa-instagram"></i>
                    </li>
                    <li class="fa-icon">
                        <i class="fa fa-twitter"></i>
                    </li>
                </ul>
            </div>
            
        </div>
    </footer>
    <!--Footer Bar-->
</body>
</html>
