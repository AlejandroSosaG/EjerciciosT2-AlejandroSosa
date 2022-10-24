package ejercicios;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Creación de variables.
		int num;
		// Generación de escaner.
		Scanner sc = new Scanner(System.in);
		// Pedimos al usuario un número entero.
		System.out.println("Introduzca un número");
		// Asignamos el valor escrito por el usuario.
		num = sc.nextInt();
		// Si es negativo lo transformamos en positivo multiplicando por -1, sino lo dejamos igual multiplicando por 1.
		num *= num<0? -1: 1;
		// Mostramos mensaje con resultado.
		System.out.println("El valor absoluto del número es " + num);
		// Cerramos escaner.
		sc.close();
	}

}
