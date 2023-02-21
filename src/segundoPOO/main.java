package segundoPOO;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
persona nuevaPersona= new persona();
nuevaPersona.nombre="meme";
nuevaPersona.edad=12;
nuevaPersona.estatura=13;
nuevaPersona.crecer(0);
nuevaPersona.cumpliranos();
System.out.println("El nombre de la persona es "+nuevaPersona.nombre+" con edad "+nuevaPersona.edad+" y estatura de "+nuevaPersona.estatura+" kilometros");
System.out.println("Cuanto has crecido?");
double incremento=new Scanner(System.in).nextDouble();

nuevaPersona.crecer(incremento);
	System.out.println("Tu estatura es ahora de "+nuevaPersona.estatura);
	}

}
