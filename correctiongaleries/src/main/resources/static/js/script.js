document.getElementById('choix').addEventListener('click', choixRegistration2);

function choixRegistration(){
   let medecin = document.getElementById('medecin');
   let patient = document.getElementById('patient');
   let resHTML = '';
   
   if (medecin){
       resHTML += '<div><input type="text"  th:field="*{numrpps}" placeholder="Numero RPPS" /> </div>' +
               '<div><input type="text"  th:field="*{specialite}" placeholder="Spécialité" /> </div>';
   }else{
       if (patient){
       resHTML += '<div><input type="text"  th:field="*{numSecu}" placeholder="Numero Sécurité Sociale" /> </div>' +
               '<div><input type="text"  th:field="*{dateNaissance}" placeholder="Date de naissance" /> </div>';
   }else{
       resHTML += '';
   } document.getElementById("patientmedecin").innerHTML = resHTML;
   //create element
  //appendChild
}
}

function choixRegistration2(){
   let medecin = document.getElementById('medecin').click();
   let patient = document.getElementById('patient').click();
   let patoumed = document.getElementById('patoumed');
   var text = document.createElement("input");
   text.type = "text";
   
   if (medecin){
   patoumed.appendChild(text);
   text.placeholder = "Nom";
   }else{
    if(patient){
   patoumed.appendChild(text);
           
       }
   }
   
}