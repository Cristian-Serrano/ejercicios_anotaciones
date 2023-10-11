package org.iesvdm.ejercicio1;

import org.iesvdm.ejercicio1.clases.Empleado;
import org.iesvdm.ejercicio1.clases.Empresa;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashSet;

public class EmpresaTest {
    /**
     * Compruebo que los empleados de las anotaciones de empresa están realmente en el hashset
     * y tienen los atributos corresctos, etc.
     */
    @Test
    public void testProcesadorDeContexto(){
        Empresa empresa = new Empresa();
        Empresa.cargadorDeContexto(empresa);

        String esperado = "Empresa{nombre='null', empleadoSet=[Oficial{categoria='horario de tarde', codigoTaller=1, nombre='Alfonso', apellidos='Lopez Martin', direccion='calle Pio Baroja', dni='45456565L', telefono=222222222}, Tecnico{perfil='Devops', codigoTaller=0, nombre='Fernando Gonzalo', apellidos='Fernandez Gonzalez', direccion='calle Luis Neruda', dni='12345432G', telefono=333333333}, Directivo{nombre='Mario', apellidos='Romero Ramiro', direccion='calle farolas', dni='1111111L', telefono=111111111}]}";

        Assertions.assertEquals(esperado,empresa.toString());
    }
}
