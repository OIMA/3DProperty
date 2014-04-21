/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oima.project.DDDProperty.controller;

import com.oima.project.DDDProperty.model.dto.Pago;
import com.oima.project.DDDProperty.services.Servicio;
import com.oima.project.DDDProperty.services.impl.ServicioPago;
import com.opensymphony.xwork2.ActionSupport;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Jesus
 */
public class ControlPago extends ActionSupport {

    private ServicioPago servicioPago;
    private Pago pagoObj;
    private List<Pago> pagoLista;
    private Long idPago;

    public String guardaPago() {
        try {
            pagoObj.setStatus(Byte.parseByte("1"));
            getServicioPago().guardar(pagoObj);
        } catch (Exception ex) {
            System.out.println("ERROR " + ex.getMessage());
            Logger.getLogger(ControlPago.class.getName()).log(Level.SEVERE, null, ex);
        }
        return SUCCESS;
    }

    public String consultaPagos() {
        try {
            pagoLista = getServicioPago().consultar(Pago.class);
        } catch (Exception ex) {
            System.out.println("ERROR " + ex.getMessage());
            Logger.getLogger(ControlPago.class.getName()).log(Level.SEVERE, null, ex);
        }
        return SUCCESS;
    }

    public String consultaPago() {
        try {
            pagoObj = getServicioPago().consultarUnico(idPago, Pago.class, "Pago");
        } catch (Exception ex) {
            System.out.println("ERROR " + ex.getMessage());
            Logger.getLogger(ControlPago.class.getName()).log(Level.SEVERE, null, ex);
        }
        return SUCCESS;
    }

    public String editarPago() {
        try {
            getServicioPago().editar(pagoObj);
        } catch (Exception ex) {
            System.out.println("ERROR " + ex.getMessage());
            Logger.getLogger(ControlPago.class.getName()).log(Level.SEVERE, null, ex);
        }
        return SUCCESS;
    }

    public String eliminarPago() {
        try {
            getServicioPago().eliminar(idPago);
        } catch (Exception ex) {
            System.out.println("ERROR " + ex.getMessage());
            Logger.getLogger(ControlPago.class.getName()).log(Level.SEVERE, null, ex);
        }
        return SUCCESS;
    }

    /**
     * @return the PagoObj
     */
    public Pago getPagoObj() {
        return pagoObj;
    }

    /**
     * @param pagoObj
     */
    public void setPagoObj(Pago pagoObj) {
        this.pagoObj = pagoObj;
    }

    /**
     * @return the PagoLista
     */
    public List<Pago> getPagoLista() {
        return pagoLista;
    }

    /**
     * @param pagoLista
     */
    public void setPagoLista(List<Pago> pagoLista) {
        this.pagoLista = pagoLista;
    }

    /**
     * @return the idPago
     */
    public Long getIdPago() {
        return idPago;
    }

    /**
     * @param idPago the idPago to set
     */
    public void setIdPago(Long idPago) {
        this.idPago = idPago;
    }

    /**
     * @return the servicioPago
     */
    public ServicioPago getServicioPago() {
        return servicioPago;
    }

    /**
     * @param servicioPago the servicioPago to set
     */
    public void setServicioPago(ServicioPago servicioPago) {
        this.servicioPago = servicioPago;
    }
}
