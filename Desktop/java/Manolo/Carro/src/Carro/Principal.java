package Carro;

import java.util.Scanner;

public class Principal {

 /**
  * 
  */
 public static void main(String[] args) {
   
  Carro carro1=new Carro();

  
  Scanner paso = new Scanner (System.in);
  
  System.out.print("Rin: ");
  carro1.setrin(paso.nextInt());
  System.out.print("color: ");
  carro1.setColor(paso.next());
  System.out.print("peso: ");
  carro1.setpeso(paso.nextDouble());
  System.out.print("Marca: ");
  carro1.setmarca(paso.next());
  System.out.print("Cilindraje: ");
  carro1.setcilindraje(paso.nextDouble());
  System.out.println();
  System.out.println("Las caracteristicas del auto son: ");
  System.out.println();
  
    
  carro1.imprimircarro();
    

 }

}
