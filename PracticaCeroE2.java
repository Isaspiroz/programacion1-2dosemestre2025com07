package miNuevoPaquete;

import java.util.Scanner;
// Ejercicio 2 TP0 Variables expresiones y tipos

public class PracticaCeroE2 {
	private static String pedirNombre(){
		Scanner scan = new Scanner(System.in);
		System.out.println("Escriba su nombre:");
		String nombre=scan.nextLine();
		scan.close();
		return nombre;
	}	
	public static void main(String[] args){
		String saludo ="!!!Hola"+" ";
		saludo = saludo + pedirNombre();
		System.out.println(saludo+"  !!!");
		
	}
}
