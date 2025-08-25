import java.util.Scanner;


public class EjercicioDiezTP0 {
	  public static int sumatoria(int n){
		int sumatoria=0;
		int i=0;
		while (i<=n){
			sumatoria = sumatoria+i;
			i++;
		}
		return sumatoria;
	 }
			
public static void main (String[] args) {
		  Scanner scanner = new Scanner(System.in);
          System.out.println("Ingrese un n:");
          
          int n = scanner.nextInt();

          int resultadoSumatoria = sumatoria(n);
		  System.out.println("La sumatoria es:" + resultadoSumatoria);
		  scanner.close();
       }
}
