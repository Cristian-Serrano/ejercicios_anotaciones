package org.iesvdm.ejercicio1.clases;

public class Oficial extends Operario{
    public String categoria;

    public Oficial(String nombre, String apellidos, String direccion, String dni, Integer telefono) {
        super(nombre, apellidos, direccion, dni, telefono);
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
}
