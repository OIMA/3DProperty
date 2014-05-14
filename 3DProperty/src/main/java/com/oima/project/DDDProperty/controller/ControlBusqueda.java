/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.oima.project.DDDProperty.controller;

import com.oima.project.DDDProperty.model.dto.CatalogoFotos;
import com.oima.project.DDDProperty.model.dto.PalabraClave;
import com.oima.project.DDDProperty.model.dto.Propiedad;
import com.oima.project.DDDProperty.utilities.AccordionBean;
import com.oima.project.DDDProperty.utilities.Controller;
import static com.opensymphony.xwork2.Action.SUCCESS;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.apache.struts2.interceptor.SessionAware;

/**
 *
 * @author Jesus
 */
public class ControlBusqueda extends Controller implements SessionAware {
    private String term; //del autocompleter
    private Long idPropiedad;
    private String idPropiedad_widget;
    private Long idPalabraClave;
    private String idPalabraClave_widget;
    private List<Propiedad> propiedadList;
    private List<CatalogoFotos> catalogoFotosList;
    private List<PalabraClave> palabraClaveList;
    private List<AccordionBean> accordion;

    
    public String mostrarPaginaBusqueda(){
        palabraClaveList = new ArrayList<PalabraClave>();
        palabraClaveList.add(new PalabraClave(1l, "Casa"));
        palabraClaveList.add(new PalabraClave(2l, "Playa"));
        palabraClaveList.add(new PalabraClave(3l, "Departamento"));
        palabraClaveList.add(new PalabraClave(4l, "Perros"));
        palabraClaveList.add(new PalabraClave(5l, "Gatos"));
        palabraClaveList.add(new PalabraClave(6l, "Casa"));
        palabraClaveList.add(new PalabraClave(7l, "Embrujada"));
        palabraClaveList.add(new PalabraClave(8l, "Escuela"));
        palabraClaveList.add(new PalabraClave(9l, "Madera"));
        palabraClaveList.add(new PalabraClave(10l, "Urbana"));
        return SUCCESS;
    }
    
    public String filtrarPalabrasClave(){
        palabraClaveList = new ArrayList<PalabraClave>();
        palabraClaveList.add(new PalabraClave(1l, "Casa"));
        palabraClaveList.add(new PalabraClave(2l, "Playa"));
        palabraClaveList.add(new PalabraClave(3l, "Departamento"));
        palabraClaveList.add(new PalabraClave(4l, "Perros"));
        palabraClaveList.add(new PalabraClave(5l, "Gatos"));
        palabraClaveList.add(new PalabraClave(6l, "Cabaña"));
        palabraClaveList.add(new PalabraClave(7l, "Embrujada"));
        palabraClaveList.add(new PalabraClave(8l, "Escuela"));
        palabraClaveList.add(new PalabraClave(9l, "Madera"));
        palabraClaveList.add(new PalabraClave(10l, "Urbana"));
        List<PalabraClave> listauxiliar = new ArrayList<PalabraClave>();
        System.out.println("term"+term);
        System.out.println("windget"+idPalabraClave_widget);
        for (int i = 0; i < palabraClaveList.size(); i++) {
            if (palabraClaveList.get(i).getPalabra().toLowerCase().contains(term.toLowerCase())) {
                listauxiliar.add(palabraClaveList.get(i));
            }
        }
        palabraClaveList=listauxiliar;
        return SUCCESS;
    }
    
    public String consultarPropiedadesPorLikeDescripcion() throws Exception{
        String orderBy[] ={"asc","fechaConstruccion"};
        accordion= new ArrayList<AccordionBean>();
        propiedadList = servicioPropiedad.consultaPorCampoEspecifico("descripcion", term, "like", orderBy);
        for (Propiedad propiedad: propiedadList) {
             accordion.add(new AccordionBean(propiedad.getNombre(), propiedad.getDescripcion()));
        }
        return SUCCESS;
    }
    
    private Map session;

    /**
     * @return the session
     */
    public Map getSession() {
        return session;
    }

    /**
     * @param session the session to set
     */
    public void setSession(Map session) {
        this.session = session;
    }

    /**
     * @return the term
     */
    public String getTerm() {
        return term;
    }

    /**
     * @param term the term to set
     */
    public void setTerm(String term) {
        this.term = term;
    }

    /**
     * @return the idPropiedad
     */
    public Long getIdPropiedad() {
        return idPropiedad;
    }

    /**
     * @param idPropiedad the idPropiedad to set
     */
    public void setIdPropiedad(Long idPropiedad) {
        this.idPropiedad = idPropiedad;
    }

    /**
     * @return the idPropiedad_widget
     */
    public String getIdPropiedad_widget() {
        return idPropiedad_widget;
    }

    /**
     * @param idPropiedad_widget the idPropiedad_widget to set
     */
    public void setIdPropiedad_widget(String idPropiedad_widget) {
        this.idPropiedad_widget = idPropiedad_widget;
    }

    /**
     * @return the propiedadList
     */
    public List<Propiedad> getPropiedadList() {
        return propiedadList;
    }

    /**
     * @param propiedadList the propiedadList to set
     */
    public void setPropiedadList(List<Propiedad> propiedadList) {
        this.propiedadList = propiedadList;
    }

    /**
     * @return the CatalogoFotosList
     */
    public List<CatalogoFotos> getCatalogoFotosList() {
        return catalogoFotosList;
    }

    /**
     * @param catalogoFotosList the CatalogoFotosList to set
     */
    public void setCatalogoFotosList(List<CatalogoFotos> catalogoFotosList) {
        this.catalogoFotosList = catalogoFotosList;
    }

    /**
     * @return the palabraClaveList
     */
    public List<PalabraClave> getPalabraClaveList() {
        return palabraClaveList;
    }

    /**
     * @param palabraClaveList the palabraClaveList to set
     */
    public void setPalabraClaveList(List<PalabraClave> palabraClaveList) {
        this.palabraClaveList = palabraClaveList;
    }

    /**
     * @return the accordion
     */
    public List<AccordionBean> getAccordion() {
        return accordion;
    }

    /**
     * @param accordion the accordion to set
     */
    public void setAccordion(List<AccordionBean> accordion) {
        this.accordion = accordion;
    }

    /**
     * @return the idPalabraClave
     */
    public Long getIdPalabraClave() {
        return idPalabraClave;
    }

    /**
     * @param idPalabraClave the idPalabraClave to set
     */
    public void setIdPalabraClave(Long idPalabraClave) {
        this.idPalabraClave = idPalabraClave;
    }

    /**
     * @return the idPalabraClave_widget
     */
    public String getIdPalabraClave_widget() {
        return idPalabraClave_widget;
    }

    /**
     * @param idPalabraClave_widget the idPalabraClave_widget to set
     */
    public void setIdPalabraClave_widget(String idPalabraClave_widget) {
        this.idPalabraClave_widget = idPalabraClave_widget;
    }
}
