package org.iesvdm.ejercicio1.anotaciones;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
//Target dice sobre qué se puede colocar esta anotación,
// en este caso, mi anotacion es para clases unicamente
@Target(ElementType.TYPE)
public @interface EmpleadosAnotacion {
    EmpleadoAnotacion[] value();
}