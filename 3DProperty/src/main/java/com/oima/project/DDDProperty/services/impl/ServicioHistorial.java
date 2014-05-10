/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.oima.project.DDDProperty.services.impl;

import com.oima.project.DDDProperty.model.dao.DAO;
import com.oima.project.DDDProperty.model.dto.Historial;
import java.util.List;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author OIMA
 */
public class ServicioHistorial {
    private DAO query;

    @Transactional
    public void guardar(Object objeto) throws Exception {
        query.guardar(objeto);
    }

    @Transactional
    public void eliminar(Long primaryKey) throws Exception {
        Historial historial = (Historial)consultarUnico(primaryKey);
        historial.setStatus(Boolean.FALSE);
        editar(historial);
    }

    @Transactional
    public void editar(Object object) throws Exception {
        query.editar(object);
    }

    public List consultarTodos(Class clase) throws Exception {
        System.out.println("va a consultar por nombre");
        return query.consultarTodos(clase);
    }

    public Historial consultarUnico(Long primaryKey) throws Exception {
        return (Historial)query.consultarUnico(primaryKey, Historial.class, "Historial");
    }

    public DAO getQuery() {
        return query;
    }

    public void setQuery(DAO query) {
        this.query = query;
    }
    
}

