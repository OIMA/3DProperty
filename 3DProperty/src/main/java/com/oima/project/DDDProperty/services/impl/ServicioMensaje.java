/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.oima.project.DDDProperty.services.impl;

import com.oima.project.DDDProperty.model.dao.DAO;
import com.oima.project.DDDProperty.model.dto.Mensaje;
import java.util.List;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author OIMA
 */
public class ServicioMensaje {
    private DAO query;

    @Transactional
    public void guardar(Object o) throws Exception {
        Mensaje mensaje = (Mensaje) o;
        query.guardar(mensaje);
    }

    @Transactional
    public List<Mensaje> consultarTodos(Class c) throws Exception {
        return query.consultarTodos(c);
    }

    @Transactional
    public void eliminar(Long id) throws Exception {
        Mensaje mensaje = (Mensaje) query.consultarUnico(id, Mensaje.class, "Mensaje");
        mensaje.setStatus(false);
        query.editar(mensaje);
    }

    public void editar(Object o) throws Exception {
        Mensaje mensaje = (Mensaje) o;
        query.editar(mensaje);
    }

    public Mensaje consultarUnico(Long id) throws Exception {
        return (Mensaje) query.consultarUnico(id, Mensaje.class, "Mensaje");
    }

    /**
     * @return the query
     */
    public DAO getQuery() {
        return query;
    }

    /**
     * @param query the query to set
     */
    public void setQuery(DAO query) {
        this.query = query;
    }
    
}
