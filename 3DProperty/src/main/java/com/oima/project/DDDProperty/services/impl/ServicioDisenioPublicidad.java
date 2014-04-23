/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.oima.project.DDDProperty.services.impl;

import com.oima.project.DDDProperty.model.dao.DAO;
import com.oima.project.DDDProperty.model.dto.DisenioPublicidad;
import java.util.List;

/**
 *
 * @author OIMA
 */
public class ServicioDisenioPublicidad {
    private DAO query;

    public void guardar(Object objeto) throws Exception {
        query.guardar(objeto);
    }

    public void eliminar(Long primaryKey) throws Exception {
//        DisenioPublicidad disenioPublicidad = (DisenioPublicidad)consultarUnico(primaryKey);
//        disenioPublicidad.setStatus(Boolean.FALSE);
//        editar(disenioPublicidad);
    }

    public void editar(Object object) throws Exception {
        query.editar(object);
    }

    public List consultarTodos(Class clase) throws Exception {
        return query.consultarTodos(clase);
    }

    public Object consultarUnico(Long primaryKey) throws Exception {
        return query.consultarUnico(primaryKey, DisenioPublicidad.class, "DisenioPublicidad");
    }

    public DAO getQuery() {
        return query;
    }

    public void setQuery(DAO query) {
        this.query = query;
    }
    
}

