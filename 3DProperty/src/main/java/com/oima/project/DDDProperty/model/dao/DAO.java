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
public interface DAO {
    
    public void guardar(Object objeto) throws Exception;

    public void eliminar(Long primaryKey) throws Exception;

    public void editar(Object object) throws Exception;

    public List consultarTodos(Class clase) throws Exception;

    public Object consultarUnico(Long primaryKey, Class clase, String tabla) throws Exception;
    /**
     * Metodo que devuelve una lista, consulta los elementos
     * @param campo el campo a consultar
     * @param contenido ¿Que debe de tener? 1 o 2  "gato" o perro
     * @param predicado equal, lower o greater
     * @param clase ¿Que clase es?
     * @param orderBy arreglo de dos posiciones [1 asc o desc] [2 campo]
     * @return List, que es el resultado de la consulta OJO!!! puede devolver un vacio
     * @throws Exception 
     */
    public List consultaPorCampoEspecifico(String campo, Object contenido, String predicado, Class clase, String[] orderBy) throws Exception;
    
    public List consultaPorCampoEspecifico(String[] campos, Object[] contenidos, String predicados[], Class clase, String[] orderBy) throws Exception;
}
