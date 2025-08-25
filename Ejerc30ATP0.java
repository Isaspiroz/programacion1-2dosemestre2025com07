package recursividad;

public class Ejerc30ATP0 {
		  public static void main(String[] args) {
				int resultadoSumatoria=sumatoriaRec(10);
				System.out.println("La sumatoria de n es: " +resultadoSumatoria);
				
			}	

		  public static int sumatoriaRec(int n){
			  if (n == 0){
				  return 0;
			  }else{
		          return n + sumatoriaRec(n - 1);
		      }
		  }
		}
