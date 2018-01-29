/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.itson.eduTech.persistencia;

import mx.itson.eduTech.entidades.Archivo;
import mx.itson.eduTech.utils.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 * @author Daniel Solano, Valeria García, Jesús Torres.
 */
public class ArchivoPersistencia {
    
    /***
     * Método que permite guardar un archivo.
     * @param a El archivo a guardar.
     * @return El registro del archivo guardado.
     */
    public int guardar(Archivo a) {
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
}
