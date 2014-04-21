/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.oima.project.DDDProperty.model.dto;

import java.util.Date;

/**
 *
 * @author OIMA
 */
public class Propiedad {
    private Long idPropiedad;
    private String nombre;
    private String descripcion;
    private Integer extension;
    private Integer noHabitaciones;
    private Integer noBanios;
    private Integer noPisos;
    private String color1;
    private String color2;
    private Date fechaConstruccion;
    private String tipoFachada;
    private String thumbnail;
    private String calle;
    private String noExterior;
    private String noInterior;
    private Colonia idColonia;
    private Categoria idCategoria;
    private Byte status;

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

    public Integer getNoHabitaciones() {
        return noHabitaciones;
    }

    public void setNoHabitaciones(Integer noHabitaciones) {
        this.noHabitaciones = noHabitaciones;
    }

    public Integer getNoBanios() {
        return noBanios;
    }

    public void setNoBanios(Integer noBanios) {
        this.noBanios = noBanios;
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

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

}
