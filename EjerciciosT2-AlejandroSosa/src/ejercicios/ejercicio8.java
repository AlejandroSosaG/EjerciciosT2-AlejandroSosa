package ejercicios;

import java.util.Scanner;

public class ejercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Creación de escaner.
		int dias, distancia;
		double precio; // Esta variable es el precio que calcularemos mediante un cálculo.
		// Generacion de escaner.
		Scanner sc = new Scanner(System.in);
		// Pedimos al usuario los datos necesarios.
		System.out.println("Introduzca los días de estancia y la distacia a recorrer");
		// Asignamos los valores escritos por el usuario.
		dias = sc.nextInt();
		distancia = sc.nextInt();
		// Calculamos el precio.
		precio=distancia*2.5;
		// Si los días de estancia son superior a 7 y la distancia es mayor a 800 km le aplicamos un 30% de descuento al precio.
		if(dias>7 && distancia>800) precio-=(precio*0.3);
		// Mostramos mensaje con resultado.
		System.out.println("El precio del billete es de " + precio + " €");
		// Cerramos escaner.
		sc.close();
	}

}
