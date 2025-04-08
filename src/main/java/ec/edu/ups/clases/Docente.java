package ec.edu.ups.clases;

import java.util.List;

public class Docente extends Persona {
    private List<String> titulosAcademicos;
    private List<String> areasDeEspelizacion;

    public Docente() {
    }

    public Docente(List<String> titulosAcademicos, List<String> areasDeEspelizacion) {
        this.titulosAcademicos = titulosAcademicos;
        this.areasDeEspelizacion = areasDeEspelizacion;
    }

    public List<String> getTitulosAcademicos() {
        return titulosAcademicos;
    }

    public void setTitulosAcademicos(List<String> titulosAcademicos) {
        this.titulosAcademicos = titulosAcademicos;
    }

    public List<String> getAreasDeEspelizacion() {
        return areasDeEspelizacion;
    }

    public void setAreasDeEspelizacion(List<String> areasDeEspelizacion) {
        this.areasDeEspelizacion = areasDeEspelizacion;
    }

    @Override
    public String toString() {
        return super.toString()+"Docente{" +
                "titulosAcademicos=" + titulosAcademicos +
                ", areasDeEspelizacion=" + areasDeEspelizacion +
                '}';
    }
}
