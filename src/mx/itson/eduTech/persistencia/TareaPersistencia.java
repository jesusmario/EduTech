/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.itson.eduTech.persistencia;

import java.util.ArrayList;
import java.util.List;
import mx.itson.eduTech.entidades.Tarea;
import mx.itson.eduTech.utils.HibernateUtil;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

/**
 * @author Daniel Solano, Valeria García, Jesús Torres.
 */
public class TareaPersistencia {
    
    /***
     * Método que permite guardar una tarea.
     * @param t La tarea a guardar.
     * @return  El status de la tarea guardada.
     */
    public int guardar(Tarea t) {
        int id = -1;
        try {
            Session sesion = HibernateUtil.getSessionFactory().openSession();
            Transaction transaction = sesion.beginTransaction();
            sesion.save(t);
            id = t.getId();
            transaction.commit();
            sesion.close();
        } catch (HibernateException e) {
            System.out.println(e.getMessage());
        }
        return id;
    }
    
    /***
     * Método que permite obtener una tarea por medio del id.
     * @param idTarea El id de la tarea.
     * @return La tarea.
     */
    public Tarea obtenerTarea(int idTarea) {
        Tarea t = new Tarea();
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            Criteria criteria = session.createCriteria(Tarea.class);
            criteria.add(Restrictions.eq("id", idTarea));
            t = (Tarea) session.createQuery("from Tarea where id="+idTarea).uniqueResult();
        }catch (HibernateException e) {
            System.out.println(e.getMessage());
        }

        return t;
    }
    
    /***
     * Método que permite obtener una lista de cursos por medio de su id.
     * @param idCurso El id del curso.
     * @return Lista de tareas por medio del id.
     */
     public List<Tarea> obtenerPorCurso(int idCurso) {
        List<Tarea> listTareas = new ArrayList<>();
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            Criteria criteria = session.createCriteria(Tarea.class);
            criteria.add(Restrictions.eq("idCurso", idCurso));
            listTareas = (List<Tarea>) criteria.list();
        }catch (HibernateException e) {
            System.out.println(e.getMessage());
        }

        return listTareas;
    }
     
     /***
      * Método que permite editar tarea.
      * @param tarea La tarea a editar.
      * @return El valor booleano a editar de la tarea.
      */
     
     public boolean editarTarea(Tarea tarea){
        try {
            Session sesion = HibernateUtil.getSessionFactory().openSession();
            Transaction transaction = null;
            transaction = sesion.beginTransaction();
            sesion.update(tarea);
            transaction.commit();
            return true;
        } catch (Exception e) {
            {
                System.out.println(e.getMessage());
                return false;
            }
        }
    }
}
