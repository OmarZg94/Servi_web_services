/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Omar
 */
@Entity
@Table(name = "horario")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Horario.findAll", query = "SELECT h FROM Horario h"),
    @NamedQuery(name = "Horario.findById", query = "SELECT h FROM Horario h WHERE h.id = :id"),
    @NamedQuery(name = "Horario.findByGrupo", query = "SELECT h FROM Horario h WHERE h.grupo = :grupo"),
    @NamedQuery(name = "Horario.findByMateria", query = "SELECT h FROM Horario h WHERE h.materia = :materia"),
    @NamedQuery(name = "Horario.findByProfesor", query = "SELECT h FROM Horario h WHERE h.profesor = :profesor"),
    @NamedQuery(name = "Horario.findBySalon", query = "SELECT h FROM Horario h WHERE h.salon = :salon"),
    @NamedQuery(name = "Horario.findByLunes", query = "SELECT h FROM Horario h WHERE h.lunes = :lunes"),
    @NamedQuery(name = "Horario.findByMartes", query = "SELECT h FROM Horario h WHERE h.martes = :martes"),
    @NamedQuery(name = "Horario.findByMiercoles", query = "SELECT h FROM Horario h WHERE h.miercoles = :miercoles"),
    @NamedQuery(name = "Horario.findByJueves", query = "SELECT h FROM Horario h WHERE h.jueves = :jueves"),
    @NamedQuery(name = "Horario.findByViernes", query = "SELECT h FROM Horario h WHERE h.viernes = :viernes")})
public class Horario implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 5)
    @Column(name = "grupo")
    private String grupo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "materia")
    private String materia;
    @Size(max = 100)
    @Column(name = "profesor")
    private String profesor;
    @Column(name = "salon")
    private Integer salon;
    @Column(name = "lunes")
    @Temporal(TemporalType.TIME)
    private Date lunes;
    @Column(name = "martes")
    @Temporal(TemporalType.TIME)
    private Date martes;
    @Column(name = "miercoles")
    @Temporal(TemporalType.TIME)
    private Date miercoles;
    @Column(name = "jueves")
    @Temporal(TemporalType.TIME)
    private Date jueves;
    @Column(name = "viernes")
    @Temporal(TemporalType.TIME)
    private Date viernes;

    public Horario() {
    }

    public Horario(Integer id) {
        this.id = id;
    }

    public Horario(Integer id, String grupo, String materia) {
        this.id = id;
        this.grupo = grupo;
        this.materia = materia;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public String getProfesor() {
        return profesor;
    }

    public void setProfesor(String profesor) {
        this.profesor = profesor;
    }

    public Integer getSalon() {
        return salon;
    }

    public void setSalon(Integer salon) {
        this.salon = salon;
    }

    public Date getLunes() {
        return lunes;
    }

    public void setLunes(Date lunes) {
        this.lunes = lunes;
    }

    public Date getMartes() {
        return martes;
    }

    public void setMartes(Date martes) {
        this.martes = martes;
    }

    public Date getMiercoles() {
        return miercoles;
    }

    public void setMiercoles(Date miercoles) {
        this.miercoles = miercoles;
    }

    public Date getJueves() {
        return jueves;
    }

    public void setJueves(Date jueves) {
        this.jueves = jueves;
    }

    public Date getViernes() {
        return viernes;
    }

    public void setViernes(Date viernes) {
        this.viernes = viernes;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Horario)) {
            return false;
        }
        Horario other = (Horario) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Horario[ id=" + id + " ]";
    }
    
}
