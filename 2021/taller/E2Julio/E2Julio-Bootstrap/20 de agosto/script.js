 let botones = document.getElementsByTagName("button");
 let input = document.getElementById("radio");
 input.style.display = "none";
 let base = document.getElementById("base");
 let result = document.getElementById("mostrarResultado"); 
 base.style.display = "none"
 let calc = document.getElementById("calcular");
 calc.style.display = "none"
 let opcion; 

 for(let y = 0; y < botones.length-1; y++){
    botones[y].addEventListener("click", ( ) => {
       botones[y].style.color = "white"
       if(botones[y].id == "circulo"){
          opcion = "circulo";
          input.placeholder = "ingrese su radio";
          result.innerHTML = "Circulo";
       }
       else if(botones[y].id == "esfera"){
          opcion = "esfera";
          input.placeholder = "ingrese su radio";
       }
       else if(botones[y].id == "cuadrado"){
          opcion = "cuadrado";
          input.placeholder = "ingrese su lado";
       }
       else if(botones[y].id == "cubo"){
          opcion = "cubo";
          input.placeholder = "ingrese su lado";
       }
       if(botones[y].id == "triangulo"){
          opcion = "triangulo";
          base.style.display = "inline";
          input.placeholder = "ingrese su lado";
       }
       else {
          base.style.display = "none";
       }
      input.value = null;
      base.value = null;
      input.style.display = "inline";
      calc.style.display = "inline";
      result.innerHTML = "...";
      for(let y = 0; y < botones.length-1; y++){
         if(botones[y].id == opcion){
            botones[y].style.color = "#ff0000";
         }
         else{
            botones[y].style.color = "white";
         }
      }
    });
 }

 var resultado;
 var num1;
 var num2;

 calc.addEventListener("click", ( ) =>{
   num1 = input.value;
   if(opcion == "triangulo"){
      num2 = base.value;
      result.innerHTML = Math.round((num1 * num2)/2);
   }
   else if(opcion == "circulo"){
      result.innerHTML = Math.round(Math.PI * num1 * num1);
   }
   else if(opcion == "esfera"){
      result.innerHTML = Math.round(4 * Math.PI * num1 * num1);
   }
   else if(opcion == "cuadrado"){
      result.innerHTML = Math.round(num1 * num1);
   }
   else{
      result.innerHTML = Math.round(6 * num1 * num1);
   }
 });