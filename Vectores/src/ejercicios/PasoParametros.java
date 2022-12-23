package ejercicios;

import java.util.Scanner;

public class PasoParametros {

	public static void main(String[] args) {
		
		int vector[] = new int[10];
		for (int i = 0; i < vector.length; i++) {
			System.out.print(vector[i]+" ");
		}
		System.out.println();
		int pos = 0;
		cambiaValor(vector, pos, 9);
		for (int i = 0; i < vector.length; i++) {
			System.out.print(vector[i]+" ");
		}
		System.out.println("Pos vale "+pos);
		
	}
	
	public static void cambiaValor(int v[], int posicion, int valor) {
		if (posicion >=0 && posicion < v.length) {
			v[posicion]= valor;
			posicion = 2000;
		}
	}
	

}
