/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.oima.project.DDDProperty.utilities;

import com.oima.project.DDDProperty.services.impl.ServicioCatalogoFotos;
import com.oima.project.DDDProperty.services.impl.ServicioCategoria;
import com.oima.project.DDDProperty.services.impl.ServicioCodigoPostal;
import com.oima.project.DDDProperty.services.impl.ServicioColonia;
import com.oima.project.DDDProperty.services.impl.ServicioContrato;
import com.oima.project.DDDProperty.services.impl.ServicioDiseniadorPropiedad;
import com.oima.project.DDDProperty.services.impl.ServicioDisenio;
import com.oima.project.DDDProperty.services.impl.ServicioEstado;
import com.oima.project.DDDProperty.services.impl.ServicioFavorito;
import com.oima.project.DDDProperty.services.impl.ServicioHistorial;
import com.oima.project.DDDProperty.services.impl.ServicioLocalidad;
import com.oima.project.DDDProperty.services.impl.ServicioMensaje;
import com.oima.project.DDDProperty.services.impl.ServicioPago;
import com.oima.project.DDDProperty.services.impl.ServicioPais;
import com.oima.project.DDDProperty.services.impl.ServicioPropiedad;
import com.oima.project.DDDProperty.services.impl.ServicioRegistroPago;
import com.oima.project.DDDProperty.services.impl.ServicioUsuario;

/**
 *
 * @author OIMA
 */
public abstract class Controller {
    public ServicioCatalogoFotos servicioCatalogoFotos;
    public ServicioCategoria servicioCategoria;
    public ServicioCodigoPostal servicioCP;
    public ServicioColonia servicioColonia;
    public ServicioContrato servicioContrato;
    public ServicioDiseniadorPropiedad servicioDiseniadorPropiedad;
    public ServicioDisenio servicioDisenio;
    public ServicioEstado servicioEstado;
    public ServicioFavorito servicioFavorito;
    public ServicioHistorial servicioHistorial;
    public ServicioLocalidad servicioLocalidad;
    public ServicioMensaje servicioMensaje;
    public ServicioPago servicioPago;
    public ServicioPais servicioPais;
    public ServicioPropiedad servicioPropiedad;
    public ServicioRegistroPago servicioRegistroPago;
    public ServicioUsuario servicioUsuario;

    public ServicioCatalogoFotos getServicioCatalogoFotos() {
        return servicioCatalogoFotos;
    }

    public void setServicioCatalogoFotos(ServicioCatalogoFotos servicioCatalogoFotos) {
        this.servicioCatalogoFotos = servicioCatalogoFotos;
    }

    public ServicioCategoria getServicioCategoria() {
        return servicioCategoria;
    }

    public void setServicioCategoria(ServicioCategoria servicioCategoria) {
        this.servicioCategoria = servicioCategoria;
    }

    public ServicioCodigoPostal getServicioCP() {
        return servicioCP;
    }

    public void setServicioCP(ServicioCodigoPostal servicioCP) {
        this.servicioCP = servicioCP;
    }

    public ServicioColonia getServicioColonia() {
        return servicioColonia;
    }

    public void setServicioColonia(ServicioColonia servicioColonia) {
        this.servicioColonia = servicioColonia;
    }

    public ServicioContrato getServicioContrato() {
        return servicioContrato;
    }

    public void setServicioContrato(ServicioContrato servicioContrato) {
        this.servicioContrato = servicioContrato;
    }

    public ServicioDiseniadorPropiedad getServicioDiseniadorPropiedad() {
        return servicioDiseniadorPropiedad;
    }

    public void setServicioDiseniadorPropiedad(ServicioDiseniadorPropiedad servicioDiseniadorPropiedad) {
        this.servicioDiseniadorPropiedad = servicioDiseniadorPropiedad;
    }

    public ServicioDisenio getServicioDisenio() {
        return servicioDisenio;
    }

    public void setServicioDisenio(ServicioDisenio servicioDisenio) {
        this.servicioDisenio = servicioDisenio;
    }

    public ServicioEstado getServicioEstado() {
        return servicioEstado;
    }

    public void setServicioEstado(ServicioEstado servicioEstado) {
        this.servicioEstado = servicioEstado;
    }

    public ServicioFavorito getServicioFavorito() {
        return servicioFavorito;
    }

    public void setServicioFavorito(ServicioFavorito servicioFavorito) {
        this.servicioFavorito = servicioFavorito;
    }

    public ServicioHistorial getServicioHistorial() {
        return servicioHistorial;
    }

    public void setServicioHistorial(ServicioHistorial servicioHistorial) {
        this.servicioHistorial = servicioHistorial;
    }

    public ServicioLocalidad getServicioLocalidad() {
        return servicioLocalidad;
    }

    public void setServicioLocalidad(ServicioLocalidad servicioLocalidad) {
        this.servicioLocalidad = servicioLocalidad;
    }

    public ServicioMensaje getServicioMensaje() {
        return servicioMensaje;
    }

    public void setServicioMensaje(ServicioMensaje servicioMensaje) {
        this.servicioMensaje = servicioMensaje;
    }

    public ServicioPago getServicioPago() {
        return servicioPago;
    }

    public void setServicioPago(ServicioPago servicioPago) {
        this.servicioPago = servicioPago;
    }

    public ServicioPais getServicioPais() {
        return servicioPais;
    }

    public void setServicioPais(ServicioPais servicioPais) {
        this.servicioPais = servicioPais;
    }

    public ServicioPropiedad getServicioPropiedad() {
        return servicioPropiedad;
    }

    public void setServicioPropiedad(ServicioPropiedad servicioPropiedad) {
        this.servicioPropiedad = servicioPropiedad;
    }

    public ServicioRegistroPago getServicioRegistroPago() {
        return servicioRegistroPago;
    }

    public void setServicioRegistroPago(ServicioRegistroPago servicioRegistroPago) {
        this.servicioRegistroPago = servicioRegistroPago;
    }

    public ServicioUsuario getServicioUsuario() {
        return servicioUsuario;
    }

    public void setServicioUsuario(ServicioUsuario servicioUsuario) {
        this.servicioUsuario = servicioUsuario;
    }
    
    public void borrarServicios(){
        setServicioCP(null);
        setServicioCatalogoFotos(null);
        setServicioCategoria(null);
        setServicioColonia(null);
        setServicioContrato(null);
        setServicioDiseniadorPropiedad(null);
        setServicioDisenio(null);
        setServicioEstado(null);
        setServicioFavorito(null);
        setServicioHistorial(null);
        setServicioLocalidad(null);
        setServicioMensaje(null);
        setServicioPago(null);
        setServicioPais(null);
        setServicioPropiedad(null);
        setServicioPropiedad(null);
        setServicioRegistroPago(null);
        setServicioUsuario(null);
    }
}
