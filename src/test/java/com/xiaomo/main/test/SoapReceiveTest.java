package com.xiaomo.main.test;

import java.net.MalformedURLException;
import java.net.URL;

import javax.print.attribute.standard.Severity;
import javax.xml.namespace.QName;  
import javax.xml.soap.MessageFactory;  
import javax.xml.soap.SOAPBody;  
import javax.xml.soap.SOAPBodyElement;  
import javax.xml.soap.SOAPConstants;  
import javax.xml.soap.SOAPEnvelope;  
import javax.xml.soap.SOAPMessage;  
import javax.xml.ws.Dispatch;  
import javax.xml.ws.Service;  
  
import org.w3c.dom.Document;  

public class SoapReceiveTest {
	
	public static void main(String[] args) {
		String ns = "http://axisversion.sample";
		String wsdlUrl = "http://127.0.0.1:8080/sxis2/services/Version?wsdl";
		
		//1、创建服务Service
		URL url =  null;
		try {
			url = new URL(wsdlUrl);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		QName sname = new QName(ns,"Version");
		Service service = Service.create(url, sname);
		
		//2、创建Dispatch
		Dispatch<SOAPMessage> dispatch = service.createDispatch(new QName(ns, "VersionHttpSoap11Endpoint"), SOAPMessage.class, Service.Mode.MESSAGE);
		
	}

}
