/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.itson.eduTech.entidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


/**
 *
 * @author Daniel Solano, Valeria García, Jesús Torres.
 */
@Entity
public class Alumno {

    private int id;
    private String nombre;
    private String correo;
    private String contrasena;

    public Alumno(){}
    /**
     * Constructor del objeto Alumno.
     * @param id El valor correspondiente al id del alumno.
     * @param nombre El valor correspondiente al nombre del alumno.
     * @param correo El valor correspondiente al correo del alumno.
     * @param contrasena El valor correspondiente a la contraseña del alumno.
     */
    public Alumno(int id, String nombre, String correo, String contrasena) {
        this.id = id;
        this.nombre = nombre;
        this.correo = correo;
        this.contrasena = contrasena;
    }

    /**
     * Obtiene el Id del alumno.
     * @return El id del alumno.
     */
    @Id
    @GeneratedValue
    public int getId() {
        return id;
    }

    /**
     * Se establece el id del alumno.
     * @param id El valor a establecer.
     */
    public void setId(int id) {
        this.id = id;
    }

     /**
     * Obtiene el Id del alumno.
     * @return El id del alumno.
     */
    public String getNombre() {
        return nombre;
    }

     /**
     * Se establece el nombre del alumno.
     * @param nombre El valor a establecer.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

     /**
     * Obtiene el correo del alumno.
     * @return El correo del alumno.
     */
    public String getCorreo() {
        return correo;
    }

     /**
     * Se establece el correo del alumno.
     * @param correo El valor a establecer.
     */
    public void setCorreo(String correo) {
        this.correo = correo;
    }

     /**
     * Obtiene la contraseña del alumno.
     * @return La contraseña  del alumno.
     */
    public String getContrasena() {
        return contrasena;
    }

     /**
     * Se establece la contraseña del alumno.
     * @param contrasena El valor a establecer.
     */
    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

 
    
            
}
