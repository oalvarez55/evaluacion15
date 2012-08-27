

	
	public class CamionetA {
	private int precio;
	private int kilometraje;
	private String placa;
	private String residente;
	private String color;

	public void imprimirCamionetA () {
		System.out.println("precio: "+this.precio);
		System.out.println("kilometraje: "+this.kilometraje);
		System.out.println("Color: "+this.color);
		System.out.println("residente:"+this.residente);
		System.out.println("placa:"+this.placa);
	   
	}


	public int setprecio() {
		return precio;
	}


	public void setprecio(int precio) {
		// TODO Auto-generated method stub
		this.precio = precio;
	}



	}



}
