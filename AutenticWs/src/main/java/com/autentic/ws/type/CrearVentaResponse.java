//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2018.02.21 a las 11:57:09 AM COT 
//


package com.autentic.ws.type;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="resultadoOperacion" type="{http://ws.autentic.com/Autentic/}ResultadoOperacionType"/>
 *         &lt;element name="resultadoVenta" type="{http://ws.autentic.com/Autentic/}ResultadoVentaType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "resultadoOperacion",
    "resultadoVenta"
})
@XmlRootElement(name = "CrearVentaResponse")
public class CrearVentaResponse {

    @XmlElement(required = true)
    protected ResultadoOperacionType resultadoOperacion;
    protected ResultadoVentaType resultadoVenta;

    /**
     * Obtiene el valor de la propiedad resultadoOperacion.
     * 
     * @return
     *     possible object is
     *     {@link ResultadoOperacionType }
     *     
     */
    public ResultadoOperacionType getResultadoOperacion() {
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
    public void setResultadoOperacion(ResultadoOperacionType value) {
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
    public ResultadoVentaType getResultadoVenta() {
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
    public void setResultadoVenta(ResultadoVentaType value) {
        this.resultadoVenta = value;
    }

}
