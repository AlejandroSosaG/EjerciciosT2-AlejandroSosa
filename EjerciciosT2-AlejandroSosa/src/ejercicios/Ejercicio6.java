package ejercicios;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num, num1, num2, suma;
		Scanner sc = new Scanner(System.in);
		num1= (int) (Math.random()*100);
		num2= (int) (Math.random()*100);
		suma= num1 + num2;
		System.out.println("Introduzca la suma de "+ num1 + " y " + num2);
		num = sc.nextInt();
		if(num==suma) System.out.println("El resultado es correcto");
		else System.out.println("El resultado es incorrecto");
	}
}
