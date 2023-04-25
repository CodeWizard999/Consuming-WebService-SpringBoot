function getStudent(id){
	if(document.getElementById("student" + id).innerHTML=== ""){
		fetch("/getStudent/" + id ).then(data => data.json).then(function(data){ var textToDisplay = ""; 
		 textToDisplay  += "id:" +data.student.id + "<br>" ;
		  textToDisplay  += "name:" +data.student.name + "<br>" ; 
		   textToDisplay  += "grade:" +data.student.grade + "<br>" ; 
		    textToDisplay  += ":letterGrade:" +data.student.letterGrade + "<br>" ;  
		    document.getElementById("student" + id).innerHTML= textToDisplay ;
		    });

			
	}else{
		document.getElementById("student" + id).innerHTML= "";
	}
}