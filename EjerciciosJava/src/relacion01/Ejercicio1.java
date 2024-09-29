package relacion01;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un numero");
        int num1 = sc.nextInt();

        System.out.println("Introduce otro numero");
        int num2 = sc.nextInt();
        double multiplicacion = num1*num2;
    }
}
