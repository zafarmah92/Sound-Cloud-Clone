<%-- 
    Document   : index
    Created on : Dec 13, 2014, 2:31:22 PM
    Author     : MIAN
--%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Music Library</title>
<link href="default.css" rel="stylesheet" type="text/css" media="all" />
<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.7.1/jquery.min.js"></script>
        <script src="https://w.soundcloud.com/player/api.js"></script>
        <script src="//connect.soundcloud.com/sdk.js"></script>
         <script>
             
             SC.initialize({
  client_id: 'ee6fa492f06e41811e2f45df5c11fa7b'
});
var track = '';

var count = 10 ;
    
$(document).ready(function() {
     var id = '';
        SC.get('/users/daneemalik/playlists/',{q:track} , function(tracks) {
        /*$(tracks).each(function(index, track) {  
         $('#second').append('<img src="images/soundcloud-icon.png" width="50" height="50"/><p>'+ track.title+'');
         $('#second').append('<button onClick="fun(this)" type="submit" id="'+track.uri+'">Play</button>');
         $('#second').append('</p>');
         $('#second').append('</br>');
    */
      });
    });
    });
        </script>
             <script>
                 function getTrack() {
                     $('.hello').empty();
                     val = document.getElementById("trck").value;
                     track = val;
                     alert(track);
                       SC.get('/users/'+track+'/playlists/', function(tracks) {
                       $(tracks).each(function(index, track) {
                    $('#second').append('<img src="images/soundcloud-icon.png" width="50" height="50"/>'+'  '+track.title+'');
                    $('#second').append('<p><button onClick="fun(this)" type="submit" id="'+track.uri+'">Play</button>');
                    $('#second').append('</p>');
                    $('#second').append('</br>');
         });
    });
                     
                 }
                 
             </script>
             
             <script>
   SC.initialize({
  client_id: 'ee6fa492f06e41811e2f45df5c11fa7b'
});

     function fun (clicked_id) {
       
       count = 18;
       var t = clicked_id;
       alert(t.id);
       SC.oEmbed(t.id,  {maxheight :200 , auto_play : true}, document.getElementById("third"));
       $('#second').append('</br>');
     }  
        </script>
    </head>
<body>
<div id="wrapper">
	<div id="menu">
            
		<ul>
                    <li class="current_page_item">
                        <input type="text" id="trck"/>
                    </li>
                    <li class="last"><button onclick="getTrack()" type="submit">Search</button></li>
		</ul> 
	</div>
        <div id="third">
        </div>     
        <div id="fourth">
        </div>
        <div  id="second" class="hello">
            <h2>User Playlists:</h2>
        </div>
        </div>
    
<div id="footer">
	<p>&copy; All rights reserved. Design by Airian</p>
</div>
</body>
</html>
