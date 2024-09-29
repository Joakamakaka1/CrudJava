package relacion02;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce una hora (0-24): ");
        int hora = sc.nextInt();

        if (hora >= 5 && hora <= 12) {
            System.out.println("Buenos dias");
        } else if (hora >= 13 && hora <= 20) {
            System.out.println("Buenas tardes");
        } else if(hora >= 21 && hora <= 24 || hora >= 0 && hora <= 5) {
            System.out.println("Buenas noches");
        }
    }
}
