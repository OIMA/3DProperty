/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.oima.project.DDDProperty.services.impl;

import com.oima.project.DDDProperty.model.dao.DAO;
import com.oima.project.DDDProperty.model.dto.Estado;
import java.util.List;

/**
 *
 * @author OIMA
 */
public class ServicioEstado {
    private DAO query;

    public void guardar(Object objeto) throws Exception {
        query.guardar(objeto);
    }

    public void eliminar(Long primaryKey) throws Exception {
        Estado estado = (Estado)consultarUnico(primaryKey);
        estado.setStatus(Boolean.FALSE);
        editar(estado);
    }

    public void editar(Object object) throws Exception {
        query.editar(object);
    }

    public List consultarTodos(Class clase) throws Exception {
        System.out.println("CONSULTA LOS ESTADOS");
        return query.consultarTodos(clase);
    }

    public Estado consultarUnico(Long primaryKey) throws Exception {
        return (Estado)query.consultarUnico(primaryKey, Estado.class, "Estado");
    }

    public List<Estado> consultarPorIdPais(Long idPais) throws Exception {
        return query.consultaPorCampoEspecifico("idPais.idPais", idPais, "equal", Estado.class, null);
    }
    
    public DAO getQuery() {
        return query;
    }

    public void setQuery(DAO query) {
        this.query = query;
    }
    
}

