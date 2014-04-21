package ingluis.tecweb.sesiones.modelo.dao.Impl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Order;
import org.springframework.dao.DataAccessException;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

public class DaoSupport extends HibernateDaoSupport {

    /**
     * Obtiene todos los elemetos de una tabla ordenados opcionalmente.
     * 
     * param clase param orderBy
     * 
     * return
     * 
     * @throws DataAccessException
     */
    @SuppressWarnings("unchecked")
    public List fetch(Class clase, String orderBy) throws DataAccessException {
        List lista = new ArrayList();
        Session session = this.getSessionFactory().openSession();
        Criteria criteria = session.createCriteria(clase);

        if (orderBy != null) {
            criteria.addOrder(Order.asc(orderBy));
        }

        lista = criteria.list();

        if (session != null && session.isOpen()) {
            session.close();
        }
        return lista;
    }

    /**
     * Búsqueda de una entidad por llave (String).
     * 
     * param clase param keyValue
     * 
     * return
     * 
     * @throws DataAccessException
     */
    @SuppressWarnings("unchecked")
    public Object get(Class clase, String keyValue) throws DataAccessException {
        return getHibernateTemplate().get(clase, keyValue);
    }

    /**
     * Búsqueda de una entidad por llave (Short).
     * 
     * param clase param keyValue
     * 
     * return
     * 
     * @throws DataAccessException
     */
    @SuppressWarnings("unchecked")
    public Object get(Class clase, Short keyValue) throws DataAccessException {
        return getHibernateTemplate().get(clase, keyValue);
    }

    /**
     * Búsqueda de una entidad por llave (Integer).
     * 
     * param clase param keyValue
     * 
     * return
     * 
     * @throws DataAccessException
     */
    @SuppressWarnings("unchecked")
    public Object get(Class clase, Integer keyValue) throws DataAccessException {
        return getHibernateTemplate().get(clase, keyValue);
    }

    /**
     * Búsqueda de una entidad por llave (Long).
     * 
     * param clase param keyValue
     * 
     * return
     * 
     * @throws DataAccessException
     */
    @SuppressWarnings("unchecked")
    public Object get(Class clase, Long keyValue) throws DataAccessException {
        return getHibernateTemplate().get(clase, keyValue);
    }

    /**
     * Búsqueda de una entidad por llave primaria compuesta (PK).
     * 
     * param clase param pk
     * 
     * return
     * 
     * @throws DataAccessException
     */
    @SuppressWarnings("unchecked")
    public Object get(Class clase, Serializable pk) throws DataAccessException {
        return getHibernateTemplate().get(clase, pk);
    }

    /**
     * Guarda o actualiza una entidad.
     * 
     * param obj
     * 
     * @throws DataAccessException
     */
    public void saveOrUpdate(Object obj) throws DataAccessException {
        getHibernateTemplate().saveOrUpdate(obj);
    }

    /**
     * Guarda una entidad.
     * 
     * param obj
     * 
     * @throws DataAccessException
     */
    public Serializable save(Object obj) throws DataAccessException {

        Serializable ser;
        ser = getHibernateTemplate().save(obj);
        return ser;
    }

    /**
     * Actualiza una entidad.
     * 
     * param obj
     * 
     * @throws DataAccessException
     */
    public void update(Object obj) throws DataAccessException {
        getHibernateTemplate().update(obj);
    }

    /**
     * Borra una entidad por llave (String).
     * 
     * param clase param keyValue
     * 
     * @throws DataAccessException
     */
    @SuppressWarnings("unchecked")
    public void delete(Class clase, String keyValue) throws DataAccessException {
        Object obj = get(clase, keyValue);
        getHibernateTemplate().delete(obj);
    }

    /**
     * Borra una entidad por llave (Short).
     * 
     * param clase param keyValue
     * 
     * @throws DataAccessException
     */
    @SuppressWarnings("unchecked")
    public void delete(Class clase, Short keyValue) throws DataAccessException {
        Object obj = get(clase, keyValue);
        getHibernateTemplate().delete(obj);
    }

    /**
     * Borra una entidad por llave (Integer).
     * 
     * param clase param keyValue
     * 
     * @throws DataAccessException
     */
    @SuppressWarnings("unchecked")
    public void delete(Class clase, Integer keyValue) throws DataAccessException {
        Object obj = get(clase, keyValue);
        getHibernateTemplate().delete(obj);
    }

    /**
     * Borra una entidad por llave (Long).
     * 
     * param clase param keyValue
     * 
     * @throws DataAccessException
     */
    @SuppressWarnings("unchecked")
    public void delete(Class clase, Long keyValue) throws DataAccessException {
        Object obj = get(clase, keyValue);
        getHibernateTemplate().delete(obj);
    }

    /**
     * Borra una entidad por llave compuesta (pk).
     * 
     * param clase param pk
     * 
     * @throws DataAccessException
     */
    @SuppressWarnings("unchecked")
    public void delete(Class clase, Serializable pk) throws DataAccessException {
        Object obj = get(clase, pk);
        getHibernateTemplate().delete(obj);
    }

    /**
     * Borra las entidades que se pasan en una colección.
     * 
     * param collection
     * 
     * @throws DataAccessException
     */
    @SuppressWarnings("unchecked")
    public void deleteAll(Collection collection) throws DataAccessException {
        getHibernateTemplate().deleteAll(collection);
    }

    /**
     * Ejecuta un hql configurado en el archivo hbm.
     * 
     * param query param parameters
     * 
     * return
     * 
     * @throws DataAccessException
     */
    @SuppressWarnings("unchecked")
    public List executeFetchNamedQuery(String query, Object[] parameters) throws DataAccessException {
        List lst;
        lst = getHibernateTemplate().findByNamedQuery(query, parameters);
        return lst;
    }
}