package relacion01;

import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce la bse imponible ");
        double base = sc.nextDouble();

        System.out.println("Introduce el tipo de IVA (general, reducido, superreducido): ");
        sc.nextLine();
        String tipoIva = sc.nextLine();

        double iva = 0;
        if (tipoIva.equals("general")) {
            iva = 0.21;
        } else if (tipoIva.equals("reducido")) {
            iva = 0.10;
        } else if (tipoIva.equals("superreducido")) {
            iva = 0.04;
        }else{
            System.out.println("Tipo de IVA incorrecto");
            System.exit(0);
        }

        double ivaCantidad = base * iva;

        System.out.println("Introduzca el codigo promocional (nopro, mitad, meno5 o 5porc): ");
        String codigo = sc.nextLine();

        double descuentoPromocional = 0;
        if (codigo.equals("mitad")) {
            descuentoPromocional =  (ivaCantidad + base) / 2;
        } else if (codigo.equals("meno5")) {
            descuentoPromocional = 5;
        } else if (codigo.equals("5porc")) {
            descuentoPromocional = (ivaCantidad + base) * 0.05;
        }else {
            System.out.println("Codigo incorrecto");
            System.exit(0);
        }

        double precioFinal = base + ivaCantidad - descuentoPromocional;

        System.out.println("----------------------Datos de la compra-------------------------------");
        System.out.println("Base imponible: " + base);
        System.out.println("IVA (" + tipoIva + "): " + ivaCantidad);
        System.out.println("Precio con IVA: " + (base + ivaCantidad));
        System.out.println("Cód. promo. (" + codigo + "): " + descuentoPromocional);
        System.out.println("TOTAL: " + precioFinal);
        System.out.println("----------------------------------------------------------------------");
    }
}
