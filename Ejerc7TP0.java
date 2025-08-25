package miNuevoPaquete;

import java.util.Scanner;

public class Ejerc7TP0 {

	   private static int pedirNumero(Scanner scan,String mensaje){
	        System.out.println(mensaje);
	        return scan.nextInt();
	    }

	    public static void main(String[] args) {
	        Scanner scan = new Scanner(System.in); // Crea el Scanner una sola vez

	        int a= pedirNumero(scan, "Escriba numero a: ");
	        int b= pedirNumero(scan, "Escriba numero b: ");

	        float resultado = (a+b)/2.0f;
	        System.out.println("El promedio es: " + resultado);

	        scan.close(); // Cierra el Scanner al final del programa
	    }
	}