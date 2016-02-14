/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.uia.SistemaGC.bl;

import cr.ac.uia.SistemaGC.db.Connection;
import cr.ac.uia.SistemaGC.entities.Roles;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author crisrc012
 */
public class Roles_bl {

    private Connection conn;
    private Statement st;

    public ArrayList<Roles> select(Roles roles) throws SQLException {
        ArrayList<Roles> roleslst = null;
        try {
            this.st = null;
            this.conn = new Connection();
            this.st = conn.getConnection().createStatement();
            String id = "NULL";
            String descripcion = "NULL";
            if (null != roles.getId()) {
                id = String.valueOf(roles.getId());
            }
            if (roles.getDescripcion() != null) {
                descripcion = "'" + roles.getDescripcion() + "'";
            }
            try (ResultSet rs = this.st.executeQuery(
                    "SELECT * FROM f_roles('select',"
                    + id + "," + descripcion + ");")) {
                roleslst = new ArrayList<>();
                while (rs.next()) {
                    Roles r = new Roles();
                    r.setId(rs.getInt("id"));
                    r.setDescripcion(rs.getString("descripcion"));
                    roleslst.add(r);
                }
                rs.close();
            }
        } catch (SQLException e) {
            System.out.println(e.toString());
        } finally {
            if (this.st != null) {
                this.st.close();
            }
            if (this.conn != null) {
                this.conn.close();
            }
        }
        return roleslst;
    }

    private boolean insert_update(Roles roles, String dml) throws SQLException {
        try {
            this.st = null;
            this.conn = new Connection();
            this.st = conn.getConnection().createStatement();
            String id = "NULL";
            String descripcion;
            if (dml.equals("update")) {
                id = String.valueOf(roles.getId());
            }
            if (roles.getDescripcion() == null) {
                return false;
            } else {
                descripcion = "'" + roles.getDescripcion() + "'";
            }
            this.st.executeQuery("SELECT f_roles('"
                    + dml + "'," + id + " ," + descripcion + ");");
        } catch (SQLException e) {
            return false;
        } finally {
            if (this.st != null) {
                this.st.close();
            }
            if (this.conn != null) {
                this.conn.close();
            }
        }
        return true;
    }

    public boolean insert(Roles roles) throws SQLException {
        return insert_update(roles, "insert");
    }

    public boolean update(Roles roles) throws SQLException {
        return insert_update(roles, "update");
    }

    public boolean delete(int id) throws SQLException {
        try {
            this.st = null;
            this.conn = new Connection();
            this.st = conn.getConnection().createStatement();
            this.st.executeQuery("SELECT f_roles('delete',"
                    + id + ",NULL);");
        } catch (SQLException e) {
            return false;
        } finally {
            if (this.st != null) {
                this.st.close();
            }
            if (this.conn != null) {
                this.conn.close();
            }
        }
        return true;
    }
}
