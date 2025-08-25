package recursividad;

public class Ejerc30BTP0 {
    public static double potenciaRecursiva(double x, int n) {
        // Caso base: x^0 es 1
        if (n == 0) {
            return 1;
        }
        // Manejo de exponentes negativos: x^-n = 1 / x^n
        if (n < 0) {
            return 1.0 / potenciaRecursiva(x, -n);
        }
        // Si el exponente es par, optimiza la recursión: x^n = (x^(n/2))^2
        if (n % 2 == 0) {
            double temp = potenciaRecursiva(x, n / 2);
            return temp * temp;
        }
        // Caso recursivo: si n es impar, x^n = x * x^(n-1)
        else {
            return x * potenciaRecursiva(x, n - 1);
        }
    }

    public static void main(String[] args) {
        double base = 2;
        int exponente = 5;
        double resultado = potenciaRecursiva(base, exponente);
        System.out.println(base + " elevado a la potencia de " + exponente + " es: " + resultado); // Salida: 32.0

        base = 3;
        exponente = 0;
        resultado = potenciaRecursiva(base, exponente);
        System.out.println(base + " elevado a la potencia de " + exponente + " es: " + resultado); // Salida: 1.0

        base = 5;
        exponente = -2;
        resultado = potenciaRecursiva(base, exponente);
        System.out.println(base + " elevado a la potencia de " + exponente + " es: " + resultado); // Salida: 0.04
    }
}
