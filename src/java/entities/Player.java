/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author ckc
 */
@Entity
@Table(name = "PLAYER")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Player.findAll", query = "SELECT p FROM Player p"),
    @NamedQuery(name = "Player.findById", query = "SELECT p FROM Player p WHERE p.id = :id"),
    @NamedQuery(name = "Player.findByFirstname", query = "SELECT p FROM Player p WHERE p.firstname = :firstname"),
    @NamedQuery(name = "Player.findByLastname", query = "SELECT p FROM Player p WHERE p.lastname = :lastname"),
    @NamedQuery(name = "Player.findByJerseynumber", query = "SELECT p FROM Player p WHERE p.jerseynumber = :jerseynumber"),
    @NamedQuery(name = "Player.findByLastspokenwords", query = "SELECT p FROM Player p WHERE p.lastspokenwords = :lastspokenwords")})
public class Player implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 40)
    @Column(name = "FIRSTNAME")
    private String firstname;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 40)
    @Column(name = "LASTNAME")
    private String lastname;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 40)
    @Column(name = "JERSEYNUMBER")
    private String jerseynumber;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 40)
    @Column(name = "LASTSPOKENWORDS")
    private String lastspokenwords;

    public Player() {
    }

    public Player(Integer id) {
        this.id = id;
    }

    public Player(Integer id, String firstname, String lastname, String jerseynumber, String lastspokenwords) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.jerseynumber = jerseynumber;
        this.lastspokenwords = lastspokenwords;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getJerseynumber() {
        return jerseynumber;
    }

    public void setJerseynumber(String jerseynumber) {
        this.jerseynumber = jerseynumber;
    }

    public String getLastspokenwords() {
        return lastspokenwords;
    }

    public void setLastspokenwords(String lastspokenwords) {
        this.lastspokenwords = lastspokenwords;
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
        if (!(object instanceof Player)) {
            return false;
        }
        Player other = (Player) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Player[ id=" + id + " ]";
    }
    
}