package TCPFile;

import java.net.*;
import java.io.*;
 
class TCPClientManager{
    
    public String ipAddress;
    public int port;
    File file;
    
    public void setFile(File file){
        this.file=file;
    }

    public TCPClientManager(String ipAddress, int port, File file) {
        this.ipAddress = ipAddress;
        this.port = port;
        this.file = file;
    }
    
 
    public void sendFile(){
    DataInputStream input;
    BufferedInputStream bis;
    BufferedOutputStream bos;
    int in;
    byte[] byteArray;
    
try{
    

    Socket clientSocket = new Socket(ipAddress, port);
    bis = new BufferedInputStream(new FileInputStream(file));
    bos = new BufferedOutputStream(clientSocket.getOutputStream());
 
 //Enviamos el nombre del fichero
 
   DataOutputStream dos=new DataOutputStream(clientSocket.getOutputStream());
   dos.writeUTF(file.getName());
 
     int tamañoArchivo = (int)file.length();
  
    //Enviamos el fichero
     byteArray = new byte[tamañoArchivo];
       while ((in = bis.read(byteArray)) != -1){
       bos.write(byteArray,0,in);
     }
 
     bis.close();
     bos.close();
     System.out.println("el archivo  "+file.getName() + "fue enviado con exito");
   }catch ( Exception e ) {
         System.err.println(e);
   }
 }
}