package ec.edu.ups.clases;

import ec.edu.ups.enums.TipoDireccion;

import java.util.List;

public class Institucion {
    private int id;
    private String nombre;
    private List<String> sede;
    private Direccion direccion;
    private List<Asignacion> asignacion;

    public Institucion() {
    }

    public Institucion(int id, String nombre, List<String> sede, List<Asignacion> asignacion) {
        this.id = id;
        this.nombre = nombre;
        this.sede = sede;
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

    public void addDireccion(TipoDireccion tipoDireccion,String callePrincipal, String calleSecundaria, String numeracion, String provincia, String ciudad, String pais ) {
        this.direccion = new Direccion(tipoDireccion,callePrincipal,calleSecundaria,numeracion,provincia,ciudad,pais);
    }

    public List<Asignacion> getAsignacion() {
        return asignacion;
    }

    public void setAsignacion(List<Asignacion> asignacion) {
        this.asignacion = asignacion;
    }

    public List<String> getSede() {
        return sede;
    }

    public void setSede(List<String> sede) {
        this.sede = sede;
    }

    @Override
    public String toString() {
        return "Institucion{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", sede=" + sede +
                ", direccion=" + direccion +
                ", asignacion=" + asignacion +
                '}';
    }
}

