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
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.apache.commons.io.FileUtils;
import org.apache.struts2.interceptor.ServletRequestAware;

/**
 *
 * @author OIMA
 */

public class ControlDisenio extends Controller implements ServletRequestAware{

    private Disenio disenio;
    private List<Disenio> listaDisenio;
    private Long idDisenio;
    private File archivoDisenio;
    private String archivoDisenioFileName;
    private HttpServletRequest servletRequest;

    /**
     * Se debe de cambiar la ruta "images/"
     * @return
     * @throws Exception 
     */
    public String guardar() throws Exception {
        System.out.println("Se obtuvo este archivo: " + archivoDisenio.getName());
        System.out.println("Con ruta: " + archivoDisenio.getAbsolutePath());
        
        String filePath = servletRequest.getSession().getServletContext().getRealPath("/");
        archivoDisenioFileName="images/"+archivoDisenioFileName;
        
        File fileToCreate = new File(filePath, archivoDisenioFileName);

        FileUtils.copyFile(archivoDisenio, fileToCreate);
        System.out.println("La nueva ruta es: " + fileToCreate.getAbsolutePath());
        
        Archivos archivos = new Archivos();
        disenio.setRuta(archivoDisenioFileName);
        disenio.setArchivo(archivos.fileToBytes(archivoDisenio));
        disenio.setStatus(Boolean.TRUE);
        disenio.setNoVisitas(0);
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
        archivoDisenioFileName="images/"+archivoDisenioFileName;
        
        File fileToCreate = new File(filePath, archivoDisenioFileName);

        FileUtils.copyFile(archivoDisenio, fileToCreate);
        System.out.println("La nueva ruta es: " + fileToCreate.getAbsolutePath());
        
        Archivos archivos = new Archivos();
        disenio.setRuta(archivoDisenioFileName);
        disenio.setArchivo(archivos.fileToBytes(archivoDisenio));
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
        Archivos archivos = new Archivos();
        String filePath = servletRequest.getSession().getServletContext().getRealPath("/");
        System.out.println("Ruta de archivo:"+disenio.getRuta());
        archivos.bytesToFile(disenio.getArchivo(), filePath+"/"+disenio.getRuta());
        archivoDisenioFileName=disenio.getRuta();
        consultarTodos();
        return SUCCESS;
    }

    public String consultarTodosJson() throws Exception{
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
