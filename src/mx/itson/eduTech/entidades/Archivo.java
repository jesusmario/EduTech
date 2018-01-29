/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.itson.eduTech.entidades;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

/**
 * @author Daniel Solano, Valeria García, Jesús Torres.
 */
@Entity
public class Archivo implements Serializable {
    private int id;
    private String nombre;
    private String peso;
    
    /***
     * Obtiene el Id del archivo a enviar.
     * @return El id del archivo.
     */
    @Id
    @GeneratedValue
    public int getId() {
        return id;
    }

    /**
     * Se establece el id del archivo.
     * @param id El valor a establecer.
     */
    public void setId(int id) {
        this.id = id;
    }

    /***
     * Obtiene el nombre del archivo a enviar.
     * @return El nombre del archivo.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Se establece el valor nombre del archivo.
     * @param nombre El valor a establecer.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /***
     * Obtiene el peso del archivo a enviar.
     * @return El peso del archivo.
     */
    public String getPeso() {
        return peso;
    }

    /**
     * Se establece el peso del archivo.
     * @param peso El valor a establecer.
     */
    public void setPeso(String peso) {
        this.peso = peso;
    }
    
    
}
