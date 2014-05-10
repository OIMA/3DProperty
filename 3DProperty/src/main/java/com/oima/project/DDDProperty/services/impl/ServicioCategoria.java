/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.oima.project.DDDProperty.services.impl;

import com.oima.project.DDDProperty.model.dao.DAO;
import com.oima.project.DDDProperty.model.dto.Categoria;
import java.util.List;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author OIMA
 */
public class ServicioCategoria {
    private DAO query;

    @Transactional
    public void guardar(Object objeto) throws Exception {
        query.guardar(objeto);
    }

    @Transactional
    public void eliminar(Long primaryKey) throws Exception {
        Categoria categoria = (Categoria)consultarUnico(primaryKey);
        categoria.setStatus(Boolean.FALSE);
        editar(categoria);
    }

    @Transactional
    public void editar(Object object) throws Exception {
        query.editar(object);
    }

    public List consultarTodos(Class clase) throws Exception {
        return query.consultarTodos(clase);
    }

    public Categoria consultarUnico(Long primaryKey) throws Exception {
        return (Categoria)query.consultarUnico(primaryKey, Categoria.class, "Categoria");
    }

    public DAO getQuery() {
        return query;
    }

    public void setQuery(DAO query) {
        this.query = query;
    }
}
