package ejercicios;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Creación de variables.
		int num;
		int cifra1;
		int cifra2;
		int cifra3;
		int cifra4;
		boolean capicua=false; // Esta es la variable que validará si el número es capicúa o no.
		// Generación de escaner.
		Scanner sc = new Scanner(System.in);
		// Pedimos al usuario que escriba un número.
		System.out.println("Introduzca un número entre 0 y 9999");
		// Asignamos a la variable num el valor escrito por el usuario.
		num = sc.nextInt();
		// Si el numero tiene una cifra es capicúa.
		if(num<10) {
			capicua=true;
		}else {
			// Si el numero tiene 2 cifras sacamos el valor de cada una.
			if(num<100){
				cifra1= (int) num/10;
				cifra2=num%10;
				// Si las cifras son iguales el número es capicúa.
				if(cifra1==cifra2) {
					capicua=true;
				}
					
			}else {
				// Si el número tiene 3 cifras conseguimos el valor de la primera y la última.
				if(num<1000) {
					cifra1= (int) num/100;
					cifra3=num%10;
					// Si el valor de la primera cifra y la tercera son iguales el número es capicúa.
					if(cifra1==cifra3) capicua = true;
				// Si el número tiene 4 cifras sacamos el valor de cada cifra.
				}else {
					cifra1= (int) num/1000;
					cifra2=(int)(num/100)%10;
					cifra3=(int)(num/10)%10;
					cifra4= (int)(num%10);
					// Si el valor de la primera y cuarta cifra y el de la segunda y cuarta son iguales el número es capicúa.
					if(cifra1==cifra4 && cifra2==cifra3) capicua=true;
				}
			}
		}
		/*
		 * Si el número es capicúa mostramos un mensaje que lo diga, sino mostramos un mensaje diciendo que no es capicúa.
		 */
		if(capicua) {
			System.out.println("El número es capicúa");
		}else System.out.println("El número no es capicúa");
		sc.close();
	}

}
