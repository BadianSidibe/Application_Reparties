
package org.sid.ws;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "BanqueService", targetNamespace = "http://ws.sid.org/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface BanqueService {


    /**
     * 
     * @param montant
     * @return
     *     returns double
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "conversionEuroToCFA", targetNamespace = "http://ws.sid.org/", className = "org.sid.ws.ConversionEuroToCFA")
    @ResponseWrapper(localName = "conversionEuroToCFAResponse", targetNamespace = "http://ws.sid.org/", className = "org.sid.ws.ConversionEuroToCFAResponse")
    @Action(input = "http://ws.sid.org/BanqueService/conversionEuroToCFARequest", output = "http://ws.sid.org/BanqueService/conversionEuroToCFAResponse")
    public double conversionEuroToCFA(
        @WebParam(name = "montant", targetNamespace = "")
        double montant);

    /**
     * 
     * @return
     *     returns java.util.List<org.sid.ws.Compte>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "compteList", targetNamespace = "http://ws.sid.org/", className = "org.sid.ws.CompteList")
    @ResponseWrapper(localName = "compteListResponse", targetNamespace = "http://ws.sid.org/", className = "org.sid.ws.CompteListResponse")
    @Action(input = "http://ws.sid.org/BanqueService/compteListRequest", output = "http://ws.sid.org/BanqueService/compteListResponse")
    public List<Compte> compteList();

    /**
     * 
     * @param code
     * @return
     *     returns org.sid.ws.Compte
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getCompte", targetNamespace = "http://ws.sid.org/", className = "org.sid.ws.GetCompte")
    @ResponseWrapper(localName = "getCompteResponse", targetNamespace = "http://ws.sid.org/", className = "org.sid.ws.GetCompteResponse")
    @Action(input = "http://ws.sid.org/BanqueService/getCompteRequest", output = "http://ws.sid.org/BanqueService/getCompteResponse")
    public Compte getCompte(
        @WebParam(name = "code", targetNamespace = "")
        Long code);

}