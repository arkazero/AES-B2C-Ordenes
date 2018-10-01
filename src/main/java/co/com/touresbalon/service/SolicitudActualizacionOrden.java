
package co.com.touresbalon.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para solicitudActualizacionOrden complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="solicitudActualizacionOrden"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="codigoReservaEspectaculo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codigoReservaHotel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codigoReservaTransporte" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="estadoOrden" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="idOrden" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "solicitudActualizacionOrden", propOrder = {
    "codigoReservaEspectaculo",
    "codigoReservaHotel",
    "codigoReservaTransporte",
    "estadoOrden",
    "idOrden"
})
public class SolicitudActualizacionOrden {

    protected String codigoReservaEspectaculo;
    protected String codigoReservaHotel;
    protected String codigoReservaTransporte;
    protected String estadoOrden;
    protected Long idOrden;

    /**
     * Obtiene el valor de la propiedad codigoReservaEspectaculo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoReservaEspectaculo() {
        return codigoReservaEspectaculo;
    }

    /**
     * Define el valor de la propiedad codigoReservaEspectaculo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoReservaEspectaculo(String value) {
        this.codigoReservaEspectaculo = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoReservaHotel.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoReservaHotel() {
        return codigoReservaHotel;
    }

    /**
     * Define el valor de la propiedad codigoReservaHotel.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoReservaHotel(String value) {
        this.codigoReservaHotel = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoReservaTransporte.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoReservaTransporte() {
        return codigoReservaTransporte;
    }

    /**
     * Define el valor de la propiedad codigoReservaTransporte.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoReservaTransporte(String value) {
        this.codigoReservaTransporte = value;
    }

    /**
     * Obtiene el valor de la propiedad estadoOrden.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstadoOrden() {
        return estadoOrden;
    }

    /**
     * Define el valor de la propiedad estadoOrden.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstadoOrden(String value) {
        this.estadoOrden = value;
    }

    /**
     * Obtiene el valor de la propiedad idOrden.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIdOrden() {
        return idOrden;
    }

    /**
     * Define el valor de la propiedad idOrden.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIdOrden(Long value) {
        this.idOrden = value;
    }

}
