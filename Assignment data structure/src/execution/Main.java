package execution;


import contact.Contacts;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String first_Name=null;
        String last_Name=null;
        String phone_Number=null;
        String email_Address=null;
        Scanner sc=new Scanner(System.in);
        Contacts contacts=new Contacts(first_Name,last_Name,phone_Number,email_Address);
        System.out.println("Press 1 to add a new contact");
        System.out.println("Press 2 to view all contacts");
        System.out.println("Press 3 to search for a contact");
        System.out.println("Press 4 to delete a contact");
        System.out.println("Press 5 to exit program");
        int choice=sc.nextInt();

        switch (choice){
            case 1:
                System.out.println("You have chosen to add a new contact:");
                System.out.println("Enter how many times you want to add contact");
                int d=sc.nextInt();
                for(int i=0;i<d;i++) {
                    System.out.println("Please enter the first name of the Person: ");
                    System.out.println("Please enter the last name of the Person: ");
                    System.out.println("would you like to add phone number: ");
                    System.out.println("would you like to add email address");
                    String first_name=sc.nextLine();
                    String last_name=sc.nextLine();
                    String phone_number=sc.nextLine();
                    String email_address=sc.nextLine();
                    contacts.store("==", "", "", "");
                    contacts.store("First name: " + first_name, "last name: " + last_name, "phone: " + phone_number, "email address:" + email_address);
                    contacts.insertMap(first_name,last_name);
                }

                contacts.printList();
                System.out.println("which name you want to search: ");
                String c=sc.nextLine();
                contacts.search(c,last_Name);
                break;
            case 2:
                System.out.println("view all contacts menu");
                contacts.printList();
                break;
            case 3:
                System.out.println("You could search for a contact from their first names:");
                System.out.println("Enter first name that you want to search: ");
                String e=sc.nextLine();
                contacts.search(e,last_Name);
                break;
            case 4:
                System.out.println("Remove a contact");
                System.out.println("specify the contact which you want to remove: ");
                contacts.remove(sc.nextLine());
                break;
            case 5:
                System.exit(0);
                break;
            default:
                System.out.println("Invalid choice");
        }
    }
}

