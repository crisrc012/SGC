/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.uia.SistemaGC.bl;

import cr.ac.uia.SistemaGC.db.Connection;
import cr.ac.uia.SistemaGC.entities.Personas_avatar;
import cr.ac.uia.SistemaGC.entities.Precio;
import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferByte;
import java.awt.image.WritableRaster;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.imageio.ImageIO;
import org.apache.commons.codec.binary.Hex;

/**
 *
 * @author crobles
 */
public class Personas_avatar_bl {

    private Connection conn;
    private Statement st;

    public byte[] select(int cedula) throws SQLException {
        byte[] foto;
        try {
            this.st = null;
            this.conn = new Connection();
            this.st = conn.getConnection().createStatement();
            String Cedula = String.valueOf(cedula);
            try (ResultSet rs = this.st.executeQuery(
                    "SELECT foto FROM tbl_personas_avatar WHERE cedula = " + cedula)) {
                foto = rs.getBytes("foto");
                rs.close();
            }
        } catch (SQLException e) {
            System.out.println(e.toString());
            return null;
        } finally {
            if (this.st != null) {
                this.st.close();
            }
            if (this.conn != null) {
                this.conn.close();
            }
        }
        return foto;
    }

    private boolean insert_update(Personas_avatar personas_avatar, String dml) throws FileNotFoundException, SQLException, IOException {
        try {
            conn = new Connection();
            this.st = conn.getConnection().createStatement();
            String query = null;
            if (null != dml) {
                switch (dml) {
                    case "insert":
                        query = "insert into tbl_personas_avatar values ("
                                + personas_avatar.getCedula()
                                + ", "
                                + Hex.encodeHexString(personas_avatar.getFoto()) + ";";
                        break;
                    case "update":
                        query = "update tbl_personas_avatar set foto="
                                + Hex.encodeHexString(personas_avatar.getFoto())
                                + "where cedula=" + personas_avatar.getCedula() + ";";
                        break;
                    default:
                        return false;
                }
            }
            this.st.executeQuery(query);
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

    public boolean insert(Personas_avatar personas_avatar) throws SQLException, IOException {
        return insert_update(personas_avatar, "insert");
    }

    public boolean update(Personas_avatar personas_avatar) throws SQLException, IOException {
        return insert_update(personas_avatar, "update");
    }

    // Recuperado de: http://stackoverflow.com/questions/4202244/resize-jpeg-image-in-java
    public byte[] resizeImage(String filePath) {
        int w = 600;
        int h = 600;
        String data = filePath;
        BufferedImage bsrc, bdest;
        try {
            bsrc = ImageIO.read(new File(data));
            bdest = new BufferedImage(w, h, BufferedImage.TYPE_INT_RGB);
            Graphics2D g = bdest.createGraphics();
            AffineTransform at = AffineTransform.getScaleInstance((double) w / bsrc.getWidth(),
                    (double) h / bsrc.getHeight());
            g.drawRenderedImage(bsrc, at);
            // Convirtiendo a byte
            // get DataBufferBytes from Raster
            WritableRaster raster = bsrc.getRaster();
            DataBufferByte dbd = (DataBufferByte) raster.getDataBuffer();
            return (dbd.getData());
        } catch (Exception e) {
            System.out.println("This image can not be resized. Please check the path and type of file.");
            return null;
        }
    }

    public boolean delete(int id) throws SQLException {
        try {
            this.conn = new Connection();
            this.st = conn.getConnection().createStatement();
            this.st.executeQuery("");
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
