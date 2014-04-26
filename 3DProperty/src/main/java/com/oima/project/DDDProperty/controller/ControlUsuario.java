/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oima.project.DDDProperty.controller;

import com.oima.project.DDDProperty.model.dto.Usuario;
import com.oima.project.DDDProperty.model.dto.Colonia;
import com.oima.project.DDDProperty.utilities.Controller;
import static com.opensymphony.xwork2.Action.SUCCESS;
import java.util.List;

/**
 *
 * @author OIMA
 */
public class ControlUsuario extends Controller {

    private Usuario usuario;
    private List<Usuario> listaUsuario;
    private Long idUsuario;
    private List<Colonia> listaColonia;

    private String mensajeRetorno;

    public String guardar() throws Exception {
        usuario.setStatus(Boolean.TRUE);
        servicioUsuario.guardar(usuario);
        consultarTodos();
        return SUCCESS;
    }

    public String eliminar() throws Exception {
        servicioUsuario.eliminar(idUsuario);
        return SUCCESS;
    }

    public String editar() throws Exception {
        servicioUsuario.editar(usuario);
        return SUCCESS;
    }

    public String consultarTodos() throws Exception {
        listaUsuario = servicioUsuario.consultarTodos(Usuario.class);
        consultarPaises();
        return SUCCESS;
    }

    public String consultarUnico() throws Exception {
        usuario = servicioUsuario.consultarUnico(idUsuario);
        consultarTodos();
        return SUCCESS;
    }

    public String consultarPaises() throws Exception {
        listaColonia = getServicioColonia().consultarTodos(Colonia.class);
        return SUCCESS;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public List<Usuario> getListaUsuario() {
        return listaUsuario;
    }

    public void setListaUsuario(List<Usuario> listaUsuarios) {
        this.listaUsuario = listaUsuarios;
    }

    public List<Colonia> getListaColonia() {
        return listaColonia;
    }

    public void setListaColonia(List<Colonia> listaColoniaes) {
        this.listaColonia = listaColoniaes;
    }

    public Long getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Long idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getMensajeRetorno() {
        return mensajeRetorno;
    }

    public void setMensajeRetorno(String mensajeRetorno) {
        this.mensajeRetorno = mensajeRetorno;
    }
}
