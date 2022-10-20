package ejercicios;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Creación de variables.
		int dni;
		int num;
		char letra; // Esta es la variable donde meteremos la letra del dni.
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca el número de dni");
		dni= sc.nextInt();
		num = dni%23;
		letra = switch(num) {
		case 0 -> {
			yield 'T';
		}
		case 1 ->{
			yield 'R';
		}
		case 2 ->{
			yield 'W';
		}
		case 3 ->{
			yield 'A';
		}
		case 4 ->{
			yield 'G';
		}
		case 5 ->{
			yield 'M';
		}
		case 6 ->{
			yield 'Y';
		}
		case 7 ->{
			yield 'F';
		}
		case 8 ->{
			yield 'P';
		}
		case 9 ->{
			yield 'D';
		}
		case 10 ->{
			yield 'X';
		}
		case 11 ->{
			yield 'B';
		}
		case 12 ->{
			yield 'N';
		}
		case 13 ->{
			yield 'J';
		}
		case 14 ->{
			yield 'Z';
		}
		case 15 ->{
			yield 'S';
		}
		case 16 ->{
			yield 'Q';
		}
		case 17 ->{
			yield 'V';
		}
		case 18 ->{
			yield 'H';
		}
		case 19 ->{
			yield 'L';
		}
		case 20 ->{
			yield 'C';
		}
		case 21 ->{
			yield 'K';
		}
		case 22 ->{
			yield 'E';
		}
		default ->{
			System.out.println("Error");
			yield 'Ñ';
		}
		};
		System.out.println("La letra del dni es " + letra);
	}

}
