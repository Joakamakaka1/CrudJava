package relacion01;

import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Pon una cantidad de kb y te hago la conversión a mb");
        double resultado = sc.nextDouble() * 0.001;

        System.out.println("La conversion de kb a mb es de " + resultado + " mb");

    }
}

