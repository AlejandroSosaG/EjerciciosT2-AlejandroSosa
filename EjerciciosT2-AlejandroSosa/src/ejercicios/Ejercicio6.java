package ejercicios;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Creación de variables.
		int num, num1, num2, suma;
		// Generación de escaner.
		Scanner sc = new Scanner(System.in);
		// Generamos 2 números aleatorios entre 1 y 100.
		num1= (int) (Math.random()*100);
		num2= (int) (Math.random()*100);
		// Sumamos el valor de los dos aleatorios.
		suma = num1 + num2;
		// Pedimos al usuario la suma de los dos números aleatorios.
		System.out.println("Introduzca la suma de "+ num1 + " y " + num2);
		// Asignamos el valor escrito por el usuario.
		num = sc.nextInt();
		// Si el resultado es correcto lo mostramos por mensaje, sino decimos que es incorrecto.
		if(num==suma) System.out.println("El resultado es correcto");
		else System.out.println("El resultado es incorrecto");
		// Cerramos escaner.
		sc.close();
	}
}
