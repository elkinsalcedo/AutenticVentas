/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.autentic.core.dto;

import java.io.Serializable;
import java.util.List;

/**
 *
 * @author esalcedo
 */
public class ProductoDto implements Serializable {
    private static final long serialVersionUID = 1L;
    private int id;
    private String nombre;
    private double valor;
    private int estado;
    private PreventaproductoDto preventaproducto;

    public ProductoDto() {
    }

    public ProductoDto(int id) {
        this.id = id;
    }

    public ProductoDto(int id, String nombre, double valor, int estado) {
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

    public PreventaproductoDto getPreventaproducto() {
        return preventaproducto;
    }

    public void setPreventaproductoList(PreventaproductoDto preventaproducto) {
        this.preventaproducto = preventaproducto;
    }
}
