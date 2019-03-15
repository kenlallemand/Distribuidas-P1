package udpmanager;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
 
public class TCPServer extends Thread {
    public static final int PORT = 9090;
    public static final int BUFFER_SIZE = 100;
    public BridgeUDP_TCP caller;
    
    
    public TCPServer(BridgeUDP_TCP caller) {
        this.start();
        this.caller = caller;
    }
    
    @Override
    public void run() {
        try {
            ServerSocket serverSocket = new ServerSocket(PORT);
 
            while (true) {
                Socket s = serverSocket.accept();
                saveFile(s,caller);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
 
    private void saveFile(Socket socket, BridgeUDP_TCP caller) throws Exception {
        ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
        ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
        FileOutputStream fos = null;
        byte [] buffer = new byte[BUFFER_SIZE];
 
        // 1. Read file name.
        Object o = ois.readObject();
        
        
        InetAddress inaddr = socket.getInetAddress();

        String nameFile = "default";
        if (o instanceof String) {
            nameFile = o.toString();
            fos = new FileOutputStream(new File(o.toString()));
        } else {
            throwException("Something is wrong");
        }
 
        // 2. Read file to the end.
        Integer bytesRead = 0;
 
        do {
            o = ois.readObject();
 
            if (!(o instanceof Integer)) {
                throwException("Something is wrong");
            }
 
            bytesRead = (Integer)o;
 
            o = ois.readObject();
 
            if (!(o instanceof byte[])) {
                throwException("Something is wrong");
            }
 
            buffer = (byte[])o;
 
            // 3. Write data to output file.
            fos.write(buffer, 0, bytesRead);
           
        } while (bytesRead == BUFFER_SIZE);
         
        System.out.println("file: "+o.toString()+" has arrived successfully!");
        
        fos.close();
        ois.close();
        oos.close();
        caller.Bridge(nameFile);
    }
 
    public static void throwException(String message) throws Exception {
        throw new Exception(message);
    }
 
   
} 