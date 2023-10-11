package org.iesvdm.ejercicio1.clases;

public class Operario extends Empleado{
    public Integer codigoTaller;

    public Operario(String nombre, String apellidos, String direccion, String dni, Integer telefono) {
        super(nombre, apellidos, direccion, dni, telefono);
    }

    public Operario(Integer codigoTaller) {
        this.codigoTaller = codigoTaller;
    }

    public Integer getCodigoTaller() {
        return codigoTaller;
    }

    public void setCodigoTaller(Integer codigoTaller) {
        this.codigoTaller = codigoTaller;
    }
}
