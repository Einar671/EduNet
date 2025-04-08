package ec.edu.ups.clases;

public class Estudiante extends Persona {
    private String carrera;
    private String matricula;

    public Estudiante(){

    }
    public Estudiante(String carrera, String matricula){
        this.carrera = carrera;
        this.matricula = matricula;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return super.toString()+"Estudiante{" +
                "carrera='" + carrera + '\'' +
                ", matricula='" + matricula + '\'' +
                '}';
    }
}
