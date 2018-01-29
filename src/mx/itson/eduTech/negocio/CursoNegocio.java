/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.itson.eduTech.negocio;

import java.util.List;
import mx.itson.eduTech.entidades.Curso;
import mx.itson.eduTech.persistencia.CursoPersistencia;

/**
 * @author Daniel Solano, Valeria García, Jesús Torres.
 */

public class CursoNegocio {
    /***
     * Método que permite obtener el curso por medio del id.
     * @param id El id del curso.
     * @return El id del curso.
     */
    public Curso obtenerPorId(int id){
       CursoPersistencia cp= new CursoPersistencia();
        return cp.obtenerPorId(id);
    }
    
    /***
     * Método que permite editar el curso.
     * @param c El curso a editar.
     * @return El valor booleano del curso editado.
     */
    
     public boolean editarCurso(Curso c){
        CursoPersistencia cp = new CursoPersistencia();
        return cp.editarCurso(c);
    }
     
     /***
      * Método que permite guardar un curso.
      * @param c El curso a guardar.
      * @return El valor booleano del estado de guardar curso. 
      */
    public boolean guardar(Curso c){
        CursoPersistencia cp= new CursoPersistencia();
        return cp.guardar(c)!=-1;
    }
    
    /***
     * Método que permite obtener el curso por su nombre.
     * @param nombre El nombre del curso a obtener.
     * @return El valor booleano de la obtención del curso.
     */
    public boolean obtenerPorNombre(String nombre){
        CursoPersistencia cp = new CursoPersistencia();
        return cp.obtenerPorNombre(nombre)==null;
    }
    
    /***
     * Método para obtener cursos por el id el maestro.
     * @param idMaestro El id del maestro.
     * @return La lista para obetner cursos por maestro.
     */
    
    public List<Curso> obtenerPorMaestro(int idMaestro){
        CursoPersistencia cp= new CursoPersistencia();
        return cp.obtenerPorMaestro(idMaestro);
    }
    
    
}
