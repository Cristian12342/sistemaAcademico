package com.mycompany.profesores;

public class Profesores implements IProfesores {
 public String agregarProfesor() {
        return "";
    }

    /*public boolean verificarCedula(String cedula) {
        
        return true;
    }*/
    
    public void imprimirDatos(Profesor[] profesor) {

        for(int i = 0; i < profesor.length; i++) {
            System.out.println("Los Datos de los Profesor :" +profesor[i]   );
        }
        System.out.println("-----------------------------");
    }

}
