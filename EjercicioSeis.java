package miNuevoPaquete;

import java.util.Scanner;

public class EjercicioSeis {
	
	public static void main(String[] args) {
		int a = 2;
		int b = 3;
		int suma = a + b;
		System.out.println("La suma de"+" "+ a +" , "+ b +" "+ "es" +" " + suma);
		
		double c = 16;
		double d = 4;
		double e = c/(2*d);
		System.out.println(e);
	}

}
/* Ejercicio 5 TP0 variables exprsiones y tipos:
 *  private static int pedirNumeros1(){
Scanner scan = new Scanner(System.in);
System.out.println("Escriba numero a: ");
int a = scan.nextInt();
return a; 
}
private static int pedirNumeros2(){
Scanner scan = new Scanner(System.in);
System.out.println("Escriba numero b: ");
int b = scan.nextInt();
return b; 
}

public static void main(String[] args) {
int a = pedirNumeros1();
int b = pedirNumeros2();
double promedio = (a + b)/2;
System.out.println("El promedio de"+" "+ a +" , "+ b +" "+ "es" +" " + promedio); */
