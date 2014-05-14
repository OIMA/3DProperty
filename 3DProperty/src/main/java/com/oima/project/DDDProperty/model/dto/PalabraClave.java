/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.oima.project.DDDProperty.model.dto;

/**
 *
 * @author Jesus
 */
public class PalabraClave { //se añade a BD?
    private Long idPalabraClave;
    private String palabra;

    public PalabraClave(Long idPalabraClave, String palabra) {
        this.idPalabraClave = idPalabraClave;
        this.palabra = palabra;
    }

    
    
    /**
     * @return the idPalabraClave
     */
    public Long getIdPalabraClave() {
        return idPalabraClave;
    }

    /**
     * @param idPalabraClave the idPalabraClave to set
     */
    public void setIdPalabraClave(Long idPalabraClave) {
        this.idPalabraClave = idPalabraClave;
    }

    /**
     * @return the palabra
     */
    public String getPalabra() {
        return palabra;
    }

    /**
     * @param palabra the palabra to set
     */
    public void setPalabra(String palabra) {
        this.palabra = palabra;
    }
}
