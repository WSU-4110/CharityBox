const firebase = require("firebase");
// Required for side-effects
require("firebase/firestore");


const firebaseConfig = {
  apiKey: "AIzaSyDXjH-Ou-kzGztLmYVOw0xtG0wzj9S-H3M",
  authDomain: "chartiybox.firebaseapp.com",
  databaseURL: "https://chartiybox.firebaseio.com",
  projectId: "chartiybox",
  storageBucket: "chartiybox.appspot.com",
  messagingSenderId: "954464642263",
  appId: "1:954464642263:web:d687e90346eefec322fc92",
  measurementId: "G-W0T1VZEKY4"
};

//was having difficulties understanding firebase syntax and how it creates
//and connects to the database, making it hard to check for whether the connection
//had been established or not


// Initialize Firebase
  
firebase.initializeApp(firebaseConfig);
firebase.analytics();

firebase.auth.Auth.Persistence.LOCAL;


public class singleUser{
    private static singleUser user = new singleUser();
    
    private singleUser(){}

    public static singleUser getUser(){
        return user;
    }

    public void login()
    {
        var email = $("#email").val();
        var password = $("#password").val();

            if(email != "" && password != "")
            {
                var result = firebase.auth().signInWithEmailAndPassword(email, password);

                //added function error to catch when a user instance isn't valid
                //prints a message to the console and the screen 
                result.catch(function(error)
                {

                    var errorCode = error.code;
                    var errorMessage = error.message;
                    console.log(errorCode);
                    console.log(errorMessage);
                    window.alert("Message: " + errorMessage);
                });
            }
            else
            {
                window.alert("Please fill out all fields.");       
            }
    }    
}



$("#btn-login").click(function()
{
    
    singleUser newUser = singeUser.getUser();
    newUser.login();
    
};

 