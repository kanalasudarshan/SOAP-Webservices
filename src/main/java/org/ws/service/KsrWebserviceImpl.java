package org.ws.service;

import javax.jws.WebService;

import ksr.service.KsrDomain;
import ksr.service.KsrWebservice;



@WebService(endpointInterface="ksr.service.KsrWebservice")
public class KsrWebserviceImpl implements KsrWebservice {

	public KsrDomain getUserDetails(String name) {
		KsrDomain ksr=new KsrDomain();
		
		ksr.setId(22);
		ksr.setName(name);
		return ksr;
	}

	public void addUser(KsrDomain ksrDomain) {
		System.out.println("User added");		
	}

}
