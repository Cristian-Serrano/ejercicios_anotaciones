package org.iesvdm.ejercicio1.clases;

import org.iesvdm.ejercicio1.anotaciones.Empleado;
import org.iesvdm.ejercicio1.anotaciones.Empleados;

@Empleado(nombre = "Alfonso",
        apellidos = "Lopez Martin",
        dni = "45456565L",
        direccion = "calle farolas",
        telefono = "668766870",
        clase = "Directivo",
        codigoDespacho = 1
)
@Empleado(nombre = "Mario",
        apellidos = "Lopez Martin",
        dni = "45456565L",
        direccion = "calle farolas",
        telefono = "668766870",
        clase = "Directivo",
        codigoDespacho = 1
)
public class Empresa {
    private String nombre;

    public static Empresa cargadorDeContexto(Empresa empresa){
        empresa.getClass().getAnnotation(Empleados.class);
        empresa.getClass().getAnnotations();
    }
}
