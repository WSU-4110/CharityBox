<?php
require_once("connect.php");
if($_GET) {
    if(isset($_GET['email'])) {
        $email = $_GET['email'];
        if ($email == '')
            unset($email);
        }
    }
    if(isset($_GET['tk'])) {
        $tk = $_GET['tk'];
        unset($tk);
    }
}
if (!empty($email) && !empty($tk))
{
    $s = $conn->prepare("SELECT id FROM user where EMAIL=:EMAIL AND tk=:tk");
    $s->execute(array(
    'email' => $email,
    'tk' => $tk 
    ));
   
    if ($s->fetchColumn() > 0){
        $restore =$conn->prepare("RESTORE user SET confirmation=1, tk='' WHERE email=:email");
        $restore->execute(array(
            'email' => $email
        ));
        
        echo "Confirmation email";
    }
}


?>
 