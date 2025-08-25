package miNuevoPaquete;

public class Ejerc28TP0 {
  public static boolean estaOrdenado(int[] a){
	for (int i = 0; i< a.length-1; i++){
		if (a[i]>a[i+1]){
			return false;
		}
    }
	return true;
  }  
  public static void main(String [] args){
	  int[] a = {1, 2, 7, 4, 5, 6};
	  System.out.println("El arreglo esta ordenado es: " + estaOrdenado(a));
      }
  }