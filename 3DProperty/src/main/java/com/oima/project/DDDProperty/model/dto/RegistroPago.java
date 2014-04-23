/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oima.project.DDDProperty.model.dto;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author OIMA
 */
@Entity
@Table(name = "registro_pago")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RegistroPago.findAll", query = "SELECT r FROM RegistroPago r"),
    @NamedQuery(name = "RegistroPago.findByIdRegistroPago", query = "SELECT r FROM RegistroPago r WHERE r.idRegistroPago = :idRegistroPago"),
    @NamedQuery(name = "RegistroPago.findByFInicio", query = "SELECT r FROM RegistroPago r WHERE r.fInicio = :fInicio"),
    @NamedQuery(name = "RegistroPago.findByFVencimiento", query = "SELECT r FROM RegistroPago r WHERE r.fVencimiento = :fVencimiento"),
    @NamedQuery(name = "RegistroPago.findByIdContrato", query = "SELECT r FROM RegistroPago r WHERE r.idContrato = :idContrato"),
    @NamedQuery(name = "RegistroPago.findByIdPago", query = "SELECT r FROM RegistroPago r WHERE r.idPago = :idPago"),
    @NamedQuery(name = "RegistroPago.findByStatus", query = "SELECT r FROM RegistroPago r WHERE r.status = :status")})
public class RegistroPago implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID_REGISTRO_PAGO")
    private Long idRegistroPago;
    @Column(name = "F_INICIO")
    @Temporal(TemporalType.DATE)
    private Date fechaInicio;
    @Column(name = "F_VENCIMIENTO")
    @Temporal(TemporalType.DATE)
    private Date fechaVencimiento;
    @Basic(optional = false)
    @Column(name = "ID_CONTRATO")
    private Contrato idContrato;
    @Basic(optional = false)
    @Column(name = "ID_PAGO")
    private Pago idPago;
    @Basic(optional = false)
    @Column(name = "STATUS")
    private boolean status;

    public RegistroPago() {
    }

    public RegistroPago(Long idRegistroPago) {
        this.idRegistroPago = idRegistroPago;
    }

    public RegistroPago(Long idRegistroPago, Contrato idContrato, Pago idPago, boolean status) {
        this.idRegistroPago = idRegistroPago;
        this.idContrato = idContrato;
        this.idPago = idPago;
        this.status = status;
    }

    public Long getIdRegistroPago() {
        return idRegistroPago;
    }

    public void setIdRegistroPago(Long idRegistroPago) {
        this.idRegistroPago = idRegistroPago;
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

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public void setFechaVencimiento(Date fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public Date getFechaVencimiento() {
        return fechaVencimiento;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idRegistroPago != null ? idRegistroPago.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RegistroPago)) {
            return false;
        }
        RegistroPago other = (RegistroPago) object;
        if ((this.idRegistroPago == null && other.idRegistroPago != null) || (this.idRegistroPago != null && !this.idRegistroPago.equals(other.idRegistroPago))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.oima.project.DDDProperty.model.dto.RegistroPago[ idRegistroPago=" + idRegistroPago + " ]";
    }

}
