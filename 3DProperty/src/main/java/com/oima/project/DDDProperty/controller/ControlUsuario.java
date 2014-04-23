/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.oima.project.DDDProperty.controller;

import com.oima.project.DDDProperty.model.dto.Pais;
import com.oima.project.DDDProperty.model.dto.Usuario;
import com.oima.project.DDDProperty.utilities.Controller;
import java.util.List;
import static com.opensymphony.xwork2.Action.SUCCESS;

/**
 *
 * @author OIMA
 */
public class ControlUsuario extends Controller{
    private List<Pais> listaPaises;
    private Long idUsuario;
    private Usuario usuario;
    
    public String consultaUsuario(){
        
        return SUCCESS;
    }
    
    public String consultaPaises() throws Exception{
        getServicioPais().consultarTodos(Pais.class);
        return SUCCESS;
    }

    public List<Pais> getListaPaises() {
        return listaPaises;
    }

    public void setListaPaises(List<Pais> listaPaises) {
        this.listaPaises = listaPaises;
    }

    public Long getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Long idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
