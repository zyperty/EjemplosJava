import java.util.Scanner;

public class Promedio {
	public static void main(String[] argumentos) {
		Scanner dato = new Scanner(System.in);
		double promedio = 0;
		double sumatoria = 0;
//      Tamaño del arreglo
		int tamano = 10;
	  
// 		Declaracion de arreglo
		double []arreglo = new double [tamano];
		
//		Ingreso de datos al arreglo de a uno
		for(int i = 0; i < tamano; i++) {
			arreglo[i] = dato.nextInt();
		}	
//		Matriz original
		System.out.println("La matriz original es ");
		
//     	leectura de la arreglo original
		for(int i = 0; i < tamano; i++) {
			System.out.println(arreglo[i]);
		}
//		Sumatoria 
		for(int i = 0; i < tamano; i++) {
//			Equivalente a sumatoria =  sumatoria + arreglo[]
			sumatoria += arreglo[i]; 
		}
			
		promedio = sumatoria / tamano;
		System.out.println("El promedio es "+promedio);
		dato.close();
	}
}
