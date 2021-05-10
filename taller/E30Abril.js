let margen = "1cm";
let margen2 = "1cm";

function moverHaciaAbajo(){
    let cuadrado = document.getElementById("cuadrado");
    let nuevoValorDeMargenIzquierdo = parseInt(margen.charAt(0)) + 1;
    margen = nuevoValorDeMargenIzquierdo + "cm";
    cuadrado.style.marginTop = margen;
}

function moverHaciaArriba() {
    let cuadrado= document.getElementById("cuadrado");
    let nuevoValorDeMargenDerecho = parseInt(margen.charAt(0)) - 1;
    margen = nuevoValorDeMargenDerecho + "cm";
    cuadrado.style.marginTop = margen;
}

function moverDerecha(){
    let cuadrado= document.getElementById("cuadrado");
    let nuevoValorDeMargenDerecho = parseInt(margen2.charAt(0)) + 1;
    margen2 = nuevoValorDeMargenDerecho + "cm";
    cuadrado.style.marginLeft = margen2;
}

function moverIzquierda(){
    let cuadrado= document.getElementById("cuadrado");
    let nuevoValorDeMargenDerecho = parseInt(margen2.charAt(0)) - 1;
    margen2 = nuevoValorDeMargenDerecho + "cm";
    cuadrado.style.marginLeft = margen2;
}