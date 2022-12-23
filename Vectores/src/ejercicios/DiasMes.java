package ejercicios;

import java.util.Scanner;

public class DiasMes {
		
	public static void main(String[] args) {
		final short dias [] = { 31,28,31,30,31,30,31,31,30,31,30,31 };
		final String meses [] = { "Enero", "Febrero", "Marzo", "Abril", "Mayo", 
			"junio", "Julio", "Agosto", "septiembre", "octubre", "noviembre", 
			"diciembre"
		};
		
		Scanner teclado = new Scanner(System.in);
		int mes;
		do {
			System.out.println("Introduce el numero del mes (1-12): ");
			mes = teclado.nextInt();
		} while (mes <1 || mes >12);
		
		
		System.out.printf("EL mes %d (%s) tiene %d dias", mes, meses[mes-1], dias[mes-1]);
	}

}
