import java.util.Scanner;


public class Ejerc18TP0 {

	public static int cantidadVocales(String s){
	int contador=0;
	for (int i=0; i< s.length();i++){
		if (s.charAt(i)=='a'){
			contador++;
		}
			if (s.charAt(i)=='e'){
				contador++;
			}
			   if (s.charAt(i)=='i'){
				   contador++;
			   }
					if (s.charAt(i)=='o'){
						contador++;
					}
						if (s.charAt(i)=='u'){
							contador++;
					}
	}
	return contador;
	}
	public static void main(String[] args) {
		   Scanner scanner = new Scanner(System.in);
	       System.out.println("Ingrese texto:");
	       String s = scanner.nextLine();
	       
	       System.out.println("Hay " + cantidadVocales(s) +"  "+" en la cadena");

	        scanner.close();

	}

}