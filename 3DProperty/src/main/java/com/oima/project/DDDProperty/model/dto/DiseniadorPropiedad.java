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
@Table(name = "diseniador_propiedad")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DiseniadorPropiedad.findAll", query = "SELECT d FROM DiseniadorPropiedad d"),
    @NamedQuery(name = "DiseniadorPropiedad.findByIdDiseniadorPropiedad", query = "SELECT d FROM DiseniadorPropiedad d WHERE d.idDiseniadorPropiedad = :idDiseniadorPropiedad"),
    @NamedQuery(name = "DiseniadorPropiedad.findByIdUsuario", query = "SELECT d FROM DiseniadorPropiedad d WHERE d.idUsuario = :idUsuario"),
    @NamedQuery(name = "DiseniadorPropiedad.findByIdDisenio", query = "SELECT d FROM DiseniadorPropiedad d WHERE d.idDisenio = :idDisenio")})
public class DiseniadorPropiedad implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID_DISENIADOR_PROPIEDAD")
    private Long idDiseniadorPropiedad;
    @Basic(optional = false)
    @Column(name = "ID_USUARIO")
    private Usuario idUsuario;
    @Basic(optional = false)
    @Column(name = "ID_DISENIO")
    private Disenio idDisenio;

    public DiseniadorPropiedad() {
    }

    public DiseniadorPropiedad(Long idDiseniadorPropiedad) {
        this.idDiseniadorPropiedad = idDiseniadorPropiedad;
    }

    public DiseniadorPropiedad(Long idDiseniadorPropiedad, Usuario idUsuario, Disenio idDisenio) {
        this.idDiseniadorPropiedad = idDiseniadorPropiedad;
        this.idUsuario = idUsuario;
        this.idDisenio = idDisenio;
    }

    public Long getIdDiseniadorPropiedad() {
        return idDiseniadorPropiedad;
    }

    public void setIdDiseniadorPropiedad(Long idDiseniadorPropiedad) {
        this.idDiseniadorPropiedad = idDiseniadorPropiedad;
    }

    public Usuario getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Usuario idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Disenio getIdDisenio() {
        return idDisenio;
    }

    public void setIdDisenio(Disenio idDisenio) {
        this.idDisenio = idDisenio;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idDiseniadorPropiedad != null ? idDiseniadorPropiedad.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DiseniadorPropiedad)) {
            return false;
        }
        DiseniadorPropiedad other = (DiseniadorPropiedad) object;
        if ((this.idDiseniadorPropiedad == null && other.idDiseniadorPropiedad != null) || (this.idDiseniadorPropiedad != null && !this.idDiseniadorPropiedad.equals(other.idDiseniadorPropiedad))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.oima.project.DDDProperty.model.dto.DiseniadorPropiedad[ idDiseniadorPropiedad=" + idDiseniadorPropiedad + " ]";
    }
    
}
