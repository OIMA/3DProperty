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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
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
@Table(name = "disenio")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Disenio.findAll", query = "SELECT d FROM Disenio d"),
    @NamedQuery(name = "Disenio.findByIdDisenio", query = "SELECT d FROM Disenio d WHERE d.idDisenio = :idDisenio"),
    @NamedQuery(name = "Disenio.findByRuta", query = "SELECT d FROM Disenio d WHERE d.ruta = :ruta"),
    @NamedQuery(name = "Disenio.findByRutaSkybox", query = "SELECT d FROM Disenio d WHERE d.rutaSkybox = :rutaSkybox"),
    @NamedQuery(name = "Disenio.findByViewpoint", query = "SELECT d FROM Disenio d WHERE d.viewpoint = :viewpoint"),
    @NamedQuery(name = "Disenio.findByNoVisitas", query = "SELECT d FROM Disenio d WHERE d.noVisitas = :noVisitas"),
    @NamedQuery(name = "Disenio.findByIdPropiedad", query = "SELECT d FROM Disenio d WHERE d.idPropiedad = :idPropiedad"),
    @NamedQuery(name = "Disenio.findByStatus", query = "SELECT d FROM Disenio d WHERE d.status = :status")})
public class Disenio implements Serializable {
    private static long serialVersionUID = 1L;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public static void setSerialVersionUID(long aSerialVersionUID) {
        serialVersionUID = aSerialVersionUID;
    }
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID_DISENIO")
    private Long idDisenio;
    @Basic(optional = false)
    @Column(name = "RUTA")
    private String ruta;
    @Column(name = "RUTA_SKYBOX")
    private String skybox;
    @Column(name = "VIEWPOINT")
    private String viewpoint;
    @Column(name = "NO_VISITAS")
    private Integer noVisitas;
    @Basic(optional = false)
    @Column(name = "ID_PROPIEDAD")
    private Propiedad idPropiedad;
    @Column(name = "STATUS")
    private Boolean status;

    public Disenio() {
    }

    public Disenio(Long idDisenio) {
        this.idDisenio = idDisenio;
    }

    public Disenio(Long idDisenio, String ruta, Propiedad idPropiedad) {
        this.idDisenio = idDisenio;
        this.ruta = ruta;
        this.idPropiedad = idPropiedad;
    }


    @Override
    public int hashCode() {
        int hash = 0;
        hash += (getIdDisenio() != null ? getIdDisenio().hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Disenio)) {
            return false;
        }
        Disenio other = (Disenio) object;
        if ((this.getIdDisenio() == null && other.getIdDisenio() != null) || (this.getIdDisenio() != null && !this.idDisenio.equals(other.idDisenio))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.oima.project.DDDProperty.model.dto.Disenio[ idDisenio=" + getIdDisenio() + " ]";
    }

    public Long getIdDisenio() {
        return idDisenio;
    }

    public void setIdDisenio(Long idDisenio) {
        this.idDisenio = idDisenio;
    }

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    public String getRutaSkybox() {
        return skybox;
    }

    public Boolean isStatus() {
        return status;
    }

    public void setRutaSkybox(String rutaSkybox) {
        this.skybox = rutaSkybox;
    }



    public String getViewpoint() {
        return viewpoint;
    }

    public void setViewpoint(String viewpoint) {
        this.viewpoint = viewpoint;
    }

    public Integer getNoVisitas() {
        return noVisitas;
    }

    public void setNoVisitas(Integer noVisitas) {
        this.noVisitas = noVisitas;
    }

    public Propiedad getIdPropiedad() {
        return idPropiedad;
    }

    public void setIdPropiedad(Propiedad idPropiedad) {
        this.idPropiedad = idPropiedad;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }
    
}
