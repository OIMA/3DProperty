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
@Table(name = "colonia")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Colonia.findAll", query = "SELECT c FROM Colonia c"),
    @NamedQuery(name = "Colonia.findByIdColonia", query = "SELECT c FROM Colonia c WHERE c.idColonia = :idColonia"),
    @NamedQuery(name = "Colonia.findByNombre", query = "SELECT c FROM Colonia c WHERE c.nombre = :nombre"),
    @NamedQuery(name = "Colonia.findByIdCodigoPostal", query = "SELECT c FROM Colonia c WHERE c.idCodigoPostal = :idCodigoPostal"),
    @NamedQuery(name = "Colonia.findByStatus", query = "SELECT c FROM Colonia c WHERE c.status = :status")})
public class Colonia implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID_COLONIA")
    private Long idColonia;
    @Basic(optional = false)
    @Column(name = "NOMBRE")
    private String nombre;
    @Basic(optional = false)
    @Column(name = "ID_CODIGO_POSTAL")
    private CodigoPostal idCodigoPostal;
    @Basic(optional = false)
    @Column(name = "STATUS")
    private boolean status;

    public Colonia() {
    }

    public Colonia(Long idColonia) {
        this.idColonia = idColonia;
    }

    public Colonia(Long idColonia, String nombre, CodigoPostal idCodigoPostal, boolean status) {
        this.idColonia = idColonia;
        this.nombre = nombre;
        this.idCodigoPostal = idCodigoPostal;
        this.status = status;
    }

    public Long getIdColonia() {
        return idColonia;
    }

    public void setIdColonia(Long idColonia) {
        this.idColonia = idColonia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public CodigoPostal getIdCodigoPostal() {
        return idCodigoPostal;
    }

    public void setIdCodigoPostal(CodigoPostal idCodigoPostal) {
        this.idCodigoPostal = idCodigoPostal;
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
        hash += (idColonia != null ? idColonia.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Colonia)) {
            return false;
        }
        Colonia other = (Colonia) object;
        if ((this.idColonia == null && other.idColonia != null) || (this.idColonia != null && !this.idColonia.equals(other.idColonia))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.oima.project.DDDProperty.model.dto.Colonia[ idColonia=" + idColonia + " ]";
    }
    
}
