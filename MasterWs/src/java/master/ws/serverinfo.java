/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package master.ws;

/**
 *
 * @author andres
 */
public class serverinfo {
     private String sName;
    private String sURL;
    
    public serverinfo(){}
    public serverinfo(String sName, String sURL) {
        this.sName = sName;
        this.sURL = sURL;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public String getsURL() {
        return sURL;
    }

    public void setsURL(String sURL) {
        this.sURL = sURL;
    }
    
    
}
