package org.example;

import org.w3c.dom.events.Event;

import java.util.ArrayList;

public class Customer {

    private String firstName;
    private String lastName;
    private String email;
    ArrayList<Event> reservationList = new ArrayList<>();

    public Customer(String firstName, String lastName, String email, ArrayList<Event> reservationList) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.reservationList = reservationList;
    }

public Customer(String firstName, String lastName, String email) {

    this.firstName = firstName;
    this.lastName = lastName;
    this.email = email;
}

    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public String getEmail() {
        return email;
    }
    public ArrayList<Event> getReservationList() {
        return reservationList;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setReservationList(ArrayList<Event> reservationList) {
        this.reservationList = reservationList;
    }


}
