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
@Table(name = "DVDCART")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Dvdcart.findAll", query = "SELECT d FROM Dvdcart d"),
    @NamedQuery(name = "Dvdcart.findByCnamedvd", query = "SELECT d FROM Dvdcart d WHERE d.cnamedvd = :cnamedvd"),
    @NamedQuery(name = "Dvdcart.findByCrate", query = "SELECT d FROM Dvdcart d WHERE d.crate = :crate"),
    @NamedQuery(name = "Dvdcart.findByCyears", query = "SELECT d FROM Dvdcart d WHERE d.cyears = :cyears"),
    @NamedQuery(name = "Dvdcart.findByCprice", query = "SELECT d FROM Dvdcart d WHERE d.cprice = :cprice"),
    @NamedQuery(name = "Dvdcart.findByCqty", query = "SELECT d FROM Dvdcart d WHERE d.cqty = :cqty")})
public class Dvdcart implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 80)
    @Column(name = "CNAMEDVD")
    private String cnamedvd;
    @Size(max = 20)
    @Column(name = "CRATE")
    private String crate;
    @Column(name = "CYEARS")
    private Integer cyears;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "CPRICE")
    private Double cprice;
    @Column(name = "CQTY")
    private Integer cqty;

    public Dvdcart() {
    }

    public Dvdcart(String cnamedvd) {
        this.cnamedvd = cnamedvd;
    }

    public String getCnamedvd() {
        return cnamedvd;
    }

    public void setCnamedvd(String cnamedvd) {
        this.cnamedvd = cnamedvd;
    }

    public String getCrate() {
        return crate;
    }

    public void setCrate(String crate) {
        this.crate = crate;
    }

    public Integer getCyears() {
        return cyears;
    }

    public void setCyears(Integer cyears) {
        this.cyears = cyears;
    }

    public Double getCprice() {
        return cprice;
    }

    public void setCprice(Double cprice) {
        this.cprice = cprice;
    }

    public Integer getCqty() {
        return cqty;
    }

    public void setCqty(Integer cqty) {
        this.cqty = cqty;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cnamedvd != null ? cnamedvd.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Dvdcart)) {
            return false;
        }
        Dvdcart other = (Dvdcart) object;
        if ((this.cnamedvd == null && other.cnamedvd != null) || (this.cnamedvd != null && !this.cnamedvd.equals(other.cnamedvd))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Dvdcart[ cnamedvd=" + cnamedvd + " ]";
    }
    
}
