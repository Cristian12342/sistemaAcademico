package com.mycompany.personalacademico;

import com.mycompany.empleado.Empleado;

public class PersonalAcademico extends Empleado{

    private String dedicacion;


    // Constructor
     public PersonalAcademico(String dedicacion, double sueldo, String correoInstitucional, int id, String nombre, String correoPersonal, String cedula) {
        super(sueldo, correoInstitucional, id, nombre, correoPersonal, cedula);
        this.dedicacion = dedicacion;
    }

    @Override
    public String toString() {
        return "PersonalAcademico{" + super.toString() + "dedicacion='" + dedicacion + '\'' + '}';
    }
}