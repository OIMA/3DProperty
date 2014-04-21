/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.oima.project.DDDProperty.model.dto;


/**
 *
 * @author OIMA
 */
public class CodigoPostal {
    private Long idCodigoPostal;
    private Integer numero;
    private Localidad idLocalidad;
    private Byte status;

    public Long getIdCodigoPostal() {
        return idCodigoPostal;
    }

    public void setIdCodigoPostal(Long idCodigoPostal) {
        this.idCodigoPostal = idCodigoPostal;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Localidad getIdLocalidad() {
        return idLocalidad;
    }

    public void setIdLocalidad(Localidad idLocalidad) {
        this.idLocalidad = idLocalidad;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

}
