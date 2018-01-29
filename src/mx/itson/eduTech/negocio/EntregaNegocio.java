/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.itson.eduTech.negocio;

import java.util.List;
import mx.itson.eduTech.entidades.Alumno;
import mx.itson.eduTech.entidades.Entrega;
import mx.itson.eduTech.entidades.Tarea;
import mx.itson.eduTech.persistencia.EntregaPersistencia;

/**
 * @author Daniel Solano, Valeria García, Jesús Torres.
 */
public class EntregaNegocio {
    
    /***
     * Método que permite obtener la entrega por medio del alumno y la tarea.
     * @param a El alumno que entregó tarea.
     * @param t La tarea que entrego el alumno.
     * @return La entrega realizada por el alumno.
     */
    
    public Entrega obtenerEntrega(Alumno a, Tarea t){
        EntregaPersistencia ep= new EntregaPersistencia();
        return ep.obtenerPorAlumnoTarea(a, t);
    }
    
    /***
     * Método que permite guardar la entrega.
     * @param e La entrega a guardar
     * @return El registro de la entrega guardada.
     */
    public int guardar(Entrega e){
        EntregaPersistencia ep = new EntregaPersistencia();
        return ep.guardar(e);
    }
    
    /***
     * Método que permite obtener la entrega por id.
     * @param id El id de la entrega.
     * @return La entrega obtenida por su id.
     */
    public Entrega obtenerPorId(int id){
        EntregaPersistencia ep= new EntregaPersistencia();
        return ep.obtenerPorId(id);
    }
    
    /***
     * Método que permite obtener la lista de entregas por el id de tarea.
     * @param idTarea El id de la tarea.
     * @return La lista de las entregas obtenidas por tarea.
     */
     public List<Entrega> obtenerPorTarea(int idTarea){
        EntregaPersistencia ep= new EntregaPersistencia();
        return ep.obtenerPorTarea(idTarea);
    }
    
     /***
      * Método que permite editar la entrega.
      * @param e La entrega a editar.
      * @return El valor booleano del status de la edicion de la tarea.
      */
    public boolean editarEntrega(Entrega e){
        EntregaPersistencia ep = new EntregaPersistencia();
        return ep.editarEntrega(e);
    }
}
