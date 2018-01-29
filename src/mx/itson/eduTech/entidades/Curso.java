/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.itson.eduTech.entidades;

import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

/**
 * @author Daniel Solano, Valeria García, Jesús Torres.
 */
@Entity
public class Curso {

    private int id;
    private String nombre;
    private List<Tarea> tareas;
    

    public Curso(){}
    /**
     * Constructor del objeto curso.
     * @param id El id del curso.
     * @param nombre El nombre del curso.
     */
    public Curso(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    /***
     * Obtiene el Id del curso.
     * @return El id del curso.
     */
    @Id
    @GeneratedValue
    public int getId() {
        return id;
    }

    /**
     * Se establece el id del curso.
     * @param id El valor a establecer.
     */
    public void setId(int id) {
        this.id = id;
    }

    /***
     * Obtiene el nombre del curso.
     * @return El nombre del curso.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Se establece el nombre del curso.
     * @param nombre El valor a establecer.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
 
    /**
     * El valor toString del nombre del curso.
     * @return Nombre del curso.
     */
    @Override
    public String toString() {
        return  nombre;
    }

    /***
     * Obtiene las listas de tareas del curso.
     * @return Las tareas del curso.
     */
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "idCurso")
    @LazyCollection(LazyCollectionOption.FALSE)
    public List<Tarea> getTareas() {
        return tareas;
    }

    /**
     * Se establece la lista de tareas del curso.
     * @param tareas El valor a establecer.
     */
    public void setTareas(List<Tarea> tareas) {
        this.tareas = tareas;
    }

    
    


}
