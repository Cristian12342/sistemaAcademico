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
    
    private  int id;
    private String Nombre;
    private String correoPersonal;
    private String cedula;

    public Persona(int id, String Nombre, String correoPersonal, String cedula) {
        this.id = id;
        this.Nombre = Nombre;
        this.correoPersonal = correoPersonal;
        this.cedula = cedula;
    }
    
    public int getid(){
    return id;
    
}
    public void setid(int id ){
        
        this.id = id;
    }

    public  String getNombre() {
    return Nombre;          
    }

    public void  setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getCorreoPersonal() {
        return correoPersonal;
    }       

    public String agregarCorreoPersonal() {
        return "Persona agregada :"+Nombre;
    }

    public void setCorreoPersonal(String correoPersonal) {
        this.correoPersonal = correoPersonal;
    }
    public String getCedula() {
        return cedula;
    }
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }
    public String agregarPersona() {
        return "Persona agregada: " + Nombre;
    }
    //Agregar Persona

    @Override
    public String toString() {
        return "ID=" + id + 
               "\nNombre =" + Nombre + 
               "\ncorreoPersonal=" + correoPersonal + 
               "\ncedula=" + cedula;
    }
    
}






    
   
    
    

