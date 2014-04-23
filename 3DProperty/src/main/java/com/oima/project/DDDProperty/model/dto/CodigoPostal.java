/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.oima.project.DDDProperty.model.dto;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author OIMA
 */
@Entity
@Table(name = "codigo_postal")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CodigoPostal.findAll", query = "SELECT c FROM CodigoPostal c"),
    @NamedQuery(name = "CodigoPostal.findByIdCodigoPostal", query = "SELECT c FROM CodigoPostal c WHERE c.idCodigoPostal = :idCodigoPostal"),
    @NamedQuery(name = "CodigoPostal.findByNumero", query = "SELECT c FROM CodigoPostal c WHERE c.numero = :numero"),
    @NamedQuery(name = "CodigoPostal.findByIdLocalidad", query = "SELECT c FROM CodigoPostal c WHERE c.idLocalidad = :idLocalidad"),
    @NamedQuery(name = "CodigoPostal.findByStatus", query = "SELECT c FROM CodigoPostal c WHERE c.status = :status")})
public class CodigoPostal implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID_CODIGO_POSTAL")
    private Long idCodigoPostal;
    @Basic(optional = false)
    @Column(name = "NUMERO")
    private int numero;
    @Basic(optional = false)
    @Column(name = "ID_LOCALIDAD")
    private Localidad idLocalidad;
    @Basic(optional = false)
    @Column(name = "STATUS")
    private boolean status;

    public CodigoPostal() {
    }

    public CodigoPostal(Long idCodigoPostal) {
        this.idCodigoPostal = idCodigoPostal;
    }

    public CodigoPostal(Long idCodigoPostal, int numero, Localidad idLocalidad, boolean status) {
        this.idCodigoPostal = idCodigoPostal;
        this.numero = numero;
        this.idLocalidad = idLocalidad;
        this.status = status;
    }

    public Long getIdCodigoPostal() {
        return idCodigoPostal;
    }

    public void setIdCodigoPostal(Long idCodigoPostal) {
        this.idCodigoPostal = idCodigoPostal;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Localidad getIdLocalidad() {
        return idLocalidad;
    }

    public void setIdLocalidad(Localidad idLocalidad) {
        this.idLocalidad = idLocalidad;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCodigoPostal != null ? idCodigoPostal.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CodigoPostal)) {
            return false;
        }
        CodigoPostal other = (CodigoPostal) object;
        if ((this.idCodigoPostal == null && other.idCodigoPostal != null) || (this.idCodigoPostal != null && !this.idCodigoPostal.equals(other.idCodigoPostal))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.oima.project.DDDProperty.model.dto.CodigoPostal[ idCodigoPostal=" + idCodigoPostal + " ]";
    }
    
}
