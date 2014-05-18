/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.oima.project.DDDProperty.controller;

import com.oima.project.DDDProperty.model.dto.Usuario;
import com.oima.project.DDDProperty.utilities.Controller;
import static com.opensymphony.xwork2.Action.SUCCESS;
import java.util.Map;
import org.apache.struts2.interceptor.SessionAware;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;

/**
 *
 * @author OIMA
 */
public class ControlSesion extends Controller implements SessionAware {
    private Map session;
    
    public String loginSuccesfull() throws Exception {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        String nombre_usuario = auth.getName();
        Usuario usuario = servicioUsuario.consultarUnico("nombreUsuario", nombre_usuario);
        session.put("usuarioSession", usuario);
        return SUCCESS;
    }

    /**
     * @return the session
     */
    public Map getSession() {
        return session;
    }

    /**
     * @param map
     */
    @Override
    public void setSession(Map<String, Object> map) {
        session = map;
    }
}
