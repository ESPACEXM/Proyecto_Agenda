package agenda_proyecto;

import UI_Agenda.Home;
import UI_Agenda.Nueva_Tarea;


public class Agenda_Proyecto {
    



    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Home UI_HOME = new Home();
       UI_HOME.setVisible(true);
       UI_HOME.setLocationRelativeTo(null);
       
       
       
      
       
       
    Pila_Tareas pilaTareas = new Pila_Tareas(1);
    while (pilaTareas.isFull()) {
    Tarea tarea = pilaTareas.obtenerTareaPrioritaria();
    System.out.println("Tarea actual: " + tarea.getDescripcion());

    // Realizar acciones con la tarea

    pilaTareas.pop();
    }
    }
    
}
