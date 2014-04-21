/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ingluis.tecweb.sesiones.control.servicio.Impl;

import com.opensymphony.xwork2.ActionSupport;
import ingluis.tecweb.sesiones.control.servicio.ServicioUsuarios;
import ingluis.tecweb.sesiones.modelo.dao.UsuariosDao;
import ingluis.tecweb.sesiones.modelo.dto.UsuariosDTO;

/**
 *
 * @author luis
 */
public class ServicioUsuariosImpl extends ActionSupport implements ServicioUsuarios {
    
    private UsuariosDao usuariosDao;

    @Override
    public UsuariosDTO autenticarUsuario(UsuariosDTO usuario) throws Exception {
        
        UsuariosDTO result = usuariosDao.validarUsuario(usuario.getUsuario());
        if(result != null){
            if(result.getPass().equals(usuario.getPass())){
                return result;
            }else{
                this.addActionError("Nombre de Usuario o Password Incorrectos");
                return null;
            }
        }else{
            return null;
        }
    }

    @Override
    public void cerrarSesion(UsuariosDTO usuario) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public UsuariosDao getUsuariosDao() {
        return usuariosDao;
    }

    public void setUsuariosDao(UsuariosDao usuariosDao) {
        this.usuariosDao = usuariosDao;
    }

    
}
