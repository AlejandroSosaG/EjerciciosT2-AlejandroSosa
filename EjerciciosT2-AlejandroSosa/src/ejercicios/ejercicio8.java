package ejercicios;

import java.util.Scanner;

public class ejercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dias, distancia;
		double precio;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca los días de estancia y la distacia a recorrer");
		dias = sc.nextInt();
		distancia = sc.nextInt();
		precio=distancia*2.5;
		if(dias>7 && distancia>800) precio-=(precio*0.3);
		System.out.println("El precio del billete es de " + precio + " €");
	}

}
