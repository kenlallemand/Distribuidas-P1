/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wsdownloader;


import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.activation.DataHandler;
import master.ws.MasterWs_Service;
import master.ws.MasterWs;

/**
 *
 * @author andres
 */
public class WsDownloader extends Thread {

     private final String ruta = "C:\\Users\\andres\\Documents\\Distribuidas-P1\\webService\\";
    private  master.ws.MasterWs_Service masterws;
    private String ID;
    private String fName;
    private int pOF;
    private int buff;
    

    public WsDownloader(MasterWs_Service masterws, String fName,long Fsize, int pOF, int buff) {
        this.masterws = masterws;
        this.fName = fName;
        this.buff = 1024;
        this.pOF = (int)Math.ceil((double)Fsize/buff);
        start();
    }
    
     @Override
 public void run(){
         try {
             FileOutputStream os = new FileOutputStream(ruta+fName);
             
             int contador= 0;
             byte[] data;
             data = masterws.getMasterWsPort().getByte(ID, ruta, buff, pOF);
             while (contador < pOF) {                   
                    if(data!=null){
                        os.write(data, 0, data.length); 
                        contador++;
                    }  
               }
                os.flush();
                
         } catch (IOException ex) {
             Logger.getLogger(WsDownloader.class.getName()).log(Level.SEVERE, null, ex);
         }
            

 
 }
}
