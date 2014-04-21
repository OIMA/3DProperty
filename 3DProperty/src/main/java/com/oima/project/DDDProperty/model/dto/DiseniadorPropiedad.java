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
public class DiseniadorPropiedad {
    private Long idDiseniadorPropiedad;
    private Usuario idUsuario;
    private Disenio idDisenio;

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

}
