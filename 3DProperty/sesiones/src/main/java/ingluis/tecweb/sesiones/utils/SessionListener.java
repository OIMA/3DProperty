package ingluis.tecweb.sesiones.utils;

import ingluis.tecweb.sesiones.control.servicio.ServicioUsuarios;
import ingluis.tecweb.sesiones.modelo.dto.UsuariosDTO;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

public class SessionListener implements HttpSessionListener {

    private ServicioUsuarios servicio;
    private final Logger logger = Logger.getLogger(this.getClass());


    @Override
    public void sessionCreated(HttpSessionEvent httpSessionEvent) {
        ApplicationContext ctx = WebApplicationContextUtils.getWebApplicationContext(httpSessionEvent.getSession().getServletContext());
        Loader load = (Loader) ctx.getBean("loader");
        httpSessionEvent.getSession().setAttribute("version", load.getVersion());
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent httpSessionEvent) {
        try {

            ApplicationContext ctx = WebApplicationContextUtils.getWebApplicationContext(httpSessionEvent.getSession().getServletContext());            

            UsuariosDTO user = (UsuariosDTO) httpSessionEvent.getSession().getAttribute("usuario");
            if (user != null) {
                servicio = (ServicioUsuarios) ctx.getBean("servicioUsuarios");
                this.servicio.cerrarSesion(user);
            }           
        } catch (Exception s) {
            logger.error("Error Fatal de Sesion",s);
        }
    }
}
