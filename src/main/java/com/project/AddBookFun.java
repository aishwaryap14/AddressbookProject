package com.project;

import java.util.*;

public class AddBookFun {
    Scanner scanner=new Scanner(System.in);
    public static String bookName;
    public static List<Contact> contactBook = new ArrayList();//for storing person's contact details
    public static Map<String,List<Contact>> addressBookMap=new HashMap<>();//for storing both book and contact details

    public static Set<String> addressBookName=new HashSet<>();//for storing bokk details
    public boolean createAddressBook()
    {
        System.out.println("Enter Address Book name:");
        bookName=scanner.nextLine();
//        Contact contact=getUserContactDetails();
    //        addressBookMap.get(contactBook).add(contact);
        addressBookMap.put(bookName,contactBook);
        return true;
    }
    public void displayAddressBook(){
        Set<String> addressBookName= addressBookMap.keySet();

        for(String addBook: addressBookName)
        {
            System.out.println(addBook);
        }
    }

    private Contact getUserContactDetails() {
        //System.out.println("Enter City= ");
        String city = bookName;
        System.out.println("Enter First Name= ");
        String firstname = scanner.next();
        System.out.println("Enter Last Name= ");
        String lastname = scanner.next();
        System.out.println("Enter Phone Number= ");
        String phoneNo = scanner.next();
        System.out.println("Enter E-mail address= ");
        String email = scanner.next();
        System.out.println("Enter address= ");
        String address = scanner.next();
        System.out.println("Enter State= ");
        String state = scanner.next();
        System.out.println("Enter Zip= ");
        String zip = scanner.next();

        return new Contact(firstname, lastname, phoneNo, email, address, city, state, zip);
       // return contact;
    }
}
