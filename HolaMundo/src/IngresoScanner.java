import java.util.Scanner;

public class IngresoScanner {
	
//	Ingreso de datos desde el teclado.
	public static void main(String[] argumentos) {
		
		System.out.println("ingrese su nombre ");
		Scanner dato = new Scanner(System.in);
		String nombre = dato.nextLine();
		System.out.println("Tu nombre "+nombre);
		dato.close();
		
	}
}
