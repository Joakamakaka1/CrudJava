package relacion01;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Calculador de area del rectangulo");
        System.out.println("---------------------------------");

        System.out.println("Dame la base :");
        double base = sc.nextDouble();

        System.out.println("Dame la altura :");
        double altura = sc.nextDouble();

        double area = base * altura;
        System.out.println("El area del rectangulo es : " + area);
    }
}
