/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sistemaacademico;

import com.mycompany.herencia.Persona;

/**
 *
 * @author Calavera
 */
public class SistemaAcademico {

    public static void main(String[] args) {
        
        System.out.println( "DATOS DEL OBJETO PERSONA");
        Persona persona = new Persona(1, "Juan Perez", "crissandres28@gmail.com", "1234567890");
        System.out.println(persona);

        System.out.println( "DATOS DEL OBJETO PERSONA INVITADA");
        Persona personaInvitada = new Persona(2, "Maria Lopez", "juanes@gmail.com", "0987654321");
        System.out.println(personaInvitada);
        

        System.out.println("DATOS DEL OBJETO DE PERSONAl INSTITUCIONAL");
        Persona personaInstitucional = new Persona(4, "Ana Torres", "ana6@gmail.com", "1122334455");
        System.out.println(personaInstitucional);
        
        System.out.println("DATOS DEL OBJETO DE EMPLEADO");
        Persona empleado = new Persona(3, "Carlos Gomez", "carlos@gmail.com", "5566778899");
        System.out.println(empleado);
    }
}
