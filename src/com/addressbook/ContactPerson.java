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


    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public ContactPerson() {
        super();
    }

    public String toString() {
        return "Person [name=" + this.firstName + " " + this.lastName + ", Address=" + this.address + ", City="
                + this.city + ", state=" + this.state + ", email=" + this.email + ", zip=" + this.zip
                + ", phone=" + this.phoneNumber + "]";
    }
}
