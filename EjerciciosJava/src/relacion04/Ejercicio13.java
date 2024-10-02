package relacion04;

import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean bandera = true;

        while (bandera) {
            System.out.println("Introduce OK para tirar el dado");
            String tirada = sc.nextLine().toUpperCase();
            if (tirada.equals("OK")) {
                int resultado1 = (int) (Math.random() * 6 + 1);
                int resultado2 = (int) (Math.random() * 6 + 1);
                System.out.println("Numero salido del primer dado fue " + resultado1 + "\n" + "Numero salido del segundo dado " + resultado2);
                if (resultado1 == resultado2) {
                    System.out.println("Los dos dados coinciden");
                    bandera = false;
                } else {
                    System.out.println("Los dos dados no coinciden");
                }
            } else {
                System.out.println("No has escrito OK");
            }
        }
    }
}
