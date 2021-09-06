let margen = "1cm";
let margen2 = "1cm";

function moverHaciaAbajo(){
    let cuadrado = document.getElementById("cuadrado");
    let nuevoValorDeMargenIzquierdo = parseInt(margen.charAt(0)) + 1;
    margen = nuevoValorDeMargenIzquierdo + "cm";
    cuadrado.style.marginTop = margen;
    comprobar();
}

function moverHaciaArriba() {
    let cuadrado= document.getElementById("cuadrado");
    let nuevoValorDeMargenDerecho = parseInt(margen.charAt(0)) - 1;
    margen = nuevoValorDeMargenDerecho + "cm";
    cuadrado.style.marginTop = margen;
    comprobar();
}

function moverDerecha(){
    let cuadrado= document.getElementById("cuadrado");
    let nuevoValorDeMargenDerecho = parseInt(margen2.charAt(0)) + 1;
    margen2 = nuevoValorDeMargenDerecho + "cm";
    cuadrado.style.marginLeft = margen2;
    comprobar();
}

function moverIzquierda(){
    let cuadrado= document.getElementById("cuadrado");
    let nuevoValorDeMargenDerecho = parseInt(margen2.charAt(0)) - 1;
    margen2 = nuevoValorDeMargenDerecho + "cm";
    cuadrado.style.marginLeft = margen2;
    comprobar();
}


function comprobar(){
let cuadrado = document.getElementById("cuadrado");
let posicionXdeCuadrado = cuadrado.getBoundingClientRect().x;
let posicionYdeCuadrado = cuadrado.getBoundingClientRect().y;

let cuadrado2 = document.getElementById("cuadrado2");
let posicionXdeCuadrado2 = cuadrado2.getBoundingClientRect().x;
let posicionYdeCuadrado2 = cuadrado2.getBoundingClientRect().y;

if(posicionYdeCuadrado == posicionYdeCuadrado2 && posicionXdeCuadrado == posicionXdeCuadrado2){
    cuadrado2.style.display = "none";
    cuadrado.style.backgroundColor = "rgb(0, 183, 255)";
}
else{
    cuadrado2.style.display = "block";
    cuadrado.style.backgroundColor = "rgb(168, 197, 0)";
}
}

