/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oima.project.DDDProperty.controller;

import com.oima.project.DDDProperty.model.dto.Pais;
import com.oima.project.DDDProperty.utilities.Controller;
import static com.opensymphony.xwork2.Action.SUCCESS;
import java.util.List;

/**
 *
 * @author OIMA
 */
public class ControlPais extends Controller{
    
    private Pais pais;
    private List<Pais> listaPais;
    private Long idPais;

    public String guardar() throws Exception {
        pais.setStatus(Boolean.TRUE);
        servicioPais.guardar(pais);
        return SUCCESS;
    }

    public String eliminar() throws Exception {
        servicioPais.eliminar(idPais);
        return SUCCESS;
    }

    public String editar() throws Exception {
        servicioPais.editar(pais);
        return SUCCESS;
    }

    public String consultarTodos() throws Exception {
        listaPais = servicioPais.consultarTodos(Pais.class);
        return SUCCESS;
    }

    public String consultarUnico() throws Exception {
        pais = servicioPais.consultarUnico(idPais);
        consultarTodos();
        return SUCCESS;
    }

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }

    public List<Pais> getListaPais() {
        return listaPais;
    }

    public void setListaPais(List<Pais> listaPais) {
        this.listaPais = listaPais;
    }

    public Long getIdPais() {
        return idPais;
    }

    public void setIdPais(Long idPais) {
        this.idPais = idPais;
    }

}
