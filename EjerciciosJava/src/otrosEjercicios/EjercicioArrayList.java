package otrosEjercicios;

import java.util.ArrayList;
import java.util.Scanner;

public class EjercicioArrayList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean bandera = true;
        String nombre = "";
        String password = "";

        ArrayList<Personas> personas = new ArrayList<>();
        personas.add(new Personas("Joaquin", "password1"));
        personas.add(new Personas("Abraham", "password2"));
        personas.add(new Personas("Jesus", "password3"));
        personas.add(new Personas("Pablo", "password4"));
        personas.add(new Personas("Diego", "password5"));
        personas.add(new Personas("Emilio", "password6"));
        personas.add(new Personas("Ignacio", "password7"));

        System.out.println("Bienvenido al programa");

        while(bandera){
            System.out.println("Nombre: ");
            nombre = sc.nextLine();
            System.out.println("Password: ");
            password = sc.nextLine();

            for (Personas persona : personas) {
                if (persona.getNombre().equals(nombre) && persona.getPassword().equals(password)) {
                    System.out.println("Bienvenido al programa " + persona.getNombre());
                    bandera = false;
                    break;
                }
            }
            if (bandera) {
                System.err.println("Nombre incorrecto o no encontrado. Vuelve a introducir los datos");
            }
        }
    }
}