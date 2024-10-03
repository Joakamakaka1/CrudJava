package relacion02;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean bandera = true;

        while (bandera) {
            System.out.println("Introduce un dia de la semana. Si quieres salir escribe 'salir'");
            String dia = sc.nextLine().toLowerCase();
            switch (dia) {
                case "lunes":
                    System.out.println("El lunes hay HLC");
                    break;
                case "martes":
                    System.out.println("El martes hay DWECL");
                    break;
                case "miercoles":
                    System.out.println("El miercoles hay DWECL");
                    break;
                case "jueves":
                    System.out.println("El jueves hay DIWEB");
                    break;
                case "viernes":
                    System.out.println("El viernes hay DIWEB");
                    break;
                case "salir":
                    System.out.println("Saliendo del programa...");
                    bandera = false;
                    break;
                default:
                    System.out.println("Ese dia no existe");
                    break;
            }
        }
    }
}
