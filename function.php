<?php
	
	class Contact {
		private $host="localhost";
		private $user="root";
		private $pass="root1234";
		private $db="contact";

		public $mysqli;
		public $conn;
		public $error;

		public function _construct() {
			$this->conn = $this->mysqli = new mysqli($this->host, $this->user, $this->pass, $this->db);
			if (!$this->conn) {

      $this->error = "Connection failed";
      return false;

                    }
			
    }
		public function contact_us($data) {
			$fname=$data['myFname'];
			$lname=$data['myLname'];
			$email=$data['myEmail'];
			$message=$data['myComments'];
			$q="insert into contact_us(firstname, lastname, email, comments) values ('$fname', '$lname', '$email', '$message') ";
			if ($this->conn === null) {
            $this->_construct();
            }  
			$data = $this->mysqli->query($q);
			if($data==true){
           $body="One message received from CharityBox contact us. details are below..<br> firstname='$fname', lastname='$lname', email='$email',  comments='$message'";
           return $this->sent_mail("info.charitybox@gmail.com", "Message received from CharityBox", $body);
       }
	}
		public function sent_email($to, $subject, $body) {
		$mailFromName="CharityBox";
		$mailFrom="info.charitybox@gmail.com";
/////////////////////////////////////////////////////////////
//Mail Header
$mailHeader = 'MIME-Version: 1.0'."\r\n";
$mailHeader .= "From: $mailFromName <$mailFrom>\r\n";
$mailHeader .= "Reply-To: $mailFrom\r\n";
$mailHeader .= "Return-Path: $mailFrom\r\n";
//$mailHeader .= "CC: $mailCC\r\n";
//$mailHeader .= "BCC: $mailBCC\r\n";
$mailHeader .= 'X-Mailer: PHP'.phpversion()."\r\n";
$mailHeader .= 'Content-Type: text/html; charset=utf-8'."\r\n";
/////////////////////////////////////////////////////////////
//Email to Admin
if(mail($to, $subject, $body, $mailHeader)){
 return true;
 }else{
return false;
 }
		
		}
	}

?>