/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oima.project.DDDProperty.controller;

import com.oima.project.DDDProperty.model.dto.Colonia;
import com.oima.project.DDDProperty.model.dto.CodigoPostal;
import com.oima.project.DDDProperty.utilities.Controller;
import static com.opensymphony.xwork2.Action.SUCCESS;
import java.util.List;

/**
 *
 * @author OIMA
 */
public class ControlColonia extends Controller {

    private Colonia colonia;
    private List<Colonia> listaColonia;
    private Long idColonia;
    private List<CodigoPostal> listaCodigoPostal;

    private String mensajeRetorno;

    public String guardar() throws Exception {
        colonia.setStatus(Boolean.TRUE);
        servicioColonia.guardar(colonia);
        consultarTodos();
        return SUCCESS;
    }

    public String eliminar() throws Exception {
        servicioColonia.eliminar(idColonia);
        return SUCCESS;
    }

    public String editar() throws Exception {
        servicioColonia.editar(colonia);
        return SUCCESS;
    }

    public String consultarTodos() throws Exception {
        listaColonia = servicioColonia.consultarTodos(Colonia.class);
        consultarCodigoPostales();
        return SUCCESS;
    }

    public String consultarUnico() throws Exception {
        colonia = servicioColonia.consultarUnico(idColonia);
        consultarTodos();
        return SUCCESS;
    }

    public String consultarCodigoPostales() throws Exception {
        listaCodigoPostal = getServicioCodigoPostal().consultarTodos(CodigoPostal.class);
        return SUCCESS;
    }

    public Colonia getColonia() {
        return colonia;
    }

    public void setColonia(Colonia colonia) {
        this.colonia = colonia;
    }

    public List<Colonia> getListaColonia() {
        return listaColonia;
    }

    public void setListaColonia(List<Colonia> listaColonias) {
        this.listaColonia = listaColonias;
    }

    public List<CodigoPostal> getListaCodigoPostal() {
        return listaCodigoPostal;
    }

    public void setListaCodigoPostal(List<CodigoPostal> listaCodigoPostales) {
        this.listaCodigoPostal = listaCodigoPostales;
    }

    public Long getIdColonia() {
        return idColonia;
    }

    public void setIdColonia(Long idColonia) {
        this.idColonia = idColonia;
    }

    public String getMensajeRetorno() {
        return mensajeRetorno;
    }

    public void setMensajeRetorno(String mensajeRetorno) {
        this.mensajeRetorno = mensajeRetorno;
    }
}
