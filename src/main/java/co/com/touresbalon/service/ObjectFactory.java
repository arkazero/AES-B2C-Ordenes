
package co.com.touresbalon.service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the co.com.touresbalon.service package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ActualizarOrden_QNAME = new QName("http://service.touresbalon.com.co/", "actualizarOrden");
    private final static QName _ActualizarOrdenResponse_QNAME = new QName("http://service.touresbalon.com.co/", "actualizarOrdenResponse");
    private final static QName _ActualizarStatusOrden_QNAME = new QName("http://service.touresbalon.com.co/", "actualizarStatusOrden");
    private final static QName _ActualizarStatusOrdenResponse_QNAME = new QName("http://service.touresbalon.com.co/", "actualizarStatusOrdenResponse");
    private final static QName _ConsultarNumeroOrdenesCerradas_QNAME = new QName("http://service.touresbalon.com.co/", "consultarNumeroOrdenesCerradas");
    private final static QName _ConsultarNumeroOrdenesCerradasResponse_QNAME = new QName("http://service.touresbalon.com.co/", "consultarNumeroOrdenesCerradasResponse");
    private final static QName _ConsultarOrdenPorNumero_QNAME = new QName("http://service.touresbalon.com.co/", "consultarOrdenPorNumero");
    private final static QName _ConsultarOrdenPorNumeroProducto_QNAME = new QName("http://service.touresbalon.com.co/", "consultarOrdenPorNumeroProducto");
    private final static QName _ConsultarOrdenPorNumeroProductoResponse_QNAME = new QName("http://service.touresbalon.com.co/", "consultarOrdenPorNumeroProductoResponse");
    private final static QName _ConsultarOrdenPorNumeroResponse_QNAME = new QName("http://service.touresbalon.com.co/", "consultarOrdenPorNumeroResponse");
    private final static QName _ConsultarOrdenesAbiertas_QNAME = new QName("http://service.touresbalon.com.co/", "consultarOrdenesAbiertas");
    private final static QName _ConsultarOrdenesAbiertasResponse_QNAME = new QName("http://service.touresbalon.com.co/", "consultarOrdenesAbiertasResponse");
    private final static QName _ConsultarOrdenesCerradas_QNAME = new QName("http://service.touresbalon.com.co/", "consultarOrdenesCerradas");
    private final static QName _ConsultarOrdenesCerradasResponse_QNAME = new QName("http://service.touresbalon.com.co/", "consultarOrdenesCerradasResponse");
    private final static QName _ConsultarOrdenesPorCliente_QNAME = new QName("http://service.touresbalon.com.co/", "consultarOrdenesPorCliente");
    private final static QName _ConsultarOrdenesPorClienteResponse_QNAME = new QName("http://service.touresbalon.com.co/", "consultarOrdenesPorClienteResponse");
    private final static QName _CrearOrden_QNAME = new QName("http://service.touresbalon.com.co/", "crearOrden");
    private final static QName _CrearOrdenResponse_QNAME = new QName("http://service.touresbalon.com.co/", "crearOrdenResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: co.com.touresbalon.service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ActualizarOrden }
     * 
     */
    public ActualizarOrden createActualizarOrden() {
        return new ActualizarOrden();
    }

    /**
     * Create an instance of {@link ActualizarOrdenResponse }
     * 
     */
    public ActualizarOrdenResponse createActualizarOrdenResponse() {
        return new ActualizarOrdenResponse();
    }

    /**
     * Create an instance of {@link ActualizarStatusOrden }
     * 
     */
    public ActualizarStatusOrden createActualizarStatusOrden() {
        return new ActualizarStatusOrden();
    }

    /**
     * Create an instance of {@link ActualizarStatusOrdenResponse }
     * 
     */
    public ActualizarStatusOrdenResponse createActualizarStatusOrdenResponse() {
        return new ActualizarStatusOrdenResponse();
    }

    /**
     * Create an instance of {@link ConsultarNumeroOrdenesCerradas }
     * 
     */
    public ConsultarNumeroOrdenesCerradas createConsultarNumeroOrdenesCerradas() {
        return new ConsultarNumeroOrdenesCerradas();
    }

    /**
     * Create an instance of {@link ConsultarNumeroOrdenesCerradasResponse }
     * 
     */
    public ConsultarNumeroOrdenesCerradasResponse createConsultarNumeroOrdenesCerradasResponse() {
        return new ConsultarNumeroOrdenesCerradasResponse();
    }

    /**
     * Create an instance of {@link ConsultarOrdenPorNumero }
     * 
     */
    public ConsultarOrdenPorNumero createConsultarOrdenPorNumero() {
        return new ConsultarOrdenPorNumero();
    }

    /**
     * Create an instance of {@link ConsultarOrdenPorNumeroProducto }
     * 
     */
    public ConsultarOrdenPorNumeroProducto createConsultarOrdenPorNumeroProducto() {
        return new ConsultarOrdenPorNumeroProducto();
    }

    /**
     * Create an instance of {@link ConsultarOrdenPorNumeroProductoResponse }
     * 
     */
    public ConsultarOrdenPorNumeroProductoResponse createConsultarOrdenPorNumeroProductoResponse() {
        return new ConsultarOrdenPorNumeroProductoResponse();
    }

    /**
     * Create an instance of {@link ConsultarOrdenPorNumeroResponse }
     * 
     */
    public ConsultarOrdenPorNumeroResponse createConsultarOrdenPorNumeroResponse() {
        return new ConsultarOrdenPorNumeroResponse();
    }

    /**
     * Create an instance of {@link ConsultarOrdenesAbiertas }
     * 
     */
    public ConsultarOrdenesAbiertas createConsultarOrdenesAbiertas() {
        return new ConsultarOrdenesAbiertas();
    }

    /**
     * Create an instance of {@link ConsultarOrdenesAbiertasResponse }
     * 
     */
    public ConsultarOrdenesAbiertasResponse createConsultarOrdenesAbiertasResponse() {
        return new ConsultarOrdenesAbiertasResponse();
    }

    /**
     * Create an instance of {@link ConsultarOrdenesCerradas }
     * 
     */
    public ConsultarOrdenesCerradas createConsultarOrdenesCerradas() {
        return new ConsultarOrdenesCerradas();
    }

    /**
     * Create an instance of {@link ConsultarOrdenesCerradasResponse }
     * 
     */
    public ConsultarOrdenesCerradasResponse createConsultarOrdenesCerradasResponse() {
        return new ConsultarOrdenesCerradasResponse();
    }

    /**
     * Create an instance of {@link ConsultarOrdenesPorCliente }
     * 
     */
    public ConsultarOrdenesPorCliente createConsultarOrdenesPorCliente() {
        return new ConsultarOrdenesPorCliente();
    }

    /**
     * Create an instance of {@link ConsultarOrdenesPorClienteResponse }
     * 
     */
    public ConsultarOrdenesPorClienteResponse createConsultarOrdenesPorClienteResponse() {
        return new ConsultarOrdenesPorClienteResponse();
    }

    /**
     * Create an instance of {@link CrearOrden }
     * 
     */
    public CrearOrden createCrearOrden() {
        return new CrearOrden();
    }

    /**
     * Create an instance of {@link CrearOrdenResponse }
     * 
     */
    public CrearOrdenResponse createCrearOrdenResponse() {
        return new CrearOrdenResponse();
    }

    /**
     * Create an instance of {@link FiltroConsultaOrden }
     * 
     */
    public FiltroConsultaOrden createFiltroConsultaOrden() {
        return new FiltroConsultaOrden();
    }

    /**
     * Create an instance of {@link ResultadoConsultaOrden }
     * 
     */
    public ResultadoConsultaOrden createResultadoConsultaOrden() {
        return new ResultadoConsultaOrden();
    }

    /**
     * Create an instance of {@link Consolidado }
     * 
     */
    public Consolidado createConsolidado() {
        return new Consolidado();
    }

    /**
     * Create an instance of {@link Error }
     * 
     */
    public Error createError() {
        return new Error();
    }

    /**
     * Create an instance of {@link OrdenBO }
     * 
     */
    public OrdenBO createOrdenBO() {
        return new OrdenBO();
    }

    /**
     * Create an instance of {@link ItemBO }
     * 
     */
    public ItemBO createItemBO() {
        return new ItemBO();
    }

    /**
     * Create an instance of {@link SolicitudActualizacionOrden }
     * 
     */
    public SolicitudActualizacionOrden createSolicitudActualizacionOrden() {
        return new SolicitudActualizacionOrden();
    }

    /**
     * Create an instance of {@link ResultadoOrden }
     * 
     */
    public ResultadoOrden createResultadoOrden() {
        return new ResultadoOrden();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActualizarOrden }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.touresbalon.com.co/", name = "actualizarOrden")
    public JAXBElement<ActualizarOrden> createActualizarOrden(ActualizarOrden value) {
        return new JAXBElement<ActualizarOrden>(_ActualizarOrden_QNAME, ActualizarOrden.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActualizarOrdenResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.touresbalon.com.co/", name = "actualizarOrdenResponse")
    public JAXBElement<ActualizarOrdenResponse> createActualizarOrdenResponse(ActualizarOrdenResponse value) {
        return new JAXBElement<ActualizarOrdenResponse>(_ActualizarOrdenResponse_QNAME, ActualizarOrdenResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActualizarStatusOrden }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.touresbalon.com.co/", name = "actualizarStatusOrden")
    public JAXBElement<ActualizarStatusOrden> createActualizarStatusOrden(ActualizarStatusOrden value) {
        return new JAXBElement<ActualizarStatusOrden>(_ActualizarStatusOrden_QNAME, ActualizarStatusOrden.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActualizarStatusOrdenResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.touresbalon.com.co/", name = "actualizarStatusOrdenResponse")
    public JAXBElement<ActualizarStatusOrdenResponse> createActualizarStatusOrdenResponse(ActualizarStatusOrdenResponse value) {
        return new JAXBElement<ActualizarStatusOrdenResponse>(_ActualizarStatusOrdenResponse_QNAME, ActualizarStatusOrdenResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultarNumeroOrdenesCerradas }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.touresbalon.com.co/", name = "consultarNumeroOrdenesCerradas")
    public JAXBElement<ConsultarNumeroOrdenesCerradas> createConsultarNumeroOrdenesCerradas(ConsultarNumeroOrdenesCerradas value) {
        return new JAXBElement<ConsultarNumeroOrdenesCerradas>(_ConsultarNumeroOrdenesCerradas_QNAME, ConsultarNumeroOrdenesCerradas.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultarNumeroOrdenesCerradasResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.touresbalon.com.co/", name = "consultarNumeroOrdenesCerradasResponse")
    public JAXBElement<ConsultarNumeroOrdenesCerradasResponse> createConsultarNumeroOrdenesCerradasResponse(ConsultarNumeroOrdenesCerradasResponse value) {
        return new JAXBElement<ConsultarNumeroOrdenesCerradasResponse>(_ConsultarNumeroOrdenesCerradasResponse_QNAME, ConsultarNumeroOrdenesCerradasResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultarOrdenPorNumero }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.touresbalon.com.co/", name = "consultarOrdenPorNumero")
    public JAXBElement<ConsultarOrdenPorNumero> createConsultarOrdenPorNumero(ConsultarOrdenPorNumero value) {
        return new JAXBElement<ConsultarOrdenPorNumero>(_ConsultarOrdenPorNumero_QNAME, ConsultarOrdenPorNumero.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultarOrdenPorNumeroProducto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.touresbalon.com.co/", name = "consultarOrdenPorNumeroProducto")
    public JAXBElement<ConsultarOrdenPorNumeroProducto> createConsultarOrdenPorNumeroProducto(ConsultarOrdenPorNumeroProducto value) {
        return new JAXBElement<ConsultarOrdenPorNumeroProducto>(_ConsultarOrdenPorNumeroProducto_QNAME, ConsultarOrdenPorNumeroProducto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultarOrdenPorNumeroProductoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.touresbalon.com.co/", name = "consultarOrdenPorNumeroProductoResponse")
    public JAXBElement<ConsultarOrdenPorNumeroProductoResponse> createConsultarOrdenPorNumeroProductoResponse(ConsultarOrdenPorNumeroProductoResponse value) {
        return new JAXBElement<ConsultarOrdenPorNumeroProductoResponse>(_ConsultarOrdenPorNumeroProductoResponse_QNAME, ConsultarOrdenPorNumeroProductoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultarOrdenPorNumeroResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.touresbalon.com.co/", name = "consultarOrdenPorNumeroResponse")
    public JAXBElement<ConsultarOrdenPorNumeroResponse> createConsultarOrdenPorNumeroResponse(ConsultarOrdenPorNumeroResponse value) {
        return new JAXBElement<ConsultarOrdenPorNumeroResponse>(_ConsultarOrdenPorNumeroResponse_QNAME, ConsultarOrdenPorNumeroResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultarOrdenesAbiertas }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.touresbalon.com.co/", name = "consultarOrdenesAbiertas")
    public JAXBElement<ConsultarOrdenesAbiertas> createConsultarOrdenesAbiertas(ConsultarOrdenesAbiertas value) {
        return new JAXBElement<ConsultarOrdenesAbiertas>(_ConsultarOrdenesAbiertas_QNAME, ConsultarOrdenesAbiertas.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultarOrdenesAbiertasResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.touresbalon.com.co/", name = "consultarOrdenesAbiertasResponse")
    public JAXBElement<ConsultarOrdenesAbiertasResponse> createConsultarOrdenesAbiertasResponse(ConsultarOrdenesAbiertasResponse value) {
        return new JAXBElement<ConsultarOrdenesAbiertasResponse>(_ConsultarOrdenesAbiertasResponse_QNAME, ConsultarOrdenesAbiertasResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultarOrdenesCerradas }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.touresbalon.com.co/", name = "consultarOrdenesCerradas")
    public JAXBElement<ConsultarOrdenesCerradas> createConsultarOrdenesCerradas(ConsultarOrdenesCerradas value) {
        return new JAXBElement<ConsultarOrdenesCerradas>(_ConsultarOrdenesCerradas_QNAME, ConsultarOrdenesCerradas.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultarOrdenesCerradasResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.touresbalon.com.co/", name = "consultarOrdenesCerradasResponse")
    public JAXBElement<ConsultarOrdenesCerradasResponse> createConsultarOrdenesCerradasResponse(ConsultarOrdenesCerradasResponse value) {
        return new JAXBElement<ConsultarOrdenesCerradasResponse>(_ConsultarOrdenesCerradasResponse_QNAME, ConsultarOrdenesCerradasResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultarOrdenesPorCliente }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.touresbalon.com.co/", name = "consultarOrdenesPorCliente")
    public JAXBElement<ConsultarOrdenesPorCliente> createConsultarOrdenesPorCliente(ConsultarOrdenesPorCliente value) {
        return new JAXBElement<ConsultarOrdenesPorCliente>(_ConsultarOrdenesPorCliente_QNAME, ConsultarOrdenesPorCliente.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultarOrdenesPorClienteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.touresbalon.com.co/", name = "consultarOrdenesPorClienteResponse")
    public JAXBElement<ConsultarOrdenesPorClienteResponse> createConsultarOrdenesPorClienteResponse(ConsultarOrdenesPorClienteResponse value) {
        return new JAXBElement<ConsultarOrdenesPorClienteResponse>(_ConsultarOrdenesPorClienteResponse_QNAME, ConsultarOrdenesPorClienteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CrearOrden }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.touresbalon.com.co/", name = "crearOrden")
    public JAXBElement<CrearOrden> createCrearOrden(CrearOrden value) {
        return new JAXBElement<CrearOrden>(_CrearOrden_QNAME, CrearOrden.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CrearOrdenResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.touresbalon.com.co/", name = "crearOrdenResponse")
    public JAXBElement<CrearOrdenResponse> createCrearOrdenResponse(CrearOrdenResponse value) {
        return new JAXBElement<CrearOrdenResponse>(_CrearOrdenResponse_QNAME, CrearOrdenResponse.class, null, value);
    }

}
