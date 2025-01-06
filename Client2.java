/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package weddingplanner;

import java.io.Serializable;

/**
 *
 * @author rafia
 */
public class Client2 implements Serializable{
    public String clientname,location;

    public Client2() {
    }

    public Client2(String clientname, String location) {
        this.clientname = clientname;
        this.location = location;
    }

    public String getClientname() {
        return clientname;
    }

    public void setClientname(String clientname) {
        this.clientname = clientname;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "Client2{" + "clientname=" + clientname + ", location=" + location + '}';
    }
    
}
