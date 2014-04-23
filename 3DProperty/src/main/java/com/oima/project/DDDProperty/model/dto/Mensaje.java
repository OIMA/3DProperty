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
@Table(name = "mensaje")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Mensaje.findAll", query = "SELECT m FROM Mensaje m"),
    @NamedQuery(name = "Mensaje.findByIdMensaje", query = "SELECT m FROM Mensaje m WHERE m.idMensaje = :idMensaje"),
    @NamedQuery(name = "Mensaje.findByIdRemitente", query = "SELECT m FROM Mensaje m WHERE m.idRemitente = :idRemitente"),
    @NamedQuery(name = "Mensaje.findByIdDestinatario", query = "SELECT m FROM Mensaje m WHERE m.idDestinatario = :idDestinatario"),
    @NamedQuery(name = "Mensaje.findByMensaje", query = "SELECT m FROM Mensaje m WHERE m.mensaje = :mensaje"),
    @NamedQuery(name = "Mensaje.findByStatusLeido", query = "SELECT m FROM Mensaje m WHERE m.statusLeido = :statusLeido"),
    @NamedQuery(name = "Mensaje.findByIdPropiedad", query = "SELECT m FROM Mensaje m WHERE m.idPropiedad = :idPropiedad"),
    @NamedQuery(name = "Mensaje.findByStatus", query = "SELECT m FROM Mensaje m WHERE m.status = :status")})
public class Mensaje implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID_MENSAJE")
    private Long idMensaje;
    @Basic(optional = false)
    @Column(name = "ID_REMITENTE")
    private Usuario idRemitente;
    @Basic(optional = false)
    @Column(name = "ID_DESTINATARIO")
    private Usuario idDestinatario;
    @Basic(optional = false)
    @Column(name = "MENSAJE")
    private String mensaje;
    @Column(name = "STATUS_LEIDO")
    private Boolean statusLeido;
    @Column(name = "ID_PROPIEDAD")
    private Integer idPropiedad;
    @Column(name = "STATUS")
    private Boolean status;

    public Mensaje() {
    }

    public Mensaje(Long idMensaje) {
        this.idMensaje = idMensaje;
    }

    public Mensaje(Long idMensaje, Usuario idRemitente, Usuario idDestinatario, String mensaje) {
        this.idMensaje = idMensaje;
        this.idRemitente = idRemitente;
        this.idDestinatario = idDestinatario;
        this.mensaje = mensaje;
    }

    public Long getIdMensaje() {
        return idMensaje;
    }

    public void setIdMensaje(Long idMensaje) {
        this.idMensaje = idMensaje;
    }

    public Usuario getIdRemitente() {
        return idRemitente;
    }

    public void setIdRemitente(Usuario idRemitente) {
        this.idRemitente = idRemitente;
    }

    public Usuario getIdDestinatario() {
        return idDestinatario;
    }

    public void setIdDestinatario(Usuario idDestinatario) {
        this.idDestinatario = idDestinatario;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public Boolean getStatusLeido() {
        return statusLeido;
    }

    public void setStatusLeido(Boolean statusLeido) {
        this.statusLeido = statusLeido;
    }

    public Integer getIdPropiedad() {
        return idPropiedad;
    }

    public void setIdPropiedad(Integer idPropiedad) {
        this.idPropiedad = idPropiedad;
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
        hash += (idMensaje != null ? idMensaje.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Mensaje)) {
            return false;
        }
        Mensaje other = (Mensaje) object;
        if ((this.idMensaje == null && other.idMensaje != null) || (this.idMensaje != null && !this.idMensaje.equals(other.idMensaje))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.oima.project.DDDProperty.model.dto.Mensaje[ idMensaje=" + idMensaje + " ]";
    }
    
}
