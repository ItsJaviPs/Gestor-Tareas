package com.curso.todo;

public class Tarea {

    private String descripcion;
    private boolean completada;

    public Tarea(String descripcion) {
        this.descripcion = descripcion;
        this.completada = false;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public boolean isCompletada() {
        return completada;
    }

    public void marcarCompletada() {
        this.completada = true;
    }

    @Override
    public String toString() {
        String estado = completada ? "[X]" : "[ ]";
        return estado + " " + descripcion;
    }
}
