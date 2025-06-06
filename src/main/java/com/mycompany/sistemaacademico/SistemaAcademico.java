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
        System.out.println("DATOS DEL OBJETO DE PERSONA INVITADA");

        Persona personaInvitada = new Persona(2, "Maria Lopez", "juan@gmail.com", "0987654321");
        System.out.println(personaInvitada);
    }
}
