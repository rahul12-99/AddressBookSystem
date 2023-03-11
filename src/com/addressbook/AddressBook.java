package com.addressbook;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;

public class AddressBook extends ContactPerson {
    public static AddressBook newPerson = new AddressBook();
    public static ArrayList<ContactPerson> person = new ArrayList<>();

    public static void addContact() {

        Scanner sc = new Scanner(System.in);
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
        System.out.println("Enter Email");
        newPerson.setEmail(sc.nextLine());
        System.out.println("Enter zip code");
        newPerson.setZip(sc.nextInt());
        System.out.println("Enter phone number");
        newPerson.setPhoneNumber(sc.nextLong());

        ContactPerson contactPerson = new ContactPerson(newPerson.getFirstName(), newPerson.getLastName(), newPerson.getAddress(), newPerson.getCity(), newPerson.getState(), newPerson.getEmail(), newPerson.getZip(), newPerson.getPhoneNumber());
        person.add(contactPerson);
        System.out.println(person);
    }

    public static void modify() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first name whose contact to be edited");
        String name = sc.nextLine();
        boolean found = false;
        ListIterator<ContactPerson> iterator = person.listIterator();
        while (iterator.hasNext()) {
            ContactPerson contact = iterator.next();
            if (name.equals(contact.getFirstName())) {
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
                System.out.println("Edit email");
                newPerson.setEmail(sc.nextLine());
                System.out.println("Edit zip code");
                newPerson.setZip(sc.nextInt());
                System.out.println("Edit phone number");
                newPerson.setPhoneNumber(sc.nextLong());

                iterator.set(new ContactPerson(newPerson.getFirstName(), newPerson.getLastName(), newPerson.getAddress(), newPerson.getCity(), newPerson.getState(), newPerson.getEmail(), newPerson.getZip(), newPerson.getPhoneNumber()));
                found = true;
            }

        }
        if (found) {
            System.out.println("record is update");
            System.out.println(person);
        } else {
            System.out.println("record not found");
        }
    }

    public static void deleteContact() {
        Scanner sc = new Scanner(System.in);
        boolean found = false;
        System.out.println("Enter the first name of contact to delete");
        String nameDelete;
        nameDelete = sc.nextLine();
        ListIterator<ContactPerson> iterator = person.listIterator();
        while (iterator.hasNext()) {
            ContactPerson contact = iterator.next();
            if (nameDelete.equals(contact.getFirstName())) {
                iterator.remove();
                found = true;
            }
        }
        if (found) {
            System.out.println("record is deleted");
            System.out.println(person);
        } else {
            System.out.println("record not found");
        }
    }

    public void addContactsMain(AddressBook addressBook) {
        Scanner scanner = new Scanner(System.in);
        int flag = 0;
        int choice;
        System.out.println("Welcome to Address Book Program");
        while (flag != 1) {
            System.out.println("Enter 1 to add contact details");
            System.out.println("Enter 2 to edit details");
            System.out.println("Enter 3 to delete contact");
            System.out.println("Enter 4 to exit");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    addContact();
                    break;
                case 2:
                    modify();
                    break;
                case 3:
                    deleteContact();
                    break;
                case 4:
                    flag = 1;
                    break;
            }
        }
    }
}

