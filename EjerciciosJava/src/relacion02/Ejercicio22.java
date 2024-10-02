package relacion02;

import java.time.LocalTime;
import java.util.Scanner;

public class Ejercicio22 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean bandera = true;

        while (bandera) {
            System.out.println("Descubre cuanto te falta para llegar al Viernes a las 3 de la tarde");
            System.out.println("Elige un dia del lunes al viernes (1-5): ");
            int dia = sc.nextInt();

            System.out.println("Que hora es (0-23): ");
            int hora = sc.nextInt();

            LocalTime horaActual = LocalTime.of(hora, 0);

            int minutosFaltantes = (5 - dia) * 24 * 60 + (15 - horaActual.getHour()) * 60 + (0 - horaActual.getMinute());
            if (minutosFaltantes < 0) {
                minutosFaltantes += 7 * 24 * 60;
            }

            System.out.println("Faltan " + minutosFaltantes + " minutos");
            bandera = false;
        }
    }
}
