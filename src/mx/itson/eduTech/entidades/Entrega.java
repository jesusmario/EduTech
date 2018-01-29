/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.itson.eduTech.entidades;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

/**
 *
 * @author Daniel Solano, Valeria García, Jesús Torres.
 */
@Entity
public class Entrega implements Serializable {

    private int id;
    private int idAlumno;
    private int idTarea;
    private List<Envio> envios;
    private String calificacion;

    public Entrega() {
    }

    /**
     * Constructor de objeto Entrega.
     *
     * @param id El valor del id de la entrega.
     * @param idAlumno El valor del id del alumno.
     * @param idTarea El valor del id de la tarea.
     * @param calificacion La calificación de la entrega.
     */
    public Entrega(int id, int idAlumno, int idTarea, String calificacion) {
        this.id = id;
        this.idAlumno = idAlumno;
        this.idTarea = idTarea;
        this.calificacion = calificacion;
    }

    /**
     * Obtiene el Id de la entrega.
     * @return El id de la entrega.
     */
    @Id
    @GeneratedValue
    public int getId() {
        return id;
    }
    
    /**
     * Se establece el id de la entrega.
     * @param id El valor a establecer.
     */
    public void setId(int id) {
        this.id = id;
    }
    
    /**
     * Obtiene los envios de la entrega.
     * @return Los envios de la entrega.
     */
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "idEntrega")
    @LazyCollection(LazyCollectionOption.FALSE)
    public List<Envio> getEnvios() {
        return envios;
    }
    /**
     * Se establece los envios de la entrega.
     * @param envios El valor a establecer.
     */
    public void setEnvios(List<Envio> envios) {
        this.envios = envios;
    }
    
    /**
     * Obtiene La calificación de la entrega.
     * @return La calificación de la entrega.
     */
    public String getCalificacion() {
        return calificacion;
    }

    /**
     * Se establece la calificacion de la entrega.
     * @param calificacion El valor a establecer.
     */
    public void setCalificacion(String calificacion) {
        this.calificacion = calificacion;
    }

    /**
     * Obtiene el Id del alumno de la entrega.
     * @return El id del alumno.
     */
    public int getIdAlumno() {
        return idAlumno;
    }

    /**
     * Se establece el id del alumno de la entrega.
     * @param idAlumno El valor a establecer.
     */
    public void setIdAlumno(int idAlumno) {
        this.idAlumno = idAlumno;
    }
    /**
     * Obtiene el Id de la tarea de la entrega.
     * @return El id de la tarea.
     */
    public int getIdTarea() {
        return idTarea;
    }
    /**
     * Se establece el id de la tarea de la entrega.
     * @param idTarea El valor a establecer.
     */
    public void setIdTarea(int idTarea) {
        this.idTarea = idTarea;
    }

}
