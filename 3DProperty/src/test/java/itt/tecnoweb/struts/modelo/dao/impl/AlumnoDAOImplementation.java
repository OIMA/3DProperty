/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package itt.tecnoweb.struts.modelo.dao.impl;

import itt.tecnoweb.struts.modelo.dao.AlumnoDAO;
import itt.tecnoweb.struts.modelo.dto.Alumno;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Property;
import org.hibernate.criterion.Restrictions;
import org.springframework.dao.DataAccessException;

/**
 *
 * @author OIMA
 */
public class AlumnoDAOImplementation extends DAOSupport implements AlumnoDAO {

    @Override
    public void guardarAlumno(Alumno alumno) throws Exception {
        Session session;
        session = getSession();
        try {
            save(alumno);
        } catch (Exception e) {
            System.out.println("Error de inserción _********-------> " + e.getMessage());
            throw e;
        } finally {
            this.releaseSession(session);
        }
    }

    public List<Alumno> consultaAlumno() throws Exception {
        Session session;
        session = getSession();
        try {
            Criteria criteria = session.createCriteria(Alumno.class);
            criteria.addOrder(Property.forName("nombre").asc());
//            criteria.add(Restrictions.eq("semestre", 1));
            return (List<Alumno>) criteria.list();
        } catch (Exception e) {
            System.out.println("Error de consulta  _********-------> " + e.getMessage());
            throw e;
        } finally {
            this.releaseSession(session);
        }
    }

    public List<Alumno> consultarAlumno() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void editarAlumno(int idAlumno) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void consultarCarrera(int idCarrera) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void borrarCarrera(int idCarrera) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
