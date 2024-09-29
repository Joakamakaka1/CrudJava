package relacion00;

import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args) {
        double IVA = 0.21;

        Scanner sc = new Scanner(System.in);
        System.out.println("Dame el total de la factura y yo te calculo el IVA");

        double baseImponible = sc.nextDouble();
        double resultado = baseImponible + (baseImponible*IVA);

        System.out.println("El precio de " + baseImponible + " junto al IVA asciende a " + resultado);

    }
}
