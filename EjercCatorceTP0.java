import java.util.Scanner;
public class EjercCatorceTP0 {

    public static int cantCifras(int n){
    	if (n==0){
    		return 1;
    	}
    	int contador=0;
    	while (n>0){
    		n = n/10;
    		contador++;
    	}
    		return contador;
    	}
	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	        System.out.print("Ingrese un número entero: ");
	        int n = scanner.nextInt();
	        int cifras = cantCifras(n);
	        System.out.println("El número " + n + " tiene " + cifras + " cifras.");
	        scanner.close();
	}
}