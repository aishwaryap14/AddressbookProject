package com.project;

import java.util.*;

public class AddBookFun {
    Scanner scanner=new Scanner(System.in);
    public static Contact contact;
    public static String bookName;
    public static List<Contact> contactBook = new ArrayList();//for storing person's contact details
    public static Map<String,List<Contact>> addressBookMap=new HashMap<>();//for storing both book and contact details
    public static int count=contactBook.size();
    public static Set<String> addressBookName=new HashSet<>();//for storing bokk details
    public boolean createAddressBook()
    {
        System.out.println("Enter Address Book name:");
        bookName=scanner.nextLine();

        addressBookMap.put(bookName,contactBook);
        if(addressBookMap.get(bookName) == null)
        {
            System.out.println("Address Book is already present..");
        }
        return true;
    }
    public void displayAddressBook(){
        Set<String> addressBookName = addressBookMap.keySet();

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
        for(int i = 0;i < count;i ++){
            System.out.println(contactBook.get(i));
        }

    }

    private void getUserContactDetails() {
        System.out.println("Enter City = ");
        String city = scanner.nextLine();
        System.out.println("Enter First Name = ");
        String firstname = scanner.nextLine();
        System.out.println("Enter Last Name = ");
        String lastname = scanner.nextLine();
        System.out.println("Enter Phone Number = ");
        String phoneNo = scanner.nextLine();
        System.out.println("Enter E-mail address= ");
        String email = scanner.nextLine();
        System.out.println("Enter address= ");
        String address = scanner.nextLine();
        System.out.println("Enter State= ");
        String state = scanner.nextLine();
        System.out.println("Enter Zip= ");
        String zip = scanner.nextLine();
        contact = new Contact(firstname, lastname, phoneNo, email, address, city, state, zip);
        contactBook.add(contact);
        count++;
    }
    public void editContact()
    {
        System.out.println("Enter Email id to edit contact Details ");
        String email = scanner.nextLine();
    if(email.equalsIgnoreCase(contact.getEmail()))
       // for (int i = 0;i < count;i ++)
        {
          //  if(email== contact.getEmail())
          for (int i = 0;i < count;i ++)
            {
                System.out.println("Enter your choice to edit contact: \n1.Edit Name" +
                        "\n2.Edit Phone number \n3.Edit Address");
                int editChoice =scanner.nextInt();
                switch (editChoice)
                {
                    case 1:
                        System.out.println("Enter new First Name: ");
                        String firstname=scanner.nextLine();
                        contact.setFirstname(firstname);
                        System.out.println("Enter new Last Name:");
                        String lastname=scanner.nextLine();
                        contact.setLastname(lastname);
                        break;
                    case 2:
                        System.out.println("Enter new Phone Number: ");
                        String phoneNo=scanner.nextLine();
                        contact.setPhonenum(phoneNo);
                        break;
                    case 3:
                        System.out.println("Enter new Address");
                        String address=scanner.nextLine();
                        contact.setAddress(address);
                        break;
                    default:
                        System.out.println("Wrong Choice code");
                        System.exit(0);
                }
            }

        }
//        else
//        {
//            System.out.println("No such mail id Available :-(");
//        }
    }

    public void deleteContact()
    {
        System.out.println("Enter email id to delete contact");
        String email=scanner.nextLine();
        if (email.equalsIgnoreCase(contact.getEmail())) {
            for (int i = 0; i < count; i++) {
                addressBookMap.entrySet().stream().filter(emailId -> email.equals(emailId.getValue()))
                        .forEach(con -> addressBookMap.remove(con.getKey(), con.getValue()));
                count --;
                System.out.println("Contact Deleted !!");
            }
        }
        else {
            System.out.println("No such contact Available.. !!");
        }


    }

}
