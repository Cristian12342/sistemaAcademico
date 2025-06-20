
package com.mycompany.sistemaacademico;

import java.net.Socket;

import com.mycompany.profesores.Escalafon;
import com.mycompany.profesores.IProfesores;
import com.mycompany.profesores.Profesor;
import com.mycompany.profesores.Profesores;

import com.mycompany.decanos.Decano;
import com.mycompany.decanos.IDecanos;
import com.mycompany.decanos.Decanos;
/**
 *
 * @author Calavera
 */
public class SistemaAcademico {

    public static void main(String[] args) {

    System.out.println("---------------Sistema Academico-----------------");


    System.out.println("---------------Personal Academico-----------------");

    System.out.println("---------------Profesor-----------------");
        // Crear un arreglo de Profesores
        Profesor[] profesor = new Profesor[3];
        profesor[0] = new Profesor(Escalafon.PRINCIPAL, "Tiempo Completo", 1500.00, "Juan@example.edu.ec", 1, "Juan Perez", "juan.perez@gmail.com", "0102030405");
        profesor[1] = new Profesor(Escalafon.AUXILIAR, "Medio Tiempo", 1000.00, "Ana@example.edu.ec", 2, "Ana Gomez", "ana.gomez@gmail.com", "0203040506");
        profesor[2] = new Profesor(Escalafon.AUXILIAR, "Tiempo Completo", 1200.00, "Luis@example.edu.ec", 3, "Luis Martinez", "luis.martinez@gmail.com", "0304050607");

        System.out.println("Datos del Profesor:");
        IProfesores objIProfesores = new Profesores();
        objIProfesores.imprimirDatos(profesor); 


    System.out.println(" ---------------Decano-----------------");
        Decano[] decano = new Decano[1];
        decano[0] = new Decano("Principal", "Tiempo Completo", 2000.00, "perez.edu.ec", 2, "Maria Perez", "maria.perez@gmail.com", "0203040506");

        System.out.println("Datos del Decano:");
        IDecanos objIDecanos = new Decanos();
        objIDecanos.imprimirDatos(decano);

}
    
}     
