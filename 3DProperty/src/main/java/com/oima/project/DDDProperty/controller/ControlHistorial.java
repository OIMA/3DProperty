/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oima.project.DDDProperty.controller;

import com.oima.project.DDDProperty.model.dto.Historial;
import com.oima.project.DDDProperty.utilities.Controller;
import static com.opensymphony.xwork2.Action.SUCCESS;
import java.util.List;

/**
 *
 * @author OIMA
 */
public class ControlHistorial extends Controller{
    
    private Historial historial;
    private List<Historial> listaHistorial;
    private Long idHistorial;

    public String guardar() throws Exception {
        historial.setStatus(Boolean.TRUE);
        servicioHistorial.guardar(historial);
        consultarTodos();
        return SUCCESS;
    }

    public String eliminar() throws Exception {
        servicioHistorial.eliminar(idHistorial);
        return SUCCESS;
    }

    public String editar() throws Exception {
        servicioHistorial.editar(historial);
        return SUCCESS;
    }

    public String consultarTodos() throws Exception {
        listaHistorial = servicioHistorial.consultarTodos(Historial.class);
        return SUCCESS;
    }

    public String consultarUnico() throws Exception {
        historial = servicioHistorial.consultarUnico(idHistorial);
        consultarTodos();
        return SUCCESS;
    }

    public Historial getHistorial() {
        return historial;
    }

    public void setHistorial(Historial historial) {
        this.historial = historial;
    }

    public List<Historial> getListaHistorial() {
        return listaHistorial;
    }

    public void setListaHistorial(List<Historial> listaHistorial) {
        this.listaHistorial = listaHistorial;
    }

    public Long getIdHistorial() {
        return idHistorial;
    }

    public void setIdHistorial(Long idHistorial) {
        this.idHistorial = idHistorial;
    }

}
