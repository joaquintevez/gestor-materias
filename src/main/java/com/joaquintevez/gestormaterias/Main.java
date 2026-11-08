package com.joaquintevez.gestormaterias;

import java.sql.Connection;
import java.sql.SQLException;
///import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
         try (Connection con = ConexionBD.obtenerConexion()) {
            System.out.println("Conectado a: " + con.getCatalog());
        } catch (SQLException e) {
            System.out.println("Error de conexión: " + e.getMessage());
        }
    }
    
}
