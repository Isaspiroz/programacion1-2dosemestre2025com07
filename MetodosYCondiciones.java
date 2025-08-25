package miNuevoPaquete;

public class MetodosYCondiciones {

	public static int imprimirSuma(int a,int b){
		int suma = a + b;
		return suma;
	}
	public static void main(String[] args) {
		    int a = 2;
		    int b = 3;
		    int resultado = imprimirSuma(a,b);
			System.out.println("La suma de"+" "+ a +" , "+ b +" "+ "es" +" " + resultado);
	}

}
/* Ejercicio 7 TP0
public class Promedio {

public static void imprimirPromedio(int a, int b) {
    double promedio = (double) (a + b) / 2;
    System.out.println("El promedio es: " + promedio);
}

public static void main(String[] args) {
    imprimirPromedio(5, 10);
}
}
*/
