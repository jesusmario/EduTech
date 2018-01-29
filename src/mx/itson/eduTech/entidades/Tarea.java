/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.itson.eduTech.entidades;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Daniel Solano, Valeria García, Jesús Torres.
 */
@Entity
public class Tarea implements Serializable {

    private int id;
    private String nombre;
    private String descripcion;
    private int maxPuntos;
    private Date fechaCreacion;
    private Date fechaLimite;
    private String escala;
    private int formatoHora;
    public Tarea(){}
    
    /**
     * Constructor del objeto de la tarea.
     * @param id El id de la tarea.
     * @param nombre El nombre de la tarea.
     * @param descripcion La descripción de la tarea.
     * @param maxPuntos Los puntos máximos de la tarea.
     * @param fechaCreacion La fecha de la creación de la tarea.
     * @param fechaLimite La fecha limite de la tarea.
     * @param escala La escala de calificación de la tarea.
     * @param formatoHora El formato de la hora.
     */
    public Tarea(int id, String nombre, String descripcion, int maxPuntos, Date fechaCreacion, Date fechaLimite, String escala, int formatoHora) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.maxPuntos = maxPuntos;
        this.fechaCreacion = fechaCreacion;
        this.fechaLimite = fechaLimite;
        this.escala = escala;
        this.formatoHora=formatoHora;
    }
    
    /**
     * Obtiene el Id de la tarea.
     * @return El id de la tarea.
     */
    @Id
    @GeneratedValue
    public int getId() {
        return id;
    }
    
    /**
     * Se establece el id de la tarea.
     * @param id El valor a establecer.
     */
    public void setId(int id) {
        this.id = id;
    }
    
    /**
     * Obtiene el nombre de la tarea.
     * @return El nombre de la tarea.
     */
    public String getNombre() {
        return nombre;
    }
    
    /**
     * Se establece el nombre de la tarea.
     * @param nombre El valor a establecer.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /**
     * Obtiene la descripcion de la tarea.
     * @return la descripcion de la tarea.
     */
    public String getDescripcion() {
        return descripcion;
    }
    
    /**
     * Se establece la descripción de la tarea.
     * @param descripcion El valor a establecer.
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    /**
     * Obtiene el maximo de puntos de la tarea.
     * @return El maximo de puntos de la tarea.
     */
    public int getMaxPuntos() {
        return maxPuntos;
    }
    /**
     * Se establece el maximo de puntos de la tarea.
     * @param maxPuntos El valor a establecer.
     */
    public void setMaxPuntos(int maxPuntos) {
        this.maxPuntos = maxPuntos;
    }
    
    /**
     * Obtiene la fecha de la creación de la tarea.
     * @return La fecha de la creación de la tarea.
     */
    @Temporal(javax.persistence.TemporalType.DATE)
    public Date getFechaCreacion() {
        return fechaCreacion;
    }
    /**
     * Se establece la fecha de creacion de la tarea.
     * @param fechaCreacion El valor a establecer.
     */
    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }
    
    /**
     * Obtiene la fecha limite  de la tarea.
     * @return La fecha limite de la tarea.
     */
    @Temporal(TemporalType.TIMESTAMP)
    public Date getFechaLimite() {
        return fechaLimite;
    }
    /**
     * Se establece la fecha limite de la tarea.
     * @param fechaLimite El valor a establecer.
     */
    public void setFechaLimite(Date fechaLimite) {
        this.fechaLimite = fechaLimite;
    }
    
    /**
     * Obtiene la escala de la tarea.
     * @return La escala de la tarea.
     */
    public String getEscala() {
        return escala;
    }
    /**
     * Se establece la escala de la tarea.
     * @param escala El valor a establecer.
     */
    public void setEscala(String escala) {
        this.escala = escala;
    }

    /**
     * Obtiene el formato de la hora de la tarea.
     * @return El formato de la hora.
     */
    public int getFormatoHora() {
        return formatoHora;
    }
    /**
     * Se establece el formato de hora de la tarea.
     * @param formatoHora El valor a establecer.
     */
    public void setFormatoHora(int formatoHora) {
        this.formatoHora = formatoHora;
    }

 

}
