package relacion04;

import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean numAdivinado = false;
        int intentosMax = 5;
        int min = 1;
        int max = 100;

        System.out.println("Piensa en un número entre 1 y 100");

        while (!numAdivinado && intentosMax > 0) {
            System.out.println("Escribe Ok para empezar a jugar");
            String respuesta = sc.nextLine().toUpperCase();

            if (respuesta.equals("OK")) {
                int num = (int)(Math.random() * (max - min + 1)) + min;
                System.out.println("El número que pienso es " + num + "\n"
                        + "¿Es mayor (M), menor (m) o igual (I) al número que estás pensando?");
                String respuesta2 = sc.nextLine().toUpperCase();

                if (respuesta2.equals("M")) {
                    min = num + 1;
                    System.out.println("El número que estás pensando es mayor que " + num);
                } else if (respuesta2.equals("m")) {
                    max = num - 1;
                    System.out.println("El número que estás pensando es menor que " + num);
                } else if (respuesta2.equals("I")) {
                    System.out.println("¡Felicidades! He adivinado el número");
                    numAdivinado = true;
                } else {
                    System.out.println("No has introducido una respuesta válida");
                }

                intentosMax--;
                System.out.println("Me quedan " + intentosMax + " intentos");
            } else {
                System.out.println("No has escrito Ok");
            }

            if (min > max) {
                System.out.println("Parece que ha habido un error. No puede haber un número entre " + min + " y " + max + ".");
                break;
            }
        }

        if (intentosMax == 0 && !numAdivinado) {
            System.out.println("No he podido adivinar tu número. ¡Tal vez la próxima vez!");
        }

        sc.close();
    }
}