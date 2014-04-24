/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oima.project.DDDProperty.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Jesus
 */
public class Archivos {

    public byte[] fileToBytes(File file) throws Exception {
        FileInputStream fin = new FileInputStream(file);
        byte fileContent[] = new byte[(int) file.length()];
        fin.read(fileContent);
        fin.close();
        return fileContent;
    }

    public void bytesToFile(byte[] bytes, String ruta) throws Exception {
        File file = new File(ruta);
        FileOutputStream fos = new FileOutputStream(ruta);
        fos.write(bytes);
        fos.close();
    }

}
