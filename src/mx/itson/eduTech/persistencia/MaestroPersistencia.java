/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.itson.eduTech.persistencia;

import mx.itson.eduTech.entidades.Maestro;
import mx.itson.eduTech.utils.HibernateUtil;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;


/**
 * @author Daniel Solano, Valeria García, Jesús Torres.
 */
public class MaestroPersistencia {
    
    /***
     * Método que permite guardar maestro.
     * @param m El maestro a guardar.
     * @return El status del maestro guardado.
     */
    public int guardar(Maestro m) {
        int id = -1;
        try {
            Session sesion = HibernateUtil.getSessionFactory().openSession();
            Transaction transaction = sesion.beginTransaction();
            sesion.save(m);
            id = m.getId();
            transaction.commit();
            sesion.close();
        } catch (HibernateException e) {
            System.out.println(e.getMessage());
        }
        return id;
    }
    
    /***
     * Método que permite verificar un usuario.
     * @param correo El correo del usuario a verificar. 
     * @return El valor booleano del usuario a verificar por su correo.
     */
    public boolean verificarUsuario(String correo){
        Maestro m = new Maestro();
        try {
            Session sesion = HibernateUtil.getSessionFactory().openSession();
            Criteria criteria = sesion.createCriteria(Maestro.class);
            criteria.add(Restrictions.eq("correo", correo));
            m = (Maestro) criteria.uniqueResult();
            sesion.close();
        } catch (HibernateException e) {
            System.out.println(e.getMessage());
        }
        return m==null;
    }
    
    /***
     * Método que permite obtener por correo y contraseña al maestro.
     * @param correo El correo del maestro.
     * @param contrasena La contraseña del maestro.
     * @return El maestro.
     */
    public Maestro obtenerPorCorreoContrasena(String correo, String contrasena) {
        Maestro m = new Maestro();
        try {
            Session sesion = HibernateUtil.getSessionFactory().openSession();
            Criteria criteria = sesion.createCriteria(Maestro.class);
            criteria.add(Restrictions.eq("correo", correo));
            criteria.add(Restrictions.eq("contrasena", contrasena));
            m = (Maestro) criteria.uniqueResult();
            sesion.close();
        } catch (HibernateException e) {
            System.out.println(e.getMessage());
        }
        return m;
    }
    
    /***
     * Método que permite obtener por id un maestro.
     * @param id El id del maestro.
     * @return El maestro.
     */
    public Maestro obtenerPorId(int id) {
        Maestro m = new Maestro();
        try {
            Session sesion = HibernateUtil.getSessionFactory().openSession();
            Criteria criteria = sesion.createCriteria(Maestro.class);
            criteria.add(Restrictions.eq("id", id));
            m = (Maestro) criteria.uniqueResult();
            sesion.close();
        } catch (HibernateException e) {
            System.out.println(e.getMessage());
        }
        return m;
    }
    
    /***
     *  Método que permite editar maestro.
     * @param maestro El maestro a editar.
     * @return El valor booleano a editar del maestro.
     */
    
    public boolean editarMaestro(Maestro maestro){
        try {
            Session sesion = HibernateUtil.getSessionFactory().openSession();
            Transaction transaction = null;
            transaction = sesion.beginTransaction();
            sesion.update(maestro);
            transaction.commit();
            return true;
        } catch (HibernateException e) {
            {
                System.out.println(e.getMessage());
                return false;
            }
        }
    }
}
