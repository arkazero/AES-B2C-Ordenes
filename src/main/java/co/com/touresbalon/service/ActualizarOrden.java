
package co.com.touresbalon.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para actualizarOrden complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="actualizarOrden"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="solicitudActualizacion" type="{http://service.touresbalon.com.co/}solicitudActualizacionOrden" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "actualizarOrden", propOrder = {
    "solicitudActualizacion"
})
public class ActualizarOrden {

    protected SolicitudActualizacionOrden solicitudActualizacion;

    /**
     * Obtiene el valor de la propiedad solicitudActualizacion.
     * 
     * @return
     *     possible object is
     *     {@link SolicitudActualizacionOrden }
     *     
     */
    public SolicitudActualizacionOrden getSolicitudActualizacion() {
        return solicitudActualizacion;
    }

    /**
     * Define el valor de la propiedad solicitudActualizacion.
     * 
     * @param value
     *     allowed object is
     *     {@link SolicitudActualizacionOrden }
     *     
     */
    public void setSolicitudActualizacion(SolicitudActualizacionOrden value) {
        this.solicitudActualizacion = value;
    }

}
