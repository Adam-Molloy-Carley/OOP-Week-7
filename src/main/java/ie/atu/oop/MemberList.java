package ie.atu.oop;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MemberList {
    private List<String> userIDs = new ArrayList<>();
    private List<String> names = new ArrayList<>();
    private List<Integer> ages = new ArrayList<>();

    Scanner input = new Scanner(System.in);

    public MemberList(){
        this.userIDs = new ArrayList<>();
        this.names = new ArrayList<>();
        this.ages = new ArrayList<>();
    }

    public void addMember() {
       userIDs.add(input.nextLine());
       names.add(input.nextLine());
       ages.add(input.nextInt());
    }

}
