package ejercicios;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// Creación de variables.
		int num, cifra1, cifra2;
		String numero = null; // Esta variable es el número escrito en letras.
		// Generación de escaner.
		Scanner sc = new Scanner(System.in);
		// Pedimos al usuario un número entero entre 1 y 99.
		System.out.println("Introduzca un numero entre el 1 y el 99");
		// Asignamos el valor escrito por el usuario.
		num = sc.nextInt();
		// Si el número es inferior a 16 asignamos a numero un valor dependiendo de num.
		if(num<16) {
			switch (num) {
			case 1:
				numero ="uno";
				break;
			case 2:
				numero ="dos";
				break;
			case 3:
				numero ="tres";
				break;
			case 4:
				numero ="cuatro";
				break;
			case 5:
				numero ="cinco";
				break;
			case 6:
				numero ="seis";
				break;
			case 7:
				numero ="siete";
				break;
			case 8:
				numero ="ocho";
				break;
			case 9:
				numero ="nueve";
				break;
			case 10:
				numero ="diez";
				break;
			case 11:
				numero ="once";
				break;
			case 12:
				numero ="doce";
				break;
			case 13:
				numero ="trece";
				break;
			case 14:
				numero ="catorce";
				break;
			case 15:
				numero ="quince";
				break;
			}			
		}else {
			// Calculamos las dos cifras del número mediante un cálculo.
			cifra1 = (int)num/10;
			cifra2 = num%10;
			switch (cifra1) {
			case 1:
				numero = "dieci";
				break;
			case 2:
				if(cifra2==0) numero="veinte";
				else numero ="veinti";
				break;
			case 3:
				numero ="treinta";
				break;
			case 4:
				numero ="cuarenta";
				break;
			case 5:
				numero ="cincuenta";
				break;
			case 6:
				numero ="sesenta";
				break;
			case 7:
				numero ="setenta";
				break;
			case 8:
				numero ="ochenta";
				break;
			case 9:
				numero ="noventa";
				break;
			}
			switch (cifra2) {
			case 1:
				numero +=" y uno";
				break;
			case 2:
				numero +=" y dos";
				break;
			case 3:
				numero +=" y tres";
				break;
			case 4:
				numero +=" y cuatro";
				break;
			case 5: 
				numero +=" y cinco";
				break;
			case 6:
				numero +=" y seis";
				break;
			case 7:
				numero +=" y siete";
				break;
			case 8:
				numero +=" y ocho";
				break;
			case 9:
				numero +=" y nueve";
				break;
				default:
					numero+="";
			}
		}
		// Mostramos mensaje con resultado.
		System.out.println(numero);
		// Cerramos escaner.
		sc.close();
	}

}