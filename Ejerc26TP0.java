package miNuevoPaquete;

public class Ejerc26TP0 {
	public static int maximo(int[] arreglo){
	    if (arreglo == null || arreglo.length == 0) {
	        return -1;
	    }
	    int max = arreglo[0];
	    int mayor = 0;
	    for(int i=0; i < arreglo.length; i++){
	        if(arreglo[i] > max){
	            max =arreglo[i];
	            mayor = i;
	        }
	    }
	    return mayor;
	}

	public static void main(String[] args) {
	    int[] numeros = {5, 2, 9, 1, 25, 6};
	    int mayorEs = maximo(numeros);
	    System.out.println("El indice donde esta el mayor es: " + mayorEs);
	}
}
