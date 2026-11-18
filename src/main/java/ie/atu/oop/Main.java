package ie.atu.oop;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        boolean running = true;
        int choice;

        MemberList list = new MemberList(); //establishing new arraylist.

        Scanner input = new Scanner(System.in); //allows reading user input.

        do { //will iterate itself as long as its while condition is true.
            System.out.println("1. Add Member.");
            System.out.println("2. Display All Members");
            System.out.println("3. Search By ID");
            System.out.println("4. Remove Member");
            System.out.println("5. Exit");
            System.out.println();
            choice = Integer.parseInt(input.nextLine());

            switch (choice) {
                case 1: //Adds a member
                    System.out.println("Enter Member ID: ");
                    String memberID = input.nextLine();

                    System.out.println("Enter Member Name: ");
                    String memberName = input.nextLine();

                    System.out.println("Enter Member Age: ");
                    int memberAge = Integer.parseInt(input.nextLine());
                    if (memberAge <= 0){
                        System.out.println("Not an applicable age!");
                        break;
                }
                    Member newMember = new Member(memberID, memberName, memberAge); //creates new Member object from the variables inside the switch case.
                    list.addMember(newMember);
                    System.out.println("New Member Added!");
                    break;
                case 2:
                    list.displayMembers(); //calls displayMembers from the MemberList class.
                    break;
                case 3:
                    System.out.println("Enter Member ID to search: ");
                    String ID = input.nextLine();
                    Member found = list.findByID(ID); //declaring a Member Variable allows me to point to a specific member object, in this case, it being the desired Member whose ID I entered.
                    if (found != null) {
                        found.displayDetails(); //because of the member variable, found and the object it points to are one and the same, allowing me to call displayDetails.
                    } else {
                        System.out.println("No User with this ID can be found!");
                    }
                    break;
                case 4:
                    System.out.println("Enter Member ID to remove: ");
                    String removeID = input.nextLine();
                    Member delete = list.removeByID(removeID); //same principles as  finding the ID, however once it find the object it deletes it.
                    if (delete != null) {
                        System.out.println("User Removed!");
                    } else {
                        System.out.println("No User with this ID can be found!");
                    }
                    break;
                case 5:
                    System.out.println("Terminating Program....");
                    running = false;
            }
        }
        while(running);
    }
}