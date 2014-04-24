/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oima.project.DDDProperty.services.impl;

import com.oima.project.DDDProperty.model.dao.DAO;
import com.oima.project.DDDProperty.model.dto.Pago;
import java.util.List;

/**
 *
 * @author Jesus
 */
public class ServicioPago {

    private DAO query;

    public void guardar(Object o) throws Exception {
        Pago pago = (Pago) o;
        query.guardar(pago);
    }

    public List<Pago> consultarTodos(Class c) throws Exception {
        return query.consultarTodos(c);
    }

    public void eliminar(Long id) throws Exception {
        Pago pago = (Pago) query.consultarUnico(id, Pago.class, "Pago");
        pago.setStatus(false);
        query.editar(pago);
    }

    public void editar(Object o) throws Exception {
        Pago pago = (Pago) o;
        query.editar(pago);
    }

    public Pago consultarUnico(Long id) throws Exception {
        return (Pago) query.consultarUnico(id, Pago.class, "Pago");
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
