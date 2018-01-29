/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.itson.eduTech.negocio;

import java.util.List;
import mx.itson.eduTech.entidades.Tarea;
import mx.itson.eduTech.persistencia.TareaPersistencia;

/**
 * @author Daniel Solano, Valeria García, Jesús Torres.
 */
public class TareaNegocio {
    
    /***
     * Método que permite agregar tarea.
     * @param t La tarea a agregar.
     * @return El status de una tarea guardada.
     */
    public int agragarTarea(Tarea t){
        TareaPersistencia tp= new TareaPersistencia();
        return tp.guardar(t);
    }
    
    /***
     * Método que permite obtener por id la tarea.
     * @param id El id de la tarea.
     * @return La tarea.
     */
    
    public Tarea obtenerPorId(int id){
       TareaPersistencia tp= new TareaPersistencia();
        return tp.obtenerTarea(id);
    }
    /***
     * Método que permite obtener por curso una lista de tareas.
     * @param idCurso El id.
     * @return Lista de tareas obtenidas por el curso.
     */
    
    public List<Tarea> obtenerPorCurso(int idCurso){
        TareaPersistencia cp= new TareaPersistencia();
        return cp.obtenerPorCurso(idCurso);
    }
    
    /***
     * Método que permite editar una tarea.
     * @param t La tarea.
     * @return Valor booleano de la edición de la tarea.
     */
    
     public boolean editarTarea(Tarea t){
        TareaPersistencia ep = new TareaPersistencia();
        return ep.editarTarea(t);
    }
}
