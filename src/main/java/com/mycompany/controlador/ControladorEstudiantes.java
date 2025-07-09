/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.controlador;

import com.mycompany.vistas.VEstudiantes;
import com.mycompany.estudiantes.Estudiante;
import com.mycompany.estudiantes.IEstudiante;
import com.mycompany.estudiantes.Estudiantes;

/**
 *
 * @author Calavera
 */
public class ControladorEstudiantes {
    private VEstudiantes vistaEstudiantes;

    public ControladorEstudiantes(VEstudiantes vistaEstudiantes) {
        this.vistaEstudiantes = vistaEstudiantes;
    }

    public void procesoControladorEstudiantes() {
        try {
            String cedulaEstudiante = vistaEstudiantes.getCedulaEstudiante();
            String codigoEstudiante = vistaEstudiantes.getCodigoEstudiante();
            String nombreEstudiante = vistaEstudiantes.getNombreEstudiante();
            String correoPersonal = vistaEstudiantes.getCorreoPersonal();
            String correoInstitucional = vistaEstudiantes.getCorreoInstitucional();

            // Aquí puedes crear el objeto Estudiante y hacer lo que necesites
            System.out.println("Datos capturados:");
            System.out.println("Cédula: " + cedulaEstudiante);
            System.out.println("Código: " + codigoEstudiante);
            System.out.println("Nombre: " + nombreEstudiante);
            System.out.println("Correo Personal: " + correoPersonal);
            System.out.println("Correo Institucional: " + correoInstitucional);

        } catch (Exception e) {
            e.printStackTrace();
        }
    
    }
    public void agregarEstudiante() {
        String cedulaEstudiante = vistaEstudiantes.getCedulaEstudiante();
        String codigoEstudiante = vistaEstudiantes.getCodigoEstudiante();
        String nombreEstudiante = vistaEstudiantes.getNombreEstudiante();
        String correoPersonal = vistaEstudiantes.getCorreoPersonal();
        String correoInstitucional = vistaEstudiantes.getCorreoInstitucional();

        System.out.println("Agregado Estudiante");
        System.out.println("Cédula: " + cedulaEstudiante);
        System.out.println("Código: " + codigoEstudiante);
        System.out.println("Nombre: " + nombreEstudiante);
        System.out.println("Correo Personal: " + correoPersonal);
        System.out.println("Correo Institucional: " + correoInstitucional);
    }
}
 