
package agenda_proyecto;




public class Pila_Tareas {
    
    //Pila que almacena las tareas pendientes
    private Object[] pilaTareasPendientes;
    private int tamano;
    private int cima;

    //Constructor
    public Pila_Tareas(int tamano) {
        this.tamano = tamano;
        this.pilaTareasPendientes = new Object[tamano];
        this.cima = -1;
    }

    //Método que añade una tarea a la pila (push)
    public void push(Object tarea) {
        cima++;
        pilaTareasPendientes[cima] = tarea;
    }

    //Método que elimina una tarea de la pila (pop)
    public Object pop() {
        Object tarea = pilaTareasPendientes[cima];
        cima--;
        return tarea;
    }

    //Método que devuelve la tarea que está en la cima de la pila (peek)
    public Object peek() {
        return pilaTareasPendientes[cima];
    }
    
  

    //Método para saber si NO HAY tareas pendientes
    public boolean isEmpty() {
        return cima == -1;
    }
    
      public Tarea obtenerTareaPrioritaria() {
        if (isEmpty()) {
            return null;
        }
        return (Tarea) peek();
    }

    //Método para saber SI HAY tareas pendientes
    public boolean isFull() {
        return cima == tamano - 1;
    }

    //Método que devuelve la cantidad de tareas pendientes	
    public int numTareasPendientes() {
        return cima + 1;
    }

    //Método que muestra las tareas pendientes
    public void mostrarTareasPendientes() {
        for (int i = 0; i <= numTareasPendientes(); i++) {
            Tarea tarea = (Tarea) pilaTareasPendientes[i];
            System.out.println(tarea.getNombre() + " " + tarea.getDescripcion() + " " + tarea.getEstadoTarea() + " " + tarea.getPrioridad() + " " + tarea.getId());
            System.out.println("");
        }
    }
    
}
