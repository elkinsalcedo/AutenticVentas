/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.autentic.persistence.pojo;

import java.io.Serializable;

/**
 *
 * @author esalcedo
 */
public class VentafacturaPojo implements Serializable {
    private static final long serialVersionUID = 1L;
    private int id;
    private double valortotal;
    private PreventaPojo idpreventa;

    public VentafacturaPojo() {
    }

    public VentafacturaPojo(int id) {
        this.id = id;
    }

    public VentafacturaPojo(int id, double valortotal) {
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

    public PreventaPojo getIdpreventa() {
        return idpreventa;
    }

    public void setIdpreventa(PreventaPojo idpreventa) {
        this.idpreventa = idpreventa;
    }

    @Override
    public String toString() {
        return "com.autentic.persistence.entity.Ventafactura[ id=" + id + " ]";
    }
    
}
