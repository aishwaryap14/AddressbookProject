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
                    "\n3.Add contact details \n4.Display contact details \n5.Edit/Modify contact details  ");
          choice = scanner.nextInt();
            switch (choice) {
                case 1: addBookFun.createAddressBook();
                break;
                case 2: addBookFun.displayAddressBook();
                break;
                case 3: addBookFun.createContact();
                break;
                case 4: addBookFun.displayContact();
                break;
                case 5:addBookFun.editContact();
                break;
                case 6:addBookFun.deleteContact();
                break;
                default:
                    System.out.println("Entered Wrong choice code");
            }
        }while (choice<9);


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
