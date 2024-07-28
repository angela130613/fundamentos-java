import java.util.Scanner;

public class Solve {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("=== Menú ===");
            System.out.println("1. 1 ¿Cuál será el resultado de la siguiente operación?");
            System.out.println("2. 2 Dado char c = 'A';, ¿cómo convertirías c a su valor ASCII como un int?");
            System.out.println("3. 3 ¿Qué valor se imprimirá?");
            System.out.println("4. 4 Escribe código para convertir un String que contiene un número a un int.");
            System.out.println("5. 5 ¿Cuál es el resultado de (int) (char) (byte) -1?");
            System.out.println("6. 6 Convierte el número 65 a un char. ¿Qué carácter obtienes?");
            System.out.println("7. 7 ¿Qué sucede si intentas asignar un long a un int sin casteo explícito?");
            System.out.println("8. 8 Escribe código para convertir un float a un String.");
            System.out.println("9. 9 ¿Cuál es el resultado de (int) Math.round(3.7)?");
            System.out.println("10. 10 Dado byte b = 50;, ¿cómo lo convertirías a short?");
            System.out.println("Operadores de Asignación ");
            System.out.println("11. 1 ¿Cuál es el valor de x después de la siguiente operación?\n" +
                    "int x = 10; x += 5;");
            System.out.println("12. 2 Simplifica la siguiente expresión usando un operador de asignación compuesta:\n" +
                    "y = y * (x + 5);");
            System.out.println("13. 3 ¿Cuál es el valor de a después de estas operaciones?\n" +
                    "int a = 15; a %= 4;");
            System.out.println("14. 4 Escribe una expresión equivalente a x = x + y usando un operador de asignación compuesta.");
            System.out.println("15. 5 ¿Qué hace la siguiente operación? x ^= 2;");
            System.out.println("Operadores de Incremento y Decremento");
            System.out.println("16. 1 ¿Cuál es el valor de x e y después de estas operaciones?\n" +
                    "int x = 5; int y = ++x;");
            System.out.println("17. 2 ¿Qué se imprimirá en la consola?\n" +
                    "int a = 5; System.out.println(a++); System.out.println(a);");
            System.out.println("18. 3 Escribe código que use el operador de decremento para disminuir una variable count en 1.");
            System.out.println("19. 4 ¿Cuál es la diferencia entre ++i y i++?");
            System.out.println("20. 5 ¿Qué valor tendrá x después de esta operación?\n" +
                    "int x = 3; x = x++;");
            System.out.println("Ejercicios Combinados");
            System.out.println("""
                    21. 1 ¿Cuál es el resultado de la siguiente expresión?
                    int i = 5;
                    i += ++i + i++ + ++i;""");
            System.out.println("22. 2 Escribe código para convertir un double a un int, y luego incrementa el resultado en 1 usando el operador de postincremento.");
            System.out.println("""
                    23. 3 ¿Qué se imprimirá en la consola?
                    double d = 5.7;\s
                    int i = (int)d;\s
                    i *= 2;\s
                    System.out.println(i--);""");
            System.out.println("24. 4 Crea una expresión que use casteo y un operador de asignación compuesta para dividir un int por 2.0 y asignar el resultado a una variable double.");
            System.out.println("""
                    25. 5 ¿Cuál es el resultado de la siguiente operación?
                    char c = 'X';\s
                    c += 32;\s
                    System.out.println(c);""");
            System.out.println("26. 6 Escribe código para convertir un long a un short, y luego usa un operador de asignación compuesta para multiplicarlo por 3.");
            System.out.println("""
                    27. 7 ¿Qué valor tendrá x después de estas operaciones?
                    int x = 10;\s
                    x += (x++) + (++x);""");
            System.out.println("28. 8 Crea una expresión que use casteo para convertir un float a un byte, y luego usa el operador de predecremento.");
            System.out.println("""
                    29. 9 ¿Cuál es el resultado de la siguiente operación?
                    int i = 257;\s
                    byte b = (byte)i;\s
                    System.out.println(b);""");
            System.out.println("30. 10 scribe una expresión que combine casteo, un operador de asignación compuesta y un operador de incremento para convertir un double a un int, sumarle 5 y luego incrementarlo en 1.");
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
                    float myA = (int) c;
                    System.out.println("El valor ASCII de " + c + "es: " + myA);
                    break;

                case 3:
                    System.out.println("¿Qué valor se imprimirá?");
                    double d = 100.04;
                    long l = (long)d;
                    int i = (int)l;
                    System.out.println(i);
                    break;

                case 4:
                    System.out.println("Escribe código para convertir un String que contiene un número a un int.?");
                    String numCadena = "1234";
                    int numEntero = Integer.parseInt(numCadena);
                    System.out.println("El número entero es: " + numEntero);
                    break;

                case 5:
                    System.out.println("¿Cuál es el resultado de (int) (char) (byte) -1?");
                    float resultado = (int) (char) (byte) -1;
                    System.out.println("El resultado es: " + resultado);
                    break;

                case 6:
                    System.out.println("Convierte el número 65 a un char. ¿Qué carácter obtienes?");
                    int numero = 65;
                    char caracter = (char) numero;
                    System.out.println("El carácter es: " + caracter);
                    break;

                case 7:
                    System.out.println("¿Qué sucede si intentas asignar un long a un int sin casteo explícito?");
                    long valorLong = 123456789L;
                    try {
                        int valorInt = Math.toIntExact(valorLong);
                        System.out.println("El valor int es: " + valorInt);
                    } catch (ArithmeticException e) {
                        System.out.println("El valor long no puede convertirse a int sin desbordamiento.");
                    }
                    break;

                case 8:
                    System.out.println("Escribe código para convertir un float a un String.");
                    float num = 1.2345678f;
                    String resultadoNum = Float.toString(num);
                    System.out.println(resultadoNum);// El resultado es: "1.2345678"
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
