/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.herencia;


/**
 *
 * @author Calavera
 */
public class Persona {
    
    public  int id;
    public String Nombre;
    public String correoPersonal;
    public String cedula;

    public Persona(int id, String Nombre, String correoPersonal, String cedula) {
        this.id = id;
        this.Nombre = Nombre;
        this.correoPersonal = correoPersonal;
        this.cedula = cedula;
    }
    
    public int getid(){
    return id;
    
}
    public int setid(){
        
        return this.id;
    }

    public
    String getNombre() {
    return Nombre;          
    }

    public void  setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getCorreoPersonal() {
        return correoPersonal;
    }       

    //Agregar Persona



}
    
   
    
    

