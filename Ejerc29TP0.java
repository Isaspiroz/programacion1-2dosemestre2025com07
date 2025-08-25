package miNuevoPaquete;

public class Ejerc29TP0 {
  public static double promedio(double[] a){
	  double suma = 0;
	  double promedio = 0;
	  for (int i =0; i< a.length ; i++){
		  suma = suma + a[i];
		  promedio=suma/(a.length);
	  }
	  return promedio;
  }
	public static void main(String[] args) {
	  double[] notas={7.0, 6.0, 9.0, 5.0};
	  System.out.println("El promedio de notas es: "+promedio(notas));

	}

}

