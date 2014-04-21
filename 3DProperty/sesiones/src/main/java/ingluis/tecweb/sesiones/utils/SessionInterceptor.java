/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ingluis.tecweb.sesiones.utils;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;
import ingluis.tecweb.sesiones.modelo.dto.UsuariosDTO;
import java.util.Map;

/**
 *
 * @author luis
 */
public class SessionInterceptor implements Interceptor {

    private Map session;
    
    @Override
    public void destroy() {
    }

    public void invalidate() {
    }

    @Override
    public void init() {
    }

    @Override 
    public String intercept(ActionInvocation invocation) throws Exception {
        
        /******************************************************/
        //Cada que se realiza un "action" este interceptor verifica que exista sesion, 
        //de lo contrario regresa "loginSesionNull" (chequen en el struts para que vean lo que hace este result)
        //Pero primero verifica que la aación sea diferente del login, porque si la acción es login
        //el metodo: invocation.invoke() manda al login en lugar de mandar error
        /******************************************************/
        
        this.session = invocation.getInvocationContext().getSession();
        UsuariosDTO usuario = (UsuariosDTO) this.session.get("usuario");
        if (((Action) invocation.getAction()).getClass().getSimpleName().equals("Login") && invocation.getInvocationContext().getName().equals("login")) {        
            return invocation.invoke();
        }else if (((Action) invocation.getAction()).getClass().getSimpleName().equals("Login") && invocation.getInvocationContext().getName().equals("loginNull")) {
            return invocation.invoke();
        }else {
            if (usuario == null) {
                return "loginSesionNull";
            } else {
                return invocation.invoke();
            }
        }        
    }
    
}