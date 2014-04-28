/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oima.project.DDDProperty.controller;

import com.oima.project.DDDProperty.model.dto.CodigoPostal;
import com.oima.project.DDDProperty.model.dto.Colonia;
import com.oima.project.DDDProperty.model.dto.Estado;
import com.oima.project.DDDProperty.model.dto.Localidad;
import com.oima.project.DDDProperty.model.dto.Pais;
import com.oima.project.DDDProperty.model.dto.Usuario;
import static com.opensymphony.xwork2.Action.SUCCESS;
import java.util.List;

/**
 *
 * @author OIMA
 */
public class ControlAdministrador extends ControlEstado{
    private List<Pais> listaPais;
    private List<Estado> listaEstado;
    private List<Localidad> listaLocalidad;
    private List<CodigoPostal> listaCodigoPostal;
    private List<Colonia> listaColonia;
    private List<Usuario> listaUsuario;
    
    public String operacion;

    public String consultarDatos() throws Exception {
        listaPais = getServicioPais().consultarTodos(Pais.class);
        listaEstado = servicioEstado.consultarTodos(Estado.class);
        listaLocalidad = servicioLocalidad.consultarTodos(Localidad.class);
        return SUCCESS;
    }

    public String getOperacion() {
        return operacion;
    }

    public void setOperacion(String operacion) {
        this.operacion = operacion;
    }

    public List<Pais> getListaPais() {
        return listaPais;
    }

    public void setListaPais(List<Pais> listaPais) {
        this.listaPais = listaPais;
    }

    public List<Localidad> getListaLocalidad() {
        return listaLocalidad;
    }

    public void setListaLocalidad(List<Localidad> listaLocalidad) {
        this.listaLocalidad = listaLocalidad;
    }

    public List<CodigoPostal> getListaCodigoPostal() {
        return listaCodigoPostal;
    }

    public void setListaCodigoPostal(List<CodigoPostal> listaCodigoPostal) {
        this.listaCodigoPostal = listaCodigoPostal;
    }

    public List<Colonia> getListaColonia() {
        return listaColonia;
    }

    public void setListaColonia(List<Colonia> listaColonia) {
        this.listaColonia = listaColonia;
    }

    public List<Usuario> getListaUsuario() {
        return listaUsuario;
    }

    public void setListaUsuario(List<Usuario> listaUsuario) {
        this.listaUsuario = listaUsuario;
    }

    public List<Estado> getListaEstado() {
        return listaEstado;
    }

    public void setListaEstado(List<Estado> listaEstado) {
        this.listaEstado = listaEstado;
    }
}
