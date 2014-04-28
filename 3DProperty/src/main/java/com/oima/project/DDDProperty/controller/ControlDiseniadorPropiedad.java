/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oima.project.DDDProperty.controller;

import com.oima.project.DDDProperty.model.dto.DiseniadorPropiedad;
import com.oima.project.DDDProperty.model.dto.Disenio;
import com.oima.project.DDDProperty.utilities.Controller;
import static com.opensymphony.xwork2.Action.SUCCESS;
import java.util.List;

/**
 *
 * @author OIMA
 */
public class ControlDiseniadorPropiedad extends Controller {

    private DiseniadorPropiedad diseniadorPropiedad;
    private List<DiseniadorPropiedad> listaDiseniadorPropiedad;
    private List<Disenio> listaDisenio;
    private Long idDiseniadorPropiedad;

    public String guardar() throws Exception {
        diseniadorPropiedad.setStatus(Boolean.TRUE);
        servicioDiseniadorPropiedad.guardar(diseniadorPropiedad);
        consultarTodos();
        return SUCCESS;
    }

    public String eliminar() throws Exception {
        System.out.println("Se va a eliminar" + idDiseniadorPropiedad);
        servicioDiseniadorPropiedad.eliminar(idDiseniadorPropiedad);
        return SUCCESS;
    }

    public String editar() throws Exception {
        servicioDiseniadorPropiedad.editar(diseniadorPropiedad);
        return SUCCESS;
    }

    public String consultarTodos() throws Exception {
        listaDiseniadorPropiedad = servicioDiseniadorPropiedad.consultarTodos(DiseniadorPropiedad.class);
        listaDisenio = servicioDisenio.consultarTodos(Disenio.class);
        return SUCCESS;
    }

    public String consultarUnico() throws Exception {
        diseniadorPropiedad = servicioDiseniadorPropiedad.consultarUnico(idDiseniadorPropiedad);
        consultarTodos();
        return SUCCESS;
    }

    public String consultarDisenios() throws Exception {
        diseniadorPropiedad = servicioDiseniadorPropiedad.consultarUnico(idDiseniadorPropiedad);
        consultarTodos();
        return SUCCESS;
    }

    public DiseniadorPropiedad getDiseniadorPropiedad() {
        return diseniadorPropiedad;
    }

    public void setDiseniadorPropiedad(DiseniadorPropiedad diseniadorPropiedad) {
        this.diseniadorPropiedad = diseniadorPropiedad;
    }

    public List<DiseniadorPropiedad> getListaDiseniadorPropiedad() {
        return listaDiseniadorPropiedad;
    }

    public void setListaDiseniadorPropiedad(List<DiseniadorPropiedad> listaDiseniadorPropiedad) {
        this.listaDiseniadorPropiedad = listaDiseniadorPropiedad;
    }

    public Long getIdDiseniadorPropiedad() {
        return idDiseniadorPropiedad;
    }

    public void setIdDiseniadorPropiedad(Long idDiseniadorPropiedad) {
        this.idDiseniadorPropiedad = idDiseniadorPropiedad;
    }

    /**
     * @return the listaDisenio
     */
    public List<Disenio> getListaDisenio() {
        return listaDisenio;
    }

    /**
     * @param listaDisenio the listaDisenio to set
     */
    public void setListaDisenio(List<Disenio> listaDisenio) {
        this.listaDisenio = listaDisenio;
    }

}
