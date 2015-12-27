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
@Table(name = "reporte")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Reporte.findAll", query = "SELECT r FROM Reporte r"),
    @NamedQuery(name = "Reporte.findById", query = "SELECT r FROM Reporte r WHERE r.id = :id"),
    @NamedQuery(name = "Reporte.findByIdHorario", query = "SELECT r FROM Reporte r WHERE r.idHorario = :idHorario"),
    @NamedQuery(name = "Reporte.findByIpAlumno", query = "SELECT r FROM Reporte r WHERE r.ipAlumno = :ipAlumno"),
    @NamedQuery(name = "Reporte.findByEstado", query = "SELECT r FROM Reporte r WHERE r.estado = :estado"),
    @NamedQuery(name = "Reporte.findByReportedOn", query = "SELECT r FROM Reporte r WHERE r.reportedOn = :reportedOn")})
public class Reporte implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_horario")
    private int idHorario;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 15)
    @Column(name = "ip_alumno")
    private String ipAlumno;
    @Basic(optional = false)
    @NotNull
    @Column(name = "estado")
    private boolean estado;
    @Basic(optional = false)
    @NotNull
    @Column(name = "reported_on")
    @Temporal(TemporalType.TIMESTAMP)
    private Date reportedOn;

    public Reporte() {
    }

    public Reporte(Integer id) {
        this.id = id;
    }

    public Reporte(Integer id, int idHorario, String ipAlumno, boolean estado, Date reportedOn) {
        this.id = id;
        this.idHorario = idHorario;
        this.ipAlumno = ipAlumno;
        this.estado = estado;
        this.reportedOn = reportedOn;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getIdHorario() {
        return idHorario;
    }

    public void setIdHorario(int idHorario) {
        this.idHorario = idHorario;
    }

    public String getIpAlumno() {
        return ipAlumno;
    }

    public void setIpAlumno(String ipAlumno) {
        this.ipAlumno = ipAlumno;
    }

    public boolean getEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public Date getReportedOn() {
        return reportedOn;
    }

    public void setReportedOn(Date reportedOn) {
        this.reportedOn = reportedOn;
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
        if (!(object instanceof Reporte)) {
            return false;
        }
        Reporte other = (Reporte) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Reporte[ id=" + id + " ]";
    }
    
}
