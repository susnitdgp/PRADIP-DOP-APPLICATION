//
// Generated By:JAX-WS RI IBM 2.2.1-11/28/2011 08:28 AM(foreman)- (JAXB RI IBM 2.2.3-11/28/2011 06:21 AM(foreman)-)
//


package in.co.ntpc.pradip.dop.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dopSchema complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dopSchema">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="page_content" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="page_image" type="{http://dop.pradip.ntpc.co.in/}byteBuffer" minOccurs="0"/>
 *         &lt;element name="page_no" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dopSchema", propOrder = {
    "id",
    "pageContent",
    "pageImage",
    "pageNo"
})
public class DopSchema {

    protected String id;
    @XmlElement(name = "page_content")
    protected String pageContent;
    @XmlElement(name = "page_image")
    protected ByteBuffer pageImage;
    @XmlElement(name = "page_no")
    protected String pageNo;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the pageContent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPageContent() {
        return pageContent;
    }

    /**
     * Sets the value of the pageContent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPageContent(String value) {
        this.pageContent = value;
    }

    /**
     * Gets the value of the pageImage property.
     * 
     * @return
     *     possible object is
     *     {@link ByteBuffer }
     *     
     */
    public ByteBuffer getPageImage() {
        return pageImage;
    }

    /**
     * Sets the value of the pageImage property.
     * 
     * @param value
     *     allowed object is
     *     {@link ByteBuffer }
     *     
     */
    public void setPageImage(ByteBuffer value) {
        this.pageImage = value;
    }

    /**
     * Gets the value of the pageNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPageNo() {
        return pageNo;
    }

    /**
     * Sets the value of the pageNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPageNo(String value) {
        this.pageNo = value;
    }

}
