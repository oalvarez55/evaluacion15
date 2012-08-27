package CLASE2;

public class PPAL2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		PERRO[] perros = ingresarperros();
		mostrarperros(perros);
	}

	private static void mostrarperros(PERRO[] perros) {
		for(int i = 0; i< perros.length; i++){
			perros[i].imprimirperro();
	}
	}

	private static PERRO[] ingresarperros() {
		
		PERRO[] perros = new PERRO[4];
		
		String [] nombres = {"toby","matias","luna","felix"};
		String [] colores = {"amarillo","cafe","gris","blanco"};	
		Double [] pesos = {1.3,2.2,1.9,2.0};
		String [] razas = {"labrador","Chow Chow","Doberman","D�lmata"};
		Double [] alturas = {2.3,1.2,1.6,2.4};
		Double [] raciones = {1.3,2.1,1.3,2.2};
		
		for (int i = 0; i < 4; i++){
			PERRO perro = new PERRO();
			
			perro.setNombre(nombres[i]);
			perro.setColor(colores[i]);
			perro.setPeso(pesos[i]);
			perro.setRaza(razas[i]);
			perro.setAltura(alturas[i]);
			perro.setRacion(raciones[i]);
			
			perros[i]= perro;
		}
	 return perros;
	}

}
