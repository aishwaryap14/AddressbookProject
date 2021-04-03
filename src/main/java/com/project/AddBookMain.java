package com.project;

import java.util.Scanner;

public class AddBookMain {
    private Contact contact;

    public static void main(String[] args) {
        AddBookFun addBookFun = new AddBookFun();
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        System.out.println("Welcome to Address Book");
        do {
            System.out.println("Enter your choice: \n1.Add Address Book \n2.Display Address Book" +
                    "\n3.Display contact details ");
          choice = scanner.nextInt();
            switch (choice) {
                case 1: addBookFun.createAddressBook();
                break;
                case 2: addBookFun.displayAddressBook();
                break;
                default:
                    System.out.println("Entered Wrong choice code");
            }
        }while (choice<4);


    }

    public boolean createContact(Contact contact)
    {
        this.contact=contact;
        if(this.contact==null)
        {
            return false;}
        { return true;}
    }

    public boolean editcontact(Contact contact)
    {
        this.contact=contact;
        if(this.contact==null)
        {
            return false;}
        { return true;}
    }
    public boolean deletecontact(Contact contact)
    {
        this.contact=contact;
        if(this.contact==null)
        {
            return false;}
        { return true;}
    }

}
