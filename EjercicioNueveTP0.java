package miNuevoPaquete;

import java.util.Scanner;

public class EjercicioNueveTP0 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Ingrese el día:");
    int dia = scanner.nextInt();

    System.out.println("Ingrese el mes (1-12):");
    int mes = scanner.nextInt();

    System.out.println("Ingrese el año:");
    int anio = scanner.nextInt();
    System.out.print(dia+" "+ "de"+" ");
    
    switch (mes) {
    case 1: System.out.print("Enero"+" "); break;
    case 2: System.out.print("Febrero"+" "); break;
    case 3: System.out.print("Marzo"+" "); break;
    case 4: System.out.print("Abril"+" "); break;
    case 5: System.out.print("Mayo"+" "); break;
    case 6: System.out.print("Junio"+" "); break;
    case 7: System.out.print("Julio"+ " "); break;
    case 8: System.out.print("Agosto"+" "); break;
    case 9: System.out.print("Septiembre"+" "); break;
    case 10: System.out.print("Octubre"+" "); break;
    case 11: System.out.print("Noviembre"+" "); break;
    case 12: System.out.print("Diciembre"+" "); break;
    default: System.out.print("Mes no válido.");break;
    }
    System.out.print("del"+" "+ anio);

    scanner.close();
}
}