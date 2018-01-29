/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.itson.eduTech.entidades;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

/**
 *
 * @author Daniel Solano, Valeria García, Jesús Torres.
 */
@Entity
public class CursoAlumno {

    private int id;
    private int idAlumno;
    private int idCurso;

    public CursoAlumno(){}
    
    /**
     * Constructor del objeto CursoAlumno.
     * @param id El id de la relación curso-alumno.
     * @param idAlumno El id del alumno.
     * @param idCurso El id del curso.
     */
    public CursoAlumno(int id, int idAlumno, int idCurso) {
        this.id = id;
        this.idAlumno = idAlumno;
        this.idCurso = idCurso;
    }

    /**
     * Obtiene el Id de la relación alumno-curso.
     * @return El id de alumno-curso.
     */
    @Id
    @GeneratedValue
    public int getId() {
        return id;
    }

    /**
     * Se establece el id de la relacion alumno-curso.
     * @param id El valor a establecer.
     */
    public void setId(int id) {
        this.id = id;
    }

     /**
     * Obtiene el Id del alumno de la relación alumno-curso.
     * @return El id del alumno.
     */
    public int getIdAlumno() {
        return idAlumno;
    }

     /**
     * Se establece el id del alumno de la relacion alumno-curso.
     * @param idAlumno El valor a establecer.
     */
    public void setIdAlumno(int idAlumno) {
        this.idAlumno = idAlumno;
    }

     /**
     * Obtiene el Id del curso de la relación alumno-curso.
     * @return El id del curso.
     */
    public int getIdCurso() {
        return idCurso;
    }

     /**
     * Se establece el id del curso de la relacion alumno-curso.
     * @param idCurso El valor a establecer.
     */
    public void setIdCurso(int idCurso) {
        this.idCurso = idCurso;
    }

    
}
