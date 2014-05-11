/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.oima.project.DDDProperty.controller;

import com.oima.project.DDDProperty.model.dto.Mensaje;
import com.oima.project.DDDProperty.model.dto.Propiedad;
import com.oima.project.DDDProperty.model.dto.Usuario;
import com.oima.project.DDDProperty.utilities.Controller;
import static com.opensymphony.xwork2.Action.SUCCESS;
import java.util.List;
import java.util.Map;
import org.apache.struts2.interceptor.SessionAware;

/**
 *
 * @author Jesus
 */
public class ControlChat extends Controller implements SessionAware {
    private Usuario usuario;
    private Mensaje mensaje;
    private Propiedad propiedad;
    private List<Usuario> usuarioList;
    private List<Mensaje> mensajeList;
    private List<Propiedad> propiedadList;
    private String nombreUsuario;
    private Integer idUsuario;
    private Integer idUsuario_widget;
    private Integer idMensaje;
    private Integer idPropiedad;
    private Map session;
    
    
    public String consultarDestinatarios() throws Exception{
        //OJO DEBE DE CONSULTAR TODOS MENOS EL USUARIO XD
        System.out.println("Id Remitente "+mensaje.getIdRemitente().getIdUsuario());
        usuarioList = servicioUsuario.consultarTodos(Usuario.class);
        return SUCCESS;
    }
    
    public String consultarPropiedadesPorIdUsuario() throws Exception{
        System.out.println("Id Destinatario"+mensaje.getIdDestinatario().getIdUsuario());
        propiedadList = servicioPropiedad.consultarTodos(Propiedad.class);
        return SUCCESS;
    }
    
    public String guardarMensaje() throws Exception{
        System.out.println("Id Destinatario"+mensaje.getIdDestinatario().getIdUsuario());
        System.out.println("Id Remitente "+mensaje.getIdRemitente().getIdUsuario());
        System.out.println("Mensaje "+mensaje.getMensaje());
        return SUCCESS;
    }
    
    /**
     * @return the session
     */
    public Map getSession() {
        return session;
    }

    /**
     * @param session the session to set
     */
    @Override
    public void setSession(Map<String, Object> map) {
        session = map;
    }

    /**
     * @return the usuario
     */
    public Usuario getUsuario() {
        return usuario;
    }

    /**
     * @param usuario the usuario to set
     */
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    /**
     * @return the mensaje
     */
    public Mensaje getMensaje() {
        return mensaje;
    }

    /**
     * @param mensaje the mensaje to set
     */
    public void setMensaje(Mensaje mensaje) {
        this.mensaje = mensaje;
    }

    /**
     * @return the propiedad
     */
    public Propiedad getPropiedad() {
        return propiedad;
    }

    /**
     * @param propiedad the propiedad to set
     */
    public void setPropiedad(Propiedad propiedad) {
        this.propiedad = propiedad;
    }

    /**
     * @return the usuarioList
     */
    public List<Usuario> getUsuarioList() {
        return usuarioList;
    }

    /**
     * @param usuarioList the usuarioList to set
     */
    public void setUsuarioList(List<Usuario> usuarioList) {
        this.usuarioList = usuarioList;
    }

    /**
     * @return the mensajeList
     */
    public List<Mensaje> getMensajeList() {
        return mensajeList;
    }

    /**
     * @param mensajeList the mensajeList to set
     */
    public void setMensajeList(List<Mensaje> mensajeList) {
        this.mensajeList = mensajeList;
    }

    /**
     * @return the propiedadList
     */
    public List<Propiedad> getPropiedadList() {
        return propiedadList;
    }

    /**
     * @param propiedadList the propiedadList to set
     */
    public void setPropiedadList(List<Propiedad> propiedadList) {
        this.propiedadList = propiedadList;
    }

    /**
     * @return the nombreUsuario
     */
    public String getNombreUsuario() {
        return nombreUsuario;
    }

    /**
     * @param nombreUsuario the nombreUsuario to set
     */
    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    /**
     * @return the idUsuario
     */
    public Integer getIdUsuario() {
        return idUsuario;
    }

    /**
     * @param idUsuario the idUsuario to set
     */
    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    /**
     * @return the idMensaje
     */
    public Integer getIdMensaje() {
        return idMensaje;
    }

    /**
     * @param idMensaje the idMensaje to set
     */
    public void setIdMensaje(Integer idMensaje) {
        this.idMensaje = idMensaje;
    }

    /**
     * @return the idPropiedad
     */
    public Integer getIdPropiedad() {
        return idPropiedad;
    }

    /**
     * @param idPropiedad the idPropiedad to set
     */
    public void setIdPropiedad(Integer idPropiedad) {
        this.idPropiedad = idPropiedad;
    }

    /**
     * @return the idUsuario_widget
     */
    public Integer getIdUsuario_widget() {
        return idUsuario_widget;
    }
}
