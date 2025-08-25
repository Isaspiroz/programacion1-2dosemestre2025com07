package miNuevoPaquete;

import java.util.Scanner;

public class Ejerc22TP0 {
	public static String sinRepetidasPalabra(String s){
		String nueva="";
		int i=0;
		int j=0;
	    while (i < s.length()){
	    	while (j< nueva.length()){
	    		  if (i != j && s.charAt(i) == nueva.charAt(j) && Math.abs(i - j) > 1) {
	    		  char noRepetida = s.charAt(i);
	    		  nueva= nueva + noRepetida;
	    		  i++;
	    		  j++;
	    	   }
	       }
	}
 return nueva;
}
		public static void main(String[] args) {
			 Scanner scanner = new Scanner(System.in);
		     System.out.println("Ingrese texto:");
		     String s = scanner.nextLine();
		       
		     System.out.println("El texto sin repetidas es:" + sinRepetidasPalabra(s));

		     scanner.close();
		}
	}
