package crudJava;

import crudJava.clases.Respuestas;
import crudJava.clases.User;
import crudJava.controller.UserController;
import crudJava.repository.UserRepository;
import crudJava.service.UserService;

import java.util.Scanner;

/**
 * The type Main.
 */
public class Main {
    //TODO corregir main
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        UserRepository ur = new UserRepository();
        UserService userService = new UserService(ur);
        UserController userController = new UserController(userService, sc);

        System.out.println("Bienvenido al crudJava");

        boolean bandera = true;

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
                    userController.createUser();
                    break;
                case 2:
                    userController.searchUser();
                    break;
                case 3:
                    userController.updateUser();
                    break;
                case 4:
                    userController.deleteUser();
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
}
