/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.uia.SistemaGC.db;

import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author crisrc012
 */
public class Conexion {

    private final java.sql.Connection Connection;

    public Conexion() throws SQLException {
        this.Connection
                = DriverManager.getConnection(
                        "jdbc:postgresql://127.0.0.1:5432/dbSGC",
                        "postgres",
                        "postgres");
    }

    public java.sql.Connection getConnection() throws SQLException {
        return this.Connection;
    }

    public void close() throws SQLException {
        this.Connection.close();
    }
}
