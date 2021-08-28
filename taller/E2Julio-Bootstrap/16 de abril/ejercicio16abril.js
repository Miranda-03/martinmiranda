let arreglo = [];

numero = [];

numX = [];

var cant = 6;

let correo;

let numeroT;

function crearArreglo(arreglo, numero){  
 numero = document.getElementById("num").value;
 arreglo.push(numero);
 console.log(arreglo);
 console.log(arreglo.length);
 return arreglo;
}

function cantApariciones(arreglo, cant, numX){
numX = document.getElementById("num2").value;
 for(var y = 0; y < arreglo.length; y++){
     if (arreglo[y] == numX){
         cant++;
     }
 }
 console.log("cantidad de veces que aparece el numero " + numX + ": " + cant)
}

function comprobarMail(correo){
correo = document.getElementById("e-mail").value;
var verf = 0;
if(correo[0] == "@" || correo[correo.length-1] == "@"){
    document.getElementById("validacion").innerHTML = "Correo invalido!";
   document.getElementById("validacion").style.color = "red";
   return false;
}
else{
    for(var f = 1; f < (correo.length - 1); f++){
        if(correo[f] == "@"){
            verf++;
        }
     }
     
     if(verf == 1){
         document.getElementById("validacion").innerHTML = "Correo valido!";
         document.getElementById("validacion").style.color = "green";
        return true;
     }
     else{
        document.getElementById("validacion").innerHTML = "Correo invalido!";
        document.getElementById("validacion").style.color = "red";
        return false;
     }
}
}

function comprobarNumero(numeroT){
    numeroT = document.getElementById("numeroTelefono").value;
 var contNumeros = 0;
 if(numeroT[0] == 0){
     if(numeroT[1] == 1 && numeroT[2] == 1){
       for(var p = 3; p < numeroT.length; p++){
           contNumeros++;
       }
       if(contNumeros == 8){
            document.getElementById("validarTel").innerHTML = "Numero valido!";
            document.getElementById("validarTel").style.color = "green";
            return true;
       }
       else{
        document.getElementById("validarTel").innerHTML = "Numero invalido!";
        document.getElementById("validarTel").style.color = "red";
       }
     }
 }
 else if(numeroT[0] == 1 && numeroT[1] == 1){
   for(var p = 2; p < numeroT.length; p++){
           contNumeros++;
       }
       if(contNumeros == 8){
           document.getElementById("validarTel").innerHTML = "Numero valido!";
           document.getElementById("validarTel").style.color = "green";
           return true;
       }
       else{
        document.getElementById("validarTel").innerHTML = "Numero invalido!";
        document.getElementById("validarTel").style.color = "red";
       }
 }
 else{
    document.getElementById("validarTel").innerHTML = "Numero invalido!";
    document.getElementById("validarTel").style.color = "red";
 }
}