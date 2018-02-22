/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.autentic.core.dto;

import java.io.Serializable;

/**
 *
 * @author esalcedo
 */
public class VentafacturaDto implements Serializable {
    private static final long serialVersionUID = 1L;
    private int id;
    private double valortotal;
    private PreventaDto idpreventa;

    public VentafacturaDto() {
    }

    public VentafacturaDto(int id) {
        this.id = id;
    }

    public VentafacturaDto(int id, double valortotal) {
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

    public PreventaDto getIdpreventa() {
        return idpreventa;
    }

    public void setIdpreventa(PreventaDto idpreventa) {
        this.idpreventa = idpreventa;
    }

    @Override
    public String toString() {
        return "com.autentic.persistence.entity.Ventafactura[ id=" + id + " ]";
    }
    
}
