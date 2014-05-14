/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oima.project.DDDProperty.controller;

import com.oima.project.DDDProperty.model.dto.RegistroPago;
import com.oima.project.DDDProperty.utilities.Controller;
import static com.opensymphony.xwork2.Action.SUCCESS;
import java.util.List;

/**
 *
 * @author OIMA
 */
public class ControlRegistroPago extends Controller{
    
    private RegistroPago registroPago;
    private List<RegistroPago> listaRegistroPago;
    private Long idRegistroPago;

    public String guardar() throws Exception {
        registroPago.setStatus(Boolean.TRUE);
        servicioRegistroPago.guardar(registroPago);
        consultarTodos();
        return SUCCESS;
    }

    public String eliminar() throws Exception {
        System.out.println("Se va a eliminar"+idRegistroPago);
        servicioRegistroPago.eliminar(idRegistroPago);
        return SUCCESS;
    }

    public String editar() throws Exception {
        servicioRegistroPago.editar(registroPago);
        return SUCCESS;
    }

    public String consultarTodos() throws Exception {
        listaRegistroPago = servicioRegistroPago.consultarTodos(RegistroPago.class);
        return SUCCESS;
    }

    public String consultarUnico() throws Exception {
        registroPago = servicioRegistroPago.consultarUnico(idRegistroPago);
        consultarTodos();
        return SUCCESS;
    }

    public RegistroPago getRegistroPago() {
        return registroPago;
    }

    public void setRegistroPago(RegistroPago registroPago) {
        this.registroPago = registroPago;
    }

    public List<RegistroPago> getListaRegistroPago() {
        return listaRegistroPago;
    }

    public void setListaRegistroPago(List<RegistroPago> listaRegistroPago) {
        this.listaRegistroPago = listaRegistroPago;
    }

    public Long getIdRegistroPago() {
        return idRegistroPago;
    }

    public void setIdRegistroPago(Long idRegistroPago) {
        this.idRegistroPago = idRegistroPago;
    }

}
