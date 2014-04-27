/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oima.project.DDDProperty.controller;

import com.oima.project.DDDProperty.model.dto.Localidad;
import com.oima.project.DDDProperty.model.dto.Estado;
import com.oima.project.DDDProperty.utilities.Controller;
import static com.opensymphony.xwork2.Action.SUCCESS;
import java.util.List;

/**
 *
 * @author OIMA
 */
public class ControlLocalidad extends Controller {

    private Localidad localidad;
    private List<Localidad> listaLocalidad;
    private Long idLocalidad;
    private List<Estado> listaEstado;
    
    private Long idEstado;

    private String mensajeRetorno;

    public String guardar() throws Exception {
        localidad.setStatus(Boolean.TRUE);
        servicioLocalidad.guardar(localidad);
        consultarTodos();
        return SUCCESS;
    }

    public String eliminar() throws Exception {
        servicioLocalidad.eliminar(idLocalidad);
        return SUCCESS;
    }

    public String editar() throws Exception {
        servicioLocalidad.editar(localidad);
        return SUCCESS;
    }

    public String consultarTodos() throws Exception {
        listaLocalidad = servicioLocalidad.consultarTodos(Localidad.class);
        consultarEstadoes();
        return SUCCESS;
    }

    public String consultarUnico() throws Exception {
        localidad = servicioLocalidad.consultarUnico(idLocalidad);
        System.out.println(localidad.getIdEstado().getNombre());
        consultarTodos();
        return SUCCESS;
    }

    public String consultarEstadoes() throws Exception {
        listaEstado = getServicioEstado().consultarTodos(Estado.class);
        return SUCCESS;
    }
    
    public String consultarPorIdEstado() throws Exception {
        listaLocalidad = servicioLocalidad.consultarPorIdEstado(idEstado);
        return SUCCESS;
    }

    public Localidad getLocalidad() {
        return localidad;
    }

    public void setLocalidad(Localidad localidad) {
        this.localidad = localidad;
    }

    public List<Localidad> getListaLocalidad() {
        return listaLocalidad;
    }

    public void setListaLocalidad(List<Localidad> listaLocalidads) {
        this.listaLocalidad = listaLocalidads;
    }

    public List<Estado> getListaEstado() {
        return listaEstado;
    }

    public void setListaEstado(List<Estado> listaEstadoes) {
        this.listaEstado = listaEstadoes;
    }

    public Long getIdLocalidad() {
        return idLocalidad;
    }

    public void setIdLocalidad(Long idLocalidad) {
        this.idLocalidad = idLocalidad;
    }

    public String getMensajeRetorno() {
        return mensajeRetorno;
    }

    public void setMensajeRetorno(String mensajeRetorno) {
        this.mensajeRetorno = mensajeRetorno;
    }

    /**
     * @return the idEstado
     */
    public Long getIdEstado() {
        return idEstado;
    }

    /**
     * @param idEstado the idEstado to set
     */
    public void setIdEstado(Long idEstado) {
        this.idEstado = idEstado;
    }
}
