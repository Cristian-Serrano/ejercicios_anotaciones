package org.iesvdm.ejercicio1.clases;

import org.iesvdm.ejercicio1.anotaciones.Empleado;
import org.iesvdm.ejercicio1.anotaciones.Empleados;

import java.lang.annotation.Annotation;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Empleado(nombre = "Alfonso",
        apellidos = "Lopez Martin",
        dni = "45456565L",
        direccion = "calle farolas",
        telefono = 222222222,
        clase = "Directivo",
        codigoDespacho = 2
)
@Empleado(nombre = "Mario",
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
        empresa.getClass().getAnnotation(Empleados.class);
        Annotation[] anotaciones = empresa.getClass().getAnnotations();

        for (Annotation anotacion : anotaciones) {
            if (anotacion instanceof Empleado) {
                System.out.println(anotacion);

                String nombre = ((Empleado) anotacion).nombre();
                String apellidos = ((Empleado) anotacion).apellidos();
                String dni = ((Empleado) anotacion).dni();
                String direccion = ((Empleado) anotacion).direccion();
                int telefono = ((Empleado) anotacion).telefono();
                String clase = ((Empleado) anotacion).clase();

                empresa.getEmpleadoSet().add(new org.iesvdm.ejercicio1.clases.Empleado(nombre,apellidos,direccion,dni,telefono));
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
