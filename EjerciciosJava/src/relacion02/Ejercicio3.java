package relacion02;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean bandera = true;

        while (bandera){
            System.out.println("Introduce un dia (0-7). Si quieres salir escribe '8' ");
            int dia = sc.nextInt();
            switch (dia) {
                case 1:
                    System.out.println("Lunes");
                    break;
                case 2:
                    System.out.println("Martes");
                    break;
                case 3:
                    System.out.println("Miercoles");
                    break;
                case 4:
                    System.out.println("Jueves");
                    break;
                case 5:
                    System.out.println("Viernes");
                    break;
                case 6:
                    System.out.println("Sabado");
                    break;
                case 7:
                    System.out.println("Domingo");
                    break;
                case 8:
                    System.out.println("Hasta luego");
                    bandera = false;
                    break;
                default:
                    System.out.println("Ese dia no existe");
            }
        }
    }
}
