import java.util.Scanner;

public class programa_par {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//Otro comentario
        try {
            System.out.print("Ingrese un # entero: ");
        
            if (!scanner.hasNextInt()) {
                System.out.println("Ingrese un # valido.");
                return;
            }

            int numero = scanner.nextInt();

            // Verificar si es par o impar usando el operador módulo
            if (numero % 2 == 0) {
                System.out.println(numero + " es un número PAR.");
            } else {
                System.out.println(numero + " es un número IMPAR.");
            }

        } catch (Exception e) {
            System.out.println("Ocurrió un error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
