import java.util.Scanner;

public class EjercQuinceTP0 {
	public static boolean esDivisible(int n, int m){
	  if (n%m==0){
	      return true;
	  }	else {
		  return false;
	  }
	}
	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	     System.out.print("Ingrese un n�mero entero n: ");
	     int n = scanner.nextInt();
	     System.out.print("Ingrese un n�mero entero m: ");
	     int m = scanner.nextInt();
	     boolean esDivisible = esDivisible(n,m);
	     
	     System.out.println("El n�mero " + n + " es divisible " +" por el numero " + m+ " es: "+ esDivisible);
	     scanner.close();
	}
}