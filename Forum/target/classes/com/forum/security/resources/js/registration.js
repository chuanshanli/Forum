

$(document).ready(function (){
/*css style shit*/
  $("#hello").html("hello");
  $("#hello").css({"font-size": "50px"});
  $("body").css({'background-image':' url("http://2.bp.blogspot.com/_iUWnBJumD4w/TKSUCzKrTYI/AAAAAAAAAAk/Mj0DFgjYSAA/s1600/Universe4-41876.jpeg")'})
  $("#head").css({'background-image':' url("http://entropymag.org/wp-content/uploads/2014/10/outer-space-wallpaper-pictures.jpg")'});
  $("#head").css({ "background-color": "#696969", "font-weight": "10", "font-size": "100px","text-align": "center" ,"font-family":"Times New Roman","border": "3px solid black",'color':'#ccccff'});
  $("#b").click(function() {
	  alert( "Handler for .click() called." );
  });
 
  position:'absolute'
	  
	$("form").css({'border': '3px solid white',"margin-left": "400px" ,"height":"500px","margin-top": "250px","margin-right": "550px","margin-button": "800px"})
    $("td").css({"color": "white","font-size": "25px","font-family":"Times New Roman","margin-top": "400px"})
    $("input").css({"color": "black","font-size": "25px","font-family":"Times New Roman"});
    $("select").css({"color": "black","font-size": "25px","font-family":"Times New Roman"});
    $("#enter").css({'background-image':'url("http://entropymag.org/wp-content/uploads/2014/10/outer-space-wallpaper-pictures.jpg")'})
    $("#enter").css({"color": "white","border": "4px solid white","color": "white","font-size": "30px","margin-left": "10px","font-family":"Times New Roman"});
    $("#table").css({'padding': '30px',"height":"450px"})
   /*ajax post user*/
    
    
    $("#enter").click(function(){
    
    	 $.ajax
    	    ({
    	        type: "POST",
    	        //the url where you want to sent the userName and password to
    	        url: 'http://localhost:8080/Chat__Jax-Rs_Spirng/api/addUser',
    	        contentType : 'application/json',
    	        dataType: 'text',
    	        async: false,
    	        //json object to sent to the authentication url
    	        data:  '{"username": "' + $("#username").val() + '","password" : "' + $("#password").val()  + '", "town": "' + $("#town").val() + '","gender": "' + $("#gender").val() + '"}',
    	        success: function(data){
    	           
    	            alert("from succsess+"+data)
    	            
    	            
    	           
    	        },
    	        error: function(jqXHR, textStatus, errorThrown,result,data){
    	            alert('update error: ' + textStatus);
    	            alert(data)
    	        }
    	      
    	    });
    })

});




