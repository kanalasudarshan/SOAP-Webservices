
package ksr.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for addUser complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="addUser"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ksrDomain" type="{http://service.ksr/}ksrDomain" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "addUser", propOrder = {
    "ksrDomain"
})
public class AddUser {

    protected KsrDomain ksrDomain;

    /**
     * Gets the value of the ksrDomain property.
     * 
     * @return
     *     possible object is
     *     {@link KsrDomain }
     *     
     */
    public KsrDomain getKsrDomain() {
        return ksrDomain;
    }

    /**
     * Sets the value of the ksrDomain property.
     * 
     * @param value
     *     allowed object is
     *     {@link KsrDomain }
     *     
     */
    public void setKsrDomain(KsrDomain value) {
        this.ksrDomain = value;
    }

}
