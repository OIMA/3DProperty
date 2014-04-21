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
public class Mensaje {
    private Long idMensaje;
    private Usuario idRemitente;
    private Usuario idDestinatario;
    private String mensaje;
    private Byte statusLeido;
    private Long idPropiedad;
    private Byte status;

    public Long getIdMensaje() {
        return idMensaje;
    }

    public void setIdMensaje(Long idMensaje) {
        this.idMensaje = idMensaje;
    }

    public Usuario getIdRemitente() {
        return idRemitente;
    }

    public void setIdRemitente(Usuario idRemitente) {
        this.idRemitente = idRemitente;
    }

    public Usuario getIdDestinatario() {
        return idDestinatario;
    }

    public void setIdDestinatario(Usuario idDestinatario) {
        this.idDestinatario = idDestinatario;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public Byte getStatusLeido() {
        return statusLeido;
    }

    public void setStatusLeido(Byte statusLeido) {
        this.statusLeido = statusLeido;
    }

    public Long getIdPropiedad() {
        return idPropiedad;
    }

    public void setIdPropiedad(Long idPropiedad) {
        this.idPropiedad = idPropiedad;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

}
