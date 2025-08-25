package miNuevoPaquete;

public class Ejerc27TP0 {

	public static int suma(int[] arreglo){
	    if (arreglo == null || arreglo.length == 0) {
	        return -1;
	    }
	    int suma=0;
	    for(int i=0; i < arreglo.length; i++){
	        suma = suma + arreglo[i];
	    }
	    return suma;
	}

	public static void main(String[] args) {
	    int[] numeros = {5, 2, 9, 1, 7, 6};
	    int laSumaEs = suma(numeros);
	    System.out.println("El valor de la suma es: " + laSumaEs);
	}
}
