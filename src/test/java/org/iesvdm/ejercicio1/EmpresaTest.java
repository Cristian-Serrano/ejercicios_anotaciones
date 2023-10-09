package org.iesvdm.ejercicio1;

import org.iesvdm.ejercicio1.clases.Empleado;
import org.iesvdm.ejercicio1.clases.Empresa;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashSet;

public class EmpresaTest {
    @Test
    public void testProcesadorDeContexto(){
        Empresa empresa = new Empresa();
        Empresa.cargadorDeContexto(empresa);

        HashSet<Empleado> empleadoSet = new HashSet<>();
        empleadoSet.add(new Empleado());

        Assertions.assertEquals();
    }
}
