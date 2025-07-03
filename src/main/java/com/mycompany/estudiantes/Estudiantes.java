package com.mycompany.estudiantes;

public class Estudiantes implements IEstudiante {

    @Override
    public String agregarEstudiante() {
        System.out.println("Estudiante agregado.");
        return "Estudiante agregado.";
    }

    @Override
    public boolean mostrarEstudiante() {
        System.out.println("Mostrando estudiante.");
        return true;
    }

    @Override
    public boolean eliminarEstudiante() {
        System.out.println("Estudiante eliminado.");
        return true;
    }

    @Override
    public boolean buscarEstudiante() {
        System.out.println("Buscando estudiante.");
        return true;
    }
}
