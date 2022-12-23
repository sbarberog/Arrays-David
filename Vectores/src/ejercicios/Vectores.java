package ejercicios;

import java.util.Iterator;
import java.util.Scanner;

public class Vectores {

	public static void pedir_vector(int vector []) {
		Scanner teclado = new Scanner(System.in);
		
		for (int i = 0; i < vector.length; i++) {
			System.out.println("Introduce el elemento "+i);
			vector[i] = teclado.nextInt();
		}
	}
	
	public static void mostrar_vector(int vector[]) {
		for (int i = 0; i < vector.length; i++) {
			System.out.print(vector[i]+" ");
		}
		System.out.println();
	}
}
