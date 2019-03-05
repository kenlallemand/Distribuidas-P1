/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package udpmanager;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author asaad
 */
public class MulticastManager extends Thread{
    
    MulticastSocket multicastSocket;
    String multicastIp;
    int port;
    boolean isEnabled=true;
    UDPListenerManagerInterface caller;
    
    public MulticastManager(String multicastIp,
            int port,UDPListenerManagerInterface caller){
        this.multicastIp=multicastIp;
        this.port=port;
        this.caller=caller;
        this.start();
    }
    
    public boolean InitMulticastSocket(){
        try{
            this.multicastSocket=new MulticastSocket(port);
            this.multicastSocket.
                    joinGroup(InetAddress.getByName(multicastIp));
            return true;
        }catch (Exception ex) {
            
        }
        return false;
    }
    
    @Override
    public void run(){
        if(this.InitMulticastSocket()){
            DatagramPacket dp=
                    new DatagramPacket(new byte[1024], 1024);
            while(this.isEnabled){
                try {
                    this.multicastSocket.receive(dp);
                    this.caller.DatagramPacketReceived(dp.getAddress()
                        .getHostAddress(), dp.getPort(), dp.getData());
                    dp.setData(new byte[1024]);
                } catch (IOException ex) {
                    System.out.println("no recibio");
                }
                
            }
        }
    }
    
    public void sendMessage(String ipAddress,
            int destinationPort,byte[] message){
        
        try{
            DatagramPacket dpToBeSent=new 
        DatagramPacket(message, 
                    message.length, 
                InetAddress.getByName(ipAddress), 
                destinationPort);
            this.multicastSocket.send(dpToBeSent);
            
        }catch (Exception ex) {
            
        }
        
    }
    
    
    
}
