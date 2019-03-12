/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package master.ws;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author andres
 */
@WebService(serviceName = "MasterWs")
public class MasterWs {
    private final String ruta="C:\\Users\\andres\\Documents\\Distribuidas-P1\\webService\\"; 
    private final String listaarc="listarchivos.txt";
    /**
     * Web service operation
     */
    @WebMethod(operationName = "GetInfo")
    public List<String> GetInfo() {
       BufferedReader br = null;
	FileReader fr = null;
        List<String> listnames=null;
	try{
            fr = new FileReader(ruta+listaarc);
            br = new BufferedReader(fr);
            String cl;
            listnames=new ArrayList<>();
            while ((cl = br.readLine()) != null){
                String[] serverinfo = cl.split(",");
                listnames.add(cl);
            }
	} catch (IOException e) {
            e.printStackTrace();
	} finally {
            try {
                if (br != null)
                    br.close();
                if (fr != null)
                    fr.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
	}
        return listnames;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "Getfilelist")
    public List Getfile(@WebParam(name = "ID") String ID) {
        try {
            URL location = new URL(ID);
            master.wsc.NewWebService_Service Service = new master.wsc.NewWebService_Service(location);
            return Service.getNewWebServicePort().getFileNameList();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "GetArchivo")
    public byte[] GetArchivo(@WebParam(name = "ID") String ID,@WebParam(name = "narch") String narch ) {
      try {
            URL location = new URL(ID);
           master.wsc.NewWebService_Service Service = new master.wsc.NewWebService_Service(location);
           return Service.getNewWebServicePort().getArch(narch);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "GetTam")
    public long GetTam(@WebParam(name = "ID") String ID, @WebParam(name = "narch") String narch) {
        try {
            URL location = new URL(ID);
            master.wsc.NewWebService_Service  service = new master.wsc.NewWebService_Service(location);
            return service.getNewWebServicePort().getTamaño(narch);
        } catch (MalformedURLException ex) {
            Logger.getLogger(MasterWs.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "GetByte")
    public byte[] GetByte(@WebParam(name = "ID") String ID, @WebParam(name = "narch") String narch,@WebParam(name="buff") int buff ,@WebParam(name = "FileP") long FileP) {
        try {
            URL location = new URL(ID);
            master.wsc.NewWebService_Service service = new master.wsc.NewWebService_Service(location);
            return service.getNewWebServicePort().getBytes(narch, buff, FileP);
        } catch (MalformedURLException ex) {
            Logger.getLogger(MasterWs.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }


    
    
    
}
