package com.mycompany.herencia;

public class Estudiante {
    

    private int codigo;
//constructor
    public Estudiante(int codigo) {
        this.codigo = codigo;
    }

    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String agregarEstudiante() {
        return "Estudiante agregado con código: " + codigo;
    }

    @Override
    public String toString() {
        return super.toString() + "\nCódigo: " + codigo;
    }
}
