/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package udpmanager;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author asaad
 */
public class UDPListenerManager extends Thread{
    
    DatagramSocket datagramSocket;
    int port;
    public boolean isEnabled=true;
    UDPListenerManagerInterface caller;
    
    public UDPListenerManager(
            UDPListenerManagerInterface callerParam
            ,int portParam){
        this.port=portParam;
        this.caller=callerParam;
        this.start();
    }
    
    public void InitUDPDatagramSocket(){
        try{
            this.datagramSocket=new DatagramSocket(port);
        }catch (Exception ex) {
            Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @Override
    public void run(){
        try{
            InitUDPDatagramSocket();
            DatagramPacket dp=
                    new DatagramPacket(new byte[4096], 4096);
            while(this.isEnabled){
                this.datagramSocket.receive(dp);
                if (dp != null) {
                    this.caller.DatagramPacketReceived(dp.getAddress()
                        .getHostAddress(), dp.getPort(), dp.getData());
                
                    dp.setData(new byte[4096]);
                
                }              
            }
        }catch (Exception ex) {
            Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void sendMessage(String ipAddress,
            int destinationPort,String message){
        
        try{
            DatagramPacket dpToBeSent=new 
        DatagramPacket(message.getBytes(), 
                    message.getBytes().length, 
                InetAddress.getByName(ipAddress), 
                destinationPort);
            this.datagramSocket.send(dpToBeSent);
            
        }catch (Exception ex) {
            Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
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
            this.datagramSocket.send(dpToBeSent);
            
        }catch (Exception ex) {
            Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
