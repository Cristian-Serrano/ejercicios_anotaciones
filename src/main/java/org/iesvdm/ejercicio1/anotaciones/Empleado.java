package org.iesvdm.ejercicio1.anotaciones;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Repeatable(Empleados.class)
public @interface Empleado {
    String nombre();
    String apellidos();
    String dni();
    String direccion();
    String telefono();
    String clase();
    int codigoDespacho();
}
