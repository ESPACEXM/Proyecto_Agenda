package GestionTareas;


/**
 * Clase que contiene la información de las tareas
 */

public class Tarea {

    //Atributos
    private String nombreTarea;
    private String descripcionTarea;
    private String estadoTarea;
    private int prioridadTarea;
    private int id;


    //Constructor
    public Tarea(String nombreTarea, String descripcionTarea, String estadoTarea, int prioridadTarea, int id) {
        this.nombreTarea = nombreTarea;
        this.descripcionTarea = descripcionTarea;
        this.estadoTarea = estadoTarea;
        this.prioridadTarea = prioridadTarea;
        this.id = id;
    }

    //Getters y setters
    public String getNombreTarea() {
        return nombreTarea;
    }

    public void setNombreTarea(String nombreTarea) {
        this.nombreTarea = nombreTarea;
    }

    public String getDescripcionTarea() {
        return descripcionTarea;
    }

    public void setDescripcionTarea(String descripcionTarea) {
        this.descripcionTarea = descripcionTarea;
    }

    public String getEstadoTarea() {
        return estadoTarea;
    }

    public void setEstadoTarea(String estadoTarea) {
        this.estadoTarea = estadoTarea;
    }

    public int getPrioridadTarea() {
        return prioridadTarea;
    }

    public void setPrioridadTarea(int prioridadTarea) {
        this.prioridadTarea = prioridadTarea;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
