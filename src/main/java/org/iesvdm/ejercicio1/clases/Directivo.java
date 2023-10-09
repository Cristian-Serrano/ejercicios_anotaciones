package org.iesvdm.ejercicio1.clases;

public class Directivo extends Empleado {
    public Integer codigoDespacho;

    public Directivo(String nombre, String apellidos, String direccion, String dni, Integer telefono, Integer codigoDespacho) {
        super(nombre, apellidos, direccion, dni, telefono);
        this.codigoDespacho = codigoDespacho;
    }

    public Directivo(Integer codigoDespacho) {
        this.codigoDespacho = codigoDespacho;
    }
}
