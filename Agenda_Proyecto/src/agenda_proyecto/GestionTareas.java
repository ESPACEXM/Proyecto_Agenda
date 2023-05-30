package agenda_proyecto;

    public class GestionTareas {
    private Tarea[] tareas;
    private int numTareas;

    public GestionTareas() {
        tareas = new Tarea[100]; // Define el tamaño máximo del arreglo de tareas
        numTareas = 0; // Inicializa el contador de tareas en 0
    }

    public void agregarTarea(int ID,String nombre, String descripcion, String prioridad,String estado) {
        Tarea nuevaTarea = new Tarea(ID,nombre, descripcion, prioridad,estado);

        tareas[numTareas] = nuevaTarea;
        numTareas++;
        
        
    }
     public void mostrarTareas() {
        for (int i = 0; i < numTareas; i++) {
            Tarea tarea = tareas[i];
            System.out.println("Id: " + tarea.getId());
            System.out.println("Nombre: " + tarea.getNombre());
            System.out.println("Descripcion: " + tarea.getDescripcion());
            System.out.println("Prioridad: " + tarea.getPrioridad());
            System.out.println("Estado: " + tarea.getEstadoTarea());
            System.out.println("---------------------------------");
        }
    }
     
  
}
