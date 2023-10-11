package org.iesvdm.ejercicio1.clases;

public class Tecnico extends Operario{
    String perfil;

    public Tecnico(String nombre, String apellidos, String direccion, String dni, Integer telefono) {
        super(nombre, apellidos, direccion, dni, telefono);
    }

    public String getPerfil() {
        return perfil;
    }

    public void setPerfil(String perfil) {
        this.perfil = perfil;
    }
}
