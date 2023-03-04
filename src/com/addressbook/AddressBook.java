package com.addressbook;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook extends ContactPerson {
    public static void main(String[] args) {
        int button = 0;
        int choice;
        AddressBook newPerson = new AddressBook();
        ArrayList<AddressBook> person = new ArrayList<>();
        System.out.println("Welcome to Address Book Program");
        Scanner sc = new Scanner(System.in);
        while (button != 1) {
            System.out.println("Enter 1 to add contact details");
            System.out.println("Enter 2 to edit details");
            System.out.println("Enter 3 to exit");
            choice = sc.nextInt();
            sc.nextLine();
            if (choice == 1) {
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
                System.out.println("Enter zip code");
                newPerson.setZip(sc.nextInt());
                System.out.println("Enter phone number");
                newPerson.setPhoneNumber(sc.nextLong());
                System.out.println("Enter Email");
                sc.nextLine();
                newPerson.setEmail(sc.nextLine());
                person.add(newPerson);

                System.out.println(person);

            } else if (choice == 2) {
                System.out.println("Enter the first name whose contact to be edited");
                String name = sc.nextLine();
                if (name.equals(newPerson.getFirstName())) {
                    System.out.println("Edit first name");
                    newPerson.setFirstName(sc.nextLine());
                    System.out.println("Edit last name");
                    newPerson.setLastName(sc.nextLine());
                    System.out.println("Edit address");
                    newPerson.setAddress(sc.nextLine());
                    System.out.println("Edit city");
                    newPerson.setCity(sc.nextLine());
                    System.out.println("Edit state");
                    newPerson.setState(sc.nextLine());
                    System.out.println("Edit zip code");
                    newPerson.setZip(sc.nextInt());
                    System.out.println("Edit phone number");
                    newPerson.setPhoneNumber(sc.nextLong());
                    System.out.println("Edit email");
                    newPerson.setEmail(sc.nextLine());
                    person.add(newPerson);
                } else {
                    System.out.println("Provided name doesn't exist");
                }
            } else if (choice == 3) {
                button = 1;
            }
        }
    }
}

