/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package weddingplanner;

import java.time.LocalDate;

/**
 *
 * @author rafia
 */
public class Booking {
    private int bookingId,startTime,endTime;
    private LocalDate date;
    private String bookedBy;

    public Booking() {
    }

    public Booking(int bookingId, int startTime, int endTime, LocalDate date, String bookedBy) {
        this.bookingId = bookingId;
        this.startTime = startTime;
        this.endTime = endTime;
        this.date = date;
        this.bookedBy = bookedBy;
    }

    public int getBookingId() {
        return bookingId;
    }

    public void setBookingId(int bookingId) {
        this.bookingId = bookingId;
    }

    public int getStartTime() {
        return startTime;
    }

    public void setStartTime(int startTime) {
        this.startTime = startTime;
    }

    public int getEndTime() {
        return endTime;
    }

    public void setEndTime(int endTime) {
        this.endTime = endTime;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getBookedBy() {
        return bookedBy;
    }

    public void setBookedBy(String bookedBy) {
        this.bookedBy = bookedBy;
    }

    @Override
    public String toString() {
        return "Booking{" + "bookingId=" + bookingId + ", startTime=" + startTime + ", endTime=" + endTime + ", date=" + date + ", bookedBy=" + bookedBy + '}';
    }
    
    
}
