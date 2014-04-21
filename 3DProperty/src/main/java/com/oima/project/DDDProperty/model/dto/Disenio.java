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
public class Disenio {
    private Long idDisenio;
    private String ruta;
    private String rutaSkyBox;
    private String viewPoint;
    private Usuario idUsuario;
    private Propiedad idPropiedad;
    private Byte status;

    public Long getIdDisenio() {
        return idDisenio;
    }

    public void setIdDisenio(Long idDisenio) {
        this.idDisenio = idDisenio;
    }

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    public String getRutaSkyBox() {
        return rutaSkyBox;
    }

    public void setRutaSkyBox(String rutaSkyBox) {
        this.rutaSkyBox = rutaSkyBox;
    }

    public String getViewPoint() {
        return viewPoint;
    }

    public void setViewPoint(String viewPoint) {
        this.viewPoint = viewPoint;
    }

    public Usuario getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Usuario idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Propiedad getIdPropiedad() {
        return idPropiedad;
    }

    public void setIdPropiedad(Propiedad idPropiedad) {
        this.idPropiedad = idPropiedad;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

}
