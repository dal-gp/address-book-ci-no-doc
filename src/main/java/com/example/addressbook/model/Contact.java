package com.example.addressbook.model;

/**
 * Class to represent a Contact object in the address book application
 */

public class Contact {
    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;

    /**
     * Constructor for Contact class to create a new Contact object
     * @param firstName - first name of a contact
     * @param lastName - last name of a contact
     * @param email - email address for a contact
     * @param phone - phone number for a contact
     */
    public Contact(String firstName, String lastName, String email, String phone) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phone = phone;
    }

    /**
     * Getter for the ID of a contact object
     * @return  - an integer representing the ID for the contact
     */
    public int getId() {
        return id;
    }

    /**
     * Setter for the ID of a contact object
     * @param id - an integer representing the ID for the contact
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Getter for the first name of a contact object
     * @return - a string representing the first name for the contact
     */
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }
}