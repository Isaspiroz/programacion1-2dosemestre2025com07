
import java.util.Scanner;
   public class EjercicioOnceTP0 {
	
		  public static int sumatoriaPares(int n){
			int sumatoriaPares=0;
			int i=2;
			while (i<=n){
				if (i%2==0)
				sumatoriaPares = sumatoriaPares+i;
				i++;
			}
			return sumatoriaPares;
		 }
				
	public static void main (String[] args) {
			  Scanner scanner = new Scanner(System.in);
	          System.out.println("Ingrese un n:");
	          
	          int n = scanner.nextInt();

	          int resultadoSumatoriaPares = sumatoriaPares(n);
			  System.out.println("La sumatoria de los Pares es:" + resultadoSumatoriaPares);
			  scanner.close();
	       }
	}
