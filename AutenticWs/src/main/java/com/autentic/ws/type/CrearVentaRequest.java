//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2018.02.21 a las 11:57:09 AM COT 
//


package com.autentic.ws.type;

import java.math.BigInteger;
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
 *         &lt;element name="idProducto" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="cantidadProducto" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="idPreventa" type="{http://www.w3.org/2001/XMLSchema}integer"/>
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
    "idProducto",
    "cantidadProducto",
    "idPreventa"
})
@XmlRootElement(name = "CrearVentaRequest")
public class CrearVentaRequest {

    @XmlElement(required = true)
    protected BigInteger idProducto;
    @XmlElement(required = true)
    protected BigInteger cantidadProducto;
    @XmlElement(required = true)
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
