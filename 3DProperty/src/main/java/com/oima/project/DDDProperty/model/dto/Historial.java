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
@Table(name = "historial")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Historial.findAll", query = "SELECT h FROM Historial h"),
    @NamedQuery(name = "Historial.findByIdHistorial", query = "SELECT h FROM Historial h WHERE h.idHistorial = :idHistorial"),
    @NamedQuery(name = "Historial.findByIdUsuario", query = "SELECT h FROM Historial h WHERE h.idUsuario = :idUsuario"),
    @NamedQuery(name = "Historial.findByIdPropiedad", query = "SELECT h FROM Historial h WHERE h.idPropiedad = :idPropiedad"),
    @NamedQuery(name = "Historial.findByFecha", query = "SELECT h FROM Historial h WHERE h.fecha = :fecha")})
public class Historial implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID_HISTORIAL")
    private Long idHistorial;
    @Basic(optional = false)
    @Column(name = "ID_USUARIO")
    private Usuario idUsuario;
    @Basic(optional = false)
    @Column(name = "ID_PROPIEDAD")
    private Propiedad idPropiedad;
    @Basic(optional = false)
    @Column(name = "FECHA")
    @Temporal(TemporalType.DATE)
    private Date fecha;
    @Column(name = "STATUS")
    private Boolean status;

    public Historial() {
    }

    public Historial(Long idHistorial) {
        this.idHistorial = idHistorial;
    }

    public Historial(Long idHistorial, Usuario idUsuario, Propiedad idPropiedad, Date fecha) {
        this.idHistorial = idHistorial;
        this.idUsuario = idUsuario;
        this.idPropiedad = idPropiedad;
        this.fecha = fecha;
    }

    public Long getIdHistorial() {
        return idHistorial;
    }

    public void setIdHistorial(Long idHistorial) {
        this.idHistorial = idHistorial;
    }

    public Usuario getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Usuario idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Propiedad getIdPropiedad() {
        return idPropiedad;
    }

    public void setIdPropiedad(Propiedad idPropiedad) {
        this.idPropiedad = idPropiedad;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idHistorial != null ? idHistorial.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Historial)) {
            return false;
        }
        Historial other = (Historial) object;
        if ((this.idHistorial == null && other.idHistorial != null) || (this.idHistorial != null && !this.idHistorial.equals(other.idHistorial))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.oima.project.DDDProperty.model.dto.Historial[ idHistorial=" + idHistorial + " ]";
    }

    /**
     * @return the status
     */
    public Boolean getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(Boolean status) {
        this.status = status;
    }
    
}
