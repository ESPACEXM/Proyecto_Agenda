package GestionTareas;

/**
 * Clase que contiene los métodos de la cola de tareas pendientes
 */

public class ColaTareasPendientes {

    //Cola que almacena las tareas pendientes
    private Object[] colaTareasPendientes;
    private int frente;
    private int fin;
    private int numElementos;
    private int maximo;

    //Constructor
    public ColaTareasPendientes(int maximo) {
        this.maximo = maximo;
        this.frente = 0;
        this.fin = -1;
        this.numElementos = 0;
        this.colaTareasPendientes = new Object[maximo];
    }

    //Método que añade una tarea a la cola (enqueue)
    public void enqueue(Object tarea) {
        if (fin == maximo - 1) {
            fin = -1;
        }
        fin++;
        colaTareasPendientes[fin] = tarea;
        numElementos++;
    }

    //Método que extraer una tarea de la cola (dequeue)
    public Object dequeue() {
        Object tarea = colaTareasPendientes[frente];
        frente++;
        if (frente == maximo) {
            frente = 0;
        }
        numElementos--;
        return tarea;
    }

    //Método que devuelve la tarea que está en el frente de la cola (peek)
    public Object peek() {
        return colaTareasPendientes[frente];
    }

    //Método para saber si NO HAY elementos en la cola de pendientes
    public boolean isEmpty() {
        return (numElementos == 0);
    }

    //Método para saber SI HAY elementos en la cola de pendientes
    public boolean isFull() {
        return (numElementos == maximo);
    }

    //Método que devuelve la cantidad de tareas en cola
    public int numTareas() {
        return numElementos;
    }

    //Método que imprime la cola de tareas pendientes
    public void mostrarColaTareasPendientes() {
        for (int i = 0; i < numTareas(); i++) {
            Tarea tarea = (Tarea) colaTareasPendientes[i];
            System.out.println(tarea.getNombreTarea() + " " + tarea.getDescripcionTarea() + " " + tarea.getEstadoTarea() + " " + tarea.getPrioridadTarea() + " " + tarea.getId());
            System.out.println("");
        }
    }
    
}
