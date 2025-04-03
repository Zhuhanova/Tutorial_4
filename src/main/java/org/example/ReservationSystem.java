package org.example;

import java.util.ArrayList;
import java.util.List;

public class ReservationSystem {

    private List<Event> events = new ArrayList<>();
    private List<Customer> customers = new ArrayList<>();

    public void addEvent(Event event) { events.add(event); }
    public void addCustomer(Customer customer) { customers.add(customer); }

    public boolean makeReservation(Customer customer, Event event) {
        if (event.reserveSeat()) {
            customer.addReservation(event);
            return true;
        }
        return false;
    }

    public Event findEvent(String name) {
        for (Event e : events) {
            if (e.getName().equalsIgnoreCase(name)) {
                return e;
            }
        }
        return null;
    }

    public Customer findCustomer(String lastName) {
        for (Customer c : customers) {
            if (c.getLastName().equalsIgnoreCase(lastName)) {
                return c;
            }
        }
        return null;
    }

    public void changeEventPrice(String name, double newPrice) {
        Event event = findEvent(name);
        if (event != null) {
            event.setPrice(newPrice);
        }
    }
}
