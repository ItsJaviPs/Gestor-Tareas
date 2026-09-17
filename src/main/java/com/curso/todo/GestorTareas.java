package com.curso.todo;

import java.util.ArrayList;
import java.util.List;


public class GestorTareas {

    private List<Tarea> tareas;

    public GestorTareas() {
        this.tareas = new ArrayList<>();
    }


    public void añadirTarea(String descripcion) {
        if (descripcion == null || descripcion.trim().isEmpty()) {
            System.out.println("La descripción no puede estar vacía.");
            return;
        }
        tareas.add(new Tarea(descripcion.trim()));
        System.out.println("Tarea añadida correctamente.");
    }


    public void listarTareas() {
        if (tareas.isEmpty()) {
            System.out.println("No hay tareas pendientes.");
            return;
        }
        System.out.println("--- Lista de tareas ---");
        for (int i = 0; i < tareas.size(); i++) {
            System.out.println((i + 1) + ". " + tareas.get(i));
        }
    }


    public void completarTarea(int numeroTarea) {
        int indice = numeroTarea - 1;
        if (esIndiceValido(indice)) {
            tareas.get(indice).marcarCompletada();
            System.out.println("Tarea marcada como completada.");
        } else {
            System.out.println("Número de tarea no válido.");
        }
    }


    public void eliminarTarea(int numeroTarea) {
        int indice = numeroTarea - 1;
        if (esIndiceValido(indice)) {
            tareas.remove(indice);
            System.out.println("Tarea eliminada.");
        } else {
            System.out.println("Número de tarea no válido.");
        }
    }

    private boolean esIndiceValido(int indice) {
        return indice >= 0 && indice < tareas.size();
    }
}