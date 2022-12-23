package ejercicios;

public class Ambito {

	static int num = 0;
	
	public static void main(String[] args) {
		int num =8;
		System.out.println("Num1 vale "+num);
		funcion1();
		
		System.out.println("Num1 vale "+Ambito.num);
	}
	
	public static void funcion1() {
		num++;
		System.out.println("Num vale "+num);
	}

}
