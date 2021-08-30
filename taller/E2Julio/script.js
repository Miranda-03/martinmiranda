
            

                
                let numeroSacarOpciones = false;    
              

                function cambiarHTML(direccion, textoEjercicio, valor){
                    
                    
                    document.getElementById("ejercicio").src = direccion;
                    document.getElementById("enunciado").src = textoEjercicio;
                 


                    let inputs = document.querySelectorAll(".input-btn");
                    for(let u = 0; u < inputs.length; u++){
                        inputs[u].checked = false;
                    }
                    check();
                   
              
                    numeroSacarOpciones = false;

                    let botones = document.getElementsByTagName("input");
                    for(let y = 0; y < botones.length; y++){
                        if(botones[y].value == valor){
                            botones[y].style.transition = "all 1s"
                            botones[y].style.color = "#949494";
                        }
                        else{
                            botones[y].style.borderBottomStyle = "none";
                            botones[y].style.transition = "0s";
                            botones[y].style.color = "white";
                        }
                    }
                }

                VanillaTilt.init(document.querySelector("#principio img"), {
		            max: 25,
		            speed: 400,
	            });


                const contenedorOpciones = document.getElementById("m-btn");
                    let flecha = document.getElementById("arrow");

                function check(){


                    let inputs = document.querySelectorAll(".input-btn");
                    let cosas = document.querySelectorAll("#cosas")
                    let flechas = document.getElementsByTagName("span");
                    let labels = document.getElementsByTagName("label");
                    let listas = document.querySelectorAll(".lista-btn");
                    

                    for(let p = 0; p <= inputs.length -1; p++){
                        console.log(p);
                        if(inputs[p].checked){
                            console.log(listas[p].style.height);
                            flechas[p].style.transform = "rotate(180deg)";
                            cosas[p].style.height = (listas[p].scrollHeight + 60);
                        }
                        else{
                            cosas[p].style.height = "0px"
                            flechas[p].style.transform = "rotate(0deg)";
                        }
                    }
                    
                   
                }
 
               

                function mostrarOpciones(valor){
                    let idModificar;

                    if(valor == "16 de abril"){
                        idModificar = "opciones";
                    }
                    else{
                        idModificar = "opciones18Junio";
                    }

                    if(numeroSacarOpciones == false){
                        document.getElementById(idModificar).style.display = "inline-flex";
                        document.getElementById(idModificar).style.opacity = "1";
                        numeroSacarOpciones = true;
                    }
                    else{
                        document.getElementById(idModificar).style.display = "none";
                        numeroSacarOpciones = false;
                    }
                }



                
               

          