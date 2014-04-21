/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ingluis.tecweb.sesiones.utils;


import com.opensymphony.xwork2.ActionSupport;
import ingluis.tecweb.sesiones.modelo.dto.UsuariosDTO;
import java.util.Map;
import org.apache.struts2.interceptor.SessionAware;

/**
 *
 * @author luis
 */
public class Navegacion extends ActionSupport implements SessionAware {
    private Map session;
    private UsuariosDTO usuario_sesion;
    
    public Map getSession() {
        return session;
    }

    public void setSession(Map session) {
        this.session = session;
    }

    public UsuariosDTO getUsuario_sesion() {
        return usuario_sesion;
    }

    public void setUsuario_sesion(UsuariosDTO usuario_sesion) {
        this.usuario_sesion = usuario_sesion;
    }
    
    
    
    
    public String enlace(){   
        
        // se leen las variables de session
        usuario_sesion = (UsuariosDTO) this.session.get("usuario");
        
        return SUCCESS;
    }
    
}
