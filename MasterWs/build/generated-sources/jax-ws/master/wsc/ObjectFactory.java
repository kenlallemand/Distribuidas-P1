
package master.wsc;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the master.wsc package. 
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

    private final static QName _GetTamaño_QNAME = new QName("http://ws/", "GetTama\u00f1o");
    private final static QName _GetArch_QNAME = new QName("http://ws/", "GetArch");
    private final static QName _GetFileNameList_QNAME = new QName("http://ws/", "GetFileNameList");
    private final static QName _GetFileNameListResponse_QNAME = new QName("http://ws/", "GetFileNameListResponse");
    private final static QName _GetTamañoResponse_QNAME = new QName("http://ws/", "GetTama\u00f1oResponse");
    private final static QName _GetArchResponse_QNAME = new QName("http://ws/", "GetArchResponse");
    private final static QName _GetBytes_QNAME = new QName("http://ws/", "getBytes");
    private final static QName _GetBytesResponse_QNAME = new QName("http://ws/", "getBytesResponse");
    private final static QName _GetBytesResponseReturn_QNAME = new QName("", "return");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: master.wsc
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetTamaño }
     * 
     */
    public GetTamaño createGetTamaño() {
        return new GetTamaño();
    }

    /**
     * Create an instance of {@link GetArch }
     * 
     */
    public GetArch createGetArch() {
        return new GetArch();
    }

    /**
     * Create an instance of {@link GetFileNameList }
     * 
     */
    public GetFileNameList createGetFileNameList() {
        return new GetFileNameList();
    }

    /**
     * Create an instance of {@link GetFileNameListResponse }
     * 
     */
    public GetFileNameListResponse createGetFileNameListResponse() {
        return new GetFileNameListResponse();
    }

    /**
     * Create an instance of {@link GetTamañoResponse }
     * 
     */
    public GetTamañoResponse createGetTamañoResponse() {
        return new GetTamañoResponse();
    }

    /**
     * Create an instance of {@link GetArchResponse }
     * 
     */
    public GetArchResponse createGetArchResponse() {
        return new GetArchResponse();
    }

    /**
     * Create an instance of {@link GetBytes }
     * 
     */
    public GetBytes createGetBytes() {
        return new GetBytes();
    }

    /**
     * Create an instance of {@link GetBytesResponse }
     * 
     */
    public GetBytesResponse createGetBytesResponse() {
        return new GetBytesResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTamaño }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "GetTama\u00f1o")
    public JAXBElement<GetTamaño> createGetTamaño(GetTamaño value) {
        return new JAXBElement<GetTamaño>(_GetTamaño_QNAME, GetTamaño.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetArch }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "GetArch")
    public JAXBElement<GetArch> createGetArch(GetArch value) {
        return new JAXBElement<GetArch>(_GetArch_QNAME, GetArch.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFileNameList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "GetFileNameList")
    public JAXBElement<GetFileNameList> createGetFileNameList(GetFileNameList value) {
        return new JAXBElement<GetFileNameList>(_GetFileNameList_QNAME, GetFileNameList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFileNameListResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "GetFileNameListResponse")
    public JAXBElement<GetFileNameListResponse> createGetFileNameListResponse(GetFileNameListResponse value) {
        return new JAXBElement<GetFileNameListResponse>(_GetFileNameListResponse_QNAME, GetFileNameListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTamañoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "GetTama\u00f1oResponse")
    public JAXBElement<GetTamañoResponse> createGetTamañoResponse(GetTamañoResponse value) {
        return new JAXBElement<GetTamañoResponse>(_GetTamañoResponse_QNAME, GetTamañoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetArchResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "GetArchResponse")
    public JAXBElement<GetArchResponse> createGetArchResponse(GetArchResponse value) {
        return new JAXBElement<GetArchResponse>(_GetArchResponse_QNAME, GetArchResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBytes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "getBytes")
    public JAXBElement<GetBytes> createGetBytes(GetBytes value) {
        return new JAXBElement<GetBytes>(_GetBytes_QNAME, GetBytes.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBytesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "getBytesResponse")
    public JAXBElement<GetBytesResponse> createGetBytesResponse(GetBytesResponse value) {
        return new JAXBElement<GetBytesResponse>(_GetBytesResponse_QNAME, GetBytesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "return", scope = GetBytesResponse.class)
    public JAXBElement<byte[]> createGetBytesResponseReturn(byte[] value) {
        return new JAXBElement<byte[]>(_GetBytesResponseReturn_QNAME, byte[].class, GetBytesResponse.class, ((byte[]) value));
    }

}
