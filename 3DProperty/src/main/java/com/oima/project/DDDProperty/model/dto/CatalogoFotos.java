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
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author OIMA
 */
@Entity
@Table(name = "catalogo_fotos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CatalogoFotos.findAll", query = "SELECT c FROM CatalogoFotos c"),
    @NamedQuery(name = "CatalogoFotos.findByIdCatalogoFotos", query = "SELECT c FROM CatalogoFotos c WHERE c.idCatalogoFotos = :idCatalogoFotos"),
    @NamedQuery(name = "CatalogoFotos.findByRutaFotografia", query = "SELECT c FROM CatalogoFotos c WHERE c.rutaFotografia = :rutaFotografia"),
    @NamedQuery(name = "CatalogoFotos.findByDescripcion", query = "SELECT c FROM CatalogoFotos c WHERE c.descripcion = :descripcion"),
    @NamedQuery(name = "CatalogoFotos.findByViewpoint", query = "SELECT c FROM CatalogoFotos c WHERE c.viewpoint = :viewpoint"),
    @NamedQuery(name = "CatalogoFotos.findByIdPropiedad", query = "SELECT c FROM CatalogoFotos c WHERE c.idPropiedad = :idPropiedad"),
    @NamedQuery(name = "CatalogoFotos.findByStatus", query = "SELECT c FROM CatalogoFotos c WHERE c.status = :status")})
public class CatalogoFotos implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID_CATALOGO_FOTOS")
    private Long idCatalogoFotos;
    @Basic(optional = false)
    @Column(name = "RUTA_FOTOGRAFIA")
    private String rutaFotografia;
    @Column(name = "DESCRIPCION")
    private String descripcion;
    @Column(name = "VIEWPOINT")
    private String viewpoint;
    @Basic(optional = false)
    @Column(name = "ID_PROPIEDAD")
    private Propiedad idPropiedad;
    @Lob
    @Column(name = "ARCHIVO")
    private byte[] archivo;
    @Column(name = "STATUS")
    private Boolean status;

    public CatalogoFotos() {
    }

    public CatalogoFotos(Long idCatalogoFotos) {
        this.idCatalogoFotos = idCatalogoFotos;
    }

    public CatalogoFotos(Long idCatalogoFotos, String rutaFotografia, Propiedad idPropiedad) {
        this.idCatalogoFotos = idCatalogoFotos;
        this.rutaFotografia = rutaFotografia;
        this.idPropiedad = idPropiedad;
    }

    public Long getIdCatalogoFotos() {
        return idCatalogoFotos;
    }

    public void setIdCatalogoFotos(Long idCatalogoFotos) {
        this.idCatalogoFotos = idCatalogoFotos;
    }

    public String getRutaFotografia() {
        return rutaFotografia;
    }

    public void setRutaFotografia(String rutaFotografia) {
        this.rutaFotografia = rutaFotografia;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getViewpoint() {
        return viewpoint;
    }

    public void setViewpoint(String viewpoint) {
        this.viewpoint = viewpoint;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCatalogoFotos != null ? idCatalogoFotos.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CatalogoFotos)) {
            return false;
        }
        CatalogoFotos other = (CatalogoFotos) object;
        if ((this.idCatalogoFotos == null && other.idCatalogoFotos != null) || (this.idCatalogoFotos != null && !this.idCatalogoFotos.equals(other.idCatalogoFotos))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.oima.project.DDDProperty.model.dto.CatalogoFotos[ idCatalogoFotos=" + idCatalogoFotos + " ]";
    }

    /**
     * @return the archivo
     */
    public byte[] getArchivo() {
        return archivo;
    }

    /**
     * @param archivo the archivo to set
     */
    public void setArchivo(byte[] archivo) {
        this.archivo = archivo;
    }
    
}
