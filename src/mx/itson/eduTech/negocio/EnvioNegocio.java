/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.itson.eduTech.negocio;

import mx.itson.eduTech.entidades.Envio;
import mx.itson.eduTech.persistencia.EnvioPersistencia;

/**
 * @author Daniel Solano, Valeria García, Jesús Torres.
 */
public class EnvioNegocio {
    
    /***
     * Método que permite obtener el envio por id.
     * @param id El id del envio a obtener.
     * @return El envio.
     */
    
    public Envio obtenerPorId(int id){
       EnvioPersistencia ep= new EnvioPersistencia();
        return ep.obtenerEnvio(id);
    }
}
