package org.iesvdm.ejercicio1.anotaciones;

import java.lang.annotation.Inherited;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@Inherited
@Repeatable()
public @interface Empleado {
    String nombre();
    String apellidos();
    String dni();
    String direccion();
    String telefono();
    String clase();
    int codigoDespacho();
}
