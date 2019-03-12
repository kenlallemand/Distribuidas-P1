import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.Arrays;
import java.lang.*;
import java.util.Scanner;
 
 
public class TCPClient {
    
    File file;
    String ipAddress;
    int port;
    
    public TCPClient(File file, String ipAddress, int port) {
        this.file = file;
        this.ipAddress = ipAddress;
        this.port = port;
    }
    
    
    public void sendFile() throws IOException{
        
 
  
        System.out.println("Loading file...");
        
        
        Socket socket = new Socket(ipAddress, port);
        ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
        ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
 
        oos.writeObject(file.getName());
 
        FileInputStream fis = new FileInputStream(file);
        byte [] buffer = new byte[TCPServer.BUFFER_SIZE];
        Integer bytesRead = 0;
 
        while ((bytesRead = fis.read(buffer)) > 0) {
            oos.writeObject(bytesRead);
            oos.writeObject(Arrays.copyOf(buffer, buffer.length));
        }
 
        oos.close();
        ois.close();
        System.out.println("File has been sent!");
        System.exit(0);    
}
 
}

