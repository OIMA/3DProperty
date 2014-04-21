/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ingluis.tecweb.sesiones.modelo.dao.Impl;

import ingluis.tecweb.sesiones.modelo.dao.UsuariosDao;
import ingluis.tecweb.sesiones.modelo.dto.UsuariosDTO;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author luis
 */
public class UsuariosDaoImpl extends DaoSupport implements UsuariosDao {

    @Override
    public UsuariosDTO validarUsuario(String usuario) throws Exception {
        Session session = null;
        session = this.getSession();
        try {
            Criteria criteria = session.createCriteria(UsuariosDTO.class);
            criteria.add(Restrictions.eq("usuario", usuario));
            return (UsuariosDTO)criteria.uniqueResult();
        } catch (Exception e) {
            throw e;
        } finally {
            this.releaseSession(session);
        }
    }
    
}


