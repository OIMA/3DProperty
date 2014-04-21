/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.oima.project.DDDProperty.controller;

import java.security.Principal;
import org.springframework.stereotype.Controller;

/**
 *
 * @author OIMA
 */
@Controller
public class ControlSesion {
    private Principal p;
    public String mostrarJSP(){
        System.out.println("esta mapeando");
        if (p == null) {
            String s = "errorUsuario";
            System.out.println("Error de usuario");
            System.out.println(s);
            return s;
        }else
            System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ "+p.getName());
            return "errorUsuario";
    }

    public Principal getP() {
        return p;
    }

    public void setP(Principal p) {
        this.p = p;
    }
}
