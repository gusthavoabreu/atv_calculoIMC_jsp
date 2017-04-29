<!DOCTYPE html>
<html>
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1"> 
    <title>Calculo IMC</title>
    <link href="style.css" rel="stylesheet">
    <link href="https://fonts.googleapis.com/css?family=Source+Sans+Pro" rel="stylesheet">
  </head>

  <body>
      <h2>Calcular IMC</h2>
      <div class="container">
        <div id="form">
        <div class="imgcontainer">
          <img src="imagem_imc.jpg" alt="Avatar" class="avatar">
        </div>
          <form name="imcForm" id="imcForm" action="#">

        <label>Altura</label><br />
        <input type="text" placeholder="Digite sua altura em cm" name="altura" id="altura" required>

        <br /><label>Peso</label><br />
        <input type="text" placeholder="Digite seu peso em kg" name="peso" id="peso" required>
        
        <input class=css_btn_class name="Enviar" type="submit" value="Calcular" />
    </p>
                
              



	
<%
String alturaStr = request.getParameter("altura");
String pesoStr = request.getParameter("peso");
if( pesoStr == null || alturaStr == null || pesoStr == "" || alturaStr == ""){
        return;
}
double peso = Double.parseDouble(pesoStr);
double altura = Double.parseDouble(alturaStr);
altura = altura == 0 ? 1 : altura;
double calculo = peso / (altura*altura);
String resultado = "";
if(calculo<18.5){
	resultado = "Você está magro com esse indice: " + calculo;
}
else if(calculo>=18.5 && calculo<24.9){
	resultado = "Você está normal com esse indice:" + calculo;
}
else if(calculo>=24.9 && calculo<29.9) {
	resultado = "Você está com sobre peso com esse indice: " + calculo;
}
else if(calculo>=29.9 && calculo<39.9) {
	resultado = "Você está com obesidade com esse indice: " + calculo;
}
else if (calculo>39.9) {
	resultado =  "Você está com obesidade grave com esse indice: " + calculo;
}
%>

	<div id="alert"> <%=resultado%> </div>
	
    </div>
        </div>   
    </div>

  </form>
  
</body>