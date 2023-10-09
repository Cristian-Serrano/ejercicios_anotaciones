package org.iesvdm.ejercicio1.anotaciones;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface Empleados {
    Empleado[] value();
}