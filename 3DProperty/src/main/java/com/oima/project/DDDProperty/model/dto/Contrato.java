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
@Table(name = "contrato")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Contrato.findAll", query = "SELECT c FROM Contrato c"),
    @NamedQuery(name = "Contrato.findByIdContrato", query = "SELECT c FROM Contrato c WHERE c.idContrato = :idContrato"),
    @NamedQuery(name = "Contrato.findByFecha", query = "SELECT c FROM Contrato c WHERE c.fecha = :fecha"),
    @NamedQuery(name = "Contrato.findByDescripcion", query = "SELECT c FROM Contrato c WHERE c.descripcion = :descripcion"),
    @NamedQuery(name = "Contrato.findByIdPropiedad", query = "SELECT c FROM Contrato c WHERE c.idPropiedad = :idPropiedad"),
    @NamedQuery(name = "Contrato.findByIdUsuario", query = "SELECT c FROM Contrato c WHERE c.idUsuario = :idUsuario"),
    @NamedQuery(name = "Contrato.findByStatus", query = "SELECT c FROM Contrato c WHERE c.status = :status")})
public class Contrato implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID_CONTRATO")
    private Long idContrato;
    @Basic(optional = false)
    @Column(name = "FECHA")
    @Temporal(TemporalType.DATE)
    private Date fecha;
    @Basic(optional = false)
    @Column(name = "DESCRIPCION")
    private String descripcion;
    @Basic(optional = false)
    @Column(name = "ID_PROPIEDAD")
    private Propiedad idPropiedad;
    @Basic(optional = false)
    @Column(name = "ID_USUARIO")
    private Usuario idUsuario;
    @Column(name = "STATUS")
    private Boolean status;

    public Contrato() {
    }

    public Contrato(Long idContrato) {
        this.idContrato = idContrato;
    }

    public Contrato(Long idContrato, Date fecha, String descripcion, Propiedad idPropiedad, Usuario idUsuario) {
        this.idContrato = idContrato;
        this.fecha = fecha;
        this.descripcion = descripcion;
        this.idPropiedad = idPropiedad;
        this.idUsuario = idUsuario;
    }

    public Long getIdContrato() {
        return idContrato;
    }

    public void setIdContrato(Long idContrato) {
        this.idContrato = idContrato;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Propiedad getIdPropiedad() {
        return idPropiedad;
    }

    public void setIdPropiedad(Propiedad idPropiedad) {
        this.idPropiedad = idPropiedad;
    }

    public Usuario getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Usuario idUsuario) {
        this.idUsuario = idUsuario;
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
        hash += (idContrato != null ? idContrato.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Contrato)) {
            return false;
        }
        Contrato other = (Contrato) object;
        if ((this.idContrato == null && other.idContrato != null) || (this.idContrato != null && !this.idContrato.equals(other.idContrato))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.oima.project.DDDProperty.model.dto.Contrato[ idContrato=" + idContrato + " ]";
    }
    
}
