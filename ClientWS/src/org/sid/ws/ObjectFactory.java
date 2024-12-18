
package org.sid.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.sid.ws package. 
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

    private final static QName _CompteListResponse_QNAME = new QName("http://ws.sid.org/", "compteListResponse");
    private final static QName _GetCompteResponse_QNAME = new QName("http://ws.sid.org/", "getCompteResponse");
    private final static QName _GetCompte_QNAME = new QName("http://ws.sid.org/", "getCompte");
    private final static QName _ConversionEuroToCFA_QNAME = new QName("http://ws.sid.org/", "conversionEuroToCFA");
    private final static QName _CompteList_QNAME = new QName("http://ws.sid.org/", "compteList");
    private final static QName _Compte_QNAME = new QName("http://ws.sid.org/", "compte");
    private final static QName _ConversionEuroToCFAResponse_QNAME = new QName("http://ws.sid.org/", "conversionEuroToCFAResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.sid.ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetCompte }
     * 
     */
    public GetCompte createGetCompte() {
        return new GetCompte();
    }

    /**
     * Create an instance of {@link GetCompteResponse }
     * 
     */
    public GetCompteResponse createGetCompteResponse() {
        return new GetCompteResponse();
    }

    /**
     * Create an instance of {@link ConversionEuroToCFA }
     * 
     */
    public ConversionEuroToCFA createConversionEuroToCFA() {
        return new ConversionEuroToCFA();
    }

    /**
     * Create an instance of {@link CompteListResponse }
     * 
     */
    public CompteListResponse createCompteListResponse() {
        return new CompteListResponse();
    }

    /**
     * Create an instance of {@link ConversionEuroToCFAResponse }
     * 
     */
    public ConversionEuroToCFAResponse createConversionEuroToCFAResponse() {
        return new ConversionEuroToCFAResponse();
    }

    /**
     * Create an instance of {@link CompteList }
     * 
     */
    public CompteList createCompteList() {
        return new CompteList();
    }

    /**
     * Create an instance of {@link Compte }
     * 
     */
    public Compte createCompte() {
        return new Compte();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CompteListResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.sid.org/", name = "compteListResponse")
    public JAXBElement<CompteListResponse> createCompteListResponse(CompteListResponse value) {
        return new JAXBElement<CompteListResponse>(_CompteListResponse_QNAME, CompteListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCompteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.sid.org/", name = "getCompteResponse")
    public JAXBElement<GetCompteResponse> createGetCompteResponse(GetCompteResponse value) {
        return new JAXBElement<GetCompteResponse>(_GetCompteResponse_QNAME, GetCompteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCompte }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.sid.org/", name = "getCompte")
    public JAXBElement<GetCompte> createGetCompte(GetCompte value) {
        return new JAXBElement<GetCompte>(_GetCompte_QNAME, GetCompte.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConversionEuroToCFA }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.sid.org/", name = "conversionEuroToCFA")
    public JAXBElement<ConversionEuroToCFA> createConversionEuroToCFA(ConversionEuroToCFA value) {
        return new JAXBElement<ConversionEuroToCFA>(_ConversionEuroToCFA_QNAME, ConversionEuroToCFA.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CompteList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.sid.org/", name = "compteList")
    public JAXBElement<CompteList> createCompteList(CompteList value) {
        return new JAXBElement<CompteList>(_CompteList_QNAME, CompteList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Compte }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.sid.org/", name = "compte")
    public JAXBElement<Compte> createCompte(Compte value) {
        return new JAXBElement<Compte>(_Compte_QNAME, Compte.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConversionEuroToCFAResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.sid.org/", name = "conversionEuroToCFAResponse")
    public JAXBElement<ConversionEuroToCFAResponse> createConversionEuroToCFAResponse(ConversionEuroToCFAResponse value) {
        return new JAXBElement<ConversionEuroToCFAResponse>(_ConversionEuroToCFAResponse_QNAME, ConversionEuroToCFAResponse.class, null, value);
    }

}
