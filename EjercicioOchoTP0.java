package miNuevoPaquete;

import java.util.Scanner;

public class EjercicioOchoTP0 {
	  private static double pedirNota(Scanner scan,String mensaje){
		    System.out.println(mensaje);
		    
		    return scan.nextDouble(); 
     }
public static void main(String[] args) {
	        Scanner scan = new Scanner(System.in);
			double nota1 = pedirNota(scan,"Ingrese nota 1: ");
			double nota2 = pedirNota(scan,"Ingrese nota 2 :");
			double promedio = (nota1 + nota2)/2.0;
			System.out.println("El promedio de"+" "+ nota1 +" y "+ nota2 +" "+ "es" +" " + promedio);
			if (promedio>=7){
			System.out.println("Promociono");
			}else if (promedio>=4 && promedio<7){
			System.out.println("Regularizo");
			}else
				System.out.println("Recursa");
            scan.close();
  }
}