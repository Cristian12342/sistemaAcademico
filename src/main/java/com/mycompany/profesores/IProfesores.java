package com.mycompany.profesores;

public interface IProfesores {

    public boolean agregarProfesor(Profesor profesor);

    public void imprimirDatos( );
    
    public boolean actualizarProfesor(int i, Profesor profesor);
    public boolean eliminarProfesor(int i);

}
