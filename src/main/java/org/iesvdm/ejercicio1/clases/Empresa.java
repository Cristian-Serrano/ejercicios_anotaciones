package org.iesvdm.ejercicio1.clases;

import org.iesvdm.ejercicio1.anotaciones.EmpleadoAnotacion;
import org.iesvdm.ejercicio1.anotaciones.EmpleadosAnotacion;

import java.lang.annotation.Annotation;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@EmpleadoAnotacion(nombre = "Alfonso",
        apellidos = "Lopez Martin",
        dni = "45456565L",
        direccion = "calle farolas",
        telefono = 222222222,
        clase = "Directivo",
        codigoDespacho = 2
)
@EmpleadoAnotacion(nombre = "Mario",
        apellidos = "Romero Ramiro",
        dni = "45456565L",
        direccion = "calle farolas",
        telefono = 111111111,
        clase = "Directivo",
        codigoDespacho = 1
)
public class Empresa {
    private String nombre;

    private Set<org.iesvdm.ejercicio1.clases.Empleado> empleadoSet = new HashSet<>();

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Set<org.iesvdm.ejercicio1.clases.Empleado> getEmpleadoSet() {
        return empleadoSet;
    }

    public void setEmpleadoSet(Set<org.iesvdm.ejercicio1.clases.Empleado> empleadoSet) {
        this.empleadoSet = empleadoSet;
    }

    public static void cargadorDeContexto(Empresa empresa) {
        EmpleadosAnotacion empleadosAnotacionPadre = empresa.getClass().getAnnotation(EmpleadosAnotacion.class);
        EmpleadoAnotacion[] empleadoAnotacionHijas = empleadosAnotacionPadre.value();

        for (EmpleadoAnotacion empleadoAnotacionHija : empleadoAnotacionHijas) {
            System.out.println(empleadoAnotacionHija);
            String nombre = empleadoAnotacionHija.nombre();
            String apellidos = empleadoAnotacionHija.apellidos();
            String dni = empleadoAnotacionHija.dni();
            String direccion = empleadoAnotacionHija.direccion();
            int telefono = empleadoAnotacionHija.telefono();
            String clase = empleadoAnotacionHija.clase();
            int codigoDespacho = empleadoAnotacionHija.codigoDespacho   ();

            if (clase.equals("Oficial")) {
                empresa.getEmpleadoSet().add(new Oficial(nombre,apellidos,direccion,dni,telefono));
            } else if (clase.equals("Directivo")) {
                empresa.getEmpleadoSet().add(new Directivo(nombre,apellidos,direccion,dni,telefono,codigoDespacho));
            }
            }

    }

    @Override
    public String  toString() {
        return "Empresa{" +
                "nombre='" + nombre + '\'' +
                ", empleadoSet=" + empleadoSet +
                '}';
    }
}
