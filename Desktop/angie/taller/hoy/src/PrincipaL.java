

	

	public class PrincipaL {

		private String nombre;
		private Double peso;
		private String color;
		private double racion;
		public void imprimirperro(){
			System.out.println("Nombre: "+this.nombre);
			System.out.println("Peso: "+this.peso);
			System.out.println("Color: "+this.color);
		}
		
		public String getNombre() {
			return nombre;
		}
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		public Double getPeso() {
			return peso;
		}
		public void setPeso(Double peso) {
			this.peso = peso;
		}
		public String getColor() {
			return color;
		}
		public void setColor(String color) {
			this.color = color;
		}
		public double getracion() {
			return racion;
		}
		public void setracion(double racion) {
			this.racion = racion;
		}
			
	}