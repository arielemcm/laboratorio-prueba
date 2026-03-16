public class FibonacciIterativo {
    public static void main(String[] args) {
        int n = 10; // Número de elementos a mostrar
        int a = 0, b = 1;

        System.out.print("Serie Fibonacci (" + n + " términos): ");

        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            int suma = a + b;
            a = b;
            b = suma;
        }
    }
}
