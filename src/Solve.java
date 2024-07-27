import java.util.Scanner;

public class Solve {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("=== Menú ===");
            System.out.println("1. 1 ¿Cuál será el resultado de la siguiente operación?");
            System.out.println("2. Opción 2");
            System.out.println("0. Salir");
            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {

                case 1:
                    System.out.println("¿Cuál será el resultado de la siguiente operación?");
                    int x = (int) 5.89 + (int) 3.45;
                    System.out.println(x); // 8
                    break;

                case 2:
                    System.out.println("Dado char c = 'A';, ¿cómo convertirías c a su valor ASCII como un int?");
                    char c = 'A';
                    int myA = c;
                    System.out.println("El valor ASCII de " + c + "es: " + myA);
                    break;
                case 0:
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no válida. Inténtalo de nuevo.");
            }
        } while (opcion != 0);


    }
}
