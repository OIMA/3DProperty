/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.oima.project.DDDProperty.services.impl;

import com.oima.project.DDDProperty.model.dao.DAO;
import com.oima.project.DDDProperty.model.dto.CatalogoFotos;
import com.oima.project.DDDProperty.model.dto.Pais;
import java.util.List;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author OIMA
 */
public class ServicioCatalogoFotos {
    private DAO query;

    @Transactional
    public void guardar(Object objeto) throws Exception {
        System.out.println("Segun se va a gruadar");
        query.guardar(objeto);
    }

    @Transactional
    public void eliminar(Long primaryKey) throws Exception {
        CatalogoFotos catalogoFotos = (CatalogoFotos)consultarUnico(primaryKey);
        catalogoFotos.setStatus(Boolean.FALSE);
        editar(catalogoFotos);
    }

    @Transactional
    public void editar(Object object) throws Exception {
        query.editar(object);
    }

    public List consultarTodos(Class clase) throws Exception {
        return query.consultarTodos(clase);
    }

    public Object consultarUnico(Long primaryKey) throws Exception {
        return query.consultarUnico(primaryKey, CatalogoFotos.class, "CatalogoFotos");
    }

    public DAO getQuery() {
        return query;
    }

    public void setQuery(DAO query) {
        this.query = query;
    }
}
