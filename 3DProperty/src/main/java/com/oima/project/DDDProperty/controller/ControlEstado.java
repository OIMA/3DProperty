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
    private List<Estado> listaEstados;
    private List<Pais> listaPaises;
    private Long idEstado;

//    private ServicioPais servicioPais;
//    private ServicioEstado servicioEstado;
    private String mensajeRetorno;

    public String guardar() throws Exception {
        estado.setStatus(Boolean.TRUE);
        servicioEstado.guardar(estado);
        borrarServicios();
        return SUCCESS;
    }

    public String eliminar() throws Exception {
        servicioEstado.eliminar(idEstado);
        borrarServicios();
        return SUCCESS;
    }

    public void editar(Object object) throws Exception {
    }

    public String consultarTodos() throws Exception {
        listaEstados = servicioEstado.consultarTodos(Estado.class);
        borrarServicios();
        return SUCCESS;
    }

    public Object consultarUnico(Long primaryKey, Class clase, String tabla) throws Exception {
        return null;
    }

    public String consultarPaises() throws Exception {
        listaPaises = getServicioPais().consultarTodos(Pais.class);
        borrarServicios();
        return SUCCESS;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public List<Estado> getListaEstados() {
        return listaEstados;
    }

    public void setListaEstados(List<Estado> listaEstados) {
        this.listaEstados = listaEstados;
    }

    public List<Pais> getListaPaises() {
        return listaPaises;
    }

    public void setListaPaises(List<Pais> listaPaises) {
        this.listaPaises = listaPaises;
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
