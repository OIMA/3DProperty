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
@Table(name = "disenio_publicidad")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DisenioPublicidad.findAll", query = "SELECT d FROM DisenioPublicidad d"),
    @NamedQuery(name = "DisenioPublicidad.findByIdDisenioPublicidad", query = "SELECT d FROM DisenioPublicidad d WHERE d.idDisenioPublicidad = :idDisenioPublicidad"),
    @NamedQuery(name = "DisenioPublicidad.findByIdDisenio", query = "SELECT d FROM DisenioPublicidad d WHERE d.idDisenio = :idDisenio"),
    @NamedQuery(name = "DisenioPublicidad.findByIdPublicidad", query = "SELECT d FROM DisenioPublicidad d WHERE d.idPublicidad = :idPublicidad"),
    @NamedQuery(name = "DisenioPublicidad.findByStatus", query = "SELECT d FROM DisenioPublicidad d WHERE d.status = :status")})
public class DisenioPublicidad implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID_DISENIO_PUBLICIDAD")
    private Long idDisenioPublicidad;
    @Column(name = "ID_DISENIO")
    private Disenio idDisenio;
    @Column(name = "ID_PUBLICIDAD")
    private Publicidad idPublicidad;
    @Column(name = "STATUS")
    private String status;

    public DisenioPublicidad() {
    }

    public DisenioPublicidad(Long idDisenioPublicidad) {
        this.idDisenioPublicidad = idDisenioPublicidad;
    }

    public Long getIdDisenioPublicidad() {
        return idDisenioPublicidad;
    }

    public void setIdDisenioPublicidad(Long idDisenioPublicidad) {
        this.idDisenioPublicidad = idDisenioPublicidad;
    }

    public Disenio getIdDisenio() {
        return idDisenio;
    }

    public void setIdDisenio(Disenio idDisenio) {
        this.idDisenio = idDisenio;
    }

    public Publicidad getIdPublicidad() {
        return idPublicidad;
    }

    public void setIdPublicidad(Publicidad idPublicidad) {
        this.idPublicidad = idPublicidad;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idDisenioPublicidad != null ? idDisenioPublicidad.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DisenioPublicidad)) {
            return false;
        }
        DisenioPublicidad other = (DisenioPublicidad) object;
        if ((this.idDisenioPublicidad == null && other.idDisenioPublicidad != null) || (this.idDisenioPublicidad != null && !this.idDisenioPublicidad.equals(other.idDisenioPublicidad))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.oima.project.DDDProperty.model.dto.DisenioPublicidad[ idDisenioPublicidad=" + idDisenioPublicidad + " ]";
    }
    
}
