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
public class Colonia {
    private Long idColonia;
    private String nombre;
    private CodigoPostal idCodigoPostal;
    private Byte status;

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

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

}
