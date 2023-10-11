package org.iesvdm.ejercicio1.anotaciones;

import java.lang.annotation.*;

//Esta meta-anotacion, al ponerla, hace que la anotación pueda ser accedida mediante
// reflexión mientras el programa se está ejecutando
@Retention(RetentionPolicy.RUNTIME)
//Target dice sobre qué se puede colocar esta anotación,
// en este caso, mi anotacion es para clases unicamente
@Target(ElementType.TYPE)
//Esta meta-anotacion Repetable indica que se puede poner varias veces
//antes de una misma clase. Para eso es necesario crear una anotacion
//que contenga un array de esta que estoy creando.
@Repeatable(EmpleadosAnotacion.class)
public @interface EmpleadoAnotacion {
    String nombre();
    String apellidos();
    String dni();
    String direccion();
    int telefono();
    String clase();
    //El codigo de despacho es siempre 0 a no ser que sea de clase directivo
    int codigoDespacho() default 0;
    int codigoTaller() default 0;
    String categoria() default "";
    String perfil() default "";
}
