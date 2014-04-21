/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.oima.project.DDDProperty.model.dao;

import java.util.List;

/**
 *
 * @author Jesus
 */
public interface QueryDAO {
    
    public void guardar(Object objeto) throws Exception;

    public void eliminar(Long primaryKey) throws Exception;

    public void editar(Object object) throws Exception;

    public List consultar(Class clase) throws Exception;

    public Object consultarUnico(Long primaryKey, Class clase, String tabla) throws Exception;
    
}
