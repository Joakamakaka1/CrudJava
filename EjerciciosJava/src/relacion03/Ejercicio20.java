package relacion03;

import java.util.Scanner;

public class Ejercicio20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce la altura de la pirámide: ");
        int altura = scanner.nextInt();
        System.out.print("Introduce el carácter para pintar la pirámide: ");
        char caracter = scanner.next().charAt(0);

        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < altura - i - 1; j++) {
                System.out.print(" ");
            }
            if (i == 0) {
                System.out.print(caracter);
            } else {
                System.out.print(caracter);
                for (int j = 0; j < (2 * i - 1); j++) {
                    System.out.print(" ");
                }
                System.out.print(caracter);
            }
            System.out.println();
        }
    }
}

