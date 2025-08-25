package recursividad;

public class Ejerc30DTP0 {

	public static void main(String[] args){
		 int n=5;
	     int resultado=factorialRec(n);
	     System.out.println("El factorial de "+n+ " es:  "+resultado);
	}
 public static int factorialRec(int n){
	  if (n==0){
		  return 1;
	  }else{
		  return n*factorialRec(n-1);
	  }
 }
}
