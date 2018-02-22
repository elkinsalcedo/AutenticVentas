/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.autentic.persistence.entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author esalcedo
 */
@Entity
@Table(name = "producto")
@XmlRootElement
public class Producto implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private int id;
    
    @Basic(optional = false)
    @Column(name = "nombre")
    @NotNull
    private String nombre;
    
    @Basic(optional = false)
    @Column(name = "valor")
    @NotNull
    private double valor;
    
    @Basic(optional = false)
    @Column(name = "estado")
    private int estado;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idproducto", fetch = FetchType.EAGER)
    private List<Preventaproducto> preventaproducto;

    public Producto() {
    }

    public Producto(int id) {
        this.id = id;
    }

    public Producto(int id, String nombre, double valor, int estado) {
        this.id = id;
        this.nombre = nombre;
        this.valor = valor;
        this.estado = estado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    @XmlTransient
    public List<Preventaproducto> getPreventaproducto() {
        return preventaproducto;
    }

    public void setPreventaproductoList(List<Preventaproducto> preventaproducto) {
        this.preventaproducto = preventaproducto;
    }    
    
}
