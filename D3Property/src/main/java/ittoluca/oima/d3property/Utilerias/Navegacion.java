/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ittoluca.oima.D3Property.Utilerias;

import static com.opensymphony.xwork2.Action.SUCCESS;

/**
 *
 * @author Jesus
 */
public class Navegacion {

    /**
     * No entiendo como funciona lo del tio estrada, creo este metodo para 
     * llamarlo a todas las paginas que son mapeadas.
     * @return 
     */
    public String sendTo() {
        System.out.println("Esta mapeando....");
        return SUCCESS;
        //return "SUCCESS";
    }
}
