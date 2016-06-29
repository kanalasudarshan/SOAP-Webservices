package ksr.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.1.4
 * 2016-01-11T21:46:22.725+05:30
 * Generated source version: 3.1.4
 * 
 */
@WebService(targetNamespace = "http://service.ksr/", name = "KsrWebservice")
@XmlSeeAlso({ObjectFactory.class})
public interface KsrWebservice {

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "getUserDetails", targetNamespace = "http://service.ksr/", className = "ksr.service.GetUserDetails")
    @WebMethod
    @ResponseWrapper(localName = "getUserDetailsResponse", targetNamespace = "http://service.ksr/", className = "ksr.service.GetUserDetailsResponse")
    public ksr.service.KsrDomain getUserDetails(
        @WebParam(name = "name", targetNamespace = "")
        java.lang.String name
    );

    @RequestWrapper(localName = "addUser", targetNamespace = "http://service.ksr/", className = "ksr.service.AddUser")
    @WebMethod
    @ResponseWrapper(localName = "addUserResponse", targetNamespace = "http://service.ksr/", className = "ksr.service.AddUserResponse")
    public void addUser(
        @WebParam(name = "ksrDomain", targetNamespace = "")
        ksr.service.KsrDomain ksrDomain
    );
}
