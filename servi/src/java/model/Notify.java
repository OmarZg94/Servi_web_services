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
import javax.persistence.Lob;
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
@Table(name = "notify")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Notify.findAll", query = "SELECT n FROM Notify n"),
    @NamedQuery(name = "Notify.findById", query = "SELECT n FROM Notify n WHERE n.id = :id"),
    @NamedQuery(name = "Notify.findByLang", query = "SELECT n FROM Notify n WHERE n.lang = :lang"),
    @NamedQuery(name = "Notify.findByCorreo", query = "SELECT n FROM Notify n WHERE n.correo = :correo"),
    @NamedQuery(name = "Notify.findByTiempo", query = "SELECT n FROM Notify n WHERE n.tiempo = :tiempo"),
    @NamedQuery(name = "Notify.findByEnviado", query = "SELECT n FROM Notify n WHERE n.enviado = :enviado")})
public class Notify implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2)
    @Column(name = "lang")
    private String lang;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "correo")
    private String correo;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 65535)
    @Column(name = "msg")
    private String msg;
    @Basic(optional = false)
    @NotNull
    @Column(name = "tiempo")
    @Temporal(TemporalType.TIMESTAMP)
    private Date tiempo;
    @Basic(optional = false)
    @NotNull
    @Column(name = "enviado")
    private boolean enviado;

    public Notify() {
    }

    public Notify(Integer id) {
        this.id = id;
    }

    public Notify(Integer id, String lang, String correo, String msg, Date tiempo, boolean enviado) {
        this.id = id;
        this.lang = lang;
        this.correo = correo;
        this.msg = msg;
        this.tiempo = tiempo;
        this.enviado = enviado;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Date getTiempo() {
        return tiempo;
    }

    public void setTiempo(Date tiempo) {
        this.tiempo = tiempo;
    }

    public boolean getEnviado() {
        return enviado;
    }

    public void setEnviado(boolean enviado) {
        this.enviado = enviado;
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
        if (!(object instanceof Notify)) {
            return false;
        }
        Notify other = (Notify) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Notify[ id=" + id + " ]";
    }
    
}
