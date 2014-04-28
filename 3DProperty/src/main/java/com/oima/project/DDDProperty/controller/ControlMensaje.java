/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oima.project.DDDProperty.controller;

import com.oima.project.DDDProperty.model.dto.Mensaje;
import com.oima.project.DDDProperty.utilities.Controller;
import static com.opensymphony.xwork2.Action.SUCCESS;
import java.util.List;

/**
 *
 * @author OIMA
 */
public class ControlMensaje extends Controller{
    
    private Mensaje mensaje;
    private List<Mensaje> listaMensaje;
    private Long idMensaje;

    public String guardar() throws Exception {
        mensaje.setStatus(Boolean.TRUE);
        mensaje.setStatusLeido(Boolean.FALSE);
        servicioMensaje.guardar(mensaje);
        return SUCCESS;
    }

    public String eliminar() throws Exception {
        servicioMensaje.eliminar(idMensaje);
        return SUCCESS;
    }

    public String editar() throws Exception {
        servicioMensaje.editar(mensaje);
        return SUCCESS;
    }

    public String consultarTodos() throws Exception {
        listaMensaje = servicioMensaje.consultarTodos(Mensaje.class);
        return SUCCESS;
    }

    public String consultarUnico() throws Exception {
        mensaje = servicioMensaje.consultarUnico(idMensaje);
        consultarTodos();
        return SUCCESS;
    }

    public Mensaje getMensaje() {
        return mensaje;
    }

    public void setMensaje(Mensaje mensaje) {
        this.mensaje = mensaje;
    }

    public List<Mensaje> getListaMensaje() {
        return listaMensaje;
    }

    public void setListaMensaje(List<Mensaje> listaMensaje) {
        this.listaMensaje = listaMensaje;
    }

    public Long getIdMensaje() {
        return idMensaje;
    }

    public void setIdMensaje(Long idMensaje) {
        this.idMensaje = idMensaje;
    }

}
