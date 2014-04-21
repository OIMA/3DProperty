/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.oima.project.DDDProperty.model.dao.impl;

import com.oima.project.DDDProperty.model.dao.DaoSupport;
import com.oima.project.DDDProperty.model.dao.QueryDAO;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Property;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author Jesus
 */
public class QueryDAOImpl extends DaoSupport implements QueryDAO{

    public void guardar(Object objeto) throws Exception {
        Session session = null;
        session = this.getSession();
        try {
            System.out.println("Se va a guardar el objeto: " + objeto);
            save(objeto);
            System.out.println("Se guardo el objeto: "+objeto);
        } catch (Exception e) {
            System.out.println("Error al intentar guardar el objeto "+objeto+"\n el error dice" + e.getMessage());
            throw e;
        } finally {
            this.releaseSession(session);
        }
    }

    public void eliminar(Long primaryKey) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void editar(Object objeto) throws Exception {
        Session session = null;
        session = this.getSession();
        try {
            System.out.println("Va a editar el objeto: " + objeto);
            update(objeto);
            System.out.println("Edito el el objeto: "+objeto);
        } catch (Exception e) {
            System.out.println("Error al intentar guardar el objeto "+objeto+"\n el error dice" + e.getMessage());
            throw e;
        } finally {
            this.releaseSession(session);
        }
    }

    public List consultar(Class clase) throws Exception {
        Session session = null;
        session = this.getSession();
        try {
            Criteria criterio = session.createCriteria(clase);
            criterio.add(Restrictions.eq("status", Byte.parseByte("1")));
            //criterio.add(Restrictions.eq("semestre", 1));
            return criterio.list();
        } catch (Exception e) {
            System.out.println("Error de consulta " + e.getMessage());
            throw e;
        } finally {
            this.releaseSession(session);
        }
    }

    public Object consultarUnico(Long primaryKey, Class clase, String tabla) throws Exception {
        Session session = null;
        session = this.getSession();
        try {
            Criteria criterio = session.createCriteria(clase);
            criterio.add(Restrictions.eq("id"+tabla, Long.valueOf(primaryKey)));
            return  criterio.uniqueResult();
        } catch (Exception e) {
            System.out.println("Error de consulta " + e.getMessage());
            throw e;
        } finally {
            this.releaseSession(session);
        }
    }

}
