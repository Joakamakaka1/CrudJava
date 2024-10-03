package relacion03;

import java.util.Scanner;

public class Ejercicio21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int contador = 0;
        int sumaImpares = 0;
        int contadorImpares = 0;
        int mayorPares = -1;
        boolean hayPares = false;

        while (true) {
            System.out.print("Introduce un número (Si introduces un numero negativo termina el programa): ");
            int numero = scanner.nextInt();

            if (numero < 0) {
                break;
            }

            contador++;

            if (numero % 2 == 0) {
                if (numero > mayorPares) {
                    mayorPares = numero;
                }
                hayPares = true;
            } else {
                sumaImpares += numero;
                contadorImpares++;
            }
        }

        System.out.println("Total de números introducidos: " + contador);

        if (contadorImpares > 0) {
            double mediaImpares = (double) sumaImpares / contadorImpares;
            System.out.println("Media de los números impares: " + mediaImpares);
        } else {
            System.out.println("No se han introducido números impares.");
        }

        if (hayPares) {
            System.out.println("Mayor de los números pares: " + mayorPares);
        } else {
            System.out.println("No se han introducido números pares.");
        }
    }
}

