package com.programacion2;

import java.time.LocalDate;
import java.time.Period;

public class Persona {
    public String nombre;
    public LocalDate fechaDeNacimiento;

    public long calcularEdad(){
        LocalDate hoy = LocalDate.now();
        Period resultado = fechaDeNacimiento.until(hoy);
        int edad = resultado.getYears();
        return edad;
    }
}
