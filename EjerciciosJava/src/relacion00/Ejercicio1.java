package relacion00;

public class Ejercicio1 {

    public static void main(String[] args) {
        int x = 144;
        int e = 999;

        int suma = x + e;
        int resta =  x - e;
        double division = (double) x/e;
        double multiplicacion = x*e;

        System.out.println("--------------------------------------------------");
        System.out.println("El primer numero es " + x + " y el segundo es " + e);
        System.out.println("--------------------------------------------------");
        System.out.println("La suma ambos numeros da " + suma + "\n" +
                "La resta de ambos numeros es " + resta + "\n" +
                "La division de ambos numeros es " + division + "\n" +
                "La multiplicacion de ambos numeros es " + multiplicacion);

    }
}
