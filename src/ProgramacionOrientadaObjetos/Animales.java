package ProgramacionOrientadaObjetos;

public class Animales {

	static String nombre;
	int id;
	int edad;
	
	
	static void mostrarNombre() {
		System.out.println(nombre);
	}
	
	public void mostrarCaracteristicas(String nombString,int edad,int id) {
	System.out.println("El nombre es "+nombString+" con edad "+edad+" y con id "+id);	
		
		
	}
}
