package recursividad;

public class Ejerc31TP0 {

	public static void main(String[] args) {
		int n=10;
		int resultado=fibRec(n);
		System.out.println("La serie de Fibonacci da: "+ resultado);
}
public static int fibRec(int n){
	  if (n==0){
		  return 0;
	  }else{
	     if (n==1){
		   return 1;
	     }else{
		   return fibRec(n-1)+fibRec(n-2);
	  }
}
}
}