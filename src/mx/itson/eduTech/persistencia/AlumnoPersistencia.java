/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.itson.eduTech.persistencia;

import mx.itson.eduTech.entidades.Alumno;
import mx.itson.eduTech.utils.HibernateUtil;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

/**
 * @author Daniel Solano, Valeria García, Jesús Torres.
 */
public class AlumnoPersistencia {

    /***
     * Método que permite guardar un alumno.
     * @param a El alumno.
     * @return La id del alumno.
     */
    public int guardar(Alumno a) {
        int id = -1;
        try {
            Session sesion = HibernateUtil.getSessionFactory().openSession();
            Transaction transaction = sesion.beginTransaction();
            sesion.save(a);
            id = a.getId();
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
     * @return  El valor booleano de la verificación del usuario.
     */
    
    public boolean verificarUsuario(String correo){
        Alumno alumno = new Alumno();
        try {
            Session sesion = HibernateUtil.getSessionFactory().openSession();
            Criteria criteria = sesion.createCriteria(Alumno.class);
            criteria.add(Restrictions.eq("correo", correo));
            alumno = (Alumno) criteria.uniqueResult();
            sesion.close();
        } catch (HibernateException e) {
            System.out.println(e.getMessage());
        }
        return alumno==null;
    }
    
    /***
     * Método que permite obtener por correo la contraseña del alumno.
     * @param correo El correo del alumno a obtener.
     * @param contrasena La contraseña del alumno a obtener.
     * @return El correo del alumno y la contraseña.
     */
    public Alumno obtenerPorCorreoContrasena(String correo, String contrasena) {
        Alumno alumno = new Alumno();
        try {
            Session sesion = HibernateUtil.getSessionFactory().openSession();
            Criteria criteria = sesion.createCriteria(Alumno.class);
            criteria.add(Restrictions.eq("correo", correo));
            criteria.add(Restrictions.eq("contrasena", contrasena));
            alumno = (Alumno) criteria.uniqueResult();
            sesion.close();
        } catch (HibernateException e) {
            System.out.println(e.getMessage());
        }
        return alumno;
    }
    
    /***
     * Método que permite obtener obtener por id el alumno.
     * @param id El id del alumno.
     * @return El id del alumno.
     */
    public Alumno obtenerPorId(int id) {
        Alumno alumno = new Alumno();
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            Criteria criteria = session.createCriteria(Alumno.class);
            criteria.add(Restrictions.eq("id", id));
            alumno = (Alumno) criteria.uniqueResult();
        }catch (HibernateException e) {
            System.out.println(e.getMessage());
        }

        return alumno;
    }

}
