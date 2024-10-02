package relacion04;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe OK para tirar el dado");
        String tirada = sc.nextLine().toLowerCase();

        if(tirada.equals("ok")){
            System.out.println();
            System.out.println("Tirada: " + (int)(Math.random() * 6 + 1));
            System.out.println();
        }
    }
}
