/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.oima.project.DDDProperty.model.dto;


/**
 *
 * @author OIMA
 */
public class CatalogoFotos {
    private Long idCatalogoFotos;
    private Propiedad idPropiedad;
    private String rutaFotografia;
    private String viewpoint;
    private String descripcion;
    private Byte status;

    public Long getIdCatalogoFotos() {
        return idCatalogoFotos;
    }

    public void setIdCatalogoFotos(Long idCatalogoFotos) {
        this.idCatalogoFotos = idCatalogoFotos;
    }

    public Propiedad getIdPropiedad() {
        return idPropiedad;
    }

    public void setIdPropiedad(Propiedad idPropiedad) {
        this.idPropiedad = idPropiedad;
    }

    public String getRutaFotografia() {
        return rutaFotografia;
    }

    public void setRutaFotografia(String rutaFotografia) {
        this.rutaFotografia = rutaFotografia;
    }

    public String getViewpoint() {
        return viewpoint;
    }

    public void setViewpoint(String viewpoint) {
        this.viewpoint = viewpoint;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

}
