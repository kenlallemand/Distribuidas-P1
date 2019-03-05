
package ws;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;


@WebService(serviceName = "NewWebService")
public class NewWebService {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "GetFileName")
    public String GetFileName(@WebParam(name = "FileName") String FileName) {
        //TODO write your implementation code here:
        return "nombre del archivo"+FileName;
    }

    /**
     * Web service operation
     * @param FileName
     */
    @WebMethod(operationName = "GetBytes")
    public byte[] GetBytes(@WebParam(name = "FileName") String FileName) {
        //TODO write your implementation code here:
        return FileName.getBytes();
    }
}
