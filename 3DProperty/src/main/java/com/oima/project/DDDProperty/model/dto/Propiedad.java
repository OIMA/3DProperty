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
@Table(name = "propiedad")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Propiedad.findAll", query = "SELECT p FROM Propiedad p"),
    @NamedQuery(name = "Propiedad.findByIdPropiedad", query = "SELECT p FROM Propiedad p WHERE p.idPropiedad = :idPropiedad"),
    @NamedQuery(name = "Propiedad.findByNombre", query = "SELECT p FROM Propiedad p WHERE p.nombre = :nombre"),
    @NamedQuery(name = "Propiedad.findByDescripcion", query = "SELECT p FROM Propiedad p WHERE p.descripcion = :descripcion"),
    @NamedQuery(name = "Propiedad.findByExtension", query = "SELECT p FROM Propiedad p WHERE p.extension = :extension"),
    @NamedQuery(name = "Propiedad.findByNoBanios", query = "SELECT p FROM Propiedad p WHERE p.noBanios = :noBanios"),
    @NamedQuery(name = "Propiedad.findByNoHabitaciones", query = "SELECT p FROM Propiedad p WHERE p.noHabitaciones = :noHabitaciones"),
    @NamedQuery(name = "Propiedad.findByNoPisos", query = "SELECT p FROM Propiedad p WHERE p.noPisos = :noPisos"),
    @NamedQuery(name = "Propiedad.findByColor1", query = "SELECT p FROM Propiedad p WHERE p.color1 = :color1"),
    @NamedQuery(name = "Propiedad.findByColor2", query = "SELECT p FROM Propiedad p WHERE p.color2 = :color2"),
    @NamedQuery(name = "Propiedad.findByFechaConstruccion", query = "SELECT p FROM Propiedad p WHERE p.fechaConstruccion = :fechaConstruccion"),
    @NamedQuery(name = "Propiedad.findByTipoFachada", query = "SELECT p FROM Propiedad p WHERE p.tipoFachada = :tipoFachada"),
    @NamedQuery(name = "Propiedad.findByThumbnail", query = "SELECT p FROM Propiedad p WHERE p.thumbnail = :thumbnail"),
    @NamedQuery(name = "Propiedad.findByCalle", query = "SELECT p FROM Propiedad p WHERE p.calle = :calle"),
    @NamedQuery(name = "Propiedad.findByNoExterior", query = "SELECT p FROM Propiedad p WHERE p.noExterior = :noExterior"),
    @NamedQuery(name = "Propiedad.findByNoInterior", query = "SELECT p FROM Propiedad p WHERE p.noInterior = :noInterior"),
    @NamedQuery(name = "Propiedad.findByIdColonia", query = "SELECT p FROM Propiedad p WHERE p.idColonia = :idColonia"),
    @NamedQuery(name = "Propiedad.findByIdCategoria", query = "SELECT p FROM Propiedad p WHERE p.idCategoria = :idCategoria"),
    @NamedQuery(name = "Propiedad.findByStatus", query = "SELECT p FROM Propiedad p WHERE p.status = :status")})
public class Propiedad implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID_PROPIEDAD")
    private Long idPropiedad;
    @Basic(optional = false)
    @Column(name = "NOMBRE")
    private String nombre;
    @Basic(optional = false)
    @Column(name = "DESCRIPCION")
    private String descripcion;
    @Column(name = "EXTENSION")
    private Integer extension;
    @Column(name = "NO_BANIOS")
    private Integer noBanios;
    @Column(name = "NO_HABITACIONES")
    private Integer noHabitaciones;
    @Column(name = "NO_PISOS")
    private Integer noPisos;
    @Column(name = "COLOR_1")
    private String color1;
    @Column(name = "COLOR_2")
    private String color2;
    @Column(name = "FECHA_CONSTRUCCION")
    @Temporal(TemporalType.DATE)
    private Date fechaConstruccion;
    @Column(name = "TIPO_FACHADA")
    private String tipoFachada;
    @Column(name = "THUMBNAIL")
    private String thumbnail;
    @Basic(optional = false)
    @Column(name = "CALLE")
    private String calle;
    @Basic(optional = false)
    @Column(name = "NO_EXTERIOR")
    private String noExterior;
    @Column(name = "NO_INTERIOR")
    private String noInterior;
    @Basic(optional = false)
    @Column(name = "ID_COLONIA")
    private Colonia idColonia;
    @Basic(optional = false)
    @Column(name = "ID_CATEGORIA")
    private Categoria idCategoria;
    @Basic(optional = false)
    @Column(name = "STATUS")
    private boolean status;

    public Propiedad() {
    }

    public Propiedad(Long idPropiedad) {
        this.idPropiedad = idPropiedad;
    }

    public Propiedad(Long idPropiedad, String nombre, String descripcion, String calle, String noExterior, Colonia idColonia, Categoria idCategoria, boolean status) {
        this.idPropiedad = idPropiedad;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.calle = calle;
        this.noExterior = noExterior;
        this.idColonia = idColonia;
        this.idCategoria = idCategoria;
        this.status = status;
    }

    public Long getIdPropiedad() {
        return idPropiedad;
    }

    public void setIdPropiedad(Long idPropiedad) {
        this.idPropiedad = idPropiedad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Integer getExtension() {
        return extension;
    }

    public void setExtension(Integer extension) {
        this.extension = extension;
    }

    public Integer getNoBanios() {
        return noBanios;
    }

    public void setNoBanios(Integer noBanios) {
        this.noBanios = noBanios;
    }

    public Integer getNoHabitaciones() {
        return noHabitaciones;
    }

    public void setNoHabitaciones(Integer noHabitaciones) {
        this.noHabitaciones = noHabitaciones;
    }

    public Integer getNoPisos() {
        return noPisos;
    }

    public void setNoPisos(Integer noPisos) {
        this.noPisos = noPisos;
    }

    public String getColor1() {
        return color1;
    }

    public void setColor1(String color1) {
        this.color1 = color1;
    }

    public String getColor2() {
        return color2;
    }

    public void setColor2(String color2) {
        this.color2 = color2;
    }

    public Date getFechaConstruccion() {
        return fechaConstruccion;
    }

    public void setFechaConstruccion(Date fechaConstruccion) {
        this.fechaConstruccion = fechaConstruccion;
    }

    public String getTipoFachada() {
        return tipoFachada;
    }

    public void setTipoFachada(String tipoFachada) {
        this.tipoFachada = tipoFachada;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getNoExterior() {
        return noExterior;
    }

    public void setNoExterior(String noExterior) {
        this.noExterior = noExterior;
    }

    public String getNoInterior() {
        return noInterior;
    }

    public void setNoInterior(String noInterior) {
        this.noInterior = noInterior;
    }

    public Colonia getIdColonia() {
        return idColonia;
    }

    public void setIdColonia(Colonia idColonia) {
        this.idColonia = idColonia;
    }

    public Categoria getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(Categoria idCategoria) {
        this.idCategoria = idCategoria;
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
        hash += (idPropiedad != null ? idPropiedad.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Propiedad)) {
            return false;
        }
        Propiedad other = (Propiedad) object;
        if ((this.idPropiedad == null && other.idPropiedad != null) || (this.idPropiedad != null && !this.idPropiedad.equals(other.idPropiedad))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.oima.project.DDDProperty.model.dto.Propiedad[ idPropiedad=" + idPropiedad + " ]";
    }
    
}
