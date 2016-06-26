/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.uia.SistemaGC.db;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 *
 * @author crisrc012
 */
public class Conexion {

    private final java.sql.Connection Connection;

    public Conexion() throws IOException, SQLException {
        try{
            Class.forName("org.postgresql.Driver");
        } catch(ClassNotFoundException e){
            e.printStackTrace();
         System.err.println(e.getClass().getName()+": "+e.getMessage());
         System.exit(0);
        }
        Properties prop = new Properties();
        prop.load(new FileInputStream("src/cr/ac/uia/SistemaGC/conf/db.properties"));
        Connection
                = DriverManager.getConnection(
                        "jdbc:postgresql://"
                        + prop.getProperty("Servidor") + "/"
                        + prop.getProperty("BD"),
                        prop.getProperty("Usuario"),
                        prop.getProperty("Clave"));
    }

    public java.sql.Connection getConnection() throws SQLException {
        return this.Connection;
    }

    public void close() throws SQLException {
        if (this.Connection != null) {
            this.Connection.close();
        }
    }
}
