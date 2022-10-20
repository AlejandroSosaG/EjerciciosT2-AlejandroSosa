package ejercicios;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num, cifra1, cifra2;
		String numero;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca un número entero entre 1 y 99");
		num = sc.nextInt();
		numero=switch(num) {
		case 10 ->{
			yield "diez";
		}
		case 11 ->{
			yield "once";
		}
		case 12->{
			yield "doce";
		}
		case 13 ->{
			yield "trece";
		}
		case 14 ->{
			yield "catorce";
		}
		case 15 ->{
			yield "quince";
		}
		case 20 ->{
			yield "viente";
		}
		default ->{
			if(num>9) {
				cifra1=(int) num/10;
				cifra2 = num%10;
				numero = switch(cifra1) {
				case 1 ->{
					yield "dieci";
				}
				case 2 ->{
					yield "veinti";
				}
				case 3 ->{
					yield "treinta";
				}
				case 4 ->{
					yield "cuarenta";
				}
				case 5 ->{
					yield "cincuenta";
				}
				case 6 ->{
					yield "sesenta";
				}
				case 7 ->{
					yield "setenta";
				}
				case 8 ->{
					yield "ochenta";
				}
				case 9 ->{
					yield "noventa";
				}
				default -> {
					yield "Error: valor invalido";
				}
				};
				numero+= switch(cifra2) {
				case 1 ->{
					yield " y uno";
				}
				case 2 ->{
					yield " y dos";
				}
				case 3 ->{
					yield " y tres";
				}
				case 4 ->{
					yield " y cuatro";
				}
				case 5 ->{
					yield " y cinco";
				}
				case 6 ->{
					yield " y seis";
				}
				case 7 ->{
					yield " y siete";
				}
				case 8 ->{
					yield " y ocho";
				}
				case 9 ->{
					yield " y nueve";
				}
				default -> {
					yield "";
				}
				};
		}
		
	}
		};
		System.out.println(numero);
		sc.close();
	}
}