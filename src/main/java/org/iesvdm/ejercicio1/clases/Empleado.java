package org.iesvdm.ejercicio1.clases;

import java.util.Objects;
public abstract class Empleado {
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

    /**
     * Dos empleados son iguales si tienen el mismo DNI
     * @param o
     * @return
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Empleado empleado)) return false;
        return Objects.equals(getDni(), empleado.getDni());
    }

    /**
     * Dos empleados son iguales si tienen el mismo DNI
     * @return
     */
    @Override
    public int hashCode() {
        return Objects.hash(getDni());
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public Integer getTelefono() {
        return telefono;
    }

    public void setTelefono(Integer telefono) {
        this.telefono = telefono;
    }
}
