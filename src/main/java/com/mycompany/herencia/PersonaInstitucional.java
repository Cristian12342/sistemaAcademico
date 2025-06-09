
package com.mycompany.herencia;


public class PersonaInstitucional {
    
    
    private String correoInstitucional;


    //Constructor
    public PersonaInstitucional(String correoInstitucional) {
        this.correoInstitucional = correoInstitucional;
    }
    
    

    public String getCorreoInstitucional() {
        return correoInstitucional;
    }
    public void setCorreoInstitucional(String correoInstitucional) {
        this.correoInstitucional = correoInstitucional;
    }

    public String agregarCorreoInstitucional() {
        return "Correo institucional agregado: " + correoInstitucional;
    }

    @Override
    public String toString() {
        return super.toString() +"\nCorreo Institucional: " + correoInstitucional;
    }
}
