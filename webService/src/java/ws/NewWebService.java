
package ws;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
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
     * @return 
     */
    @WebMethod(operationName = "getBytes")
    public byte[] getBytes(@WebParam(name= "narch") String narch ) {
        
             String ruta = "/"+narch;
            File archivo= new File(ruta);
        try {
            FileInputStream fis = new FileInputStream(archivo);
            BufferedInputStream input = new BufferedInputStream(fis);
            byte[] salida= new byte[(int) archivo.length()];
            input.read(salida);
            input.close();
            return salida;
        } catch (IOException ex) {
            return null;
        }
    }


}
