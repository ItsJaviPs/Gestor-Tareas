# Gestor de Tareas (To-Do)

Aplicación de consola en Java para gestionar una lista de tareas pendientes.

## Funcionalidades

- Añadir una tarea con una descripción.
- Ver la lista de tareas pendientes.
- Marcar una tarea como completada.
- Eliminar una tarea.

## Tecnologías

- Java 17
- Maven
- Entrada de datos por consola con `Scanner`

## Cómo ejecutarlo

1. Abrir el proyecto en IntelliJ IDEA (se detectará automáticamente como proyecto Maven).
2. Localizar la clase `Main` en `src/main/java/com/curso/todo/Main.java`.
3. Ejecutarla con el botón ▶ (Run) o pulsando `Shift + F10`.
4. Usar el menú numérico que aparece en la consola para interactuar con el programa.

## Estructura del proyecto

```
src/main/java/com/curso/todo/
 ├── Tarea.java          # Modelo de una tarea individual
 ├── GestorTareas.java   # Lógica de negocio (añadir, listar, completar, eliminar)
 └── Main.java           # Punto de entrada y menú de consola
```