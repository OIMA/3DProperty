/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oima.project.DDDProperty.controller;

import com.oima.project.DDDProperty.model.dto.Contrato;
import com.oima.project.DDDProperty.model.dto.Propiedad;
import com.oima.project.DDDProperty.model.dto.Usuario;
import com.oima.project.DDDProperty.utilities.Controller;
import static com.opensymphony.xwork2.Action.SUCCESS;
import java.util.List;

/**
 *
 * @author OIMA
 */
public class ControlContrato extends Controller{
    
    private Contrato contrato;
    private List<Contrato> listaContrato;
    private List<Usuario> listaUsuario;
    private List<Propiedad> listaPropiedad;
    private Long idContrato;
    private String term;

    public String guardar() throws Exception {
        contrato.setStatus(Boolean.TRUE);
        servicioContrato.guardar(contrato);
        return SUCCESS;
    }

    public String eliminar() throws Exception {
        servicioContrato.eliminar(idContrato);
        return SUCCESS;
    }

    public String editar() throws Exception {
        servicioContrato.editar(contrato);
        return SUCCESS;
    }

    public String consultarTodos() throws Exception {
        System.out.println("Consulta todas las contratos");
        listaContrato = servicioContrato.consultarTodos(Contrato.class);
        return SUCCESS;
    }

    public String consultarUnico() throws Exception {
        contrato = servicioContrato.consultarUnico(idContrato);
        consultarTodos();
        return SUCCESS;
    }

    public String consultarUsuarios() throws Exception{
        listaUsuario = servicioUsuario.consultarTodos(Usuario.class);
        return SUCCESS;
    }
    
    public String consultarPropiedades() throws Exception{
        listaPropiedad = servicioPropiedad.consultarTodos(Propiedad.class);
        return SUCCESS;
    }
    
    
    public Contrato getContrato() {
        return contrato;
    }

    public void setContrato(Contrato contrato) {
        this.contrato = contrato;
    }

    public List<Contrato> getListaContrato() {
        return listaContrato;
    }

    public void setListaContrato(List<Contrato> listaContrato) {
        this.listaContrato = listaContrato;
    }

    public Long getIdContrato() {
        return idContrato;
    }

    public void setIdContrato(Long idContrato) {
        this.idContrato = idContrato;
    }

    /**
     * @return the listaUsuario
     */
    public List<Usuario> getListaUsuario() {
        return listaUsuario;
    }

    /**
     * @param listaUsuario the listaUsuario to set
     */
    public void setListaUsuario(List<Usuario> listaUsuario) {
        this.listaUsuario = listaUsuario;
    }

    /**
     * @return the term
     */
    public String getTerm() {
        return term;
    }

    /**
     * @param term the term to set
     */
    public void setTerm(String term) {
        this.term = term;
    }

    /**
     * @return the listaPropiedad
     */
    public List<Propiedad> getListaPropiedad() {
        return listaPropiedad;
    }

    /**
     * @param listaPropiedad the listaPropiedad to set
     */
    public void setListaPropiedad(List<Propiedad> listaPropiedad) {
        this.listaPropiedad = listaPropiedad;
    }

}
