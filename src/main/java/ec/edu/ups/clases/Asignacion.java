package ec.edu.ups.clases;

import ec.edu.ups.enums.Rol;

import java.util.GregorianCalendar;

public class Asignacion {
    private Persona persona;
    private GregorianCalendar fechaDeInicio;
    private Rol rol;

    public Asignacion(Persona persona, GregorianCalendar fechaDeInicio, Rol rol) {
        this.persona = persona;
        this.fechaDeInicio = fechaDeInicio;
        this.rol = rol;
    }

    public Asignacion() {
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public GregorianCalendar getFechaDeInicio() {
        return fechaDeInicio;
    }

    public void setFechaDeInicio(GregorianCalendar fechaDeInicio) {
        this.fechaDeInicio = fechaDeInicio;
    }

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }
}
