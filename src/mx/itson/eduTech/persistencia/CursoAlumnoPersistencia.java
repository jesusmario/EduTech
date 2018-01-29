/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.itson.eduTech.persistencia;

import java.util.ArrayList;
import java.util.List;
import mx.itson.eduTech.entidades.Curso;
import mx.itson.eduTech.entidades.CursoAlumno;
import mx.itson.eduTech.utils.HibernateUtil;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

/**
 * @author Daniel Solano, Valeria García, Jesús Torres.
 */
public class CursoAlumnoPersistencia {

    /***
     * Método para guardar el curso del alumno.
     * @param ca El nombre del curso para el alumno.
     * @return El registro completado.
     */
    public int guardar(CursoAlumno ca) {
        int id = -1;
        try {
            Session sesion = HibernateUtil.getSessionFactory().openSession();
            Transaction transaction = sesion.beginTransaction();
            sesion.save(ca);
            id = ca.getId();
            transaction.commit();
            sesion.close();
        } catch (HibernateException e) {
            System.out.println(e.getMessage());
        }
        return id;
    }
    
    /***
     * Método que permite obtener cursos por el alumno.
     * @param idAlumno La id del alumno del curso.
     * @return La lista de cursos de alumno.
     */
    public List<CursoAlumno> obtenerCursosPorAlumno(int idAlumno) {
        List<CursoAlumno> listCursos = new ArrayList<>();
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            Criteria criteria = session.createCriteria(CursoAlumno.class);
            criteria.add(Restrictions.eq("idAlumno", idAlumno));
            listCursos = (List<CursoAlumno>) criteria.list();
        }catch (HibernateException e) {
            System.out.println(e.getMessage());
        }

        return listCursos;
    }
    
    /***
     * Método para obtener la lista de cursos disponibles.
     * @param idAlumno La id del alumno.
     * @return Lista de cursos disponibles para el alumno.
     */
    public List<Curso> obtenerCursosDisponibles(int idAlumno) {
        CursoPersistencia cp = new CursoPersistencia();
        List<Curso> tCursos = new ArrayList<>();
        List<Curso> cDisponibles= new ArrayList<>();
        List<CursoAlumno> listCursos = new ArrayList<>();
        try {
            tCursos=cp.obtenerTodos();
            Session session = HibernateUtil.getSessionFactory().openSession();
            Criteria criteria = session.createCriteria(CursoAlumno.class);
            criteria.add(Restrictions.eq("idAlumno", idAlumno));
            listCursos = (List<CursoAlumno>) criteria.list();
            boolean esta=false;
            for(Curso c: tCursos){
                for(CursoAlumno ca: listCursos){
                    if(ca.getIdCurso()==c.getId()){
                        esta=true;
                    }
                }
                if(!esta){
                    cDisponibles.add(c);
                }
                esta=false;
            }
        }catch (HibernateException e) {
            System.out.println(e.getMessage());
        }

        return cDisponibles;
    }
    
    /***
     * Método para obtener el alumno por curso.
     * @param idCurso El id del curso para el alumno a obtener.
     * @return La lista de cursos en los que pertenece el alumno.
     */
    public List<CursoAlumno> obtenerAlumnoPorCurso(int idCurso) {
        List<CursoAlumno> listCursos = new ArrayList<>();
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            Criteria criteria = session.createCriteria(CursoAlumno.class);
            criteria.add(Restrictions.eq("idCurso", idCurso));
            listCursos = (List<CursoAlumno>) criteria.list();
        }catch (HibernateException e) {
            System.out.println(e.getMessage());
        }

        return listCursos;
    }
    
    
}
