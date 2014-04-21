/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ingluis.tecweb.sesiones.modelo.dto;

import java.io.Serializable;

/**
 *
 * @author luis
 */
public class UsuariosDTO implements Serializable{
    
    private Integer id_usuario;
    private String usuario;
    private String pass;
    private Integer rol; 
    private String nombre;
    private String paterno;
    private String materno;

    public Integer getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(Integer id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public Integer getRol() {
        return rol;
    }

    public void setRol(Integer rol) {
        this.rol = rol;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPaterno() {
        return paterno;
    }

    public void setPaterno(String paterno) {
        this.paterno = paterno;
    }

    public String getMaterno() {
        return materno;
    }

    public void setMaterno(String materno) {
        this.materno = materno;
    }
    
    
    
    
}
