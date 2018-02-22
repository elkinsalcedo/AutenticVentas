/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.autentic.persistence.pojo;

import java.io.Serializable;
import java.util.List;

/**
 *
 * @author esalcedo
 */
public class ProductoPojo implements Serializable {
    private static final long serialVersionUID = 1L;
    private int id;
    private String nombre;
    private double valor;
    private int estado;
    private PreventaproductoPojo preventaproducto;

    public ProductoPojo() {
    }

    public ProductoPojo(int id) {
        this.id = id;
    }

    public ProductoPojo(int id, String nombre, double valor, int estado) {
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

    public PreventaproductoPojo getPreventaproducto() {
        return preventaproducto;
    }

    public void setPreventaproductoList(PreventaproductoPojo preventaproducto) {
        this.preventaproducto = preventaproducto;
    }
}
