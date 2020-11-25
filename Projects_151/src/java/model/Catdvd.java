/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

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
 * @author 61050151
 */
@Entity
@Table(name = "CATDVD")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Catdvd.findAll", query = "SELECT c FROM Catdvd c"),
    @NamedQuery(name = "Catdvd.findById", query = "SELECT c FROM Catdvd c WHERE c.id = :id"),
    @NamedQuery(name = "Catdvd.findByNamedvd", query = "SELECT c FROM Catdvd c WHERE c.namedvd = :namedvd"),
    @NamedQuery(name = "Catdvd.findByRate", query = "SELECT c FROM Catdvd c WHERE c.rate = :rate"),
    @NamedQuery(name = "Catdvd.findByYears", query = "SELECT c FROM Catdvd c WHERE c.years = :years"),
    @NamedQuery(name = "Catdvd.findByPrice", query = "SELECT c FROM Catdvd c WHERE c.price = :price")})
public class Catdvd implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID")
    private Integer id;
    @Size(max = 80)
    @Column(name = "NAMEDVD")
    private String namedvd;
    @Size(max = 20)
    @Column(name = "RATE")
    private String rate;
    @Column(name = "YEARS")
    private Integer years;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "PRICE")
    private Double price;

    public Catdvd() {
    }

    public Catdvd(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNamedvd() {
        return namedvd;
    }

    public void setNamedvd(String namedvd) {
        this.namedvd = namedvd;
    }

    public String getRate() {
        return rate;
    }

    public void setRate(String rate) {
        this.rate = rate;
    }

    public Integer getYears() {
        return years;
    }

    public void setYears(Integer years) {
        this.years = years;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
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
        if (!(object instanceof Catdvd)) {
            return false;
        }
        Catdvd other = (Catdvd) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Catdvd[ id=" + id + " ]";
    }
    
}
