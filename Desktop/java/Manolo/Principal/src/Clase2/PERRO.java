package Clase2;

public class PERRO {
private String nombre;
private String color;
private Double peso;
private Double Racion;


public void imprimirperro (){

System.out.println("Nombre: "+this.nombre);
System.out.println("Color: "+this.color);
System.out.println("Peso: "+this.peso);
System.out.println("Racion: "+this.Racion);
}

public String getNombre() {
return nombre;
}

public void setNombre(String nombre) {
this.nombre = nombre;
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

public void setPeso(Double peso) {
this.peso = peso;
}
public Double getRacion() {
	return Racion;
}

public void setRacion(Double racion) {
	Racion = racion;
}
}
