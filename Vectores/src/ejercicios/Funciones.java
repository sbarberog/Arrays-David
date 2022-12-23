package ejercicios;

import java.util.Scanner;

public class Funciones {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double res = sumar(7,9);
		System.out.println("La suma es "+res);
		
		System.out.printf("La suma de 5 y -8 es %.2f", sumar(5,-8));
		
		System.out.println("Introduce un numero: ");
		int a = teclado.nextInt();
		System.out.println("Introduce un numero: ");
		int b = teclado.nextInt();
		System.out.printf("La suma de %d y %d es %.2f", a,b, sumar(a,b));
		
		escribeHola(8);
	}
	
	public static double sumar(double num1, double num2) {
		return num1+num2;
	}

	public static void escribeHola(int veces) {
		for (int i = 0; i < veces; i++) {
			System.out.println("Hola");
		}
	}
}
