/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.itson.eduTech.persistencia;

import java.util.ArrayList;
import java.util.List;
import mx.itson.eduTech.entidades.Alumno;
import mx.itson.eduTech.entidades.Curso;
import mx.itson.eduTech.utils.HibernateUtil;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

/**
 * @author Daniel Solano, Valeria García, Jesús Torres.
 */
public class CursoPersistencia {
    /***
     * Método que permite guardar el curso.
     * @param c Curso a guardar.
     * @return El registro del curso guardado.
     */
    
    public int guardar(Curso c) {
        int id = -1;
        try {
            Session sesion = HibernateUtil.getSessionFactory().openSession();
            Transaction transaction = sesion.beginTransaction();
            sesion.save(c);
            id = c.getId();
            transaction.commit();
            sesion.close();
        } catch (HibernateException e) {
            System.out.println(e.getMessage());
        }
        return id;
    }
    
    /***
     * Método para obtener toda la lista de cursos.
     * @return La lista de cursos.
     */
    public List<Curso> obtenerTodos() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        List<Curso> cursos = (List<Curso>) session.createCriteria(Curso.class).list();
        return cursos;
    }
    
    /***
     * Método para obtener cursos por nombre.
     * @param nombre El nombre del curso.
     * @return El curso.
     */
    public Curso obtenerPorNombre(String nombre) {
        Curso curso = new Curso();
        try {
            Session sesion = HibernateUtil.getSessionFactory().openSession();
            Criteria criteria = sesion.createCriteria(Curso.class);
            criteria.add(Restrictions.eq("nombre", nombre));
            curso = (Curso) criteria.uniqueResult();
            sesion.close();
        } catch (HibernateException e) {
            System.out.println(e.getMessage());
        }
        return curso;
    }
    
    /***
     * Método para obtener una lista de maestros por su id.
     * @param idMaestro El id del maestro.
     * @return Lista de cursos en los que pertenece el maestro.
     */
    public List<Curso> obtenerPorMaestro(int idMaestro) {
        List<Curso> listCursos = new ArrayList<>();
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            Criteria criteria = session.createCriteria(Curso.class);
            criteria.add(Restrictions.eq("idMaestro", idMaestro));
            listCursos = (List<Curso>) criteria.list();
        }catch (HibernateException e) {
            System.out.println(e.getMessage());
        }

        return listCursos;
    }
    
    /***
     * Método que permite obtener el curso por medio del id.
     * @param id La id del curso.
     * @return El curso obtenido por su id.
     */
    public Curso obtenerPorId(int id) {
        Curso c = new Curso();
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            Criteria criteria = session.createCriteria(Curso.class);
            criteria.add(Restrictions.eq("id", id));
            c = (Curso) criteria.uniqueResult();
        }catch (HibernateException e) {
            System.out.println(e.getMessage());
        }

        return c;
    }
    
    /***
     * Método que permite editar el curso.
     * @param curso El curso a editar. 
     * @return El valor booleano de la edición del curso.
     */
    public boolean editarCurso(Curso curso){
        try {
            Session sesion = HibernateUtil.getSessionFactory().openSession();
            Transaction transaction = null;
            transaction = sesion.beginTransaction();
            sesion.update(curso);
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
