
package master.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the master.ws package. 
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

    private final static QName _GetTam_QNAME = new QName("http://ws.master/", "GetTam");
    private final static QName _GetArchivo_QNAME = new QName("http://ws.master/", "GetArchivo");
    private final static QName _GetInfoResponse_QNAME = new QName("http://ws.master/", "GetInfoResponse");
    private final static QName _GetInfo_QNAME = new QName("http://ws.master/", "GetInfo");
    private final static QName _GetTamResponse_QNAME = new QName("http://ws.master/", "GetTamResponse");
    private final static QName _Getfilelist_QNAME = new QName("http://ws.master/", "Getfilelist");
    private final static QName _GetArchivoResponse_QNAME = new QName("http://ws.master/", "GetArchivoResponse");
    private final static QName _GetfilelistResponse_QNAME = new QName("http://ws.master/", "GetfilelistResponse");
    private final static QName _GetByte_QNAME = new QName("http://ws.master/", "GetByte");
    private final static QName _GetByteResponse_QNAME = new QName("http://ws.master/", "GetByteResponse");
    private final static QName _GetByteResponseReturn_QNAME = new QName("", "return");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: master.ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetArchivo }
     * 
     */
    public GetArchivo createGetArchivo() {
        return new GetArchivo();
    }

    /**
     * Create an instance of {@link GetInfoResponse }
     * 
     */
    public GetInfoResponse createGetInfoResponse() {
        return new GetInfoResponse();
    }

    /**
     * Create an instance of {@link GetTam }
     * 
     */
    public GetTam createGetTam() {
        return new GetTam();
    }

    /**
     * Create an instance of {@link GetByte }
     * 
     */
    public GetByte createGetByte() {
        return new GetByte();
    }

    /**
     * Create an instance of {@link GetByteResponse }
     * 
     */
    public GetByteResponse createGetByteResponse() {
        return new GetByteResponse();
    }

    /**
     * Create an instance of {@link GetfilelistResponse }
     * 
     */
    public GetfilelistResponse createGetfilelistResponse() {
        return new GetfilelistResponse();
    }

    /**
     * Create an instance of {@link GetInfo }
     * 
     */
    public GetInfo createGetInfo() {
        return new GetInfo();
    }

    /**
     * Create an instance of {@link GetTamResponse }
     * 
     */
    public GetTamResponse createGetTamResponse() {
        return new GetTamResponse();
    }

    /**
     * Create an instance of {@link Getfilelist }
     * 
     */
    public Getfilelist createGetfilelist() {
        return new Getfilelist();
    }

    /**
     * Create an instance of {@link GetArchivoResponse }
     * 
     */
    public GetArchivoResponse createGetArchivoResponse() {
        return new GetArchivoResponse();
    }

    /**
     * Create an instance of {@link Serverinfo }
     * 
     */
    public Serverinfo createServerinfo() {
        return new Serverinfo();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTam }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.master/", name = "GetTam")
    public JAXBElement<GetTam> createGetTam(GetTam value) {
        return new JAXBElement<GetTam>(_GetTam_QNAME, GetTam.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetArchivo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.master/", name = "GetArchivo")
    public JAXBElement<GetArchivo> createGetArchivo(GetArchivo value) {
        return new JAXBElement<GetArchivo>(_GetArchivo_QNAME, GetArchivo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetInfoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.master/", name = "GetInfoResponse")
    public JAXBElement<GetInfoResponse> createGetInfoResponse(GetInfoResponse value) {
        return new JAXBElement<GetInfoResponse>(_GetInfoResponse_QNAME, GetInfoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.master/", name = "GetInfo")
    public JAXBElement<GetInfo> createGetInfo(GetInfo value) {
        return new JAXBElement<GetInfo>(_GetInfo_QNAME, GetInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTamResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.master/", name = "GetTamResponse")
    public JAXBElement<GetTamResponse> createGetTamResponse(GetTamResponse value) {
        return new JAXBElement<GetTamResponse>(_GetTamResponse_QNAME, GetTamResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Getfilelist }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.master/", name = "Getfilelist")
    public JAXBElement<Getfilelist> createGetfilelist(Getfilelist value) {
        return new JAXBElement<Getfilelist>(_Getfilelist_QNAME, Getfilelist.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetArchivoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.master/", name = "GetArchivoResponse")
    public JAXBElement<GetArchivoResponse> createGetArchivoResponse(GetArchivoResponse value) {
        return new JAXBElement<GetArchivoResponse>(_GetArchivoResponse_QNAME, GetArchivoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetfilelistResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.master/", name = "GetfilelistResponse")
    public JAXBElement<GetfilelistResponse> createGetfilelistResponse(GetfilelistResponse value) {
        return new JAXBElement<GetfilelistResponse>(_GetfilelistResponse_QNAME, GetfilelistResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetByte }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.master/", name = "GetByte")
    public JAXBElement<GetByte> createGetByte(GetByte value) {
        return new JAXBElement<GetByte>(_GetByte_QNAME, GetByte.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetByteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.master/", name = "GetByteResponse")
    public JAXBElement<GetByteResponse> createGetByteResponse(GetByteResponse value) {
        return new JAXBElement<GetByteResponse>(_GetByteResponse_QNAME, GetByteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "return", scope = GetByteResponse.class)
    public JAXBElement<byte[]> createGetByteResponseReturn(byte[] value) {
        return new JAXBElement<byte[]>(_GetByteResponseReturn_QNAME, byte[].class, GetByteResponse.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "return", scope = GetArchivoResponse.class)
    public JAXBElement<byte[]> createGetArchivoResponseReturn(byte[] value) {
        return new JAXBElement<byte[]>(_GetByteResponseReturn_QNAME, byte[].class, GetArchivoResponse.class, ((byte[]) value));
    }

}
