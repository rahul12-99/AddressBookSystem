package com.addressbook;

import java.util.ArrayList;

public class AddressBook {
    public static void main(String[] args) {
        ArrayList<ContactPerson> contact = new ArrayList<>();

        contact.add(new ContactPerson("Rahul", "Kumar", "Patna", " Patna", "Bihar", "rahul@123", 813211, 9934691));
        contact.add(new ContactPerson("Ronit", "Rao", "Patna", "Bgp", "Bihar", "priyesh@123", 813211, 8097658));

        for (ContactPerson contactPerson : contact) {
            System.out.println(contactPerson);
        }
    }
}
