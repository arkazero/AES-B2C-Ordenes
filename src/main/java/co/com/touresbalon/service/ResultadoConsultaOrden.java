
package co.com.touresbalon.service;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para resultadoConsultaOrden complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="resultadoConsultaOrden"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="consolidado" type="{http://service.touresbalon.com.co/}consolidado" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="errores" type="{http://service.touresbalon.com.co/}error" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ordenesBO" type="{http://service.touresbalon.com.co/}ordenBO" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "resultadoConsultaOrden", propOrder = {
    "consolidado",
    "errores",
    "ordenesBO",
    "resultado"
})
public class ResultadoConsultaOrden {

    @XmlElement(nillable = true)
    protected List<Consolidado> consolidado;
    @XmlElement(nillable = true)
    protected List<Error> errores;
    @XmlElement(nillable = true)
    protected List<OrdenBO> ordenesBO;
    protected boolean resultado;

    /**
     * Gets the value of the consolidado property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the consolidado property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConsolidado().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Consolidado }
     * 
     * 
     */
    public List<Consolidado> getConsolidado() {
        if (consolidado == null) {
            consolidado = new ArrayList<Consolidado>();
        }
        return this.consolidado;
    }

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
     * Gets the value of the ordenesBO property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ordenesBO property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrdenesBO().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OrdenBO }
     * 
     * 
     */
    public List<OrdenBO> getOrdenesBO() {
        if (ordenesBO == null) {
            ordenesBO = new ArrayList<OrdenBO>();
        }
        return this.ordenesBO;
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
