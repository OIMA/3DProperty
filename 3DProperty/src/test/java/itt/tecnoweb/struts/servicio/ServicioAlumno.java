/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package itt.tecnoweb.struts.servicio;

import itt.tecnoweb.struts.modelo.dto.Alumno;
import java.util.List;

/**
 *
 * @author OIMA
 */
public interface ServicioAlumno {
    public void guardarAlumno(Alumno alumno) throws Exception;
    public List<Alumno> consultarAlumno() throws Exception;
    public void editarAlumno(int idAlumno) throws Exception;
    public void consultarCarrera(int idCarrera) throws Exception;
    public void borrarCarrera(int idCarrera) throws Exception;
}
