<?php
	
	if(isset($_POST['submit'])) {
		$fname=$_POST['myFname'];
		$lname=$_POST['myLname'];
		$email=$_POST['myEmail'];
		$msg=$_POST['myComments'];

		$to='info.charitybox@gmail.com';
		$subject='Form Submission';

		$message="Name: ".$fname." ". $lname."\n"."Wrote the following: "."\n\n".$msg;
		$headers="From: ".$email;

		if(mail($to, $subject, $message, $headers)) {
			echo "<h1>Sent Successfully! Thank you"." ".$fname." ". $lname.", We will contact you shortly!</h1>";
		}
		else {
			echo "Something went wrong";
		}
	}

?>