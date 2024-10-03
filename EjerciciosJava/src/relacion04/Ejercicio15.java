package relacion04;

import java.util.Random;

public class Ejercicio15 {
    public static void main(String[] args) {
        String[] notas = {"do", "re", "mi", "fa", "sol", "la", "si"};

        int tiempo = (int)(System.currentTimeMillis() % 7);
        int numNotas = (tiempo + 1) * 4;

        String[] melodia = new String[numNotas];

        for (int i = 0; i < numNotas; i++) {
            int indiceNota = (tiempo + i) % 7;
            melodia[i] = notas[indiceNota];
        }

        melodia[numNotas - 1] = melodia[0];

        for (int i = 0; i < numNotas; i++) {
            System.out.print(melodia[i]);
            if ((i + 1) % 4 == 0) {
                if (i == numNotas - 1) {
                    System.out.print(" ||");
                } else {
                    System.out.print(" | ");
                }
            } else {
                System.out.print(" ");
            }
        }
    }
}