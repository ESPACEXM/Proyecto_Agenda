package GestionTareas;

import java.sql.Date;

/**
 * Clase que contiene la información de las tareas
 */

public class Tareas {

    //Atributos
    private String nombreTarea;
    private String descripcionTarea;
    private Date fechaInicioTarea;
    private String estadoTarea;
    private int prioridadTarea;


    //Constructor
    public Tareas(String nombreTarea, String descripcionTarea, Date fechaInicioTarea, String estadoTarea, int prioridadTarea) {
        this.nombreTarea = nombreTarea;
        this.descripcionTarea = descripcionTarea;
        this.fechaInicioTarea = fechaInicioTarea;
        this.estadoTarea = estadoTarea;
        this.prioridadTarea = prioridadTarea;
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

    public Date getFechaInicioTarea() {
        return fechaInicioTarea;
    }

    public void setFechaInicioTarea(Date fechaInicioTarea) {
        this.fechaInicioTarea = fechaInicioTarea;
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

}
