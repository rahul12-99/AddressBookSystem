package com.addressbook;

public class ContactPerson {
    String firstName;
    String lastName;
    String address;
    String city;
    String state;
    String email;
    int zip;
    long phoneNumber;


    public ContactPerson(String firstName, String lastName, String address, String city, String state, String email, int zip, long phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.state = state;
        this.email = email;
        this.zip = zip;
        this.phoneNumber = phoneNumber;


    }

    public String toString() {
        return "Person [name=" + this.firstName + " " + this.lastName + ", Address=" + this.address + ", City="
                + this.city + ", state=" + this.state + ", email=" + this.email + ", zip=" + this.zip
                + ", phone=" + this.phoneNumber + "]";
    }
}
