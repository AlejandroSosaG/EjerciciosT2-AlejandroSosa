package ejercicios;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca un número");
		num = sc.nextInt();
		num *= num<0? -1: 1;
		System.out.println("El valor absoluto del número es " + num);
	}

}
