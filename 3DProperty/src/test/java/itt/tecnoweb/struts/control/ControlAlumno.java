/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package itt.tecnoweb.struts.control;

import com.opensymphony.xwork2.ActionSupport;
import itt.tecnoweb.struts.modelo.dto.Alumno;
import itt.tecnoweb.struts.servicio.ServicioAlumno;
import java.util.List;

/**
 *
 * @author OIMA
 */
public class ControlAlumno extends ActionSupport {

    private Alumno alumno;
    private String txt;
    private ServicioAlumno servicioAlumno;
    private List<Alumno> listaAlumnos;

//    public String guardar() {
//        System.out.println("Nombre: " + alumno.getNombre());
//        System.out.println("Semestre: " + alumno.getSemestre());
//        System.out.println("Carrera: " + alumno.getCarrera());
//
//        if (alumno.getSemestre() < 6 && alumno.getSemestre() > 0) {
//            setTxt("Estas en los primeros semestres");
//            return "primeros";
//        } else if (alumno.getSemestre() < 9) {
//            setTxt("Te falta poco para terminar");
//            return "intermedios";
//        } else {
//            setTxt("Te falta residencia y te titulas");
//        }
//        return "avanzados";
//    }
    
    public String guardarAlumno(){
        try {
            getServicioAlumno().guardarAlumno(getAlumno());
            setTxt("Alumno insertado correctamente");
            return "alumnoInsertado";
        } catch (Exception ex) {
            System.out.println("ERROR:-->"+ex.getMessage());
            return "errorInsercionAlumno";
        }
    }
    
    public String consultarAlumno(){
        try {
            setListaAlumnos(getServicioAlumno().consultarAlumno());
        } catch (Exception ex) {
            System.out.println("ERROR:-->"+ex.getMessage());
        }
        return "consultarAlumno";
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    public String getTxt() {
        return txt;
    }

    public void setTxt(String txt) {
        this.txt = txt;
    }

    public ServicioAlumno getServicioAlumno() {
        return servicioAlumno;
    }

    public void setServicioAlumno(ServicioAlumno servicioAlumno) {
        this.servicioAlumno = servicioAlumno;
    }

    public List<Alumno> getListaAlumnos() {
        return listaAlumnos;
    }

    public void setListaAlumnos(List<Alumno> listaAlumnos) {
        this.listaAlumnos = listaAlumnos;
    }

}
