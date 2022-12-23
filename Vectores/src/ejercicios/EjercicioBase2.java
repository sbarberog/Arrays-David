package ejercicios;

import java.util.Scanner;

public class EjercicioBase2 {

	public static void main(String[] args) {
		// Pedir un vector de números variables por teclado y mostrarlo
		Scanner teclado = new Scanner(System.in);
		
		int longitud;
		do {
			System.out.println("¿cuantos elementos quieres (Entre 1 y 10)?: ");
			longitud = teclado.nextInt();
		} while (longitud >10 || longitud <1);
		
		double vector [] = new double[longitud];
		
		for (int i = 0; i < vector.length; i++) {
			System.out.println("Introduce el elemento "+ i );
			vector[i] = teclado.nextDouble();
		}
		
		System.out.println("tu vector es ");
		for (int i = 0; i < vector.length; i++) {
			System.out.printf("%.2f ", vector[i]);
		}
		
		// Si el vector no tiene la casilla 5 (vector de 6 elementos en adelante
		// se produce un error del tipo ArrayIndexOutOfBoundsException
		System.out.println("El valor de la casilla 5 es "+ vector[5]);
	}

}
