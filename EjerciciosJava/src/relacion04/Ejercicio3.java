package relacion04;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String [] cartasEsp = {"bastos", "espadas", "oros", "copas"};
        String [] numeros = {"as", "2", "3", "4", "5", "6", "7", "8", "9", "10", "sota", "caballo", "rey"};

        System.out.println("Introduce OK para comenzar el juego");
        String respuesta = sc.nextLine().toUpperCase();

        if (respuesta.equals("OK")) {
            System.out.println("Tu carta seleccionada fue " + numeros[(int) (Math.random() * 13)] + " de " + cartasEsp[(int) (Math.random() * 4)]);
        }else {
            System.out.println("No has escrito OK");
        }
    }
}
