/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package itt.tecnoweb.struts.servicio.impl;

import itt.tecnoweb.struts.modelo.dao.AlumnoDAO;
import itt.tecnoweb.struts.modelo.dto.Alumno;
import itt.tecnoweb.struts.servicio.ServicioAlumno;
import java.util.List;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author OIMA
 */
public class ServicioAlumnoImplementation implements ServicioAlumno{
 
    private AlumnoDAO alumnoDAO;
    
    @Override
    @Transactional
    public void guardarAlumno(Alumno alumno) throws Exception {
        this.getAlumnoDAO().guardarAlumno(alumno);
    }

    

    public List<Alumno> consultaAlumno() throws Exception {
        return this.getAlumnoDAO().consultarAlumno();
        
    }
    public AlumnoDAO getAlumnoDAO() {
        return alumnoDAO;
    }
        
    public void setAlumnoDAO(AlumnoDAO alumnoDAO) {
        this.alumnoDAO = alumnoDAO;
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
