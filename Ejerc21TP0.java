package miNuevoPaquete;
import java.util.Scanner;

public class Ejerc21TP0 {
	public static boolean sinRepetidas(String s){
	
    for (int i = 0; i < s.length(); i++) {
        for (int j = 0; j < s.length(); j++) {
            if (i != j && s.charAt(i) == s.charAt(j) && Math.abs(i - j) > 1) {
                return false;
            }
        }
    }
    return true;
}
	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	     System.out.println("Ingrese texto:");
	     String s = scanner.nextLine();
	       
	     System.out.println("El texto no tiene repetidas es:" + sinRepetidas(s));

	     scanner.close();
	}
}

	
	
	
	
	
	
	
	
	/*public static char set(){
    public static boolean sinRepetidos(String s){
    	char caracteresVistos = set();
    	for (char in s){
    		if (char in caracteresVistos){
    			return false;
    			caracteresVistos.add(char)
    		}
    	}
    	return true;
    }
	}
	    public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	     System.out.println("Ingrese palabra:");
	     String s = scanner.nextLine();
	       
	     System.out.println(sinRepetidos(s));

	     scanner.close();

	}

}*/

