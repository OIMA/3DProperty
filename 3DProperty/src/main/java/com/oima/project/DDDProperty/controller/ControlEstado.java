/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oima.project.DDDProperty.controller;

import com.oima.project.DDDProperty.model.dto.Estado;
import com.oima.project.DDDProperty.model.dto.Pais;
import com.oima.project.DDDProperty.utilities.Controller;
import static com.opensymphony.xwork2.Action.SUCCESS;
import java.util.List;

/**
 *
 * @author OIMA
 */
public class ControlEstado extends Controller {

    private Estado estado;
    private List<Estado> listaEstado;
    private Long idEstado;
    private List<Pais> listaPais;

    private String mensajeRetorno;

    public String guardar() throws Exception {
        estado.setStatus(Boolean.TRUE);
        servicioEstado.guardar(estado);
        consultarTodos();
        return SUCCESS;
    }

    public String eliminar() throws Exception {
        servicioEstado.eliminar(idEstado);
        return SUCCESS;
    }

    public String editar() throws Exception {
        servicioEstado.editar(estado);
        return SUCCESS;
    }

    public String consultarTodos() throws Exception {
        listaEstado = servicioEstado.consultarTodos(Estado.class);
        consultarPaises();
        return SUCCESS;
    }

    public String consultarUnico() throws Exception {
        estado = servicioEstado.consultarUnico(idEstado);
        System.out.println(estado.getIdPais().getNombre());
        consultarTodos();
        return SUCCESS;
    }

    public String consultarPaises() throws Exception {
        listaPais = getServicioPais().consultarTodos(Pais.class);
        return SUCCESS;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public List<Estado> getListaEstado() {
        return listaEstado;
    }

    public void setListaEstado(List<Estado> listaEstados) {
        this.listaEstado = listaEstados;
    }

    public List<Pais> getListaPais() {
        return listaPais;
    }

    public void setListaPais(List<Pais> listaPaises) {
        this.listaPais = listaPaises;
    }

    public Long getIdEstado() {
        return idEstado;
    }

    public void setIdEstado(Long idEstado) {
        this.idEstado = idEstado;
    }

    public String getMensajeRetorno() {
        return mensajeRetorno;
    }

    public void setMensajeRetorno(String mensajeRetorno) {
        this.mensajeRetorno = mensajeRetorno;
    }
}
