package com.autentic.core.dto;

import java.math.BigInteger;

public class ResultadoVentaDto {

    protected BigInteger idFactura;
    protected double valor;
    protected String lugarDespacho;

    /**
     * Obtiene el valor de la propiedad idFactura.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getIdFactura() {
        return idFactura;
    }

    /**
     * Define el valor de la propiedad idFactura.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setIdFactura(BigInteger value) {
        this.idFactura = value;
    }

    /**
     * Obtiene el valor de la propiedad valor.
     * 
     */
    public double getValor() {
        return valor;
    }

    /**
     * Define el valor de la propiedad valor.
     * 
     */
    public void setValor(double value) {
        this.valor = value;
    }

    /**
     * Obtiene el valor de la propiedad lugarDespacho.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLugarDespacho() {
        return lugarDespacho;
    }

    /**
     * Define el valor de la propiedad lugarDespacho.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLugarDespacho(String value) {
        this.lugarDespacho = value;
    }

}
