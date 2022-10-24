package ejercicios;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Creación de variables.
		int comida, animales, kilos, necesario=0;
		// Generación de escaner.
		Scanner sc = new Scanner(System.in);
		// Pedimos al usuario los datos iniciales.
		System.out.println("Introduzca la cantidad de comida comprada, el número de animales y los kilos que comen todos en total");
		// Asignamos a las variables los valores escritos por el usuario.
		comida = sc.nextInt();
		animales = sc.nextInt();
		kilos = sc.nextInt();
		// Si no hay suficiente comida lo mostramos en un mensaje y calculamos los kilos que faltan, sino lo decimos en un mensaje.
		if(kilos*animales>comida) {
			System.out.println("No disponemos de suficiente comida para cada animal");
			necesario = ((kilos-comida)/animales);
			// Mostramos mensaje con resultado.
			System.out.println("Necesitamos comprar " + necesario + " kilos de comida para dar de comer a todos los animales");
		}else System.out.println("Tenemos suficiente comida para cada animal");
		// Cerramos escaner.
		sc.close();
	}
}
