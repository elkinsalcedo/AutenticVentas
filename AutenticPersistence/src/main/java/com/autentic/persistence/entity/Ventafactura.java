/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.autentic.persistence.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author esalcedo
 */
@Entity
@Table(name = "ventafactura")
@XmlRootElement
public class Ventafactura implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private int id;
    
    @Basic(optional = false)
    @Column(name = "valortotal")
    private double valortotal;
    
    @JoinColumn(name = "idpreventa", referencedColumnName = "id")
    @OneToOne(optional = false, fetch = FetchType.EAGER)
    private Preventa idpreventa;

    public Ventafactura() {
    }

    public Ventafactura(int id) {
        this.id = id;
    }

    public Ventafactura(int id, double valortotal) {
        this.id = id;
        this.valortotal = valortotal;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getValortotal() {
        return valortotal;
    }

    public void setValortotal(double valortotal) {
        this.valortotal = valortotal;
    }

    public Preventa getIdpreventa() {
        return idpreventa;
    }

    public void setIdpreventa(Preventa idpreventa) {
        this.idpreventa = idpreventa;
    }

    @Override
    public String toString() {
        return "com.autentic.persistence.entity.Ventafactura[ id=" + id + " ]";
    }
    
}
