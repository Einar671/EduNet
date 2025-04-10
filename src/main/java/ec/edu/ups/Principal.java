package ec.edu.ups;

import ec.edu.ups.clases.Institucion;
import ec.edu.ups.clases.Persona;
import ec.edu.ups.enums.TipoDireccion;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean continuar=true;

        while(continuar){
            System.out.println("Seleccione una opcion; ");
            System.out.println("1. Institucion");
            System.out.println("2. Estudiante ");
            System.out.println("3. Administrador");
            System.out.println("4. Docente");
            System.out.println("5. Salir");
            switch(sc.nextInt()){
                case 1:
                    Institucion inst = new Institucion();
                    inst.setId(010101);
                    inst.setNombre("Universidad Politecnica Salesiana");
                    inst.setSede();
                    inst.setAsignacion();
                    inst.addDireccion(TipoDireccion.INSTITUCION,"Calle Vieja","Elia Liut", "12-30","Azuay","Cuenca","Ecuador");
                case 2:
                    Persona persona = new Persona();
                persona.setCedula("01010101");
                persona.setNombre("Einar");
                persona.setApellido("Kaalhus");
                persona.setTelefono("55555555");
                persona.setCorreoElectronico("einarkaalhus2809@gmail.com");
                persona.addDireccion();
            }

        }
    }
}
