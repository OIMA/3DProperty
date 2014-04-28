/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oima.project.DDDProperty.controller;

import com.oima.project.DDDProperty.model.dto.Favorito;
import com.oima.project.DDDProperty.utilities.Controller;
import static com.opensymphony.xwork2.Action.SUCCESS;
import java.util.List;

/**
 *
 * @author OIMA
 */
public class ControlFavorito extends Controller{
    
    private Favorito favorito;
    private List<Favorito> listaFavorito;
    private Long idFavorito;

    public String guardar() throws Exception {
        favorito.setStatus(Boolean.TRUE);
        servicioFavorito.guardar(favorito);
        consultarTodos();
        return SUCCESS;
    }

    public String eliminar() throws Exception {
        System.out.println("Se va a eliminar"+idFavorito);
        servicioFavorito.eliminar(idFavorito);
        return SUCCESS;
    }

    public String editar() throws Exception {
        servicioFavorito.editar(favorito);
        return SUCCESS;
    }

    public String consultarTodos() throws Exception {
        listaFavorito = servicioFavorito.consultarTodos(Favorito.class);
        return SUCCESS;
    }

    public String consultarUnico() throws Exception {
        favorito = servicioFavorito.consultarUnico(idFavorito);
        consultarTodos();
        return SUCCESS;
    }

    public Favorito getFavorito() {
        return favorito;
    }

    public void setFavorito(Favorito favorito) {
        this.favorito = favorito;
    }

    public List<Favorito> getListaFavorito() {
        return listaFavorito;
    }

    public void setListaFavorito(List<Favorito> listaFavorito) {
        this.listaFavorito = listaFavorito;
    }

    public Long getIdFavorito() {
        return idFavorito;
    }

    public void setIdFavorito(Long idFavorito) {
        this.idFavorito = idFavorito;
    }

}
