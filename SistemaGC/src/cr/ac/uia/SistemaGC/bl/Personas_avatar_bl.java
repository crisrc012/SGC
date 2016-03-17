/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.uia.SistemaGC.bl;

import cr.ac.uia.SistemaGC.db.Personas_avatar_db;
import cr.ac.uia.SistemaGC.entities.Personas_avatar;
import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferByte;
import java.awt.image.WritableRaster;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import javax.imageio.ImageIO;
import org.apache.commons.codec.binary.Hex;

/**
 *
 * @author crisrc012
 */
public class Personas_avatar_bl {

    private final Personas_avatar_db padb;
    
    public Personas_avatar_bl(){
        padb = new Personas_avatar_db();
    }

    public byte[] select(int cedula) throws SQLException {
        return padb.select(cedula);
    }

    private boolean insert_update(Personas_avatar personas_avatar, String dml) throws FileNotFoundException, SQLException, IOException {
        return padb.insert_update(personas_avatar.getCedula().toString(), Hex.encodeHexString(personas_avatar.getFoto()), dml);
    }

    public boolean insert(Personas_avatar personas_avatar) throws SQLException, IOException {
        return insert_update(personas_avatar, "insert");
    }

    public boolean update(Personas_avatar personas_avatar) throws SQLException, IOException {
        return insert_update(personas_avatar, "update");
    }

    // Recuperado de: http://stackoverflow.com/questions/4202244/resize-jpeg-image-in-java
    public byte[] resizeImage(String filePath) {
        int w = 320;
        int h = 240;
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
    
    public boolean delete(int cedula) throws SQLException {
        return padb.delete(cedula);
    }
}
