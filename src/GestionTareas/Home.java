
package GestionTareas;

/**
 *
 * @author Datos en Escabeche
 */

public class Home {
    public static void main(String[] args) {

        //Heredar la clase metodos
        Metodos metodos = new Metodos();
        ColaTareasPendientes colaTareasPendientes = new ColaTareasPendientes(50);
        PilaTareasPendientes pilaTareasPendientes = new PilaTareasPendientes(50);
        PilaTareasFinalizadas pilaTareasFinalizadas = new PilaTareasFinalizadas(50);

        Tarea tarea1 = new Tarea("Cocinar", "Preparar el almuerzo", "Pendiente", 1, 1);
        Tarea tarea2 = new Tarea("Lavar", "Lavar la ropa", "Pendiente", 4, 2);

        pilaTareasPendientes.push(tarea1);
        pilaTareasPendientes.push(tarea2);

        pilaTareasPendientes.mostrarTareasPendientes();
    }
    
}
