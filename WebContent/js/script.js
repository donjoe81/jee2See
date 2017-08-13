window.onload = init;

function init(){
	$("btnvalider").onclick=save;
	
}

function valider(){
	var param="";
	if(isanumber($("txttel").value)){
		alert("le tel ne correspond pas");
	}
}
function save(){
	var xhr = getXHR();
	if($("txtnom").value!="" && $("txtprenom").value!="" && $("txttel").value!="" && $("txtlogin").value!=""
		&& $("txtpass").value!=""){
		var param="nom="+$("txtnom").value+"&prenom="+$("txtprenom").value+"&tel="+$("txttel").value+
		"&adresse="+$("txtadress").value+"&login="+$("txtlogin").value+"&password="+$("txtpass").value;
		xhr.onreadystatechange = function() {
		if (xhr.readyState == 4) {
			if (xhr.status == 200) {
					callBackSelectMap(xhr.responseText);
				}
			}
		}
		xhr.open("POST","../create.php?"+param,true);
		xhr.send(null);
	}
	else
		alert("tous les champs (*) sont obligatoire");
}

function callBackSelectMap(rsp){
	if(rsp="true"){
		alert('compté crée avec succes');
		window.location.href="http://localhost:9090/reservation/vues/login.jsp";
	}
	else
		alert("erreur survenu lors du traitement de votre demande, veillez reessayer plus tard");
}