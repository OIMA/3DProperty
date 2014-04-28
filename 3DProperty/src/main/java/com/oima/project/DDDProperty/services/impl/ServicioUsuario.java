/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.oima.project.DDDProperty.services.impl;

import com.oima.project.DDDProperty.model.dao.DAO;
import com.oima.project.DDDProperty.model.dto.Usuario;
import java.util.List;

/**
 *
 * @author OIMA
 */
public class ServicioUsuario {
    private DAO query;

    public void guardar(Object objeto) throws Exception {
        query.guardar(objeto);
    }

    public void eliminar(Long primaryKey) throws Exception {
        Usuario usuario = (Usuario)consultarUnico(primaryKey);
        usuario.setStatus(Boolean.FALSE);
        editar(usuario);
    }

    public void editar(Object object) throws Exception {
        query.editar(object);
    }

    public List consultarTodos(Class clase) throws Exception {
        return query.consultarTodos(clase);
    }

    public Usuario consultarUnico(Long primaryKey) throws Exception {
        return (Usuario)query.consultarUnico(primaryKey, Usuario.class, "Usuario");
    }
    
    public List<Usuario> consultarPorCampoEspecifico(String campo, Object objeto, String predicado, String[] order) throws Exception {
        return query.consultaPorCampoEspecifico(campo, objeto, predicado, Usuario.class, order);
    }

    public DAO getQuery() {
        return query;
    }

    public void setQuery(DAO query) {
        this.query = query;
    }
    
}
