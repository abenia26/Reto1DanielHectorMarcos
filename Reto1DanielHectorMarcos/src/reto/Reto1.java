package reto;

import java.util.Locale;
import java.util.Scanner;
import reto.Funciones1;
import reto.Funciones2;
import reto.Funciones3;

public class Reto1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in).useLocale(Locale.US);
		int n=0;
		do {
			System.out.println("Elige la operacion");
			System.out.println("1.Sumar");
			System.out.println("2.Restar");
			System.out.println("3.Multiplicar");
			System.out.println("4.Dividir");
			System.out.println("5.Par");
			System.out.println("6.Impar");
			System.out.println("7.Positivo");
			System.out.println("8.Negativo");
			System.out.println("0.Salir");
			System.out.println();
			System.out.println("Introduce la operacion a realizar");
			String entrada=sc.nextLine();
			n=Integer.parseInt(entrada);
			//inicio del menu
			switch (n) {
			//suma
			case 1: System.out.println("Introduce un numero");
			String e2=sc.nextLine();
			int n1=Integer.parseInt(e2);
			System.out.println("Introduce otro");
			String e3=sc.nextLine();
			int n2=Integer.parseInt(e3);
			if(n2==0) {
				System.out.println("Dime otro numero");
				e3=sc.nextLine();
			    n2=Integer.parseInt(e3);
			}
			System.out.println(Funciones3.suma(n1, n2));
				break;
			//resta
			case 2:
				System.out.println("Introduce un numero");
				e2=sc.nextLine();
				n1=Integer.parseInt(e2);
				System.out.println("Introduce otro");
				e3=sc.nextLine();
				n2=Integer.parseInt(e3);
				if(n2==0) {
					System.out.println("Dime otro numero");
					e3=sc.nextLine();
				    n2=Integer.parseInt(e3);
				}
			System.out.println(Funciones3.resta(n1, n2));
			break;
			//multiplicacion
			case 3:
				System.out.println("Introduce un numero");
				e2=sc.nextLine();
				n1=Integer.parseInt(e2);
				System.out.println("Introduce otro");
				e3=sc.nextLine();
				n2=Integer.parseInt(e3);
				if(n2==0) {
					System.out.println("Dime otro numero");
					e3=sc.nextLine();
				    n2=Integer.parseInt(e3);
				}
			System.out.println(Funciones1.multiplicacion(n1, n2));
			break;
			//division
			case 4:System.out.println("Introduce un numero");
			e2=sc.nextLine();
			n1=Integer.parseInt(e2);
			System.out.println("Introduce otro");
			e3=sc.nextLine();
			n2=Integer.parseInt(e3);
			if(n2==0) {
				System.out.println("Dime otro numero");
				e3=sc.nextLine();
			    n2=Integer.parseInt(e3);
			}
			System.out.println(Funciones1.division(n1, n2));
			break;
			//par
			case 5:
			System.out.println("Introduce un numero");
			e2=sc.nextLine();
		    n1=Integer.parseInt(e2);
			if(n1==0) {
				System.out.println("Dime otro numero");
				e3=sc.nextLine();
			    n2=Integer.parseInt(e3);
			}
			System.out.println(Funciones2.esPar(n1));
			break;
			//impar
			case 6:
			System.out.println("Introduce un numero");
			e2=sc.nextLine();
			n1=Integer.parseInt(e2);
			System.out.println(Funciones2.esImpar(n1));
			if(n1==0) {
				System.out.println("Dime otro numero");
				e3=sc.nextLine();
			    n2=Integer.parseInt(e3);
			}
			break;
			//positivo
			case 7:
			System.out.println("Introduce un numero");
			e2=sc.nextLine();
			 n1=Integer.parseInt(e2);
			System.out.println(Funciones1.esPositivo(n1));
			if(n1==0) {
				System.out.println("Dime otro numero");
				e3=sc.nextLine();
			    n2=Integer.parseInt(e3);
			}
			break;
			//negativo
			case 8:
			System.out.println("Introduce un numero");
			e2=sc.nextLine();
		     n1=Integer.parseInt(e2);
			System.out.println(Funciones1.esNegativo(n1));
			if(n1==0) {
				System.out.println("Dime otro numero");
				e3=sc.nextLine();
			    n2=Integer.parseInt(e3);
			}
			break;
			//salir
			case 0:
			break;

			default:System.out.println("Número no válido");
				break;
			}
		} while (n!=0 );

	}

}
