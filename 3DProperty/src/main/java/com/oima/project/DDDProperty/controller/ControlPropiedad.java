/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oima.project.DDDProperty.controller;

import com.oima.project.DDDProperty.model.dto.Categoria;
import com.oima.project.DDDProperty.model.dto.Propiedad;
import com.oima.project.DDDProperty.utilities.Controller;
import static com.opensymphony.xwork2.Action.SUCCESS;
import java.util.List;

/**
 *
 * @author OIMA
 */
public class ControlPropiedad extends Controller {

    private Propiedad propiedad;
    private List<Propiedad> listaPropiedades;
    private Long idPropiedad;
    private Long idCategoria;

    private String mensajeRetorno;

    public String guardar() throws Exception {
        getPropiedad().setStatus(Boolean.TRUE);
        servicioPropiedad.guardar(getPropiedad());
        borrarServicios();
        return SUCCESS;
    }

    public String eliminar() throws Exception {
        servicioEstado.eliminar(getIdPropiedad());
        borrarServicios();
        return SUCCESS;
    }

    public String editar() throws Exception {
        return SUCCESS;
    }

    public String consultarTodos() throws Exception {
        setListaPropiedades((List<Propiedad>) servicioEstado.consultarTodos(Propiedad.class));
        borrarServicios();
        return SUCCESS;
    }

    public String consultarUnico() throws Exception {
        return SUCCESS;
    }

    public String buscarPorCategoria() throws Exception {
        Categoria categoria = getServicioCategoria().consultarUnico(idCategoria);
        setListaPropiedades(getServicioPropiedad().consultaPorCampoEspecifico("idCategoria", categoria, "asc", Categoria.class, null));
        borrarServicios();
        return SUCCESS;
    }

    public Propiedad getPropiedad() {
        return propiedad;
    }

    public void setPropiedad(Propiedad propiedad) {
        this.propiedad = propiedad;
    }

    public List<Propiedad> getListaPropiedades() {
        return listaPropiedades;
    }

    public void setListaPropiedades(List<Propiedad> listaPropiedades) {
        this.listaPropiedades = listaPropiedades;
    }

    public Long getIdPropiedad() {
        return idPropiedad;
    }

    public void setIdPropiedad(Long idPropiedad) {
        this.idPropiedad = idPropiedad;
    }

    public Long getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(Long idCategoria) {
        this.idCategoria = idCategoria;
    }

    public String getMensajeRetorno() {
        return mensajeRetorno;
    }

    public void setMensajeRetorno(String mensajeRetorno) {
        this.mensajeRetorno = mensajeRetorno;
    }

}
