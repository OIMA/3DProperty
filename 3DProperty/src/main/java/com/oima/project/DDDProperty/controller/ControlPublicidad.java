/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oima.project.DDDProperty.controller;

import com.oima.project.DDDProperty.model.dto.Publicidad;
import com.oima.project.DDDProperty.utilities.Archivos;
import com.oima.project.DDDProperty.utilities.Controller;
import static com.opensymphony.xwork2.Action.SUCCESS;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.apache.commons.io.FileUtils;
import org.apache.struts2.interceptor.ServletRequestAware;

/**
 *
 * @author OIMA
 */
public class ControlPublicidad extends Controller implements ServletRequestAware {

    private Publicidad publicidad;
    private List<Publicidad> listaPublicidad;
    private Long idPublicidad;
    private File archivoPublicidad;
    private String archivoPublicidadFileName;
    private HttpServletRequest servletRequest;

    /**
     * Se debe de cambiar la ruta "images/"
     *
     * @return
     * @throws Exception
     */
    public String guardar() throws Exception {
        Date date = new Date();
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd-G-HH-mm-ss");
        String nombreSinExtension = archivoPublicidadFileName.substring(0, archivoPublicidadFileName.lastIndexOf("."));
        nombreSinExtension = nombreSinExtension.replace(" ", "_");
        String extension = archivoPublicidadFileName.substring(archivoPublicidadFileName.lastIndexOf("."),archivoPublicidadFileName.length());
        archivoPublicidadFileName = nombreSinExtension+sdf.format(date)+extension;
        
        System.out.println("Se obtuvo este archivo: " + archivoPublicidad.getName());
        System.out.println("Con ruta: " + archivoPublicidad.getAbsolutePath());
        String webPath = servletRequest.getSession().getServletContext().getRealPath("/");
        String filePath = "C:/Archivos";
        archivoPublicidadFileName = "publicidades/" + archivoPublicidadFileName;

        File fileToCreate = new File(webPath, archivoPublicidadFileName);

        FileUtils.copyFile(archivoPublicidad, fileToCreate);

        fileToCreate = new File(filePath, archivoPublicidadFileName);

        FileUtils.copyFile(archivoPublicidad, fileToCreate);
        System.out.println("La nueva ruta es: " + fileToCreate.getAbsolutePath());

        publicidad.setRuta(archivoPublicidadFileName);
        publicidad.setStatus(Boolean.TRUE);
        servicioPublicidad.guardar(publicidad);
        System.out.println("Se guardo?");

        consultarTodos();
        return SUCCESS;
    }

    public String eliminar() throws Exception {
        servicioPublicidad.eliminar(idPublicidad);
        return SUCCESS;
    }

    public String editar() throws Exception {
        String filePath = servletRequest.getSession().getServletContext().getRealPath("/");
        archivoPublicidadFileName = "images/" + archivoPublicidadFileName;

        File fileToCreate = new File(filePath, archivoPublicidadFileName);

        FileUtils.copyFile(archivoPublicidad, fileToCreate);
        System.out.println("La nueva ruta es: " + fileToCreate.getAbsolutePath());

        publicidad.setRuta(archivoPublicidadFileName);
        publicidad.setStatus(Boolean.TRUE);
        servicioPublicidad.editar(publicidad);
        return SUCCESS;
    }

    public String consultarTodos() throws Exception {
        listaPublicidad = servicioPublicidad.consultarTodos(Publicidad.class);
        return SUCCESS;
    }

    public String consultarUnico() throws Exception {
        publicidad = (Publicidad) servicioPublicidad.consultarUnico(idPublicidad);
        String filePath = "C:/Archivos";
        String webPath = servletRequest.getSession().getServletContext().getRealPath("/");

        File fileToCreate = new File(webPath, publicidad.getRuta());
        if (!fileToCreate.exists()) {
            File fileToOpen = new File(filePath, publicidad.getRuta());
            FileUtils.copyFile(fileToOpen, fileToCreate);
            System.out.println("Rutal archivo abierto" + fileToOpen.getAbsolutePath());
            System.out.println("Rutal archivo creado" + fileToCreate.getAbsolutePath());
        } else{
             System.out.println("El archivo ya existe en web, no sera creado");
        }
        archivoPublicidadFileName = publicidad.getRuta();
        consultarTodos();
        return SUCCESS;
    }

    public Publicidad getPublicidad() {
        return publicidad;
    }

    public void setPublicidad(Publicidad publicidad) {
        this.publicidad = publicidad;
    }

    public List<Publicidad> getListaPublicidad() {
        return listaPublicidad;
    }

    public void setListaPublicidad(List<Publicidad> listaPublicidad) {
        this.listaPublicidad = listaPublicidad;
    }

    public Long getIdPublicidad() {
        return idPublicidad;
    }

    public void setIdPublicidad(Long idPublicidad) {
        this.idPublicidad = idPublicidad;
    }

    /**
     * @return the archivoPublicidad
     */
    public File getArchivoPublicidad() {
        return archivoPublicidad;
    }

    /**
     * @param archivoPublicidad the archivoPublicidad to set
     */
    public void setArchivoPublicidad(File archivoPublicidad) {
        this.archivoPublicidad = archivoPublicidad;
    }

    /**
     * @return the archivoPublicidadFileName
     */
    public String getArchivoPublicidadFileName() {
        return archivoPublicidadFileName;
    }

    /**
     * @param archivoPublicidadFileName the archivoPublicidadFileName to set
     */
    public void setArchivoPublicidadFileName(String archivoPublicidadFileName) {
        this.archivoPublicidadFileName = archivoPublicidadFileName;
    }

    public void setServletRequest(HttpServletRequest servletRequest) {
        this.servletRequest = servletRequest;
    }
}
