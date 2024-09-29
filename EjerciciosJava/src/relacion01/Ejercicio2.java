package relacion01;

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Pon una cantidad de dinero en euros y te hago la conversión a pesetas");
        double resultado = sc.nextDouble() * 636.63;

        System.out.println("La conversion de euros a pesetas es de " + resultado + " pesetas");
    }
}
