package com.mycompany.decanos;

public class Decanos implements IDecanos {

    /*public boolean verificarCedula() {
        
        return true; 
    }*/

    public String agregarDecano() {
        return "";           
    }
    
    public void imprimirDatos(Decano[] decano) {
       
        for (int i = 0; i < decano.length; i++) {
            System.out.println("Los Datos del Decano: " + decano[i]);
        }
        System.out.println("-----------------------------");
    }

}
