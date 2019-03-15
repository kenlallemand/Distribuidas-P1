
package master.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para GetByte complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="GetByte">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="narch" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="buff" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="FileP" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetByte", propOrder = {
    "id",
    "narch",
    "buff",
    "fileP"
})
public class GetByte {

    @XmlElement(name = "ID")
    protected String id;
    protected String narch;
    protected int buff;
    @XmlElement(name = "FileP")
    protected long fileP;

    /**
     * Obtiene el valor de la propiedad id.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getID() {
        return id;
    }

    /**
     * Define el valor de la propiedad id.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setID(String value) {
        this.id = value;
    }

    /**
     * Obtiene el valor de la propiedad narch.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNarch() {
        return narch;
    }

    /**
     * Define el valor de la propiedad narch.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNarch(String value) {
        this.narch = value;
    }

    /**
     * Obtiene el valor de la propiedad buff.
     * 
     */
    public int getBuff() {
        return buff;
    }

    /**
     * Define el valor de la propiedad buff.
     * 
     */
    public void setBuff(int value) {
        this.buff = value;
    }

    /**
     * Obtiene el valor de la propiedad fileP.
     * 
     */
    public long getFileP() {
        return fileP;
    }

    /**
     * Define el valor de la propiedad fileP.
     * 
     */
    public void setFileP(long value) {
        this.fileP = value;
    }

}
