package segundoPOO;

public class persona {

	
	String nombre;
	byte edad;
	double estatura;
	
	public void saludar() {
		System.out.println("Hola mi nombre es "+nombre);
		System.out.println("Encantado de conocerte");
	}

	public void cumpliranos() {
		edad++;
	}

	public void crecer (double incremento) {
		estatura=estatura+incremento;
		
	}

}
