

let inputs;
let cosas;
let flechas; 
let labels;
let listas;
let numeroSacarOpciones = false;

function cambiarHTML(direccion, textoEjercicio){

    inputs = document.querySelectorAll(".input-btn");
    
    document.getElementById("ejercicio").src = direccion;
    document.getElementById("enunciado").src = textoEjercicio;


    for(let p = 0; p <= inputs.length -1; p++){
            inputs[p].checked = false;
            cosas[p].style.height = "0px"
            flechas[p].style.transform = "rotate(0deg)";   
    } 
}


VanillaTilt.init(document.querySelector("#principio img"), {
    max: 25,
    speed: 400,
});


inputs = document.querySelectorAll(".input-btn");
cosas = document.querySelectorAll("#cosas");
flechas = document.getElementsByTagName("span");
labels = document.getElementsByTagName("label");
listas = document.querySelectorAll(".lista-btn");

function check(valorInput){
   
    for(let p = 0; p <= inputs.length -1; p++){
        if(p != valorInput){
            inputs[p].checked = false;
            cosas[p].style.height = "0px"
            flechas[p].style.transform = "rotate(0deg)";
        }
    }

    if(inputs[valorInput].checked){
        flechas[valorInput].style.transform = "rotate(180deg)";
        cosas[valorInput].style.height = (listas[valorInput].scrollHeight + 60);
    }
    else{
        cosas[valorInput].style.height = "0px"
        flechas[valorInput].style.transform = "rotate(0deg)";
    }
}

