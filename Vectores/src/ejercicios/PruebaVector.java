package ejercicios;

import java.util.Scanner;

public class PruebaVector {

	public static void main(String[] args) {
		int vector1[], vector2[];
		
		int longitud;
		Scanner teclado = new Scanner(System.in);
		
		
		System.out.println("Cuantos elementos quieres para el vector?");
		longitud = teclado.nextInt();
		vector1 = new int[longitud];
		vector2 = new int[longitud];
		
		System.out.println("Introduce el primer vector");
		Vectores.pedir_vector(vector1);
		System.out.println("Introduce el segundo vector");
		Vectores.pedir_vector(vector2);
		
		System.out.println("tu primer array es ");
		Vectores.mostrar_vector(vector1);
		
		System.out.println("tu segundo array es ");
		Vectores.mostrar_vector(vector2);

	}

}
