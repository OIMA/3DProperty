/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.oima.project.DDDProperty.model.dto;

import java.util.Date;

/**
 *
 * @author OIMA
 */
public class RegistroPago {
    private Long idRegistroPago;
    private Date fInicio;
    private Date fVencimiento;
    private Contrato idContrato;
    private Pago idPago;
    private Byte status;

    public Long getIdRegistroPago() {
        return idRegistroPago;
    }

    public void setIdRegistroPago(Long idRegistroPago) {
        this.idRegistroPago = idRegistroPago;
    }

    public Date getfInicio() {
        return fInicio;
    }

    public void setfInicio(Date fInicio) {
        this.fInicio = fInicio;
    }

    public Date getfVencimiento() {
        return fVencimiento;
    }

    public void setfVencimiento(Date fVencimiento) {
        this.fVencimiento = fVencimiento;
    }

    public Contrato getIdContrato() {
        return idContrato;
    }

    public void setIdContrato(Contrato idContrato) {
        this.idContrato = idContrato;
    }

    public Pago getIdPago() {
        return idPago;
    }

    public void setIdPago(Pago idPago) {
        this.idPago = idPago;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

}
