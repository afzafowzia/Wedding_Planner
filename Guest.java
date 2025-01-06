/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package weddingplanner;

/**
 *
 * @author rafia
 */
public class Guest {
    protected String venuName, guestName,vegererian,nonVegeterian;

    public Guest(String venuName, String guestName, String vegererian, String nonVegeterian) {
        this.venuName = venuName;
        this.guestName = guestName;
        this.vegererian = vegererian;
        this.nonVegeterian = nonVegeterian;
    }

    public String getVenuName() {
        return venuName;
    }

    public void setVenuName(String venuName) {
        this.venuName = venuName;
    }

    public String getGuestName() {
        return guestName;
    }

    public void setGuestName(String guestName) {
        this.guestName = guestName;
    }

    public String getVegererian() {
        return vegererian;
    }

    public void setVegererian(String vegererian) {
        this.vegererian = vegererian;
    }

    public String getNonVegeterian() {
        return nonVegeterian;
    }

    public void setNonVegeterian(String nonVegeterian) {
        this.nonVegeterian = nonVegeterian;
    }

    @Override
    public String toString() {
        return "Guest{" + "venuName=" + venuName + ", guestName=" + guestName + ", vegererian=" + vegererian + ", nonVegeterian=" + nonVegeterian + '}';
    }
    
    
}
