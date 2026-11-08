package com.joaquintevez.gestormaterias;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Materia m = new Materia("POO", "1");
Actividad a = new Actividad(m, "TP1", TipoActividad.TP, LocalDate.of(2026, 11, 20), "Primer trabajo práctico");
System.out.println(a);
    }
    
}
