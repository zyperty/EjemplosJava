import java.util.Scanner;

public class TipoDatos {
	public static void main(String[] artgumentos) {
//		ingresar un numero por teclado e imprimir en pantalla los numeros pares.
		System.out.println("Ingresar el numero ");
		Scanner rango = new Scanner(System.in);
		int numero = Integer.parseInt(rango.nextLine());
		rango.close();
		
		for(int i = 1; i <= numero; i++) {
			if(i%2 == 0) {
				
				System.out.println("Los numeros pares son "+i);
			}
			
		}
		
	}

}
