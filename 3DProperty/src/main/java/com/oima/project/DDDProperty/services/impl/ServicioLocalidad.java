/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.oima.project.DDDProperty.services.impl;

import com.oima.project.DDDProperty.model.dao.DAO;
import com.oima.project.DDDProperty.model.dto.Estado;
import com.oima.project.DDDProperty.model.dto.Localidad;
import java.util.List;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author OIMA
 */
public class ServicioLocalidad {
    private DAO query;

    @Transactional
    public void guardar(Object objeto) throws Exception {
        query.guardar(objeto);
    }

    @Transactional
    public void eliminar(Long primaryKey) throws Exception {
        Localidad localidad = (Localidad)consultarUnico(primaryKey);
        localidad.setStatus(Boolean.FALSE);
        editar(localidad);
    }

    @Transactional
    public void editar(Object object) throws Exception {
        query.editar(object);
    }

    public List consultarTodos(Class clase) throws Exception {
        return query.consultarTodos(clase);
    }

    public Localidad consultarUnico(Long primaryKey) throws Exception {
        return (Localidad)query.consultarUnico(primaryKey, Localidad.class, "Localidad");
    }

    public DAO getQuery() {
        return query;
    }

    public void setQuery(DAO query) {
        this.query = query;
    }

    public List<Localidad> consultarPorIdEstado(Long idEstado) throws Exception{
        return query.consultaPorCampoEspecifico("idEstado.idEstado", idEstado, "equal", Localidad.class, null);
    }
    
}
