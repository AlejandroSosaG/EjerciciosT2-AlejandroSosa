package ejercicios;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int comida, animales, kilos, necesario=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca la cantidad de comida comprada, el número de animales y los kilos que comen todos en total");
		comida = sc.nextInt();
		animales = sc.nextInt();
		kilos = sc.nextInt();
		if(kilos*animales>comida) {
			System.out.println("No disponemos de suficiente comida para cada animal");
			necesario = ((kilos-comida)/animales);
			System.out.println("Necesitamos comprar " + necesario + " kilos de comida para dar de comer a todos los animales");
		}else System.out.println("Tenemos suficiente comida para cada animal");
	}

}
