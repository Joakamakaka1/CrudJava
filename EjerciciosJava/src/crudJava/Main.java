package crudJava;

import crudJava.clases.Respuestas;
import crudJava.clases.User;
import crudJava.controller.UserController;

import java.util.Scanner;
import java.util.List;

/**
 * The type Main.
 */
public class Main {
    private static final Scanner sc = new Scanner(System.in);
    private static final UserController userController = new UserController();
    private static boolean respuestaOk;

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        System.out.println("Bienvenido al crudJava");
        boolean bandera = true;

        while (bandera) {
            mostrarMenu();
            int opcion = sc.nextInt();
            sc.nextLine();
            bandera = manejarOpcion(opcion);
        }
        sc.close();
    }

    private static void mostrarMenu() {
        System.out.println("--------Elige una opcion--------");
        System.out.println("1. Crear usuario");
        System.out.println("2. Buscar usuario");
        System.out.println("3. Actualizar usuario");
        System.out.println("4. Borrar usuario");
        System.out.println("5. Listar todos los usuarios");
        System.out.println("6. Salir");
    }

    private static boolean manejarOpcion(int opcion) {
        switch (opcion) {
            case 1:
                crearUsuario();
                break;
            case 2:
                buscarUsuario();
                break;
            case 3:
                actualizarUsuario();
                break;
            case 4:
                borrarUsuario();
                break;
            case 5:
                listarUsuarios();
                break;
            case 6:
                System.out.println("Saliendo del programa...");
                return false;
            default:
                System.out.println("Opcion no valida");
                break;
        }
        return true;
    }

    private static void crearUsuario() {
        respuestaOk = false;

        while (!respuestaOk) {
            System.out.print("Ingrese nombre de usuario: ");
            String nombre = sc.nextLine();
            System.out.print("Ingrese contraseña: ");
            String password = sc.nextLine();
            Respuestas respuesta = userController.createUser(nombre, password);

            if(respuesta.getStatus() == 201) {
                System.out.println(respuesta.getMessage());
                respuestaOk = true;
            } else {
                System.err.println(respuesta.getMessage());
            }
        }
    }

    private static void buscarUsuario() {
        respuestaOk = false;

        while (!respuestaOk) {
            System.out.print("Ingrese nombre de usuario a buscar: ");
            String nombre = sc.nextLine();
            Respuestas respuesta = userController.searchUser(nombre);

            if (respuesta.getStatus() == 200) {
                System.out.println(respuesta.getMessage());
                respuestaOk = true;
            } else {
                System.err.println(respuesta.getMessage());
            }
        }
    }

    //TODO arregla este metodo para que cuando se actualice el usuario y lo busques o listes a todos salga
    private static void actualizarUsuario() {
        respuestaOk = false;

        while (!respuestaOk) {
            System.out.print("Ingrese nombre de usuario a actualizar: ");
            String nombre = sc.nextLine();
            System.out.print("Ingrese nuevo nombre: ");
            String nuevoNombre = sc.nextLine();
            Respuestas respuesta = userController.updateUser(nombre, nuevoNombre);

            if (respuesta.getStatus() == 200) {
                System.out.println(respuesta.getMessage());
                respuestaOk = true;
            } else {
                System.err.println(respuesta.getMessage());
            }
        }
    }

    private static void borrarUsuario() {
        respuestaOk = false;

        while (!respuestaOk) {
            System.out.print("Ingrese nombre de usuario a borrar: ");
            String nombre = sc.nextLine();
            Respuestas respuesta = userController.deleteUser(nombre);

            if (respuesta.getStatus() == 200) {
                System.out.println(respuesta.getMessage());
                respuestaOk = true;
            } else {
                System.err.println(respuesta.getMessage());
            }
        }
    }

    private static void listarUsuarios() {
        respuestaOk = false;

        while(!respuestaOk) {
            Respuestas respuesta = userController.getAllUsers();
            if (respuesta.getStatus() == 200) {
                System.out.println(respuesta.getMessage());

                List<User> users = (List<User>) respuesta.getData();
                for (User user : users) {
                    System.out.println("Usuario: " + user.getName());
                }

                respuestaOk = true;
            } else {
                System.err.println(respuesta.getMessage());
            }
        }
    }
}