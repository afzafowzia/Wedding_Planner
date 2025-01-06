/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package weddingplanner;

import java.io.Serializable;
import java.time.LocalDate;

/**
 *
 * @author HP
 */
public class DestintionClass implements Serializable {
    
    private String destination;
    private String contact;
    private String name;
    private LocalDate doEvent; 

    public DestintionClass() {
    }

    public DestintionClass(String destination, String contact, String name, LocalDate doEvent) {
        this.destination = destination;
        this.contact = contact;
        this.name = name;
        this.doEvent = doEvent;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDoEvent() {
        return doEvent;
    }

    public void setDoEvent(LocalDate doEvent) {
        this.doEvent = doEvent;
    }

    @Override
    public String toString() {
        return "DestintionClass{" + "destination=" + destination + ", contact=" + contact + ", name=" + name + ", doEvent=" + doEvent + '}';
    }
    
    
}
