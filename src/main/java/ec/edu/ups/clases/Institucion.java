package ec.edu.ups.clases;

import java.util.List;

public class Institucion {
    private int id;
    private String nombre;
    private List<String> sede;
    private Direccion direccion;
    private Asignacion asignacion;

    public Institucion() {
    }

    public Institucion(int id, String nombre, List<String> sede, Direccion direccion, Asignacion asignacion) {
        this.id = id;
        this.nombre = nombre;
        this.sede = sede;
        this.direccion = direccion;
        this.asignacion = asignacion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    public Asignacion getAsignacion() {
        return asignacion;
    }

    public void setAsignacion(Asignacion asignacion) {
        this.asignacion = asignacion;
    }

    public List<String> getSede() {
        return sede;
    }

    public void setSede(List<String> sede) {
        this.sede = sede;
    }
}

