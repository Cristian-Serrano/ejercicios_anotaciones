package org.iesvdm.ejercicio1.clases;

public class Oficial extends Operario{
    public String categoria;

    public Oficial(String nombre, String apellidos, String direccion, String dni, Integer telefono, String categoria, int codigoTaller) {
        super(nombre, apellidos, direccion, dni, telefono);
        this.categoria = categoria;
        this.codigoTaller = codigoTaller;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "Oficial{" +
                "categoria='" + categoria + '\'' +
                ", codigoTaller=" + codigoTaller +
                ", nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", direccion='" + direccion + '\'' +
                ", dni='" + dni + '\'' +
                ", telefono=" + telefono +
                '}';
    }
}
