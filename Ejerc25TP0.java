package miNuevoPaquete;

public class Ejerc25TP0 {
	
	public static int maximo(int[] arreglo){
	    if (arreglo == null || arreglo.length == 0) {
	        return -1;
	    }
	    int max = arreglo[0]; // Inicializar max con el primer elemento
	    for(int i=0; i < arreglo.length; i++){
	        if(arreglo[i] > max){
	            max = arreglo[i];
	        }
	    }
	    return max;
	}

	public static void main(String[] args) {
	    int[] numeros = {5, 2, 9, 1, 5, 6};
	    int mayor = maximo(numeros);
	    System.out.println("El mayor es: " + mayor);
	}
}
