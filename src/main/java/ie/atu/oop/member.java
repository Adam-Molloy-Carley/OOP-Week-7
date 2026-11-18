package ie.atu.oop;

import java.util.Scanner;

public class member {
    private String memberID;
    private String name;
    private int age;

    Scanner input = new Scanner(System.in);

    public member(String memberID, String name, String number) {
        this.memberID = memberID;
        this.name = name;
        this.age = Integer.parseInt(number);
    }

    public void addMember() {
       this.memberID = input.nextLine();
       System.out.println("Please set the memberID: ");
       this.name = input.nextLine();
       System.out.println("Please input member name: ");
       this.age = input.nextLine();
       System.out.println("Please input member age: ");

    }

    public String memberID() {return memberID;}

    public String getName() {return name;}

    public int getAge() {return age;}

    public void displayDetails() {
        System.out.println("MemberID: " + this.memberID);
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
    }
}
