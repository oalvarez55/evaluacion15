
package Carro;

/*
 * 
 */

public class Carro {
	
 private int Rin;
 private String color;
 private Double peso;
 private String marca;
 private Double cilindraje; 
 
 public void imprimircarro (){
  
  System.out.println("Rin: "+this.Rin);
  System.out.println("color: "+this.color);
  System.out.println("peso: "+this.peso);
  System.out.println("marca: "+this.marca);
  System.out.println("cilindraje: "+this.cilindraje);
 }

public int getNombre() {
 return Rin;
}

public void setrin(int Rin) {
 this.Rin = Rin;
}

public String getColor() {
 return color;
}

public void setColor(String color) {
 this.color = color;
}

public Double getPeso() {
 return peso;
}
public void setpeso(Double peso) {
	 this.peso = peso;
}
public String getmarca() {
 return marca;
}

public void setmarca(String marca) {
 this.marca = marca;
 
}

public Double getcilindraje() {
 return cilindraje;
}

public void setcilindraje(Double cilindraje) {
 this.cilindraje = cilindraje;
}
}