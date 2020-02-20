<?php
use phpmailer\phpmailer\src\PHPMailer;
use PHPMailer\PHPMailer\src\Exception;
if(isset($_POST['submit'])){
    $myFname=$_POST['myFname'];
    $myLname=$_POST['myLname'];
    $myEmail=$_POST['myEmail'];
    $myComments=$_POST['myComments'];

require 'PHPMailer/src/Exception.php';
require 'PHPMailer/src/PHPMailer.php';
require 'PHPMailer/src/SMTP.php';
$mail = new PHPMailer(true);

try {
    //Server settings
    $mail->SMTPDebug = 0;                                       // Enable verbose debug output
    $mail->isSMTP();                                            // Send using SMTP
    $mail->Host       = 'smtp.gmail.com';                       // Set the SMTP server to send through
    $mail->SMTPAuth   = true;                                   // Enable SMTP authentication
    $mail->Username   = 'fahnin44@gmail.com';                     // SMTP username
    $mail->Password   = 'Pass1234!';                               // SMTP password
    $mail->SMTPSecure = 'tls';         // Enable TLS encryption; `PHPMailer::ENCRYPTION_SMTPS` also accepted
    $mail->Port       = 587;                                    // TCP port to connect to


    //Recipients
    $mail->setFrom($myEmail,$myFname);
    $mail->addAddress('fahnin44@gmail.com');     // Add a recipient            
    $mail->addReplyTo($myEmail,$myFname);


    // Attachments
    //$mail->addAttachment('/var/tmp/file.tar.gz');         // Add attachments
    //$mail->addAttachment('/tmp/image.jpg', 'new.jpg');    // Optional name

    // Content
    $mail->isHTML(true);                                  // Set email format to HTML
    $mail->Subject = 'Form submission';
    $mail->Body    = $myComments;

    $mail->send();
    echo "Message has been sent";
} catch (Exception $e) {
    echo "Message could not be sent. Mailer Error: {$mail->ErrorInfo}";
}
}
else {
    echo "Message is not sent.";
}

