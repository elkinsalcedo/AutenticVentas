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
public class PreventaproductoDto implements Serializable {
    private static final long serialVersionUID = 1L;
    private int id;
    private int cantidad;
    private double valor;
    private ProductoDto idproducto;
    private PreventaDto idpreventa;

    public PreventaproductoDto() {
    }

    public PreventaproductoDto(int id) {
        this.id = id;
    }

    public PreventaproductoDto(int id, int cantidad, double valor) {
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

    public ProductoDto getIdproducto() {
        return idproducto;
    }

    public void setIdproducto(ProductoDto idproducto) {
        this.idproducto = idproducto;
    }

    public PreventaDto getIdpreventa() {
        return idpreventa;
    }

    public void setIdpreventa(PreventaDto idpreventa) {
        this.idpreventa = idpreventa;
    }
    
    @Override
    public String toString() {
        return "com.autentic.persistence.entity.Preventaproducto[ id=" + id + " ]";
    }
    
}
