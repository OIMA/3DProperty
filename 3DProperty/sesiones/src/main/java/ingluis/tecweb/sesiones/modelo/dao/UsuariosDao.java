/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ingluis.tecweb.sesiones.modelo.dao;

import ingluis.tecweb.sesiones.modelo.dto.UsuariosDTO;

/**
 *
 * @author luis
 */
public interface UsuariosDao {
    
    public UsuariosDTO validarUsuario(String usuario) throws Exception;
    
}
