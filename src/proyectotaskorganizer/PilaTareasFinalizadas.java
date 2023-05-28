package proyectotaskorganizer;

/**
 * Clase que contiene los métodos de la pila de tareas finalizadas
 */

public class PilaTareasFinalizadas {
    
    //Pila que almacena las tareas finalizadas
    private Object[] pilaTareasFinalizadas;
    private int tamanoPila;
    private int cima;

    //Constructor
    public PilaTareasFinalizadas(int tamano) {
        this.tamanoPila = tamano;
        this.cima = -1;
        this.pilaTareasFinalizadas = new Object[tamano];
    }

    //Método que añade una tarea a la pila (push)
    public void push(Object tarea) {
        cima++;
        pilaTareasFinalizadas[cima] = tarea;
    }

    //Método que elimina una tarea de la pila (pop)
    public Object pop() {
        Object tarea = pilaTareasFinalizadas[cima];
        cima--;
        return tarea;
    }
    
    //Método que devuelve la tarea que está en la cima de la pila (peek)
    public Object peek() {
        return pilaTareasFinalizadas[cima];
    }

    //Método para saber si NO HAY tareas finalizadas
    public boolean isEmpty() {
        return cima == -1;
    }

    //Método para saber SI HAY tareas finalizadas
    public boolean isFull() {
        return cima == tamanoPila - 1;
    }

    //Método que devuelve la cantidad de tareas finalizadas
    public int numTareasFinalizadas() {
        return cima + 1;
    }

    //Método que muestra las tareas finalizadas
    public void mostrarTareasFinalizadas() {
        for (int i = 0; i <= numTareasFinalizadas(); i++) {
            System.out.println(pilaTareasFinalizadas[i]);
            System.out.println("");
        }
    }
    
}
