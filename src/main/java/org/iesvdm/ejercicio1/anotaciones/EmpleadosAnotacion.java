package org.iesvdm.ejercicio1.anotaciones;

import java.lang.annotation.*;

//Esta meta-anotacion, al ponerla, hace que la anotación pueda ser accedida mediante
// reflexión mientras el programa se está ejecutando
@Retention(RetentionPolicy.RUNTIME)
//Target dice sobre qué se puede colocar esta anotación,
// en este caso, mi anotacion es para clases unicamente
@Target(ElementType.TYPE)
public @interface EmpleadosAnotacion {
    EmpleadoAnotacion[] value();
}