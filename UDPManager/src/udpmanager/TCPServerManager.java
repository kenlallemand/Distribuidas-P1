package udpmanager;

import java.net.*;
import java.io.*;
 
class TCPServerManager{
 public static void main (String[] args){
 
ServerSocket server;
Socket connection;
 
DataOutputStream output;
 BufferedInputStream bis;
 BufferedOutputStream bos;
 
byte[] receivedData;
 int in;
 String file;
 
  try{
   //Servidor Socket en el puerto 9090
      server = new ServerSocket( 9090 );
        while ( true ) {
    //Aceptar conexiones
    connection = server.accept();
 
    bis = new BufferedInputStream(connection.getInputStream());
    DataInputStream dis=new DataInputStream(connection.getInputStream());
    //Recibimos el nombre del fichero
       file = dis.readUTF();
       int tam = dis.readInt(); 
    //Buffer de tam del archivo bytes
       receivedData = new byte[9090];
       file = file.substring(file.indexOf('\\')+1,file.length());
 //Para guardar fichero recibido
 bos = new BufferedOutputStream(new FileOutputStream(file));
 while ((in = bis.read(receivedData)) != -1){
 bos.write(receivedData,0,in);
 }
 bos.close();
 
 dis.close();
     System.out.println("archivo recibido: "+file);
 }
 }catch (Exception e ) {
 System.err.println(e);
 }
 }
}

