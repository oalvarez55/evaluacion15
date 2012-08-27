package claseCA;

public class ppal1 {

	/**
	 * 
	 * camilo, angie
	 * 10/08/2012
	 * modelaje y especificacion
	 */
	public static void main(String[] args) {
		
		CARRO carro1= new CARRO();
		CARRO carro2= new CARRO();
		
		carro1.marca="chevrolet";
		carro1.referencia="captiva";
		carro1.color="negro";
		carro1.cilindrage=2.0;
		carro1.placa="GRE457";
		
		carro2.marca="KIA";
		carro2.referencia="cerato";
		carro2.color="rojo";
		carro2.cilindrage=2.0;
		carro2.placa="GRG123";
		
		carro1.imprimircarro();
		carro2.imprimircarro();
		
		
		
		

	}

}
