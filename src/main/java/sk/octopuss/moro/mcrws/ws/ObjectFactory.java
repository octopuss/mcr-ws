//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.09.06 at 05:30:53 PM CEST 
//


package sk.octopuss.moro.mcrws.ws;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the sk.octopuss.moro.mcrws.ws package. 
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


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: sk.octopuss.moro.mcrws.ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetTransactionHistoryRequest }
     * 
     */
    public GetTransactionHistoryRequest createGetTransactionHistoryRequest() {
        return new GetTransactionHistoryRequest();
    }

    /**
     * Create an instance of {@link RedemptionResponse }
     * 
     */
    public RedemptionResponse createRedemptionResponse() {
        return new RedemptionResponse();
    }

    /**
     * Create an instance of {@link GetTransactionHistoryResponse }
     * 
     */
    public GetTransactionHistoryResponse createGetTransactionHistoryResponse() {
        return new GetTransactionHistoryResponse();
    }

    /**
     * Create an instance of {@link Transaction }
     * 
     */
    public Transaction createTransaction() {
        return new Transaction();
    }

    /**
     * Create an instance of {@link GetCardInfoResponse }
     * 
     */
    public GetCardInfoResponse createGetCardInfoResponse() {
        return new GetCardInfoResponse();
    }

    /**
     * Create an instance of {@link CardInfo }
     * 
     */
    public CardInfo createCardInfo() {
        return new CardInfo();
    }

    /**
     * Create an instance of {@link GetCardInfoRequest }
     * 
     */
    public GetCardInfoRequest createGetCardInfoRequest() {
        return new GetCardInfoRequest();
    }

    /**
     * Create an instance of {@link RedemptionRequest }
     * 
     */
    public RedemptionRequest createRedemptionRequest() {
        return new RedemptionRequest();
    }

    /**
     * Create an instance of {@link UserAccount }
     * 
     */
    public UserAccount createUserAccount() {
        return new UserAccount();
    }

}
