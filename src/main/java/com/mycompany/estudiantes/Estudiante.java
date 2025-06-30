package com.mycompany.estudiantes;

public class Estudiante extends PersonalAcademico {
    

    public int codigo;
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

    @Override
    public String toString() {
        return super.toString() + "\nCódigo: " + codigo;
    }
}
