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
public class Favorito {
    private Long idFavorito;
    private Usuario idUsuario;
    private Propiedad idPropiedad;
    private Byte noEstrellas;

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

    public Byte getNoEstrellas() {
        return noEstrellas;
    }

    public void setNoEstrellas(Byte noEstrellas) {
        this.noEstrellas = noEstrellas;
    }

}
