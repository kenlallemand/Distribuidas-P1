/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package udpmanager;

/**
 *
 * @author asaad
 */
public interface UDPListenerManagerInterface {
    
    public void DatagramPacketReceived(String sourceHost,
            int sourcePort,byte[] payload);
    
    public void ErrorHasBeenThrown(Exception error);
    
}
