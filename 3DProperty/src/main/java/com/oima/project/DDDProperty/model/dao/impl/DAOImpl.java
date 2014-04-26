/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.oima.project.DDDProperty.model.dao.impl;

import com.oima.project.DDDProperty.model.dao.DaoSupport;
import com.oima.project.DDDProperty.model.dao.DAO;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Property;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author Jesus
 */
public class DAOImpl extends DaoSupport implements DAO{

    public Boolean oneToMany=false;
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
        } 
        finally {
            if (oneToMany) {
                this.releaseSession(session);
            }
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
        }
        finally {
            if (oneToMany) {
                this.releaseSession(session);
            }
        }
    }

    public List consultarTodos(Class clase) throws Exception {
        Session session = null;
        session = this.getSession();
        try {
            Criteria criterio = session.createCriteria(clase);
            criterio.add(Restrictions.eq("status", true));
            //criterio.add(Restrictions.eq("semestre", 1));
            return criterio.list();
        } catch (Exception e) {
            System.out.println("Error de consulta " + e.getMessage());
            throw e;
        } 
        finally {
            if (oneToMany) {
                this.releaseSession(session);
            }
        }
    }

    public Object consultarUnico(Long primaryKey, Class clase, String tabla) throws Exception {
        Session session = null;
        session = this.getSession();
        try {
            Criteria criterio = session.createCriteria(clase);
            criterio.add(Restrictions.eq("id"+tabla, Long.valueOf(primaryKey)));
            criterio.add(Restrictions.eq("status", true));
            return  criterio.uniqueResult();
        } catch (Exception e) {
            System.out.println("Error de consulta " + e.getMessage());
            throw e;
        } 
        finally {
            if (oneToMany) {
                this.releaseSession(session);
            }
        }
    }

    /**
     * Metodo que devuelve una lista, consulta los elementos
     * @param campo el campo a consultar
     * @param contenido ¿Que debe de tener? 1 o 2  "gato" o perro
     * @param predicado equal, lower o greater
     * @param clase ¿Que clase es?
     * @param orderBy arreglo de dos posiciones [1 asc o desc] [2 campo]
     * @return List, que es el resultado de la consulta OJO!!! puede devolver un vacio
     * @throws Exception 
     */
    public List consultaPorCampoEspecifico(String campo, Object contenido, String predicado, Class clase, String[] orderBy) throws Exception {
        Session session = null;
        session = this.getSession();
        try {
            Criteria criterio = session.createCriteria(clase);
            System.out.println("antes de las restricciones"+criterio.list().size());
            if (predicado.equals("equal")) {
                criterio.add(Restrictions.eq(campo, contenido));
                System.out.println("Despues del equals"+criterio.list().size());
            } else if (predicado.equals("lower")) {
                criterio.add(Restrictions.lt(campo, contenido));
            } else if (predicado.equals("greater")) {
                criterio.add(Restrictions.gt(campo, contenido));
            }
            
            if (orderBy != null) {
                if (orderBy[0].equals("asc")) {
                    criterio.addOrder(Order.asc(orderBy[1]));
                } else {
                    criterio.addOrder(Order.desc(orderBy[1]));
                }
            }
            
            criterio.add(Restrictions.eq("status", true));
            System.out.println("Despues de borrar los que no estaban"+criterio.list().size());
            return criterio.list();
        } catch (Exception e) {
            System.out.println("Error de consulta " + e.getMessage());
            throw e;
        } finally {
            if (oneToMany) {
                this.releaseSession(session);
            }
        }
    }
}
