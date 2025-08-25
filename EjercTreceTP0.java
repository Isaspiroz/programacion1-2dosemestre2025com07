import java.util.Scanner;
	   public class EjercTreceTP0 {
		
			  public static double factorial(int n){
				double factorial = 1;
				for (int i=1;i<=n;i++){
				     factorial = factorial * i;
				}
				return factorial;
			 }
					
		public static void main (String[] args) {
				  Scanner scanner = new Scanner(System.in);
		          System.out.println("Ingrese un n:");
		          int n = scanner.nextInt();

		          double resultadoFactorial = factorial(n);
				  System.out.println("El factorial de: " + n + " es: " + resultadoFactorial);
				  scanner.close();
		       }
		}
	   