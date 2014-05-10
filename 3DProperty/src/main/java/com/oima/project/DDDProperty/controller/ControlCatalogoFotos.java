/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oima.project.DDDProperty.controller;

import com.oima.project.DDDProperty.model.dto.CatalogoFotos;
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
public class ControlCatalogoFotos extends Controller implements ServletRequestAware {

    private CatalogoFotos catalogoFotos;
    private List<CatalogoFotos> listaCatalogoFotos;
    private Long idCatalogoFotos;
    private File archivoCatalogoFotos;
    private String archivoCatalogoFotosFileName;
    private HttpServletRequest servletRequest;

    public String guardar() throws Exception {
        Date date = new Date();
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd-G-HH-mm-ss");
        String nombreSinExtension = archivoCatalogoFotosFileName.substring(0, archivoCatalogoFotosFileName.lastIndexOf("."));
        nombreSinExtension = nombreSinExtension.replace(" ", "_");
        String extension = archivoCatalogoFotosFileName.substring(archivoCatalogoFotosFileName.lastIndexOf("."),archivoCatalogoFotosFileName.length());
        archivoCatalogoFotosFileName = nombreSinExtension+sdf.format(date)+extension;

        System.out.println("Se obtuvo este archivo: " + archivoCatalogoFotos.getName());
        System.out.println("Con ruta: " + archivoCatalogoFotos.getAbsolutePath());
        String webPath = servletRequest.getSession().getServletContext().getRealPath("/");
        String filePath = "C:/Archivos";
        archivoCatalogoFotosFileName = "imagenes/" + archivoCatalogoFotosFileName;

        File fileToCreate = new File(webPath, archivoCatalogoFotosFileName);

        FileUtils.copyFile(archivoCatalogoFotos, fileToCreate);

        fileToCreate = new File(filePath, archivoCatalogoFotosFileName);

        FileUtils.copyFile(archivoCatalogoFotos, fileToCreate);
        System.out.println("La nueva ruta es: " + fileToCreate.getAbsolutePath());

        catalogoFotos.setRutaFotografia(archivoCatalogoFotosFileName);
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
        //IMPLEMENTAR
        return SUCCESS;
    }

    public String consultarTodos() throws Exception {
        listaCatalogoFotos = servicioCatalogoFotos.consultarTodos(CatalogoFotos.class);
        return SUCCESS;
    }

    public String consultarUnico() throws Exception {
        catalogoFotos = (CatalogoFotos) servicioCatalogoFotos.consultarUnico(idCatalogoFotos);
        String filePath = "C:/Archivos";
        String webPath = servletRequest.getSession().getServletContext().getRealPath("/");
        File fileToCreate = new File(webPath, catalogoFotos.getRutaFotografia());
        if (!fileToCreate.exists()) {
            File fileToOpen = new File(filePath, catalogoFotos.getRutaFotografia());

            FileUtils.copyFile(fileToOpen, fileToCreate);

            System.out.println("Rutal archivo abierto" + fileToOpen.getAbsolutePath());
            System.out.println("Rutal archivo creado" + fileToCreate.getAbsolutePath());
        } else {
            System.out.println("El archivo ya existe en web, no sera creado");
        }
        archivoCatalogoFotosFileName = catalogoFotos.getRutaFotografia();
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
     * @param archivoCatalogoFotosFileName the archivoCatalogoFotosFileName to
     * set
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
