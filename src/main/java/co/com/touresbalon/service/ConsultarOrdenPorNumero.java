
package co.com.touresbalon.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para consultarOrdenPorNumero complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="consultarOrdenPorNumero"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="filtro" type="{http://service.touresbalon.com.co/}filtroConsultaOrden" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "consultarOrdenPorNumero", propOrder = {
    "filtro"
})
public class ConsultarOrdenPorNumero {

    protected FiltroConsultaOrden filtro;

    /**
     * Obtiene el valor de la propiedad filtro.
     * 
     * @return
     *     possible object is
     *     {@link FiltroConsultaOrden }
     *     
     */
    public FiltroConsultaOrden getFiltro() {
        return filtro;
    }

    /**
     * Define el valor de la propiedad filtro.
     * 
     * @param value
     *     allowed object is
     *     {@link FiltroConsultaOrden }
     *     
     */
    public void setFiltro(FiltroConsultaOrden value) {
        this.filtro = value;
    }

}
