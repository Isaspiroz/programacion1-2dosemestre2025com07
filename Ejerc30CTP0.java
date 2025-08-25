package recursividad;

public class Ejerc30CTP0 {

	  public static void main(String[] args) {
			int resultadoSumatoriaPares=sumatoriaParesRec(10);
			System.out.println("La sumatoria de n pares es: " +resultadoSumatoriaPares);
			
		}	

	  public static int sumatoriaParesRec(int n){
		  if (n == 0){
			  return 0;
		  }
		  if (n%2==0){
				  return n + sumatoriaParesRec(n - 2);
		  }else{
			  if (n % 2 != 0);{
			        return sumatoriaParesRec(n - 1);
	      }
	  }
}
}