package com.company;
import java.text.BreakIterator;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

		Persona p = new Persona();
		Persona p2 = new Persona("Leandro");
		Persona p3 = new Persona("Julian", 45, 34455327, "Rivadavia 2345", 23442123);

		int new_edad = p.getEdad();

		System.out.println(p3.getNombre());
		System.out.println(p3.getEdad());
		System.out.println(p3.getDni());
		System.out.println(p3.getDireccion());
		System.out.println(p3.getTelefono());

		System.out.println("---------------------------------------------------------------------");

		boolean esMayor = p.esMayorDeEdad();
		System.out.println(esMayor);

		boolean sonIguales = p.sonLaMismaPersona(p2);
		System.out.println(sonIguales);

		boolean edadIgual = p.tienenLaMismaEdad(p3);
		System.out.println(edadIgual);


		//ejercicio de la clase del 12 de abril

		System.out.println(" ");


		Scanner ingresar = new Scanner(System.in);
		Scanner ingresar2 = new Scanner(System.in);

		System.out.println("ingrese nombre:");
		String ponerNombre = ingresar.nextLine();
		System.out.println("ingrese direccion:");
		String ponerDireccion = ingresar.nextLine();
		System.out.println("ingrese edad:");
		int ponerEdad = ingresar.nextInt();
		System.out.println("ingrese dni:");
		int ponerDni = ingresar.nextInt();
		System.out.println("ingrese telefono:");
		int ponerTelefono = ingresar.nextInt();

		System.out.flush();

		System.out.println("-----------------------------------");

		int opcion;
			
		Persona p0 = new Persona(ponerNombre, ponerEdad, ponerDni, ponerDireccion, ponerTelefono);

		boolean block = false;

		while(block == false){

			System.out.println(p0.getNombre());
			System.out.println(p0.getEdad());
			System.out.println(p0.getDni());
			System.out.println(p0.getDireccion());
			System.out.println(p0.getTelefono());

			System.out.println(" ");

			System.out.println("¿Que desea cambiar?");

			System.out.println(" ");

			System.out.println("(- 1 -) Nombre");
			System.out.println("(- 2 -) edad");
			System.out.println("(- 3 -) dni");
			System.out.println("(- 4 -) direccion");
			System.out.println("(- 5 -) telefono");

			System.out.println(" ");

			System.out.println("Eliga la opcion o entre '0' para terminar");

			opcion = ingresar.nextInt();

			if(opcion == 0){
				block = true;
			}
			else if(opcion == 1){
				System.out.println("ingrese nuevo nombre:");
				ponerNombre = ingresar2.nextLine();
				p0.setNombre(ponerNombre);
			}
			else if(opcion == 2){
				System.out.println("ingrese nueva edad:");
				ponerEdad = ingresar2.nextInt();
				p0.setEdad(ponerEdad);
			}
			else if(opcion == 3){
				System.out.println("ingrese nuevo dni:");
				ponerDni = ingresar2.nextInt();
				p0.setDni(ponerDni);
			}
			else if(opcion == 4){
				System.out.println("ingrese nueva direccion:");
				ponerDireccion = ingresar2.nextLine();
				p0.setDireccion(ponerDireccion);
			}
			else if(opcion == 5){
				System.out.println("ingrese nuevo telefono:");
				ponerTelefono = ingresar2.nextInt();
				p0.setTelefono(ponerTelefono);
			}

			System.out.println(" ");

		}
    }

}




