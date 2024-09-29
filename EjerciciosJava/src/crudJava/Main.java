package crudJava;

import crudJava.clases.Respuestas;
import crudJava.clases.User;
import crudJava.repository.UserRepository;

import java.util.Scanner;

/**
 * The type Main.
 */
public class Main {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean bandera = true;
        UserRepository ur = new UserRepository();

        ur.createUser(new User("Joaquin", "123456"));

        System.out.println("Bienvenido al crudJava");

        while (bandera) {
            System.out.println("--------Elige una opcion--------");
            System.out.println("1. Crear usuario");
            System.out.println("2. Buscar usuario");
            System.out.println("3. Actualizar usuario");
            System.out.println("4. Borrar usuario");
            System.out.println("5. Salir");
            int opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    createUser(sc, ur);
                    break;
                case 2:
                    searchUser(sc, ur);
                    break;
                case 3:
                    updateUser(sc, ur);
                    break;
                case 4:
                    deleteUser(sc, ur);
                    break;
                case 5:
                    System.out.println("Saliendo del programa...");
                    bandera = false;
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
        }
        sc.close();
    }

    private static void createUser(Scanner sc, UserRepository ur) {
        System.out.println("Introduce el nombre del usuario");
        String name = sc.next();
        System.out.println("Introduce la contraseña del usuario");
        String password = sc.next();

        if (name.length() < 5 || password.length() < 5) {
            System.err.println("El nombre o la contraseña son demasiado cortos");
        } else {
            User newUser = new User(name, password);
            Respuestas createResponse = ur.createUser(newUser);
            System.out.println(createResponse.getMessage());
        }
    }

    private static void searchUser(Scanner sc, UserRepository ur) {
        System.out.println("Introduce el nombre del usuario");
        String name = sc.next();
        System.out.println("Introduce la contraseña del usuario");
        String password = sc.next();
        User searchUser = new User(name, password);
        Respuestas readResponse = ur.readUser(searchUser);
        System.out.println(readResponse.getMessage());
    }

    private static void updateUser(Scanner sc, UserRepository ur) {
        System.out.println("Introduce el nombre del usuario");
        String name = sc.next();
        System.out.println("Introduce la contraseña del usuario");
        String password = sc.next();

        User existingUser = new User(name, password);
        Respuestas readResponse = ur.readUser(existingUser);

        if (readResponse.getStatus() == 404) {
            System.err.println("El usuario no existe");
            return;
        }

        System.out.println("Introduce el nuevo nombre del usuario");
        String newName = sc.next();
        System.out.println("Introduce la nueva contraseña del usuario");
        String newPass = sc.next();

        if (newName.length() < 5 || newPass.length() < 5) {
            System.err.println("El nuevo nombre o la nueva contraseña son demasiado cortos");
            return;
        }

        existingUser.setName(newName);
        existingUser.setPassword(newPass);
        Respuestas updateResponse = ur.updateUser(existingUser);
        System.out.println(updateResponse.getMessage());

    }

    private static void deleteUser(Scanner sc, UserRepository ur) {
        System.out.println("Introduce el nombre del usuario");
        String name = sc.next();
        System.out.println("Introduce la contraseña del usuario");
        String password = sc.next();
        User deleteUser = new User(name, password);
        Respuestas deleteResponse = ur.deleteUser(deleteUser);
        System.out.println(deleteResponse.getMessage());
    }
}