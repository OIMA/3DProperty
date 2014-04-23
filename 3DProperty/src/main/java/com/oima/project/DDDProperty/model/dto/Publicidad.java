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
@Table(name = "publicidad")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Publicidad.findAll", query = "SELECT p FROM Publicidad p"),
    @NamedQuery(name = "Publicidad.findByIdPublicidad", query = "SELECT p FROM Publicidad p WHERE p.idPublicidad = :idPublicidad"),
    @NamedQuery(name = "Publicidad.findByDetalle", query = "SELECT p FROM Publicidad p WHERE p.detalle = :detalle"),
    @NamedQuery(name = "Publicidad.findByRuta", query = "SELECT p FROM Publicidad p WHERE p.ruta = :ruta"),
    @NamedQuery(name = "Publicidad.findByStatus", query = "SELECT p FROM Publicidad p WHERE p.status = :status")})
public class Publicidad implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID_PUBLICIDAD")
    private Long idPublicidad;
    @Column(name = "DETALLE")
    private String detalle;
    @Column(name = "RUTA")
    private String ruta;
    @Column(name = "STATUS")
    private Boolean status;

    public Publicidad() {
    }

    public Publicidad(Long idPublicidad) {
        this.idPublicidad = idPublicidad;
    }

    public Long getIdPublicidad() {
        return idPublicidad;
    }

    public void setIdPublicidad(Long idPublicidad) {
        this.idPublicidad = idPublicidad;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPublicidad != null ? idPublicidad.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Publicidad)) {
            return false;
        }
        Publicidad other = (Publicidad) object;
        if ((this.idPublicidad == null && other.idPublicidad != null) || (this.idPublicidad != null && !this.idPublicidad.equals(other.idPublicidad))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.oima.project.DDDProperty.model.dto.Publicidad[ idPublicidad=" + idPublicidad + " ]";
    }
    
}
