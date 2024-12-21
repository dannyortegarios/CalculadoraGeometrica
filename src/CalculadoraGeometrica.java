import java.util.Scanner;

public class CalculadoraGeometrica {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            System.out.println("=== Calculadora Geométrica ===");
            System.out.println("1. Círculo");
            System.out.println("2. Cuadrado");
            System.out.println("3. Triángulo");
            System.out.println("4. Rectángulo");
            System.out.println("5. Pentágono");
            System.out.println("6. Salir");
            System.out.print("Elija una figura (1-6): ");
            int opcionFigura = scanner.nextInt();

            if (opcionFigura == 6) {
                continuar = false;
                System.out.println("Gracias por usar la calculadora.");
                break;
            }

            System.out.println("1. Calcular Área");
            System.out.println("2. Calcular Perímetro");
            System.out.print("Elija una operación (1-2): ");
            int opcionOperacion = scanner.nextInt();

            switch (opcionFigura) {
                case 1: // Círculo
                    System.out.print("Ingrese el radio del círculo: ");
                    double radio = scanner.nextDouble();
                    if (opcionOperacion == 1) {
                        double area = Math.PI * Math.pow(radio, 2);
                        System.out.println("El área del círculo es: " + area);
                    } else {
                        double perimetro = 2 * Math.PI * radio;
                        System.out.println("El perímetro del círculo es: " + perimetro);
                    }
                    break;

                case 2: // Cuadrado
                    System.out.print("Ingrese el lado del cuadrado: ");
                    double lado = scanner.nextDouble();
                    if (opcionOperacion == 1) {
                        double area = Math.pow(lado, 2);
                        System.out.println("El área del cuadrado es: " + area);
                    } else {
                        double perimetro = 4 * lado;
                        System.out.println("El perímetro del cuadrado es: " + perimetro);
                    }
                    break;

                case 3: // Triángulo
                    System.out.print("Ingrese la base del triángulo: ");
                    double base = scanner.nextDouble();
                    System.out.print("Ingrese la altura del triángulo: ");
                    double altura = scanner.nextDouble();
                    if (opcionOperacion == 1) {
                        double area = (base * altura) / 2;
                        System.out.println("El área del triángulo es: " + area);
                    } else {
                        System.out.print("Ingrese los otros dos lados del triángulo (separados por un espacio): ");
                        double lado1 = scanner.nextDouble();
                        double lado2 = scanner.nextDouble();
                        double perimetro = base + lado1 + lado2;
                        System.out.println("El perímetro del triángulo es: " + perimetro);
                    }
                    break;

                case 4: // Rectángulo
                    System.out.print("Ingrese el largo del rectángulo: ");
                    double largo = scanner.nextDouble();
                    System.out.print("Ingrese el ancho del rectángulo: ");
                    double ancho = scanner.nextDouble();
                    if (opcionOperacion == 1) {
                        double area = largo * ancho;
                        System.out.println("El área del rectángulo es: " + area);
                    } else {
                        double perimetro = 2 * (largo + ancho);
                        System.out.println("El perímetro del rectángulo es: " + perimetro);
                    }
                    break;

                case 5: // Pentágono
                    System.out.print("Ingrese el lado del pentágono: ");
                    double ladoPentagono = scanner.nextDouble();
                    System.out.print("Ingrese el apotema del pentágono: ");
                    double apotema = scanner.nextDouble();
                    if (opcionOperacion == 1) {
                        double area = (5 * ladoPentagono * apotema) / 2;
                        System.out.println("El área del pentágono es: " + area);
                    } else {
                        double perimetro = 5 * ladoPentagono;
                        System.out.println("El perímetro del pentágono es: " + perimetro);
                    }
                    break;

                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
            }

            System.out.println("\n¿Desea realizar otra operación? (s/n): ");
            char respuesta = scanner.next().charAt(0);
            if (respuesta != 's' && respuesta != 'S') {
                continuar = false;
                System.out.println("Gracias por usar la calculadora.");
            }
        }

        scanner.close();
    }
}
