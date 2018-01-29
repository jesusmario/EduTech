/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.itson.eduTech.negocio;

import mx.itson.eduTech.entidades.Maestro;
import mx.itson.eduTech.persistencia.MaestroPersistencia;

/**
 * @author Daniel Solano, Valeria García, Jesús Torres.
 */


public class MaestroNegocio {
    
    /***
     * Método que permite guardar a un maestro.
     * @param m El maestro a guardar.
     * @return El registro guardado del maestro.
     */
    public int guardar(Maestro m){
        MaestroPersistencia mp = new MaestroPersistencia();
        return mp.guardar(m);
    }
    
    /***
     * Método que permite verificar un usuario.
     * @param correo El correo del usuario.
     * @return El valor booleano de la verificación.
     */
    public boolean verificarUsuario(String correo){
        MaestroPersistencia mp = new MaestroPersistencia();
        return mp.verificarUsuario(correo);
    }
    
    /***
     * Método que permite obtener un maestro por medio de correo y contraseña.
     * @param correo El correo del maestro a buscar.
     * @param contrasena La contraseña del maestro a buscar.
     * @return El maestro.
     */
    public Maestro obtenerPorCorreoContrasena(String correo, String contrasena){
        MaestroPersistencia mp= new MaestroPersistencia();
        return mp.obtenerPorCorreoContrasena(correo, contrasena);
    }
    /***
     * Método que permite obtener por id al maestro.
     * @param id El id del maestro.
     * @return El maestro obtenido.
     */
    public Maestro obtenerPorId(int id){
        MaestroPersistencia mp= new MaestroPersistencia();
        return mp.obtenerPorId(id);
    }
    
    /***
     * Método que permite editar a un maestro.
     * @param m El maestro a editar.
     * @return El valor booleano de la edición.
     */
    public boolean editarMaestro(Maestro m){
        MaestroPersistencia mp = new MaestroPersistencia();
        return mp.editarMaestro(m);
    }
}
