package relacion02;

import java.util.Scanner;

public class Ejercicio20 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean bandera = true;

        while (bandera) {
            System.out.println("Introduce un numero (entre 1 y 99999): ");
            int num = sc.nextInt();

            if (num > 1 && num < 99999) {
                boolean esCapicua = false;
                String numStr = String.valueOf(num);

                switch (numStr.length()) {
                    case 1:
                        esCapicua = true;
                        break;
                    case 2:
                        esCapicua =  numStr.charAt(0) == numStr.charAt(1);
                        break;
                    case 3:
                        esCapicua = numStr.charAt(0) == numStr.charAt(2);
                        break;
                    case 4:
                        esCapicua = numStr.charAt(0) == numStr.charAt(3) && numStr.charAt(1) == numStr.charAt(2);
                        break;
                    case 5:
                        esCapicua = numStr.charAt(0) == numStr.charAt(4) && numStr.charAt(1) == numStr.charAt(3);
                        break;
                    default:
                        System.out.println("El numero no es correcto");
                        break;
                }
                if (esCapicua) {
                    System.out.println("El numero " + num + " es capicua");
                    bandera = false;
                } else {
                    System.out.println("El numero " + num + " no es capicua");
                }
            } else {
                System.out.println("El numero no es correcto");
            }
        }

    }

}
