package ejercicios;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	// Creación de variables.
	int horas, min, s;
	// Generación de escaner.
	Scanner sc =new Scanner(System.in);
	// Pedimos al usuario una hora completa.
	System.out.println("Introduzca una hora completa(horas, minutos y segundos)");
	// Asignamos los valores escritos por el usuario.
	horas = sc.nextInt();
	min = sc.nextInt();
	s = sc.nextInt();
	// Si los segundos son 59 lo ponemos a cero, sino aumentamos su valor en 1.
	if(s==59) {
		s=0;
		// Si los minutos son 59 los ponemos a cero, sino aumentamos su valor en 1.
		if(min==59) {
			min=0;
			// Si las horas son 23 las ponemos a cero, sino aumentamos su valor en 1.
			if(horas==23) horas=0;
			else horas++;
		}else min++;
	}else s++;
	// Mostramos mensaje con resultado.
	System.out.println("La hora incrementada es " + horas + ":" + min + ":" + s);
	// Cerramos escaner.
	sc.close();
}
}
