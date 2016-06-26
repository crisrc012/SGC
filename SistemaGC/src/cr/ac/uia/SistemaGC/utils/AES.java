/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.uia.SistemaGC.utils;

import java.io.UnsupportedEncodingException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.apache.commons.codec.binary.Base64;

/**
 *
 * @author crisrc012 Inspirado en:
 * http://stackoverflow.com/questions/15554296/simple-java-aes-encrypt-decrypt-example
 */
public class AES {

    private static String fitString(String str, Integer i) {
        // Se encarga de que el string se ajuste al largo necesario
        if (str.length() < i) {
            return fitString(str += str, i);
        } else {
            return str.substring(0, i);
        }
    }

    public static String encrypt(Long cedula, String usuario, String contrasena) {
        //<editor-fold defaultstate="collapsed" desc="Método para cifrar contraseñas">
        /*
        * Inspirado en:
        * http://stackoverflow.com/questions/15554296/simple-java-aes-encrypt-decrypt-example
         */
        try {
            IvParameterSpec iv = new IvParameterSpec(fitString(usuario, 16).getBytes("UTF-8"));
            SecretKeySpec skeySpec = new SecretKeySpec(fitString(cedula.toString(), 16).getBytes("UTF-8"), "AES");
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5PADDING");
            cipher.init(Cipher.ENCRYPT_MODE, skeySpec, iv);
            byte[] encrypted = cipher.doFinal(contrasena.getBytes());
            return Base64.encodeBase64String(encrypted);
        } catch (UnsupportedEncodingException | NoSuchAlgorithmException | NoSuchPaddingException | InvalidKeyException | InvalidAlgorithmParameterException | IllegalBlockSizeException | BadPaddingException e) {
            e.printStackTrace();
         System.err.println(e.getClass().getName()+": "+e.getMessage());
         System.exit(0);
        }
        return null;
        //</editor-fold>
    }
    
    //<editor-fold defaultstate="collapsed" desc="Método para descifrar las contraseñas">
//    public static String decrypt(String key, String initVector, String encrypted) {
//        try {
//            IvParameterSpec iv = new IvParameterSpec(fitString(initVector, 16).getBytes("UTF-8"));
//            SecretKeySpec skeySpec = new SecretKeySpec(fitString(key, 16).getBytes("UTF-8"), "AES");
//            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5PADDING");
//            cipher.init(Cipher.DECRYPT_MODE, skeySpec, iv);
//            byte[] original = cipher.doFinal(Base64.decodeBase64(encrypted));
//            return new String(original);
//        } catch (UnsupportedEncodingException | NoSuchAlgorithmException | NoSuchPaddingException | InvalidKeyException | InvalidAlgorithmParameterException | IllegalBlockSizeException | BadPaddingException e) {
//            e.printStackTrace();
//            System.err.println(e.getClass().getName()+": "+e.getMessage());
//            System.exit(0);
//        }
//        return null;
//    }
    //</editor-fold>
}
