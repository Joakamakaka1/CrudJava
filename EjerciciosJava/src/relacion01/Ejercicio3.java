package relacion01;

import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Pon una cantidad de dinero en pesetas y te hago la conversión a euros");
        double resultado = sc.nextDouble() / 636.63;

        System.out.println("La conversion de pesetas a euros es de " + resultado + " euros");
    }
}
