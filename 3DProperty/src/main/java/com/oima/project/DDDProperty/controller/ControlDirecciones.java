/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.oima.project.DDDProperty.controller;

import com.oima.project.DDDProperty.model.dto.Categoria;
import com.oima.project.DDDProperty.model.dto.CodigoPostal;
import com.oima.project.DDDProperty.model.dto.Colonia;
import com.oima.project.DDDProperty.model.dto.Estado;
import com.oima.project.DDDProperty.model.dto.Localidad;
import com.oima.project.DDDProperty.model.dto.Pais;
import com.oima.project.DDDProperty.model.dto.Propiedad;
import com.oima.project.DDDProperty.model.dto.Usuario;
import com.oima.project.DDDProperty.utilities.Controller;
import static com.opensymphony.xwork2.Action.SUCCESS;
import java.util.List;

/**
 *
 * @author Jesus
 */
public class ControlDirecciones extends Controller {
    private Usuario usuario;
    private Propiedad propiedad;
    private Localidad localidad;
    private List<Pais> listaPais;
    private List<Estado> listaEstado;
    private List<Localidad> listaLocalidad;
    private List<CodigoPostal> listaCodigoPostal;
    private List<Colonia> listaColonia;
    private List<Categoria> listaCategoria;

    private Long idPais;
    private Long idEstado;
    private Long idLocalidad;
    private Long idCodigoPostal;
    private Long idColonia;

    public String consultarPaises() throws Exception {
        listaPais = servicioPais.consultarTodos(Pais.class);
        return SUCCESS;
    }
    
    public String consultarCategorias() throws Exception {
        System.out.println("Hola");
        listaCategoria = servicioCategoria.consultarTodos(Categoria.class);
        System.out.println(listaCategoria.size());
        return SUCCESS;
    }
    
    public String consultarEstadosPorIdPais() throws Exception {
        listaEstado = servicioEstado.consultarPorIdPais(idPais);
        return SUCCESS;
    }
    
    public String consultarLocalidadesPorIdEstado() throws Exception {
        listaLocalidad = servicioLocalidad.consultarPorIdEstado(idEstado);
        return SUCCESS;
    }
    
    public String consultarCodigosPostalesPorIdLocalidad() throws Exception {
        listaCodigoPostal = servicioCodigoPostal.consultarPorIdLocalidad(idLocalidad);
        return SUCCESS;
    }
    
    public String consultarColoniasPorIdCodigoPostal() throws Exception {
        listaColonia = servicioColonia.consultarPorIdCodigoPostal(idCodigoPostal);
        return SUCCESS;
    }
    
    /**
     * @return the usuario
     */
    public Usuario getUsuario() {
        return usuario;
    }

    /**
     * @param usuario the usuario to set
     */
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    /**
     * @return the propiedad
     */
    public Propiedad getPropiedad() {
        return propiedad;
    }

    /**
     * @param propiedad the propiedad to set
     */
    public void setPropiedad(Propiedad propiedad) {
        this.propiedad = propiedad;
    }

    /**
     * @return the listaPais
     */
    public List<Pais> getListaPais() {
        return listaPais;
    }

    /**
     * @param listaPais the listaPais to set
     */
    public void setListaPais(List<Pais> listaPais) {
        this.listaPais = listaPais;
    }

    /**
     * @return the listaEstado
     */
    public List<Estado> getListaEstado() {
        return listaEstado;
    }

    /**
     * @param listaEstado the listaEstado to set
     */
    public void setListaEstado(List<Estado> listaEstado) {
        this.listaEstado = listaEstado;
    }

    /**
     * @return the listaLocalidad
     */
    public List<Localidad> getListaLocalidad() {
        return listaLocalidad;
    }

    /**
     * @param listaLocalidad the listaLocalidad to set
     */
    public void setListaLocalidad(List<Localidad> listaLocalidad) {
        this.listaLocalidad = listaLocalidad;
    }

    /**
     * @return the listaCodigoPostal
     */
    public List<CodigoPostal> getListaCodigoPostal() {
        return listaCodigoPostal;
    }

    /**
     * @param listaCodigoPostal the listaCodigoPostal to set
     */
    public void setListaCodigoPostal(List<CodigoPostal> listaCodigoPostal) {
        this.listaCodigoPostal = listaCodigoPostal;
    }

    /**
     * @return the listaColonia
     */
    public List<Colonia> getListaColonia() {
        return listaColonia;
    }

    /**
     * @param listaColonia the listaColonia to set
     */
    public void setListaColonia(List<Colonia> listaColonia) {
        this.listaColonia = listaColonia;
    }

    /**
     * @return the idPais
     */
    public Long getIdPais() {
        return idPais;
    }

    /**
     * @param idPais the idPais to set
     */
    public void setIdPais(Long idPais) {
        this.idPais = idPais;
    }

    /**
     * @return the idEstado
     */
    public Long getIdEstado() {
        return idEstado;
    }

    /**
     * @param idEstado the idEstado to set
     */
    public void setIdEstado(Long idEstado) {
        this.idEstado = idEstado;
    }

    /**
     * @return the idLocalidad
     */
    public Long getIdLocalidad() {
        return idLocalidad;
    }

    /**
     * @param idLocalidad the idLocalidad to set
     */
    public void setIdLocalidad(Long idLocalidad) {
        this.idLocalidad = idLocalidad;
    }

    /**
     * @return the idCodigoPostal
     */
    public Long getIdCodigoPostal() {
        return idCodigoPostal;
    }

    /**
     * @param idCodigoPostal the idCodigoPostal to set
     */
    public void setIdCodigoPostal(Long idCodigoPostal) {
        this.idCodigoPostal = idCodigoPostal;
    }

    /**
     * @return the idColonia
     */
    public Long getIdColonia() {
        return idColonia;
    }

    /**
     * @param idColonia the idColonia to set
     */
    public void setIdColonia(Long idColonia) {
        this.idColonia = idColonia;
    }

    /**
     * @return the localidad
     */
    public Localidad getLocalidad() {
        return localidad;
    }

    /**
     * @param localidad the localidad to set
     */
    public void setLocalidad(Localidad localidad) {
        this.localidad = localidad;
    }
    
    public void setListaCategoria(List<Categoria> listaCategoria) {
        this.listaCategoria = listaCategoria;
    }

    public List<Categoria> getListaCategoria() {
        return listaCategoria;
    }
    
}
