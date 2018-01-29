/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.itson.eduTech.negocio;

import java.util.List;
import mx.itson.eduTech.entidades.Curso;
import mx.itson.eduTech.entidades.CursoAlumno;
import mx.itson.eduTech.persistencia.CursoAlumnoPersistencia;

/**
 * @author Daniel Solano, Valeria García, Jesús Torres.
 */
public class CursoAlumnoNegocio {
    
    /***
     * Método para guardar el curso del alumno.
     * @param ca El curso al que pertenece el alumno.
     * @return El registro guardado.
     */
    
    public int guardar(CursoAlumno ca){
        CursoAlumnoPersistencia cap = new CursoAlumnoPersistencia();
        return cap.guardar(ca);
    }
    
    /***
     * Método que permite obtener los cursos del alumno.
     * @param idAlumno El id del alumno.
     * @return La lista de cursos que tiene el alumno.
     */
    public List<CursoAlumno> obtenerCursosPorAlumno(int idAlumno){
        CursoAlumnoPersistencia cap= new CursoAlumnoPersistencia();
        return cap.obtenerCursosPorAlumno(idAlumno);
    }
    
    /***
     * Método que permite mostrar los cursos disponibles para el alumno.
     * @param idAlumno El id del alumno.
     * @return La lista de los cursos disponibles.
     */
    public List<Curso> obtenerCursosDisponibles(int idAlumno){
        CursoAlumnoPersistencia cap= new CursoAlumnoPersistencia();
        return cap.obtenerCursosDisponibles(idAlumno);
    }
    
    /***
     * Método para obtener alumno por curso.
     * @param idCurso El id del curso.
     * @return Una lista de alumnos que pertenecen a un curso.
     */
    public List<CursoAlumno> obtenerAlumnoPorCurso(int idCurso){
        CursoAlumnoPersistencia cap= new CursoAlumnoPersistencia();
        return cap.obtenerCursosPorAlumno(idCurso);
    }
}
