package com.project;

import java.util.*;

public class AddBookFun {
    Scanner scanner=new Scanner(System.in);
    public static Contact contact;
    public static String bookName;
    public static List<Contact> contactBook = new ArrayList();//for storing person's contact details
    public static Map<String,List<Contact>> addressBookMap=new HashMap<>();//for storing both book and contact details

    public static Set<String> addressBookName=new HashSet<>();//for storing bokk details
    public boolean createAddressBook()
    {
        System.out.println("Enter Address Book name:");
        bookName=scanner.nextLine();

        addressBookMap.put(bookName,contactBook);
        if(addressBookMap.get(bookName)==null)
        {
            System.out.println("Address Book is already present..");
        }
        return true;
    }
    public void displayAddressBook(){
        Set<String> addressBookName= addressBookMap.keySet();

        for(String addBook: addressBookName)
        {
            System.out.println(addBook);
        }
    }
    public void createContact()
    {
        System.out.println("Select Address Book to Add Contact details");
        displayAddressBook();
        getUserContactDetails();

       // addressBookMap.get(contactBook).add(contact);
        //System.out.println(addressBookMap.get(contactBook).add(contact));
    }
    public void displayContact()
    {
//        List<Contact> contactBook=  ;
//        List<Contact> contactBook=addressBookMap.;
//        addressBookMap.get(contact);
       // System.out.println(addressBookMap.contactBook);
        //System.out.println(contactBook.add(contact));
        for(int i=0;i<contactBook.size();i++){
            System.out.println(contactBook.get(i));
        }

    }

    private void getUserContactDetails() {
        System.out.println("Enter City= ");
        String city = scanner.nextLine();
        System.out.println("Enter First Name= ");
        String firstname = scanner.nextLine();
        System.out.println("Enter Last Name= ");
        String lastname = scanner.nextLine();
        System.out.println("Enter Phone Number= ");
        String phoneNo = scanner.nextLine();
        System.out.println("Enter E-mail address= ");
        String email = scanner.nextLine();
        System.out.println("Enter address= ");
        String address = scanner.nextLine();
        System.out.println("Enter State= ");
        String state = scanner.nextLine();
        System.out.println("Enter Zip= ");
        String zip = scanner.nextLine();
        contact =new Contact(firstname, lastname, phoneNo, email, address, city, state, zip);
        contactBook.add(contact);
    }
}
