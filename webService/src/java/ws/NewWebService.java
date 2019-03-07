
package ws;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.activation.DataHandler;
import javax.activation.FileDataSource;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;


@WebService(serviceName = "NewWebService")
public class NewWebService {
    private final String ruta="C:\\Users\\andres\\Documents\\Distribuidas-P1\\webService\\"; 
    private final String listaarc="listarchivos.txt";



    /**
     * Web service operation
     * @param narch
     * @param buff
     * @param fileP
     * @return 
     */
    @WebMethod(operationName = "getBytes")
    public byte[] getBytes(@WebParam(name= "narch") String narch , @WebParam(name = "buff") int buff, @WebParam(name = "fileP") long fileP) {
        byte[] salida = null;
          try {
            File file =new  File(ruta+listaarc);
            FileInputStream fis = new FileInputStream(file);
            fis.skip(fileP*buff);
            salida = new byte[Math.min(buff, fis.available())];
            fis.read(salida, 0, salida.length);
            fis.close();
        } catch (Exception ex) {
            Logger.getLogger(NewWebService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return salida;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "GetTama\u00f1o")
    public long GetTamaño(@WebParam(name="Filename") String Filename ) {
        return new File(ruta+Filename).length();
    }

    /**
     * Web service operation
     * @param file
     * @return 
     */
    @WebMethod(operationName = "GetArch")
    public DataHandler GetArch(@WebParam(name="file")String file) {
       FileDataSource data = new FileDataSource(ruta+listaarc);
        DataHandler fDH = new DataHandler(data);
        return fDH;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "GetFileNameList")
    public List<String> GetFileNameList() {
         BufferedReader br = null;
	FileReader fr = null;
        List<String> myFilesNames=null;
	try {
            fr = new FileReader(ruta+listaarc);
            br = new BufferedReader(fr);
            String cl;
            myFilesNames=new ArrayList<String>();
            while ((cl = br.readLine()) != null) {
                myFilesNames.add(cl);
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
        return myFilesNames;
    }





}
