
package com.mycompany.personasinstitucionales;

import com.mycompany.personas.Persona;

public abstract class PersonaInstitucional extends Persona {
    
    
    private String correoInstitucional;

    // Constructor


     public PersonaInstitucional(String correoInstitucional, int id, String nombre, String correoPersonal, String cedula) {
        super(id, nombre, correoPersonal, cedula);
        this.correoInstitucional = correoInstitucional;
    }
    @Override
    public String toString() {
        return "PersonaInstitucional{" + super.toString() + "correoInstitucional='" + correoInstitucional + '\'' + '}';
    }

    //public abstract boolean verificarCedula();

   
}
