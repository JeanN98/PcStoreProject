var i=0; 

fuction MostrarLogin(){
	if (i==0){
		var Login= document.getElementsByTagName('form').style.display="block";
		i++;
	}else {
		  document.getElementsByTagName('form').style.display="none";
      i--;
		
	}
	
}