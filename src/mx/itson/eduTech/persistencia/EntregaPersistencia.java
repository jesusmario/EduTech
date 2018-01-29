/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.itson.eduTech.persistencia;

import java.util.ArrayList;
import java.util.List;
import mx.itson.eduTech.entidades.Alumno;
import mx.itson.eduTech.entidades.Entrega;
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

public class EntregaPersistencia {
    
    /***
     * Método para guardar una entrega.
     * @param e La entrega.
     * @return El status de la entrega guardada.
     */
    public int guardar(Entrega e) {
        int id = -1;
        try {
            Session sesion = HibernateUtil.getSessionFactory().openSession();
            Transaction transaction = sesion.beginTransaction();
            sesion.save(e);
            id = e.getId();
            transaction.commit();
            sesion.close();
        } catch (HibernateException he) {
            System.out.println(he.getMessage());
        }
        return id;
    }
    
    /***
     * Método que permite obtener por el alumno la tarea.
     * @param a El alumno.
     * @param t La tarea.
     * @return La entrega realizada por el alumno.
     */
    public Entrega obtenerPorAlumnoTarea(Alumno a, Tarea t) {
        Entrega entrega = new Entrega();
        try {
            Session sesion = HibernateUtil.getSessionFactory().openSession();
            Criteria criteria = sesion.createCriteria(Entrega.class);
            criteria.add(Restrictions.eq("idAlumno", a.getId()));
            criteria.add(Restrictions.eq("idTarea", t.getId()));
            entrega = (Entrega) criteria.uniqueResult();
            sesion.close();
        } catch (HibernateException e) {
            System.out.println(e.getMessage());
        }
        return entrega;
    }
    
    /***
     * Método que permite obtener por id las entregas.
     * @param id El id de la entrega.
     * @return Una entrega.
     */
    public Entrega obtenerPorId(int id) {
        Entrega entrega = new Entrega();
        try {
            Session sesion = HibernateUtil.getSessionFactory().openSession();
            Criteria criteria = sesion.createCriteria(Entrega.class);
            criteria.add(Restrictions.eq("id", id));
            entrega = (Entrega) criteria.uniqueResult();
            sesion.close();
        } catch (HibernateException e) {
            System.out.println(e.getMessage());
        }
        return entrega;
    }
    
    /***
     * Método que permite obtener por tarea una lista de entregas.
     * @param idTarea El id de la tarea.
     * @return Lista de entregas realizadas por las tareas.
     */
    public List<Entrega> obtenerPorTarea(int idTarea) {
        List<Entrega> entregas = new ArrayList<>();
        try {
            Session sesion = HibernateUtil.getSessionFactory().openSession();
            Criteria criteria = sesion.createCriteria(Entrega.class);
            criteria.add(Restrictions.eq("idTarea", idTarea));
            entregas = (List<Entrega>) criteria.list();
            sesion.close();
        } catch (HibernateException e) {
            System.out.println(e.getMessage());
        }
        return entregas;
    }
    
    /***
     * Método que permite editar una entrega.
     * @param entrega La entrega a editar.
     * @return El valor booleano de la edición de una entrega.
     */
    public boolean editarEntrega(Entrega entrega){
        try {
            Session sesion = HibernateUtil.getSessionFactory().openSession();
            Transaction transaction = null;
            transaction = sesion.beginTransaction();
            sesion.update(entrega);
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
