/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.itson.eduTech.negocio;

import mx.itson.eduTech.entidades.Alumno;
import mx.itson.eduTech.persistencia.AlumnoPersistencia;

/**
 * @author Daniel Solano, Valeria García, Jesús Torres.
 */
public class AlumnoNegocio {
 
    /***
     * Método que permite obtener al alumno por id.
     * @param id valor del id del alumno.
     * @return La id del alumno.
     */
    public Alumno obtenerPorId(int id){
       AlumnoPersistencia ap= new AlumnoPersistencia();
        return ap.obtenerPorId(id);
    }
    
    /***
     * Método que permite guardar al alumno.
     * @param a El alumno que se desea guardar.
     * @return El alumno guardado.
     */
    public int guardar(Alumno a){
        AlumnoPersistencia ap = new AlumnoPersistencia();
        return ap.guardar(a);
    }
    
    /***
     * Método para verificar un usuario.
     * @param correo El correo del usuario que se desea verificar.
     * @return La verificación del usuario.
     */
    public boolean verificarUsuario(String correo){
        AlumnoPersistencia ap = new AlumnoPersistencia();
        return ap.verificarUsuario(correo);
    }
    
    /***
     * Método para obtener al usuario por correo y contraseña.
     * @param correo El correo del usuario.
     * @param contrasena La contraseña del usuario.
     * @return El usuario.
     */
    public Alumno obtenerPorCorreoContrasena(String correo, String contrasena){
        AlumnoPersistencia ap= new AlumnoPersistencia();
        return ap.obtenerPorCorreoContrasena(correo, contrasena);
    }
}
