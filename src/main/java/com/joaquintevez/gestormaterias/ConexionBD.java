package com.joaquintevez.gestormaterias;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBD {
    private static final String URL = "jdbc:postgresql://localhost:5432/gestor_materias";

    public static Connection obtenerConexion() throws SQLException {
        String usuario = System.getenv("DB_USER");
        String password = System.getenv("DB_PASSWORD");
        return DriverManager.getConnection(URL, usuario, password);
    }
}
