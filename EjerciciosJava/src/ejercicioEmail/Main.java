package ejercicioEmail;

import ejercicioEmail.controller.UserEmailController;
import ejercicioEmail.model.RespuestasHTTP;

import java.util.Scanner;

/**
 * The type Main.
 */
public class Main {

    private static boolean respuestaOk;

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        UserEmailController uec = new UserEmailController();


        boolean bandera = true;
        System.out.println("-----Bienvenido al programa------");

        while (bandera) {
            System.out.println("Ingresa una opción");
            System.out.println("1. Insertar usuario");
            System.out.println("2. Eliminar usuario");
            System.out.println("3. Buscar usuario");
            System.out.println("4. Salir");

            int opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    insertarNuevoUsuario(sc, uec);
                    break;
                case 2:
                    eliminarUsuario(sc, uec);
                    break;
                case 3:
                    consultarUsuario(sc, uec);
                    break;
                case 4:
                    System.out.println("Saliendo del programa...");
                    bandera = false;
                    break;
                default:
                    System.out.println("Opción no válida");
                    break;
            }
        }
    }

    private static void insertarNuevoUsuario(Scanner sc, UserEmailController uec) {
        respuestaOk = false;

        while (!respuestaOk) {
            System.out.println("Insertar un nuevo usuario");
            System.out.println("Ingresa el nombre");
            String name = sc.nextLine();
            System.out.println("Ingresa el email");
            String email = sc.nextLine();

            RespuestasHTTP r = uec.insertUserEmail(name, email);
            if (r.getStatus() == 201) {
                System.out.println(r.getBody());
                respuestaOk = true;
            } else {
                System.err.println(r.getBody());
            }
        }
    }

    private static void eliminarUsuario(Scanner sc, UserEmailController uec) {
        respuestaOk = false;

        while (!respuestaOk) {
            System.out.println("Eliminar un usuario");
            System.out.println("Ingresa el email");
            String email = sc.nextLine();

            RespuestasHTTP r = uec.deleteUserEmail(email);
            if (r.getStatus() == 200) {
                System.out.println(r.getBody());
                respuestaOk = true;
            } else {
                System.err.println(r.getBody());
            }
        }
    }

    private static void consultarUsuario(Scanner sc, UserEmailController uec) {
        respuestaOk = false;

        while (!respuestaOk) {
            System.out.println("Consultar un usuario");
            System.out.println("Ingresa el email");
            String email = sc.nextLine();

            RespuestasHTTP r = uec.getUserEmail(email);
            if (r.getStatus() == 200) {
                System.out.println(r.getBody());
                respuestaOk = true;
            } else {
                System.err.println(r.getBody());
            }
        }
    }
}