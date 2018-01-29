/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.itson.eduTech.persistencia;

import mx.itson.eduTech.entidades.Envio;
import mx.itson.eduTech.utils.HibernateUtil;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

/**
 * @author Daniel Solano, Valeria García, Jesús Torres.
 */
public class EnvioPersistencia {
    
    /***
     * Método que permite guardar un envio.
     * @param e El envio a guardar.
     * @return El status del envio guardado.
     */
    public int guardar(Envio e) {
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
     * Método que permite obtener envio.
     * @param idEnvio La id del envio a obtener.
     * @return El envio.
     */
    
    public Envio obtenerEnvio(int idEnvio) {
        Envio envio = new Envio();
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            Criteria criteria = session.createCriteria(Envio.class);
            criteria.add(Restrictions.eq("id", idEnvio));
            envio = (Envio) criteria.uniqueResult();
        }catch (HibernateException e) {
            System.out.println(e.getMessage());
        }

        return envio;
    }
}
