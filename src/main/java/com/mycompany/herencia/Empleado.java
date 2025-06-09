package com.mycompany.herencia;

public class Empleado {

private double sueldo;



// Constructor
public Empleado(double sueldo) {
    
    this.sueldo = sueldo;
}

public String agregarEmpleado() {
    return "Empleado agregado con sueldo: " + sueldo;
}

@Override
public String toString() {
    return super.toString() + "\nSueldo: " + sueldo;
}
}
