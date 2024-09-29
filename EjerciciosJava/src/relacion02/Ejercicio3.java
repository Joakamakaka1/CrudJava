package relacion02;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean bandera = true;

        while (bandera){
            System.out.println("Introduce un dia (0-7) :");
            int dia = sc.nextInt();
            switch (dia) {
                case 1:
                    System.out.println("Lunes");
                    bandera = false;
                    break;
                case 2:
                    System.out.println("Martes");
                    bandera = false;
                    break;
                case 3:
                    System.out.println("Miercoles");
                    bandera = false;
                    break;
                case 4:
                    System.out.println("Jueves");
                    bandera = false;
                    break;
                case 5:
                    System.out.println("Viernes");
                    bandera = false;
                    break;
                case 6:
                    System.out.println("Sabado");
                    bandera = false;
                    break;
                case 7:
                    System.out.println("Domingo");
                    bandera = false;
                    break;
                default:
                    System.out.println("Ese dia no existe");
                    bandera = true;
            }
        }
    }
}
