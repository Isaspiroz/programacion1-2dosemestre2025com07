import java.util.Scanner;
	   public class EjercDoceTP0 {
		
			  public static double potencia(double x,int a){
				double potencia = 1;
				for (int i=1;i<=a;i++){
				     potencia = potencia * x;
				}
				return potencia;
			 }
					
		public static void main (String[] args) {
				  Scanner scanner = new Scanner(System.in);
		          System.out.println("Ingrese una base x:");
		          double x = scanner.nextDouble();
		          
		          System.out.println("Ingrese esponente a:");
		          int a = scanner.nextInt();

		          double resultadoPotencia = potencia(x,a);
				  System.out.println("El resultado de elevar: " + x + "  a la " + a + " es: " + resultadoPotencia);
				  scanner.close();
		       }
		}
	   