import java.util.InputMismatchException;
import java.util.Scanner;

public class fibonacci {

    // Método iterativo para generar la serie
    public static void fibonacciIterativo(int n) {
        long a = 0, b = 1;
        System.out.print("Serie Fibonacci: ");
        for (int i = 0; i < n; i++) {
            System.out.print(a + (i < n - 1 ? ", " : "\n"));
            long siguiente = a + b;
            a = b;
            b = siguiente;
        }
    }

    // Método recursivo para obtener el n-ésimo número de Fibonacci
    public static long fibonacciRecursivo(int n) {
        if (n <= 1) return n;
        return fibonacciRecursivo(n - 1) + fibonacciRecursivo(n - 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cantidad = 0;

        try {
            System.out.print("Ingrese la cantidad de términos de la serie: ");
            cantidad = sc.nextInt();

            if (cantidad <= 0) {
                System.out.println("Por favor, ingrese un número entero positivo.");
                return;
            }

            // Mostrar serie usando método iterativo
            fibonacciIterativo(cantidad);

            // Ejemplo: mostrar el último número usando recursividad
            System.out.println("Último número (recursivo): " + fibonacciRecursivo(cantidad - 1));

        } catch (InputMismatchException e) {
            System.out.println("Entrada inválida. Debe ingresar un número entero.");
        } finally {
            sc.close();
        }
    }
}
