
	import java.util.Scanner;

    public class Ejerc16TP0 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese texto:");
        String cadena = scanner.nextLine();

        recorrerCadenaInversa(cadena);

        scanner.close();
    }

    public static void recorrerCadenaInversa(String cadena) {
        for (int i = cadena.length() - 1; i >= 0; i--) {
            char caracter = cadena.charAt(i);
            System.out.print(caracter);
        }
        System.out.println();
    }
}