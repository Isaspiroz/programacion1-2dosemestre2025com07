package miNuevoPaquete;

import java.util.Scanner;

public class EjercicioTresAlCinco {  // ejercicio de practica cero del 3 al 5
  private static int pedirNumeros(Scanner scan,String mensaje){
		    System.out.println(mensaje);
		    return scan.nextInt();
  }
 
public static void main(String[] args) {
	        Scanner scan = new Scanner(System.in);
			int a = pedirNumeros(scan,"Escriba un numero a: ");
			int b = pedirNumeros(scan,"Escriba un numero b: ");
			double promedio = (a + b)/2;
			int suma = a+b;
			System.out.println("La suma de "+a+ " y "+b+" es: "+suma);
			System.out.println("El promedio de"+" "+ a +" , "+ b +" "+ "es" +" " + promedio);
    }       
}