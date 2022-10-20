package ejercicios;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int horas, min, s;
	Scanner sc =new Scanner(System.in);
	System.out.println("Introduzca una hora completa(horas, minutos y segundos)");
	horas = sc.nextInt();
	min = sc.nextInt();
	s = sc.nextInt();
	if(s<59) {
		s=0;
		if(min<59) {
			min=0;
			if(horas<23) horas++;
			else horas=0;
		}else min++;
	}else s++;
	System.out.println("La hora incrementada es " + horas + ":" + min + ":" + s);
}
}
