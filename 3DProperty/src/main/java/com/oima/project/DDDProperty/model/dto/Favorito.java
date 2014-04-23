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
@Table(name = "favorito")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Favorito.findAll", query = "SELECT f FROM Favorito f"),
    @NamedQuery(name = "Favorito.findByIdFavorito", query = "SELECT f FROM Favorito f WHERE f.idFavorito = :idFavorito"),
    @NamedQuery(name = "Favorito.findByIdUsuario", query = "SELECT f FROM Favorito f WHERE f.idUsuario = :idUsuario"),
    @NamedQuery(name = "Favorito.findByIdPropiedad", query = "SELECT f FROM Favorito f WHERE f.idPropiedad = :idPropiedad"),
    @NamedQuery(name = "Favorito.findByNoEstrellas", query = "SELECT f FROM Favorito f WHERE f.noEstrellas = :noEstrellas")})
public class Favorito implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID_FAVORITO")
    private Long idFavorito;
    @Basic(optional = false)
    @Column(name = "ID_USUARIO")
    private Usuario idUsuario;
    @Basic(optional = false)
    @Column(name = "ID_PROPIEDAD")
    private Propiedad idPropiedad;
    @Column(name = "NO_ESTRELLAS")
    private Integer noEstrellas;

    public Favorito() {
    }

    public Favorito(Long idFavorito) {
        this.idFavorito = idFavorito;
    }

    public Favorito(Long idFavorito, Usuario idUsuario, Propiedad idPropiedad) {
        this.idFavorito = idFavorito;
        this.idUsuario = idUsuario;
        this.idPropiedad = idPropiedad;
    }

    public Long getIdFavorito() {
        return idFavorito;
    }

    public void setIdFavorito(Long idFavorito) {
        this.idFavorito = idFavorito;
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

    public Integer getNoEstrellas() {
        return noEstrellas;
    }

    public void setNoEstrellas(Integer noEstrellas) {
        this.noEstrellas = noEstrellas;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idFavorito != null ? idFavorito.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Favorito)) {
            return false;
        }
        Favorito other = (Favorito) object;
        if ((this.idFavorito == null && other.idFavorito != null) || (this.idFavorito != null && !this.idFavorito.equals(other.idFavorito))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.oima.project.DDDProperty.model.dto.Favorito[ idFavorito=" + idFavorito + " ]";
    }
    
}
