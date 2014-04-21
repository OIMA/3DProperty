/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oima.project.DDDProperty.services.impl;

import com.oima.project.DDDProperty.model.dao.QueryDAO;
import com.oima.project.DDDProperty.model.dto.Pago;
import com.oima.project.DDDProperty.services.Servicio;
import java.util.List;

/**
 *
 * @author Jesus
 */
public class ServicioPago implements Servicio {

    private QueryDAO query;

    public void guardar(Object o) throws Exception {
        Pago pago = (Pago) o;
        query.guardar(pago);
    }

    public List<Pago> consultar(Class c) throws Exception {
        return query.consultar(c);
    }

    public void eliminar(Long id) throws Exception {
        Pago pago = (Pago) query.consultarUnico(id, Pago.class, "Pago");
        pago.setStatus(Byte.parseByte("0"));
        query.editar(pago);
    }

    public void editar(Object o) throws Exception {
        Pago pago = (Pago) o;
        query.editar(pago);
    }

    public Pago consultarUnico(Long id, Class c, String tabla) throws Exception {
        return (Pago) query.consultarUnico(id, c, "Pago");
    }

    /**
     * @return the query
     */
    public QueryDAO getQuery() {
        return query;
    }

    /**
     * @param query the query to set
     */
    public void setQuery(QueryDAO query) {
        this.query = query;
    }
}
