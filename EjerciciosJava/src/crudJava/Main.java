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
        System.out.println("Introduce la contraseña del usuario");
        String password = sc.next();

        User newUser = new User(name, password);
        Respuestas createResponse = ur.createUser(newUser);

        if(createResponse.getStatus() == 201){
            System.out.println(createResponse.getMessage());
        }else{
            System.err.println(createResponse.getMessage());
        }

    }

    private static void searchUser(Scanner sc, UserRepository ur) {
        System.out.println("Introduce el nombre del usuario");
        String name = sc.next();
        System.out.println("Introduce la contraseña del usuario");
        String password = sc.next();

        User searchUser = new User(name, password);
        Respuestas readResponse = ur.readUser(searchUser);

        if(readResponse.getStatus() == 200) {
            System.out.println(readResponse.getMessage());
        }else{
            System.err.println(readResponse.getMessage());
        }
    }

    private static void updateUser(Scanner sc, UserRepository ur) {
        System.out.println("Introduce el nombre del usuario");
        String name = sc.next();
        System.out.println("Introduce la contraseña del usuario");
        String password = sc.next();

        User existingUser = new User(name, password);
        Respuestas readResponse = ur.readUser(existingUser);

        if (readResponse.getStatus() == 200) {
            System.out.println(readResponse.getMessage());

            System.out.println("Introduce el nuevo nombre del usuario");
            String newName = sc.next();
            System.out.println("Introduce la nueva contraseña del usuario");
            String newPass = sc.next();

            User userToUpdate = new User(newName, newPass);
            Respuestas updateResponse = ur.updateUser(userToUpdate);

            System.out.println(updateResponse.getMessage());
        } else {
            System.err.println(readResponse.getMessage());
        }
    }

    private static void deleteUser(Scanner sc, UserRepository ur) {
        System.out.println("Introduce el nombre del usuario");
        String name = sc.next();
        System.out.println("Introduce la contraseña del usuario");
        String password = sc.next();

        User deleteUser = new User(name, password);
        Respuestas deleteResponse = ur.deleteUser(deleteUser);

        if(deleteResponse.getStatus() == 200){
            System.out.println(deleteResponse.getMessage());
        }else{
            System.err.println(deleteResponse.getMessage());
        }
    }
}