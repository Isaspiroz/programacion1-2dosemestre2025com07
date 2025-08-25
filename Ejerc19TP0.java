package miNuevoPaquete;

import java.util.Scanner;

public class Ejerc19TP0 {

    public static boolean esAbecedaria(String s){
    	for(int i=0; i< s.length()-1;i++){
    		if(s.charAt(i) > s.charAt(i+1)){
    		return false;
    		}
    	}
    	return true;
    }
	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	     System.out.println("Ingrese texto:");
	     String s = scanner.nextLine();
	     String s1 = s.toLowerCase(); //convierte a minuscula cualquier entrada
	       
	     System.out.println(esAbecedaria(s1));

	     scanner.close();
	}
}
