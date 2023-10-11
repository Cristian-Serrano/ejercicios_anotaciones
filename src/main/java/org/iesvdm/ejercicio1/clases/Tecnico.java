package org.iesvdm.ejercicio1.clases;

public class Tecnico extends Operario{
    String perfil;
    public Tecnico(String nombre, String apellidos, String direccion, String dni, Integer telefono, String perfil, int codigoTaller) {
        super(nombre, apellidos, direccion, dni, telefono);
        this.perfil = perfil;
        this.codigoTaller = codigoTaller;
    }

    public String getPerfil() {
        return perfil;
    }

    public void setPerfil(String perfil) {
        this.perfil = perfil;
    }

    @Override
    public String toString() {
        return "Tecnico{" +
                "perfil='" + perfil + '\'' +
                ", codigoTaller=" + codigoTaller +
                ", nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", direccion='" + direccion + '\'' +
                ", dni='" + dni + '\'' +
                ", telefono=" + telefono +
                '}';
    }
}
