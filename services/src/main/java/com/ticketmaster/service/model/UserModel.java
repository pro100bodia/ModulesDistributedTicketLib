package com.ticketmaster.service.model;

import java.util.Set;

public class UserModel {
    private Long id;
    private String username;
    private String firstName;
    private String lastName;
    private String email;

    private Set<TicketModel> tickets;

    public UserModel() {
    }

    public UserModel(Long id, String username, String firstName, String lastName, String email, Set<TicketModel> tickets) {
        this.id = id;
        this.username = username;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.tickets = tickets;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Set<TicketModel> getTickets() {
        return tickets;
    }

    public void setTickets(Set<TicketModel> tickets) {
        this.tickets = tickets;
    }
}
