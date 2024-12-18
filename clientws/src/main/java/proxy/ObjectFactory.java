
package proxy;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the proxy package. 
 * <p>An ObjectFactory allows you to programmatically 
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

    private static final QName _ConvertDHtoEURO_QNAME = new QName("http://ws.java.main.src/", "convertDHtoEURO");
    private static final QName _ConvertDHtoEUROResponse_QNAME = new QName("http://ws.java.main.src/", "convertDHtoEUROResponse");
    private static final QName _GetComte_QNAME = new QName("http://ws.java.main.src/", "getComte");
    private static final QName _GetComteResponse_QNAME = new QName("http://ws.java.main.src/", "getComteResponse");
    private static final QName _ListCompte_QNAME = new QName("http://ws.java.main.src/", "listCompte");
    private static final QName _ListCompteResponse_QNAME = new QName("http://ws.java.main.src/", "listCompteResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: proxy
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ConvertDHtoEURO }
     * 
     * @return
     *     the new instance of {@link ConvertDHtoEURO }
     */
    public ConvertDHtoEURO createConvertDHtoEURO() {
        return new ConvertDHtoEURO();
    }

    /**
     * Create an instance of {@link ConvertDHtoEUROResponse }
     * 
     * @return
     *     the new instance of {@link ConvertDHtoEUROResponse }
     */
    public ConvertDHtoEUROResponse createConvertDHtoEUROResponse() {
        return new ConvertDHtoEUROResponse();
    }

    /**
     * Create an instance of {@link GetComte }
     * 
     * @return
     *     the new instance of {@link GetComte }
     */
    public GetComte createGetComte() {
        return new GetComte();
    }

    /**
     * Create an instance of {@link GetComteResponse }
     * 
     * @return
     *     the new instance of {@link GetComteResponse }
     */
    public GetComteResponse createGetComteResponse() {
        return new GetComteResponse();
    }

    /**
     * Create an instance of {@link ListCompte }
     * 
     * @return
     *     the new instance of {@link ListCompte }
     */
    public ListCompte createListCompte() {
        return new ListCompte();
    }

    /**
     * Create an instance of {@link ListCompteResponse }
     * 
     * @return
     *     the new instance of {@link ListCompteResponse }
     */
    public ListCompteResponse createListCompteResponse() {
        return new ListCompteResponse();
    }

    /**
     * Create an instance of {@link Compte }
     * 
     * @return
     *     the new instance of {@link Compte }
     */
    public Compte createCompte() {
        return new Compte();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConvertDHtoEURO }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ConvertDHtoEURO }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.java.main.src/", name = "convertDHtoEURO")
    public JAXBElement<ConvertDHtoEURO> createConvertDHtoEURO(ConvertDHtoEURO value) {
        return new JAXBElement<>(_ConvertDHtoEURO_QNAME, ConvertDHtoEURO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConvertDHtoEUROResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ConvertDHtoEUROResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.java.main.src/", name = "convertDHtoEUROResponse")
    public JAXBElement<ConvertDHtoEUROResponse> createConvertDHtoEUROResponse(ConvertDHtoEUROResponse value) {
        return new JAXBElement<>(_ConvertDHtoEUROResponse_QNAME, ConvertDHtoEUROResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetComte }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetComte }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.java.main.src/", name = "getComte")
    public JAXBElement<GetComte> createGetComte(GetComte value) {
        return new JAXBElement<>(_GetComte_QNAME, GetComte.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetComteResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetComteResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.java.main.src/", name = "getComteResponse")
    public JAXBElement<GetComteResponse> createGetComteResponse(GetComteResponse value) {
        return new JAXBElement<>(_GetComteResponse_QNAME, GetComteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListCompte }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ListCompte }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.java.main.src/", name = "listCompte")
    public JAXBElement<ListCompte> createListCompte(ListCompte value) {
        return new JAXBElement<>(_ListCompte_QNAME, ListCompte.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListCompteResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ListCompteResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.java.main.src/", name = "listCompteResponse")
    public JAXBElement<ListCompteResponse> createListCompteResponse(ListCompteResponse value) {
        return new JAXBElement<>(_ListCompteResponse_QNAME, ListCompteResponse.class, null, value);
    }

}
