package com.mycompany.profesores;

import com.mycompany.decanos.Decano;

public class Profesores implements IProfesores {
 
    private Profesor[] profesores;
    private int totalProfesores;

    public Profesores (int dimension) {
        
        profesores = new Profesor [dimension];
        totalProfesores = 0;

    }
    
    public boolean agregarProfesor(Profesor profesor) {
        if (totalProfesores == profesores.length) {
            System.out.println("No se puede agregar más decanos, el arreglo está lleno.");
            return false;
        }else {
            profesores[totalProfesores] = profesor;
            totalProfesores = totalProfesores + 1;  
            return true;
        }
    }

    public void imprimirDatos() {
        for (int i = 0; i < totalProfesores; i++) {
            if (profesores[i] != null) {
                System.out.println(profesores[i].toString());
            }
        }
    }

    public boolean actualizarProfesor(int i, Profesor profesor) {
         profesores [i]= profesor;
         return true;

    }
    public boolean eliminarProfesor(int i) {
        profesores[i] = null;
        return true;
    }
    

    
}
