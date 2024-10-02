package relacion04;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numMaxTiradas = 3;
        int sumaResultado = 0;
        while (numMaxTiradas > 0) {

            System.out.println("Introduce OK para tirar el dado");
            String tirada = sc.nextLine().toUpperCase();
            if (tirada.equals("OK")) {
                int resultado = (int) (Math.random() * 6 + 1);
                System.out.println("Numero salido del dado " + resultado);
                sumaResultado += resultado;
                numMaxTiradas--;
            } else {
                System.out.println("No has escrito OK");
            }
        }
        if (numMaxTiradas == 0) {
            System.out.println("Se acabaron los intentos. Gracias por jugar" + "\n" +
                    "La suma de los 3 resultados fue de " + sumaResultado);
        }
    }
}
