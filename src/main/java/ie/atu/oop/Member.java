package ie.atu.oop;

import java.util.Scanner;

public class Member {
    private String memberID;
    private String name;
    private int age;

    Scanner input = new Scanner(System.in); //allows reading input, must be present in any class that uses its methods.

    public Member(String memberID, String name, int number) {
        this.memberID = memberID;
        this.name = name;
        this.age =number;
    }

    public void addMember() { //add member functionality.
       System.out.println("Please set the memberID: ");
        this.memberID = input.nextLine();
       System.out.println("Please input member name: ");
        this.name = input.nextLine();
       System.out.println("Please input member age: ");
        this.age = Integer.parseInt(input.nextLine());
    }

    public String getMemberID() {return memberID;}  //getters

    public String getName() {return name;}

    public int getAge() {return age;}

    public void displayDetails() {
        System.out.println(this.toString());
    }

    @Override //changes the default message when attempting to print using an Object in the parameters.
        public String toString() {
            return "MemberID: " + this.memberID + "\nMember Name: " + this.name + "\nMemmber Name: " + this.age;

    }
}
