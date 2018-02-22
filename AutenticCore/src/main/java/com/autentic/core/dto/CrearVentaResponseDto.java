package com.autentic.core.dto;

public class CrearVentaResponseDto {

    protected ResultadoOperacionDto resultadoOperacion;
    protected ResultadoVentaDto resultadoVenta;

    /**
     * Obtiene el valor de la propiedad resultadoOperacion.
     * 
     * @return
     *     possible object is
     *     {@link ResultadoOperacionType }
     *     
     */
    public ResultadoOperacionDto getResultadoOperacion() {
        return resultadoOperacion;
    }

    /**
     * Define el valor de la propiedad resultadoOperacion.
     * 
     * @param value
     *     allowed object is
     *     {@link ResultadoOperacionType }
     *     
     */
    public void setResultadoOperacion(ResultadoOperacionDto value) {
        this.resultadoOperacion = value;
    }

    /**
     * Obtiene el valor de la propiedad resultadoVenta.
     * 
     * @return
     *     possible object is
     *     {@link ResultadoVentaType }
     *     
     */
    public ResultadoVentaDto getResultadoVenta() {
        return resultadoVenta;
    }

    /**
     * Define el valor de la propiedad resultadoVenta.
     * 
     * @param value
     *     allowed object is
     *     {@link ResultadoVentaType }
     *     
     */
    public void setResultadoVenta(ResultadoVentaDto value) {
        this.resultadoVenta = value;
    }

}
