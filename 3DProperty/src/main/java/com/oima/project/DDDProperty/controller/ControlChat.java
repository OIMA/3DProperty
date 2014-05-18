/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.oima.project.DDDProperty.controller;

import com.oima.project.DDDProperty.model.dto.Contrato;
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
    private List<Mensaje> mensajeRecibidosList;
    private List<Propiedad> propiedadList;
    private List<Contrato> contratoList;
    private String term; //del autocompleter
    private Long idUsuario;
    private String idUsuario_widget;
    private Integer idMensaje;
    private Integer idPropiedad;
    private Map session;
    
    
    public String consultarDestinatarios() throws Exception{
        //OJO DEBE DE CONSULTAR TODOS MENOS EL USUARIO XD
        System.out.println("Id Remitente "+mensaje.getIdRemitente().getIdUsuario());
        String campos[] = {"nombreUsuario","idUsuario"}; 
        Object contenidos[] = {term,((Usuario)session.get("usuarioSession")).getIdUsuario()};
        String predicados[] ={"like","notequal"};
        usuarioList = servicioUsuario.consultarPorCampoEspecifico(campos,contenidos,predicados,null);
        return SUCCESS;
    }
    
    public String consultarPropiedadesPorIdUsuario() throws Exception{
        System.out.println("Id Destinatario"+idUsuario);
        contratoList = servicioContrato.consultarPorCampoEspecifico("idUsuario.idUsuario", idUsuario, "equal", null);
        return SUCCESS;
    }
    
    public String consultarMensajesPorIdUsuario() throws Exception{
        idUsuario = ((Usuario)session.get("usuarioSession")).getIdUsuario();
        String orderBy[] = {"desc","idMensaje"};
        mensajeList = servicioMensaje.consultaPorCampoEspecifico("idRemitente.idUsuario", idUsuario, "equal", orderBy);
        mensajeRecibidosList = servicioMensaje.consultaPorCampoEspecifico("idDestinatario.idUsuario", idUsuario, "equal", orderBy);
        return SUCCESS;
    }
    
    public String consultarMensajesNoLeidosPorIdUsuario() throws Exception{
        idUsuario = ((Usuario)session.get("usuarioSession")).getIdUsuario();
        String orderBy[] = {"desc","idMensaje"};
        String campos[] = {"idDestinatario.idUsuario","statusLeido"};
        Object objetos[] = {idUsuario,Boolean.FALSE};
        String predicados[] = {"equal","equal"};
        mensajeList = servicioMensaje.consultaPorCampoEspecifico("idRemitente.idUsuario", idUsuario, "equal", orderBy);
//        mensajeRecibidosList = servicioMensaje.consultaPorCampoEspecifico("idDestinatario.idUsuario", idUsuario, "equal", orderBy);
       
        mensajeRecibidosList = servicioMensaje.consultaPorCampoEspecifico(campos,objetos, predicados, orderBy);
        return SUCCESS;
    }
    
    public String guardarMensaje() throws Exception{
        System.out.println("Id Destinatario"+idUsuario);
        System.out.println("Id Remitente "+mensaje.getIdRemitente().getIdUsuario());
        System.out.println("Mensaje "+mensaje.getMensaje());
        Usuario usuario = servicioUsuario.consultarUnico(idUsuario);
        mensaje.setIdDestinatario(usuario);
        mensaje.setStatus(Boolean.TRUE);
        mensaje.setStatusLeido(Boolean.FALSE);
        mensaje.setIdPropiedad((mensaje.getIdPropiedad().getIdPropiedad()==-1)?null:mensaje.getIdPropiedad());
        servicioMensaje.guardar(mensaje);
        System.out.println("Guardo el mensaje?");
        return SUCCESS;
    }
    
    public String marcarMensaje() throws Exception{
        System.out.println("IdMensaje"+idMensaje);
        Mensaje mensaje = servicioMensaje.consultarUnico(Long.valueOf(idMensaje));
        mensaje.setStatus(Boolean.FALSE);
        servicioMensaje.editar(mensaje);
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
    public String getTerm() {
        return term;
    }

    /**
     * @param nombreUsuario the nombreUsuario to set
     */
    public void setTerm(String term) {
        this.term = term;
    }

    /**
     * @return the idUsuario
     */
    public Long getIdUsuario() {
        return idUsuario;
    }

    /**
     * @param idUsuario the idUsuario to set
     */
    public void setIdUsuario(Long idUsuario) {
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
     * @return the contratoList
     */
    public List<Contrato> getContratoList() {
        return contratoList;
    }

    /**
     * @param contratoList the contratoList to set
     */
    public void setContratoList(List<Contrato> contratoList) {
        this.contratoList = contratoList;
    }

    /**
     * @return the idUsuario_widget
     */
    public String getIdUsuario_widget() {
        return idUsuario_widget;
    }

    /**
     * @param idUsuario_widget the idUsuario_widget to set
     */
    public void setIdUsuario_widget(String idUsuario_widget) {
        this.idUsuario_widget = idUsuario_widget;
    }

    /**
     * @return the mensajeRecibidosList
     */
    public List<Mensaje> getMensajeRecibidosList() {
        return mensajeRecibidosList;
    }

    /**
     * @param mensajeRecibidosList the mensajeRecibidosList to set
     */
    public void setMensajeRecibidosList(List<Mensaje> mensajeRecibidosList) {
        this.mensajeRecibidosList = mensajeRecibidosList;
    }

    
}
