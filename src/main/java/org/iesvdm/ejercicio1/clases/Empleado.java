package org.iesvdm.ejercicio1.clases;

import org.iesvdm.ejercicio1.anotaciones.Empleados;

public class Empleado {
    String nombre;
    String apellidos;
    String direccion;
    String dni;
    Integer telefono;

    public Empleado(String nombre, String apellidos, String direccion, String dni, Integer telefono) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.dni = dni;
        this.telefono = telefono;
    }

    public Empleado()
    {
    }
}
