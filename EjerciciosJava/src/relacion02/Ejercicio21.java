package relacion02;

import java.util.Scanner;

public class Ejercicio21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean bandera = true;

        while (bandera){
            System.out.println("Introduce la primera nota del primer control: ");
            double nota1 = sc.nextInt();
            System.out.println("Introduce la segunda nota del segundo control: ");
            double nota2 = sc.nextInt();

            if(nota1 < 0 || nota1 > 10 || nota2 < 0 || nota2 > 10){
                System.out.println("Las notas tienen que estar entre 0 y 10");
            } else {
                double media = (nota1 + nota2) / 2;
                System.out.println("Tu nota del primer control fue de " + nota1 + "\n" + " Tu nota del segundo control fue de " + nota2 + "\n" + " y la media es de " + media);
                if(media >= 5){
                    System.out.println("Enhorabuena has aprobao");
                    bandera = false;
                }else{
                    System.out.println("Lo siento has suspendido. Necesitas hacer la recuperación");
                    System.out.println("Cual fue tu nota de recuperación? (Apto/No apto)");
                    String recuperacion = sc.next().toLowerCase();
                    if(recuperacion.equals("Apto")){
                        System.out.println("Enhorabuena has aprobado con un " + recuperacion);
                        bandera = false;
                    }else{
                        System.out.println("Lo siento has suspendido. Tu nota final será " + media);
                        bandera = false;
                    }
                }
            }
        }
    }
}
