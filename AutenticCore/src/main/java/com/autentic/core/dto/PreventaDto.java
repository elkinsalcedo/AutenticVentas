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
public class PreventaDto implements Serializable {
    private static final long serialVersionUID = 1L;
    private int id;    
    private String comercial;
    private String lugardespacho;
    private int estado;
    private VentafacturaDto ventafactura;
    private List<PreventaproductoDto> preventaproducto;

    public PreventaDto() {
    }

    public PreventaDto(int id) {
        this.id = id;
    }

    public PreventaDto(int id, String comercial, String lugardespacho, int estado) {
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
    
    public VentafacturaDto getVentafactura() {
		return ventafactura;
	}

	public void setVentafactura(VentafacturaDto ventafactura) {
		this.ventafactura = ventafactura;
	}

	public List<PreventaproductoDto> getPreventaproducto() {
		return preventaproducto;
	}

	public void setPreventaproducto(List<PreventaproductoDto> preventaproducto) {
		this.preventaproducto = preventaproducto;
	}

    @Override
    public String toString() {
        return "com.autentic.persistence.entity.Preventa[ id=" + id + " ]";
    }
    
}
