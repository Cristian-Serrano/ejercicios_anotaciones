package org.iesvdm.ejercicio1.clases;

public class Operario extends Empleado{
    public Integer codigoTaller;

    public Operario(String nombre, String apellidos, String direccion, String dni, Integer telefono, Integer codigoTaller) {
        super(nombre, apellidos, direccion, dni, telefono);
        this.codigoTaller = codigoTaller;
    }

    public Operario(Integer codigoTaller) {
        this.codigoTaller = codigoTaller;
    }
}
