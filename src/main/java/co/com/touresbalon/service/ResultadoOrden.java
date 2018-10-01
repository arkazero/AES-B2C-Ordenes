
package co.com.touresbalon.service;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para resultadoOrden complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="resultadoOrden"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="errores" type="{http://service.touresbalon.com.co/}error" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ordenBO" type="{http://service.touresbalon.com.co/}ordenBO" minOccurs="0"/&gt;
 *         &lt;element name="resultado" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "resultadoOrden", propOrder = {
    "errores",
    "ordenBO",
    "resultado"
})
public class ResultadoOrden {

    @XmlElement(nillable = true)
    protected List<Error> errores;
    protected OrdenBO ordenBO;
    protected boolean resultado;

    /**
     * Gets the value of the errores property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the errores property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getErrores().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Error }
     * 
     * 
     */
    public List<Error> getErrores() {
        if (errores == null) {
            errores = new ArrayList<Error>();
        }
        return this.errores;
    }

    /**
     * Obtiene el valor de la propiedad ordenBO.
     * 
     * @return
     *     possible object is
     *     {@link OrdenBO }
     *     
     */
    public OrdenBO getOrdenBO() {
        return ordenBO;
    }

    /**
     * Define el valor de la propiedad ordenBO.
     * 
     * @param value
     *     allowed object is
     *     {@link OrdenBO }
     *     
     */
    public void setOrdenBO(OrdenBO value) {
        this.ordenBO = value;
    }

    /**
     * Obtiene el valor de la propiedad resultado.
     * 
     */
    public boolean isResultado() {
        return resultado;
    }

    /**
     * Define el valor de la propiedad resultado.
     * 
     */
    public void setResultado(boolean value) {
        this.resultado = value;
    }

}
