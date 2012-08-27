package claseCA;

import java.util.Scanner;

public class ppal2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		 
		PERRO perro1=new PERRO();
		PERRO perro2=new PERRO();
		Scanner paso = new Scanner (System.in);
		
		System.out.print("nombre: ");
		perro1.setNombre(paso.next());
		System.out.print("color: ");
		perro1.setColor(paso.next());
		System.out.print("peso: ");
		perro1.setPeso(paso.nextDouble());
		System.out.print("raza: ");
		perro1.setRaza(paso.next());
		System.out.print("altura: ");
		perro1.setAltura(paso.nextDouble());
		
		System.out.print("nombre: ");
		perro2.setNombre(paso.next());
		System.out.print("color: ");
		perro2.setColor(paso.next());
		System.out.print("peso: ");
		perro2.setPeso(paso.nextDouble());
		System.out.print("raza: ");
		perro2.setRaza(paso.next());
		System.out.print("altura: ");
		perro2.setAltura(paso.nextDouble());
		
		perro1.imprimirperro();
		perro2.imprimirperro();
		

	}

}
