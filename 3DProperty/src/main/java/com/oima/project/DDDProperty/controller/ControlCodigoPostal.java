/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oima.project.DDDProperty.controller;

import com.oima.project.DDDProperty.model.dto.CodigoPostal;
import com.oima.project.DDDProperty.model.dto.Localidad;
import com.oima.project.DDDProperty.utilities.Controller;
import static com.opensymphony.xwork2.Action.SUCCESS;
import java.util.List;

/**
 *
 * @author OIMA
 */
public class ControlCodigoPostal extends Controller {

    private CodigoPostal codigoPostal;
    private List<CodigoPostal> listaCodigoPostal;
    private Long idCodigoPostal;
    private List<Localidad> listaLocalidad;

    private String mensajeRetorno;

    public String guardar() throws Exception {
        codigoPostal.setStatus(Boolean.TRUE);
        servicioCodigoPostal.guardar(codigoPostal);
        consultarTodos();
        return SUCCESS;
    }

    public String eliminar() throws Exception {
        servicioCodigoPostal.eliminar(idCodigoPostal);
        return SUCCESS;
    }

    public String editar() throws Exception {
        servicioCodigoPostal.editar(codigoPostal);
        return SUCCESS;
    }

    public String consultarTodos() throws Exception {
        listaCodigoPostal = servicioCodigoPostal.consultarTodos(CodigoPostal.class);
        consultarLocalidades();
        return SUCCESS;
    }

    public String consultarUnico() throws Exception {
        codigoPostal = servicioCodigoPostal.consultarUnico(idCodigoPostal);
        System.out.println(codigoPostal.getIdLocalidad().getNombre());
        consultarTodos();
        return SUCCESS;
    }

    public String consultarLocalidades() throws Exception {
        listaLocalidad = getServicioLocalidad().consultarTodos(Localidad.class);
        return SUCCESS;
    }

    public CodigoPostal getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(CodigoPostal codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public List<CodigoPostal> getListaCodigoPostal() {
        return listaCodigoPostal;
    }

    public void setListaCodigoPostal(List<CodigoPostal> listaCodigoPostals) {
        this.listaCodigoPostal = listaCodigoPostals;
    }

    public List<Localidad> getListaLocalidad() {
        return listaLocalidad;
    }

    public void setListaLocalidad(List<Localidad> listaLocalidades) {
        this.listaLocalidad = listaLocalidades;
    }

    public Long getIdCodigoPostal() {
        return idCodigoPostal;
    }

    public void setIdCodigoPostal(Long idCodigoPostal) {
        this.idCodigoPostal = idCodigoPostal;
    }

    public String getMensajeRetorno() {
        return mensajeRetorno;
    }

    public void setMensajeRetorno(String mensajeRetorno) {
        this.mensajeRetorno = mensajeRetorno;
    }
}
