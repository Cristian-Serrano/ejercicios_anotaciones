package org.iesvdm.ejercicio1.clases;

import org.iesvdm.ejercicio1.anotaciones.EmpleadoAnotacion;
import org.iesvdm.ejercicio1.anotaciones.EmpleadosAnotacion;

import java.lang.annotation.Annotation;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author cristian-serrano
 */
//Ambas formas de poner esta anotacion son equivalentes
/*@EmpleadosAnotacion({@EmpleadoAnotacion(nombre = "Fernando Gonzalo",
        apellidos = "Fernandez Gonzalez",
        dni = "12345432G",
        direccion = "calle Luis Neruda",
        telefono = 333333333,
        clase = "Tecnico",
        //El codigo de despacho es siempre 0 a no ser que sea de clase directivo
        perfil = "Devops",
        codigoTaller = 3
)
@EmpleadoAnotacion(nombre = "Alfonso",
        apellidos = "Lopez Martin",
        dni = "45456565L",
        direccion = "calle Pio Baroja",
        telefono = 222222222,
        clase = "Oficial",
        categoria = "horario de tarde",
        codigoTaller = 1
)
@EmpleadoAnotacion(nombre = "Mario",
        apellidos = "Romero Ramiro",
        dni = "1111111L",
        direccion = "calle farolas",
        telefono = 111111111,
        clase = "Directivo",
        codigoDespacho = 1
)})*/
@EmpleadoAnotacion(nombre = "Fernando Gonzalo",
        apellidos = "Fernandez Gonzalez",
        dni = "12345432G",
        direccion = "calle Luis Neruda",
        telefono = 333333333,
        clase = "Tecnico",
        //El codigo de despacho es siempre 0 a no ser que sea de clase directivo
        perfil = "Devops",
        codigoTaller = 3
)
@EmpleadoAnotacion(nombre = "Alfonso",
        apellidos = "Lopez Martin",
        dni = "45456565L",
        direccion = "calle Pio Baroja",
        telefono = 222222222,
        clase = "Oficial",
        categoria = "horario de tarde",
        codigoTaller = 1
)
@EmpleadoAnotacion(nombre = "Mario",
        apellidos = "Romero Ramiro",
        dni = "1111111L",
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

    /**
     * Se crea un objeto por cada empleado pasado por anotación
     * @param empresa
     */
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
            int codigoDespacho = empleadoAnotacionHija.codigoDespacho();
            int codigoTaller = empleadoAnotacionHija.codigoTaller();
            String categoria = empleadoAnotacionHija.categoria();
            String perfil = empleadoAnotacionHija.perfil();

            if (clase.equals("Oficial")) {
                empresa.getEmpleadoSet().add(new Oficial(nombre,apellidos,direccion,dni,telefono,categoria,codigoTaller));
            } else if (clase.equals("Directivo")) {
                empresa.getEmpleadoSet().add(new Directivo(nombre,apellidos,direccion,dni,telefono,codigoDespacho));
            } else if (clase.equals("Tecnico")) {
                empresa.getEmpleadoSet().add(new Tecnico(nombre,apellidos,direccion,dni,telefono,perfil,codigoDespacho));
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
