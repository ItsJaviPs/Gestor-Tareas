package com.curso.todo;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GestorTareas gestor = new GestorTareas();
        boolean salir = false;

        while (!salir) {
            mostrarMenu();
            int opcion = leerOpcion(scanner);

            switch (opcion) {
                case 1:
                    System.out.print("Descripción de la tarea: ");
                    String descripcion = scanner.nextLine();
                    gestor.añadirTarea(descripcion);
                    break;

                case 2:
                    gestor.listarTareas();
                    break;

                case 3:
                    gestor.listarTareas();
                    System.out.print("Número de la tarea a completar: ");
                    int numCompletar = leerOpcion(scanner);
                    gestor.completarTarea(numCompletar);
                    break;

                case 4:
                    gestor.listarTareas();
                    System.out.print("Número de la tarea a eliminar: ");
                    int numEliminar = leerOpcion(scanner);
                    gestor.eliminarTarea(numEliminar);
                    break;

                case 5:
                    System.out.println("¡Hasta luego!");
                    salir = true;
                    break;

                default:
                    System.out.println("Opción no válida. Inténtalo de nuevo.");
            }
        }

        scanner.close();
    }

    private static void mostrarMenu() {
        System.out.println("\n--- Gestor de Tareas ---");
        System.out.println("1. Añadir tarea");
        System.out.println("2. Ver tareas pendientes");
        System.out.println("3. Marcar tarea como completada");
        System.out.println("4. Eliminar tarea");
        System.out.println("5. Salir");
        System.out.print("Elige una opción: ");
    }


    private static int leerOpcion(Scanner scanner) {
        String entrada = scanner.nextLine();
        try {
            return Integer.parseInt(entrada.trim());
        } catch (NumberFormatException e) {
            return -1;
        }
    }
}