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
     * @return
     * @throws Exception 
     */
    public String guardar() throws Exception {
        
        System.out.println("Se obtuvo este archivo: " + archivoPublicidad.getName());
        System.out.println("Con ruta: " + archivoPublicidad.getAbsolutePath());
        
        String filePath = servletRequest.getSession().getServletContext().getRealPath("/");
        archivoPublicidadFileName="images/"+archivoPublicidadFileName;
        
        File fileToCreate = new File(filePath, archivoPublicidadFileName);

        FileUtils.copyFile(archivoPublicidad, fileToCreate);
        System.out.println("La nueva ruta es: " + fileToCreate.getAbsolutePath());
        
        Archivos archivos = new Archivos();
        publicidad.setRuta(archivoPublicidadFileName);
        publicidad.setArchivo(archivos.fileToBytes(archivoPublicidad));
        publicidad.setStatus(Boolean.TRUE);
        servicioPublicidad.guardar(publicidad);
        
        
        consultarTodos();
        return SUCCESS;
    }

    public String eliminar() throws Exception {
        servicioPublicidad.eliminar(idPublicidad);
        return SUCCESS;
    }

    public String editar() throws Exception {
        String filePath = servletRequest.getSession().getServletContext().getRealPath("/");
        archivoPublicidadFileName="images/"+archivoPublicidadFileName;
        
        File fileToCreate = new File(filePath, archivoPublicidadFileName);

        FileUtils.copyFile(archivoPublicidad, fileToCreate);
        System.out.println("La nueva ruta es: " + fileToCreate.getAbsolutePath());
        
        Archivos archivos = new Archivos();
        publicidad.setRuta(archivoPublicidadFileName);
        publicidad.setArchivo(archivos.fileToBytes(archivoPublicidad));
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
        Archivos archivos = new Archivos();
        String filePath = servletRequest.getSession().getServletContext().getRealPath("/");
        System.out.println("Ruta de archivo:"+publicidad.getRuta());
        archivos.bytesToFile(publicidad.getArchivo(), filePath+"/"+publicidad.getRuta());
        archivoPublicidadFileName=publicidad.getRuta();
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
