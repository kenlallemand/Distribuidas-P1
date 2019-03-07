/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws;

import javax.jws.WebService;

/**
 *
 * @author andres
 */
@WebService(serviceName = "NewWebService", portName = "NewWebServicePort", endpointInterface = "ws.NewWebService", targetNamespace = "http://ws/", wsdlLocation = "WEB-INF/wsdl/NewWebServiceFromWSDL/localhost_8080/webService/NewWebService.wsdl")
public class NewWebServiceFromWSDL {

    public byte[] getBytes(java.lang.String narch, int buff, long fileP) {
        //TODO implement this method
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    public byte[] getArch(java.lang.String file) {
        //TODO implement this method
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    public java.util.List<java.lang.String> getFileNameList() {
        //TODO implement this method
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    public long getTamaño() {
        //TODO implement this method
        throw new UnsupportedOperationException("Not implemented yet.");
    }
    
}
