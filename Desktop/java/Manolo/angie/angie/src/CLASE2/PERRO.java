package CLASE2;

public class PERRO {
 private String nombre;
 private String color;
 private Double peso;
 private String raza;
 private Double altura; 
 private Double racion;
 
 public void imprimirperro (){
	 
	 System.out.println("nombre: "+this.nombre);
	 System.out.println("color: "+this.color);
	 System.out.println("peso: "+this.peso);
	 System.out.println("raza: "+this.raza);
	 System.out.println("altura: "+this.altura);
	 System.out.println("racion: "+this.racion);
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

public String getRaza() {
	return raza;
}

public void setRaza(String raza) {
	this.raza = raza;

}

public Double getAltura() {
	return altura;
}

public void setAltura(Double altura) {
	this.altura = altura;
}

public Double getRacion() {
	return racion;
}

public void setRacion(Double racion) {
	this.racion = racion;
}


}
