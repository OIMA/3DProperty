/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oima.project.DDDProperty.controller;

import com.oima.project.DDDProperty.model.dto.Disenio;
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
public class ControlDisenio extends Controller implements ServletRequestAware {

    private Disenio disenio;
    private List<Disenio> listaDisenio;
    private Long idDisenio;
    private File archivoDisenio;
    private String archivoDisenioFileName;
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
        String nombreSinExtension = archivoDisenioFileName.substring(0, archivoDisenioFileName.lastIndexOf("."));
        nombreSinExtension = nombreSinExtension.replace(" ", "_");
        String extension = archivoDisenioFileName.substring(archivoDisenioFileName.lastIndexOf("."),archivoDisenioFileName.length());
        archivoDisenioFileName = nombreSinExtension+sdf.format(date)+extension;
        
        System.out.println("Se obtuvo este archivo: " + archivoDisenio.getName());
        System.out.println("Con ruta: " + archivoDisenio.getAbsolutePath());
        String webPath = servletRequest.getSession().getServletContext().getRealPath("/");
        String filePath = "C:/Archivos";
        archivoDisenioFileName = "disenios/" + archivoDisenioFileName;

        File fileToCreate = new File(webPath, archivoDisenioFileName);

        FileUtils.copyFile(archivoDisenio, fileToCreate);

        fileToCreate = new File(filePath, archivoDisenioFileName);

        FileUtils.copyFile(archivoDisenio, fileToCreate);
        System.out.println("La nueva ruta es: " + fileToCreate.getAbsolutePath());
        System.out.println("Disenio viewpoint "+disenio.getViewpoint());
        disenio.setRuta(archivoDisenioFileName);
        disenio.setStatus(Boolean.TRUE);
        servicioDisenio.guardar(disenio);
        System.out.println("Se guardo?");

        consultarTodos();
        return SUCCESS;
    }

    public String eliminar() throws Exception {
        servicioDisenio.eliminar(idDisenio);
        return SUCCESS;
    }

    public String editar() throws Exception {
        String filePath = servletRequest.getSession().getServletContext().getRealPath("/");
        archivoDisenioFileName = "images/" + archivoDisenioFileName;

        File fileToCreate = new File(filePath, archivoDisenioFileName);

        FileUtils.copyFile(archivoDisenio, fileToCreate);
        System.out.println("La nueva ruta es: " + fileToCreate.getAbsolutePath());

        Archivos archivos = new Archivos();
        disenio.setRuta(archivoDisenioFileName);
        disenio.setStatus(Boolean.TRUE);
        servicioDisenio.editar(disenio);
        return SUCCESS;
    }

    public String consultarTodos() throws Exception {
        listaDisenio = servicioDisenio.consultarTodos(Disenio.class);
        return SUCCESS;
    }

    public String consultarUnico() throws Exception {
        disenio = (Disenio) servicioDisenio.consultarUnico(idDisenio);
        String filePath = "C:/Archivos";
        String webPath = servletRequest.getSession().getServletContext().getRealPath("/");

        File fileToCreate = new File(webPath, disenio.getRuta());
        if (!fileToCreate.exists()) {
            File fileToOpen = new File(filePath, disenio.getRuta());
            FileUtils.copyFile(fileToOpen, fileToCreate);
            System.out.println("Rutal archivo abierto" + fileToOpen.getAbsolutePath());
            System.out.println("Rutal archivo creado" + fileToCreate.getAbsolutePath());
        } else {
            System.out.println("El archivo ya existe en web, no sera creado");
        }

        archivoDisenioFileName = disenio.getRuta();
        consultarTodos();
        return SUCCESS;
    }

    public String consultarTodosJson() throws Exception {
        consultarTodos();
        return SUCCESS;
    }

    public Disenio getDisenio() {
        return disenio;
    }

    public void setDisenio(Disenio disenio) {
        this.disenio = disenio;
    }

    public List<Disenio> getListaDisenio() {
        return listaDisenio;
    }

    public void setListaDisenioes(List<Disenio> listaDisenio) {
        this.listaDisenio = listaDisenio;
    }

    public Long getIdDisenio() {
        return idDisenio;
    }

    public void setIdDisenio(Long idDisenio) {
        this.idDisenio = idDisenio;
    }

    /**
     * @return the archivoDisenio
     */
    public File getArchivoDisenio() {
        return archivoDisenio;
    }

    /**
     * @param archivoDisenio the archivoDisenio to set
     */
    public void setArchivoDisenio(File archivoDisenio) {
        this.archivoDisenio = archivoDisenio;
    }

    /**
     * @return the archivoDisenioFileName
     */
    public String getArchivoDisenioFileName() {
        return archivoDisenioFileName;
    }

    /**
     * @param archivoDisenioFileName the archivoDisenioFileName to set
     */
    public void setArchivoDisenioFileName(String archivoDisenioFileName) {
        this.archivoDisenioFileName = archivoDisenioFileName;
    }

    /**
     * @return the servletRequest
     */
    public HttpServletRequest getServletRequest() {
        return servletRequest;
    }

    /**
     * @param servletRequest the servletRequest to set
     */
    public void setServletRequest(HttpServletRequest servletRequest) {
        this.servletRequest = servletRequest;
    }

}
