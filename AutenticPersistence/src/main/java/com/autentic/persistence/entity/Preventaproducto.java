/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.autentic.persistence.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author esalcedo
 */
@Entity
@Table(name = "preventaproducto")
@XmlRootElement
public class Preventaproducto implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private int id;
    
    @Basic(optional = false)
    @Column(name = "cantidad")
    @NotNull
    private int cantidad;
    
    @Basic(optional = false)
    @Column(name = "valor")
    private double valor;
    
    @JoinColumn(name = "idproducto", referencedColumnName = "id")
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private Producto idproducto;
    
    @JoinColumn(name = "idpreventa", referencedColumnName = "id")
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private Preventa idpreventa;

    public Preventaproducto() {
    }

    public Preventaproducto(int id) {
        this.id = id;
    }

    public Preventaproducto(int id, int cantidad, double valor) {
        this.id = id;
        this.cantidad = cantidad;
        this.valor = valor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Producto getIdproducto() {
        return idproducto;
    }

    public void setIdproducto(Producto idproducto) {
        this.idproducto = idproducto;
    }

    public Preventa getIdpreventa() {
        return idpreventa;
    }

    public void setIdpreventa(Preventa idpreventa) {
        this.idpreventa = idpreventa;
    }

    @Override
    public String toString() {
        return "com.autentic.persistence.entity.Preventaproducto[ id=" + id + " ]";
    }
    
}
