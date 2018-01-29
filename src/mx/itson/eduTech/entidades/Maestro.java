/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.itson.eduTech.entidades;
import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

/**
 *
 * @author Daniel Solano, Valeria García, Jesús Torres.
 */
@Entity
public class Maestro implements Serializable {
    private int id;
    private String nombre;
    private String correo;
    private String contrasena;
    private List<Curso> cursos;
    

    public Maestro(){}
    /**
     * Constructor del objeto de Maestro.
     * @param id El id del maestro.
     * @param nombre El nombre del maestro.
     * @param correo El correo del maestro.
     * @param contrasena La contraseña del maestro.
     */
    public Maestro(int id, String nombre, String correo, String contrasena) {
        this.id = id;
        this.nombre = nombre;
        this.correo = correo;
        this.contrasena = contrasena;
    }
    
    /**
     * Obtiene el Id del maestro.
     * @return El id del maestro.
     */
    @Id
    @GeneratedValue
    public int getId() {
        return id;
    }

    /**
     * Se establece el id del maestro.
     * @param id El valor a establecer.
     */
    public void setId(int id) {
        this.id = id;
    }
    
    /**
     * Obtiene el nombre del maestro.
     * @return El nombre del maestro.
     */
    public String getNombre() {
        return nombre;
    }

     /**
     * Se establece el nombre del maestro.
     * @param nombre El valor a establecer.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    /**
     * Obtiene el correo del maestro.
     * @return El correo del maestro.
     */
    public String getCorreo() {
        return correo;
    }
     /**
     * Se establece el correo del maestro.
     * @param correo El valor a establecer.
     */
    public void setCorreo(String correo) {
        this.correo = correo;
    }
    
    /**
     * Obtiene la contraseña del maestro.
     * @return La contrasena del maestro.
     */
    public String getContrasena() {
        return contrasena;
    }
    /**
     * Se establece la contraseña del maestro.
     * @param contrasena El valor a establecer.
     */
    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }
    
    /**
     * Obtiene la lista de los cursos del maestro.
     * @return Cursos del maestro.
     */
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "idMaestro")
    @LazyCollection(LazyCollectionOption.FALSE)
    public List<Curso> getCursos() {
        return cursos;
    }
     /**
     * Se establece los cursos del maestro.
     * @param cursos El valor a establecer.
     */
    public void setCursos(List<Curso> cursos) {
        this.cursos = cursos;
    }

    
    
}
