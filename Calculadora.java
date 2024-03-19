import java.util.Scanner;

public class Calculadora {
    public double sumar(double num1, double num2) {
        return num1 + num2;
    }

    public double restar(double num1, double num2) {
        return num1 - num2;
    }

    public double multiplicar(double num1, double num2) {
        return num1 * num2;
    }

    public double dividir(double num1, double num2) {
        if (num2 != 0) {
            return num1 / num2;
        } else {
            System.out.println("Error: División por cero.");
            return 0;
        }
    }

    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        Scanner scanner = new Scanner(System.in);
        int operacion = 0;

        while (operacion != 5) {
            System.out.println("Bienvenido a la calculadora");
            System.out.println("1: Sumar");
            System.out.println("2: Restar");
            System.out.println("3: Multiplicar");
            System.out.println("4: Dividir");
            System.out.println("5: Salir");

            System.out.println("Por favor, elige una operación:");
            operacion = scanner.nextInt();

            if (operacion == 5) {
                break;
            }

            System.out.println("Por favor, introduce el primer número:");
            double numero1 = scanner.nextDouble();

            System.out.println("Por favor, introduce el segundo número:");
            double numero2 = scanner.nextDouble();

            double resultado = 0;
            switch (operacion) {
                case 1:
                    resultado = calculadora.sumar(numero1, numero2);
                    break;
                case 2:
                    resultado = calculadora.restar(numero1, numero2);
                    break;
                case 3:
                    resultado = calculadora.multiplicar(numero1, numero2);
                    break;
                case 4:
                    resultado = calculadora.dividir(numero1, numero2);
                    break;
                default:
                    System.out.println("Operación no válida.");
            }

            System.out.println("El resultado es: " + resultado);
        }
    }
}
