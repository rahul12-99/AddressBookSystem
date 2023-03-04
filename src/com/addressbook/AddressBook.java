package com.addressbook;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook extends ContactPerson {
    public static void main(String[] args) {
        AddressBook newPerson = new AddressBook();
        ArrayList<AddressBook> person = new ArrayList<>();
        System.out.println("Welcome to Address Book Program");
        Scanner sc = new Scanner(System.in);
        //Add person address
        System.out.println("Enter first name");
        newPerson.setFirstName(sc.nextLine());
        System.out.println("Enter last name");
        newPerson.setLastName(sc.nextLine());
        System.out.println("Enter address");
        newPerson.setAddress(sc.nextLine());
        System.out.println("Enter city");
        newPerson.setCity(sc.nextLine());
        System.out.println("Enter state");
        newPerson.setState(sc.nextLine());
        System.out.println("Enter email");
        newPerson.setEmail(sc.nextLine());
        System.out.println("Enter zip code");
        newPerson.setZip(sc.nextInt());
        System.out.println("Enter phone number");
        newPerson.setPhoneNumber(sc.nextLong());
        person.add(newPerson);

        System.out.println(person);
    }
}

