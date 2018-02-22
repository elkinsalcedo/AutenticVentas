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
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author esalcedo
 */
@Entity
@Table(name = "preventa")
@XmlRootElement
public class Preventa implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private int id;
    
    @Basic(optional = false)
    @Column(name = "comercial")
    @NotNull
    private String comercial;
    
    @Basic(optional = false)
    @Column(name = "lugardespacho")
    @NotNull
    private String lugardespacho;
    
    @Basic(optional = false)
    @Column(name = "estado")
    private int estado;
    
    @OneToOne( mappedBy = "idpreventa", fetch = FetchType.EAGER)
    private Ventafactura ventafactura;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idpreventa", fetch = FetchType.EAGER, orphanRemoval = true)
    private List<Preventaproducto> preventaproducto;

    public Preventa() {
    }

    public Preventa(int id) {
        this.id = id;
    }

    public Preventa(int id, String comercial, String lugardespacho, int estado) {
        this.id = id;
        this.comercial = comercial;
        this.lugardespacho = lugardespacho;
        this.estado = estado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getComercial() {
        return comercial;
    }

    public void setComercial(String comercial) {
        this.comercial = comercial;
    }

    public String getLugardespacho() {
        return lugardespacho;
    }

    public void setLugardespacho(String lugardespacho) {
        this.lugardespacho = lugardespacho;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }    
    
    public Ventafactura getVentafactura() {
		return ventafactura;
	}

	public void setVentafactura(Ventafactura ventafactura) {
		this.ventafactura = ventafactura;
	}

	public List<Preventaproducto> getPreventaproducto() {
		return preventaproducto;
	}

	public void setPreventaproducto(List<Preventaproducto> preventaproducto) {
		this.preventaproducto = preventaproducto;
	}

    @Override
    public String toString() {
        return "com.autentic.persistence.entity.Preventa[ id=" + id + " ]";
    }
    
}
