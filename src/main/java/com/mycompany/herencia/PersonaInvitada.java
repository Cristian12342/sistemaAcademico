/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.herencia;

/**
 *
 * @author Calavera
 */
public class PersonaInvitada extends Persona {

    
        

    //METODOS
    
    public PersonaInvitada(int id, String Nombre, String correoPersonal, String cedula) {
        super(id, Nombre, correoPersonal, cedula);
    }
    public String agregarPersonaInvitada() {
        return "Persona invitada agregada: " + getNombre();
    }

    @Override
    public String toString() {
        return super.toString() + "\nTipo: Persona Invitada";
    }
    
    
}
   


    
