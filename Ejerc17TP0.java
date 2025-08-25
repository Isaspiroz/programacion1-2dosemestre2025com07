import java.util.Scanner;


public class Ejerc17TP0 {

	public static int cantidadDeApariciones(String s,char c){
	int contador=0;
	for (int i=0; i< s.length();i++){
		if (s.charAt(i)==c){
			contador++;
		}
	}
	return contador;
	}
	public static void main(String[] args) {
		   Scanner scanner = new Scanner(System.in);
	       System.out.println("Ingrese texto:");
	       String s = scanner.nextLine();
	       System.out.println("Ingrese letra:");
	       char c = scanner.next().charAt(0);
	       
	       System.out.println("Hay " + cantidadDeApariciones(s,c) +"  "+ c +" en la cadena");

	        scanner.close();

	}

}
