/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oima.project.DDDProperty.controller;

import com.oima.project.DDDProperty.model.dto.CatalogoFotos;
import com.oima.project.DDDProperty.services.impl.ServicioCatalogoFotos;
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

public class ControlCatalogoFotos extends Controller implements ServletRequestAware{

    private CatalogoFotos catalogoFotos;
    private List<CatalogoFotos> listaCatalogoFotos;
    private Long idCatalogoFotos;
    private File archivoCatalogoFotos;
    private String archivoCatalogoFotosFileName;
    private HttpServletRequest servletRequest;

    /**
     * Se debe de cambiar la ruta "images/"
     * @return
     * @throws Exception 
     */
    public String guardar() throws Exception {
        System.out.println("Se obtuvo este archivo: " + archivoCatalogoFotos.getName());
        System.out.println("Con ruta: " + archivoCatalogoFotos.getAbsolutePath());
        
        String filePath = servletRequest.getSession().getServletContext().getRealPath("/");
        archivoCatalogoFotosFileName="/images/"+archivoCatalogoFotosFileName;
        
        File fileToCreate = new File(filePath, archivoCatalogoFotosFileName);

        FileUtils.copyFile(archivoCatalogoFotos, fileToCreate);
        System.out.println("La nueva ruta es: " + fileToCreate.getAbsolutePath());
        
        Archivos archivos = new Archivos();
        catalogoFotos.setRutaFotografia(archivoCatalogoFotosFileName);
        catalogoFotos.setArchivo(archivos.fileToBytes(archivoCatalogoFotos));
        catalogoFotos.setStatus(Boolean.TRUE);
        servicioCatalogoFotos.guardar(catalogoFotos);
        System.out.println("Se guardo?");
        
        consultarTodos();
        return SUCCESS;
    }

    public String eliminar() throws Exception {
        servicioCatalogoFotos.eliminar(idCatalogoFotos);
        return SUCCESS;
    }

    public String editar() throws Exception {
        String filePath = servletRequest.getSession().getServletContext().getRealPath("/");
        archivoCatalogoFotosFileName="images/"+archivoCatalogoFotosFileName;
        
        File fileToCreate = new File(filePath, archivoCatalogoFotosFileName);

        FileUtils.copyFile(archivoCatalogoFotos, fileToCreate);
        System.out.println("La nueva ruta es: " + fileToCreate.getAbsolutePath());
        
        Archivos archivos = new Archivos();
        catalogoFotos.setRutaFotografia(archivoCatalogoFotosFileName);
        catalogoFotos.setArchivo(archivos.fileToBytes(archivoCatalogoFotos));
        catalogoFotos.setStatus(Boolean.TRUE);
        servicioCatalogoFotos.editar(catalogoFotos);
        return SUCCESS;
    }

    public String consultarTodos() throws Exception {
        listaCatalogoFotos = servicioCatalogoFotos.consultarTodos(CatalogoFotos.class);
        return SUCCESS;
    }

    public String consultarUnico() throws Exception {
        catalogoFotos = (CatalogoFotos) servicioCatalogoFotos.consultarUnico(idCatalogoFotos);
        Archivos archivos = new Archivos();
        String filePath = servletRequest.getSession().getServletContext().getRealPath("/");
        System.out.println("Ruta de archivo:"+catalogoFotos.getRutaFotografia());
        archivos.bytesToFile(catalogoFotos.getArchivo(), filePath+"/"+catalogoFotos.getRutaFotografia());
        archivoCatalogoFotosFileName=catalogoFotos.getRutaFotografia();
        consultarTodos();
        return SUCCESS;
    }

    public CatalogoFotos getCatalogoFotos() {
        return catalogoFotos;
    }

    public void setCatalogoFotos(CatalogoFotos catalogoFotos) {
        this.catalogoFotos = catalogoFotos;
    }

    public List<CatalogoFotos> getListaCatalogoFotos() {
        return listaCatalogoFotos;
    }

    public void setListaCatalogoFotoses(List<CatalogoFotos> listaCatalogoFotos) {
        this.listaCatalogoFotos = listaCatalogoFotos;
    }

    public Long getIdCatalogoFotos() {
        return idCatalogoFotos;
    }

    public void setIdCatalogoFotos(Long idCatalogoFotos) {
        this.idCatalogoFotos = idCatalogoFotos;
    }

    /**
     * @return the archivoCatalogoFotos
     */
    public File getArchivoCatalogoFotos() {
        return archivoCatalogoFotos;
    }

    /**
     * @param archivoCatalogoFotos the archivoCatalogoFotos to set
     */
    public void setArchivoCatalogoFotos(File archivoCatalogoFotos) {
        this.archivoCatalogoFotos = archivoCatalogoFotos;
    }

    /**
     * @return the archivoCatalogoFotosFileName
     */
    public String getArchivoCatalogoFotosFileName() {
        return archivoCatalogoFotosFileName;
    }

    /**
     * @param archivoCatalogoFotosFileName the archivoCatalogoFotosFileName to set
     */
    public void setArchivoCatalogoFotosFileName(String archivoCatalogoFotosFileName) {
        this.archivoCatalogoFotosFileName = archivoCatalogoFotosFileName;
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
