/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ingluis.tecweb.sesiones.control.servicio;

import ingluis.tecweb.sesiones.modelo.dto.UsuariosDTO;

/**
 *
 * @author luis
 */
public interface ServicioUsuarios {
    
    public UsuariosDTO autenticarUsuario(UsuariosDTO usuario) throws Exception;

    public void cerrarSesion(UsuariosDTO usuario) throws Exception;
    
}
