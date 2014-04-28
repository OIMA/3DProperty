/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oima.project.DDDProperty.controller;

import com.oima.project.DDDProperty.utilities.Controller;
import static com.opensymphony.xwork2.Action.SUCCESS;

/**
 *
 * @author OIMA
 */
public class ControlAdministrador extends Controller{

    public String operacion;

    public String cambiarOperacion() {
        System.out.println(operacion);
        return SUCCESS;
    }

    public String getOperacion() {
        return operacion;
    }

    public void setOperacion(String operacion) {
        this.operacion = operacion;
    }
}
