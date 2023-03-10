//
// Generated By:JAX-WS RI IBM 2.2.1-11/28/2011 08:28 AM(foreman)- (JAXB RI IBM 2.2.3-11/28/2011 06:21 AM(foreman)-)
//


package in.co.ntpc.pradip.dop.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for customSearchResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="customSearchResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dop_clause" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dop_romansubclause" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dop_section" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dop_subclause" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="page_content" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="page_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "customSearchResult", propOrder = {
    "dopClause",
    "dopRomansubclause",
    "dopSection",
    "dopSubclause",
    "pageContent",
    "pageId",
    "pageNo"
})
public class CustomSearchResult {

    @XmlElement(name = "dop_clause")
    protected String dopClause;
    @XmlElement(name = "dop_romansubclause")
    protected String dopRomansubclause;
    @XmlElement(name = "dop_section")
    protected String dopSection;
    @XmlElement(name = "dop_subclause")
    protected String dopSubclause;
    @XmlElement(name = "page_content")
    protected String pageContent;
    @XmlElement(name = "page_id")
    protected String pageId;
    @XmlElement(name = "page_no")
    protected String pageNo;

    /**
     * Gets the value of the dopClause property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDopClause() {
        return dopClause;
    }

    /**
     * Sets the value of the dopClause property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDopClause(String value) {
        this.dopClause = value;
    }

    /**
     * Gets the value of the dopRomansubclause property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDopRomansubclause() {
        return dopRomansubclause;
    }

    /**
     * Sets the value of the dopRomansubclause property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDopRomansubclause(String value) {
        this.dopRomansubclause = value;
    }

    /**
     * Gets the value of the dopSection property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDopSection() {
        return dopSection;
    }

    /**
     * Sets the value of the dopSection property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDopSection(String value) {
        this.dopSection = value;
    }

    /**
     * Gets the value of the dopSubclause property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDopSubclause() {
        return dopSubclause;
    }

    /**
     * Sets the value of the dopSubclause property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDopSubclause(String value) {
        this.dopSubclause = value;
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
     * Gets the value of the pageId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPageId() {
        return pageId;
    }

    /**
     * Sets the value of the pageId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPageId(String value) {
        this.pageId = value;
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
