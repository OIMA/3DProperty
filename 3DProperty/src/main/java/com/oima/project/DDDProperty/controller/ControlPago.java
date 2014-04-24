/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oima.project.DDDProperty.controller;

import com.oima.project.DDDProperty.model.dto.Pago;
import com.oima.project.DDDProperty.utilities.Controller;
import static com.opensymphony.xwork2.Action.SUCCESS;
import java.util.List;

/**
 *
 * @author OIMA
 */
public class ControlPago extends Controller{
    
    private Pago pago;
    private List<Pago> listaPago;
    private Long idPago;

    public String guardar() throws Exception {
        pago.setStatus(Boolean.TRUE);
        servicioPago.guardar(pago);
        return SUCCESS;
    }

    public String eliminar() throws Exception {
        servicioPago.eliminar(idPago);
        return SUCCESS;
    }

    public String editar() throws Exception {
        servicioPago.editar(pago);
        return SUCCESS;
    }

    public String consultarTodos() throws Exception {
        listaPago = servicioPago.consultarTodos(Pago.class);
        return SUCCESS;
    }

    public String consultarUnico() throws Exception {
        pago = servicioPago.consultarUnico(idPago);
        consultarTodos();
        return SUCCESS;
    }

    public Pago getPago() {
        return pago;
    }

    public void setPago(Pago pago) {
        this.pago = pago;
    }

    public List<Pago> getListaPago() {
        return listaPago;
    }

    public void setListaPago(List<Pago> listaPago) {
        this.listaPago = listaPago;
    }

    public Long getIdPago() {
        return idPago;
    }

    public void setIdPago(Long idPago) {
        this.idPago = idPago;
    }

}
