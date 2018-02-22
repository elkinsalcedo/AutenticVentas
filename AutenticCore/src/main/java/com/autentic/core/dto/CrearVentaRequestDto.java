package com.autentic.core.dto;

import java.math.BigInteger;

import javax.validation.constraints.NotNull;

public class CrearVentaRequestDto {
	
	protected BigInteger idProducto;
    protected BigInteger cantidadProducto;
    protected BigInteger idPreventa;

    /**
     * Obtiene el valor de la propiedad idProducto.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getIdProducto() {
        return idProducto;
    }

    /**
     * Define el valor de la propiedad idProducto.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setIdProducto(BigInteger value) {
        this.idProducto = value;
    }

    /**
     * Obtiene el valor de la propiedad cantidadProducto.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCantidadProducto() {
        return cantidadProducto;
    }

    /**
     * Define el valor de la propiedad cantidadProducto.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCantidadProducto(BigInteger value) {
        this.cantidadProducto = value;
    }

    /**
     * Obtiene el valor de la propiedad idPreventa.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getIdPreventa() {
        return idPreventa;
    }

    /**
     * Define el valor de la propiedad idPreventa.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setIdPreventa(BigInteger value) {
        this.idPreventa = value;
    }

}
