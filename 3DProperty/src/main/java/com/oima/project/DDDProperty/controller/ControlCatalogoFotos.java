/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oima.project.DDDProperty.controller;

import com.oima.project.DDDProperty.model.dto.CatalogoFotos;
import com.oima.project.DDDProperty.services.impl.ServicioCatalogoFotos;
import static com.opensymphony.xwork2.Action.SUCCESS;
import java.util.List;

/**
 *
 * @author OIMA
 */
public class ControlCatalogoFotos {

    private ServicioCatalogoFotos servicioCatalogoFotos;
    private CatalogoFotos catalogoFotos;
    private List<CatalogoFotos> listaCatalogoFotoses;
    private Long idCatalogoFotos;

    public String guardar() throws Exception {
        catalogoFotos.setStatus(Boolean.TRUE);
        servicioCatalogoFotos.guardar(catalogoFotos);
        return SUCCESS;
    }

    public String eliminar() throws Exception {
        servicioCatalogoFotos.eliminar(idCatalogoFotos);
        return SUCCESS;
    }

    public String editar() throws Exception {
        servicioCatalogoFotos.editar(catalogoFotos);
        return SUCCESS;
    }

    public String consultarTodos() throws Exception {
        listaCatalogoFotoses = servicioCatalogoFotos.consultarTodos(CatalogoFotos.class);
        return SUCCESS;
    }

    public String consultarUnico() throws Exception {
        return SUCCESS;
    }

    public ServicioCatalogoFotos getServicioCatalogoFotos() {
        return servicioCatalogoFotos;
    }

    public void setServicioCatalogoFotos(ServicioCatalogoFotos servicioCatalogoFotos) {
        this.servicioCatalogoFotos = servicioCatalogoFotos;
    }

    public CatalogoFotos getCatalogoFotos() {
        return catalogoFotos;
    }

    public void setCatalogoFotos(CatalogoFotos catalogoFotos) {
        this.catalogoFotos = catalogoFotos;
    }

    public List<CatalogoFotos> getListaCatalogoFotoses() {
        return listaCatalogoFotoses;
    }

    public void setListaCatalogoFotoses(List<CatalogoFotos> listaCatalogoFotoses) {
        this.listaCatalogoFotoses = listaCatalogoFotoses;
    }

    public Long getIdCatalogoFotos() {
        return idCatalogoFotos;
    }

    public void setIdCatalogoFotos(Long idCatalogoFotos) {
        this.idCatalogoFotos = idCatalogoFotos;
    }

}
