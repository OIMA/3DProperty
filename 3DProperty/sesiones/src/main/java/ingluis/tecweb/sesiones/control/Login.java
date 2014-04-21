/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ingluis.tecweb.sesiones.control;

import static com.opensymphony.xwork2.Action.ERROR;
import static com.opensymphony.xwork2.Action.SUCCESS;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.ActionSupport;
import ingluis.tecweb.sesiones.control.servicio.ServicioUsuarios;
import ingluis.tecweb.sesiones.modelo.dto.UsuariosDTO;
import java.util.Map;
import org.apache.log4j.Logger;
import org.apache.struts2.interceptor.SessionAware;

/**
 *
 * @author draco
 */
public class Login extends ActionSupport implements SessionAware{

    
    private Map session;
    private final Logger logger = Logger.getLogger(this.getClass());
    private ServicioUsuarios servicioUsuarios;
    private UsuariosDTO usuario;
    private UsuariosDTO usuario_sesion;

    @Override
    public void setSession(Map<String, Object> map) {
        session = map;
    }

    public Map getSession() {
        return session;
    }
    

    public String validar_usuario() {
        int errors = 0;
        System.out.println("USU ="+this.usuario.getUsuario());
        System.out.println("PASS   ="+this.usuario.getPass());
        try {            
            if(this.usuario == null || this.usuario.getUsuario().equals("")){
                this.addFieldError("usuario.usuario","Campo Obligatorio");
                errors++;
            }
            if(this.usuario == null || this.usuario.getPass().equals("")){
                this.addFieldError("usuario.pass","Campo Obligatorio");
                errors++;
            }
            if(errors > 0){
                return "nopasa";
            }
            UsuariosDTO user = servicioUsuarios.autenticarUsuario(this.usuario);
            if(user != null){
                session.put("usuario", user);
            
                usuario_sesion = user;
                System.out.println("nombre del usuario de la sesion");
                System.out.println(usuario_sesion.getNombre()+" "+usuario_sesion.getPaterno()+" "+usuario_sesion.getMaterno());
                
                
                return SUCCESS;
            }else{
                this.addActionError("Nombre de Usuario o Password Incorrectos");
                return "nopasa";
            }
                        
        }  catch (Exception e) {
            this.addActionError("Codigo: EFL-01, Error de Conexión");
            logger.error("EFL-01 - No se pudo logear al usuario" + this.usuario, e);
            return "nopasa";
        }
    }


    public String salir() {
        session.clear();
        session = null;
        return SUCCESS;
    }

    public ServicioUsuarios getServicioUsuarios() {
        return servicioUsuarios;
    }

    public void setServicioUsuarios(ServicioUsuarios servicioUsuarios) {
        this.servicioUsuarios = servicioUsuarios;
    }

    public UsuariosDTO getUsuario() {
        return usuario;
    }

    public void setUsuario(UsuariosDTO usuario) {
        this.usuario = usuario;
    }

    public UsuariosDTO getUsuario_sesion() {
        return usuario_sesion;
    }

    public void setUsuario_sesion(UsuariosDTO usuario_sesion) {
        this.usuario_sesion = usuario_sesion;
    }
    

}
