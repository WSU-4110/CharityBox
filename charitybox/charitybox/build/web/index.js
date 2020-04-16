var firebaseConfig = 
{
    apiKey: "AIzaSyDXjH-Ou-kzGztLmYVOw0xtG0wzj9S-H3M",
    authDomain: "chartiybox.firebaseapp.com",
    databaseURL: "https://chartiybox.firebaseio.com",
    projectId: "chartiybox",
    storageBucket: "chartiybox.appspot.com",
    messagingSenderId: "954464642263",
    appId: "1:954464642263:web:d687e90346eefec322fc92",
    measurementId: "G-W0T1VZEKY4"
};
  
// Initialize Firebase
  
firebase.initializeApp(firebaseConfig);
firebase.analytics();

firebase.auth.Auth.Persistence.LOCAL;

$("#btn-login").click(function(){
    
    var email = $("#email").val();
    var password = $("#password").val();

    if(email != "" && password != ""){
        var result = firebase.auth().signInWithEmailAndPassword(email, password);
        
        result.catch(function(error()
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
});