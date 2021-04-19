document.getElementById('choix').addEventListener('click', choixRegistration);

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
  // appendChild
}
}