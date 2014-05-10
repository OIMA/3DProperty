/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.oima.project.DDDProperty.services.impl;

import com.oima.project.DDDProperty.model.dao.DAO;
import com.oima.project.DDDProperty.model.dto.Colonia;
import java.util.List;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author OIMA
 */
public class ServicioColonia {
    private DAO query;

    @Transactional
    public void guardar(Object objeto) throws Exception {
        query.guardar(objeto);
    }

    @Transactional
    public void eliminar(Long primaryKey) throws Exception {
        Colonia colonia = (Colonia)consultarUnico(primaryKey);
        colonia.setStatus(Boolean.FALSE);
        editar(colonia);
    }

    @Transactional
    public void editar(Object object) throws Exception {
        query.editar(object);
    }

    public List consultarTodos(Class clase) throws Exception {
        System.out.println("va a consultar por nombre");
        return query.consultarTodos(clase);
    }

    public Colonia consultarUnico(Long primaryKey) throws Exception {
        return (Colonia)query.consultarUnico(primaryKey, Colonia.class, "Colonia");
    }
    
    public List<Colonia> consultarPorIdCodigoPostal(Long idCodigoPostal) throws Exception{
        return query.consultaPorCampoEspecifico("idCodigoPostal.idCodigoPostal", idCodigoPostal, "equal", Colonia.class, null);
    }

    public DAO getQuery() {
        return query;
    }

    public void setQuery(DAO query) {
        this.query = query;
    }
    
}
