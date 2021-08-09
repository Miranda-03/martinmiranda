
let tab;
let tl;
let ti;
let ti2;
let ti3;
let tib;
let tib2;
let tib3;
let inp;
let inp2;
let inp3;

function mostrarTodo(){
    tab = document.getElementById("tabla");
    tl = document.createElement("tr");
    tl.setAttribute("id", "infoFilas");

    ti = document.createElement("td");
    ti.setAttribute("id", "inputELiminar");

    ti2 = document.createElement("td");
    ti2.setAttribute("id", "inputELiminar2");

    ti3 = document.createElement("td");
    ti3.setAttribute("id", "inputELiminar3");

    tib = document.createElement("td");
    tib2 = document.createElement("td");
    tib3 = document.createElement("td");
    
    

    inp = document.createElement("input");
    inp.setAttribute("type", "text");
    inp.setAttribute("id", "in1");

    inp2 = document.createElement("input");
    inp2.setAttribute("type", "text");
    inp2.setAttribute("id", "in2");

    inp3 = document.createElement("input");
    inp3.setAttribute("type", "number");
    inp3.setAttribute("id", "in3");

    
    ti.appendChild(inp);
    ti2.appendChild(inp2)
    ti3.appendChild(inp3)
    
    
    tl.appendChild(ti);
    tl.appendChild(ti2);
    tl.appendChild(ti3);
    
    tab.appendChild(tl);

    let botonMostar = document.getElementById("mostrar");
    botonMostar.style.display = "none";

    let botonAgregar = document.getElementById("agregar");
    botonAgregar.style.display = "block";
}

function ingresarDatos(){
    let botonMostar = document.getElementById("mostrar");
    botonMostar.style.display = "block";

    let botonAgregar = document.getElementById("agregar");
    botonAgregar.style.display = "none";

    let inputA = document.getElementById("in1");
    let inputB = document.getElementById("in2");
    let inputC = document.getElementById("in3");

    var nombre =  document.getElementById("in1").value;
    var apellido = document.getElementById("in2").value;
    var edad = document.getElementById("in3").value;

    inputA.style.display="none";
    inputB.style.display="none";
    inputC.style.display="none";

    let info = document.createElement("h");
    info.setAttribute("type", "text");
    info.setAttribute("id", "nom");
    let info2 = document.createElement("h");
    info2.setAttribute("type", "text");
    info2.setAttribute("id", "ape");
    let info3 = document.createElement("h");
    info3.setAttribute("type", "text");
    info3.setAttribute("id", "eda");

    
    tib.appendChild(info);
    tib2.appendChild(info2);
    tib3.appendChild(info3);

    tl.appendChild(tib);
    tl.appendChild(tib2);
    tl.appendChild(tib3);
    
    tab.appendChild(tl);


    document.getElementById("nom").innerHTML = nombre;
    document.getElementById("ape").innerHTML = apellido;
    document.getElementById("eda").innerHTML = edad;

    info.setAttribute("id", "set");
    info2.setAttribute("id", "set1");
    info3.setAttribute("id", "set2");
    inp.setAttribute("id", "listo1");
    inp2.setAttribute("id", "listo2");
    inp3.setAttribute("id", "listo3");

    let inputSacar = document.getElementById("listo1");
    let inputSacar2 = document.getElementById("listo2");
    let inputSacar3 = document.getElementById("listo3");

    let sacar = document.getElementById("inputELiminar");
    let sacar2 = document.getElementById("inputELiminar2");
    let sacar3 = document.getElementById("inputELiminar3");

    inputSacar.remove();
    inputSacar2.remove();
    inputSacar3.remove();

    sacar.remove();
    sacar2.remove();
    sacar3.remove();


}

