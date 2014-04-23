/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oima.project.DDDProperty.controller;

import com.oima.project.DDDProperty.model.dto.Pais;
import com.oima.project.DDDProperty.services.impl.ServicioPais;
import static com.opensymphony.xwork2.Action.SUCCESS;
import java.util.List;

/**
 *
 * @author OIMA
 */
public class ControlPais {

    private ServicioPais servicioPais;
    private Pais pais;
    private List<Pais> listaPaises;
    private Integer idPais;

    public String guardar() throws Exception {
        System.out.println("Entro a guardar");
        pais.setStatus(Boolean.TRUE);
        servicioPais.guardar(pais);
        return SUCCESS;
    }

    public void eliminar(Long primaryKey) throws Exception {
    }

    public void editar(Object object) throws Exception {
    }

    public String consultarTodos() throws Exception {
        listaPaises = getServicioPais().consultarTodos(Pais.class);
        System.out.println("Paises "+listaPaises);
        return SUCCESS;
    }

    public Object consultarUnico(Long primaryKey, Class clase, String tabla) throws Exception {
        return null;
    }

    public ServicioPais getServicioPais() {
        return servicioPais;
    }

    public void setServicioPais(ServicioPais servicioPais) {
        this.servicioPais = servicioPais;
    }

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }

    public List<Pais> getListaPaises() {
        return listaPaises;
    }

    public void setListaPaises(List<Pais> listaPaises) {
        this.listaPaises = listaPaises;
    }

    public Integer getIdPais() {
        return idPais;
    }

    public void setIdPais(Integer idPais) {
        this.idPais = idPais;
    }

}
