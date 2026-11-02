package ie.atu.oop;

import java.util.Scanner;

public class member {
    private String userID;
    private String name;
    private int age;

    Scanner input = new Scanner(System.in);

    public member(String userID, String name, String number) {
        this.userID = userID;
        this.name = name;
        this.age = Integer.parseInt(number);
    }

    public void addMember() {
        userID = input.nextLine();
        name = input.nextLine();
        age = input.nextInt();
        System.out.println(userID + " " + name + " " + age);
    }

    public String getUserID() {return userID;}

    public String getName() {return name;}

    public int getAge() {return age;}

    public void displayDetails() {
        System.out.println("UserID: " + userID);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
