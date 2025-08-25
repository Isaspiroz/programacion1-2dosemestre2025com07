 package miNuevoPaquete;

import java.util.Scanner;

public class Ejerc20TP0 {
	    public static boolean esCapicua(String cadena) {
	        int izquierda = 0;
	        int derecha = cadena.length() - 1;

	        while (izquierda < derecha) {
	            if (cadena.charAt(izquierda) != cadena.charAt(derecha)) {
	                return false; // No son iguales, no es capicúa
	            }
	            izquierda++;
	            derecha--;
	        }

	        return true; // Todos los caracteres coinciden, es capicúa
	    }
	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	     System.out.println("Ingrese palabra:");
	     String palabra= scanner.nextLine();
	       
	     System.out.println(esCapicua(palabra));

	     scanner.close();

	}

}