/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oima.project.DDDProperty.controller;

import com.oima.project.DDDProperty.model.dto.Categoria;
import com.oima.project.DDDProperty.utilities.Controller;
import static com.opensymphony.xwork2.Action.SUCCESS;
import java.util.List;

/**
 *
 * @author OIMA
 */
public class ControlCategoria extends Controller{
    
    private Categoria categoria;
    private List<Categoria> listaCategoria;
    private Long idCategoria;

    public String guardar() throws Exception {
        categoria.setStatus(Boolean.TRUE);
        servicioCategoria.guardar(categoria);
        return SUCCESS;
    }

    public String eliminar() throws Exception {
        servicioCategoria.eliminar(idCategoria);
        return SUCCESS;
    }

    public String editar() throws Exception {
        servicioCategoria.editar(categoria);
        return SUCCESS;
    }

    public String consultarTodos() throws Exception {
        System.out.println("Consulta todas las categorias");
        listaCategoria = servicioCategoria.consultarTodos(Categoria.class);
        return SUCCESS;
    }

    public String consultarUnico() throws Exception {
        categoria = servicioCategoria.consultarUnico(idCategoria);
        consultarTodos();
        return SUCCESS;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public List<Categoria> getListaCategoria() {
        return listaCategoria;
    }

    public void setListaCategoria(List<Categoria> listaCategoria) {
        this.listaCategoria = listaCategoria;
    }

    public Long getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(Long idCategoria) {
        this.idCategoria = idCategoria;
    }

}
