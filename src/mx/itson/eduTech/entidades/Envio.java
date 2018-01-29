/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.itson.eduTech.entidades;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Temporal;

/**
 *
 * @author Daniel Solano, Valeria García, Jesús Torres.
 */
@Entity
public class Envio implements Serializable {

    private int id;
    private Date fecha;
    private String comentario;
    private Archivo archivo;
    public Envio(){}
    /**
     * El constructor del objeto Envio.
     * @param id El id del envio.
     * @param fecha La fecha del envio.
     * @param comentario El comentario del envio.
     */
    public Envio(int id, Date fecha, String comentario) {
        this.id = id;
        this.fecha = fecha;
        this.comentario = comentario;
    }
    
   
    /**
     * Obtiene el Id del envio.
     * @return El id del envio.
     */
    @Id
    @GeneratedValue
    public int getId() {
        return id;
    }
    /**
     * Se establece el id del envio.
     * @param id El valor a establecer.
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Obtiene la fecha del envio.
     * @return La fecha del envio.
     */
    @Temporal(javax.persistence.TemporalType.DATE)
    public Date getFecha() {
        return fecha;
    }
    /**
     * Se establece la fecha del envio.
     * @param fecha El valor a establecer.
     */
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    /**
     * Obtiene el comentario del envio.
     * @return Comentario del envio.
     */
    public String getComentario() {
        return comentario;
    }
    /**
     * Se establece el comentario del envio.
     * @param comentario El valor a establecer.
     */
    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    /**
     * Obtiene el archivo del envio.
     * @return Archivo del envio.
     */
    @OneToOne(cascade=CascadeType.ALL)
    @PrimaryKeyJoinColumn
    public Archivo getArchivo() {
        return archivo;
    }

    /**
     * Se establece el archivo del envio.
     * @param archivo El valor a establecer.
     */
    public void setArchivo(Archivo archivo) {
        this.archivo = archivo;
    }

    

}
