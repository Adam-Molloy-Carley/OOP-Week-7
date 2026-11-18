package ie.atu.oop;

import java.util.ArrayList;

public class MemberList {
    private ArrayList<Member> Members = new ArrayList<>(); //establishes a list type for Members

    public void addMember(Member member) {
        Members.add(member); //actually adds members to the Arraylist using the Object in its parameters which is filled in main through scanner.
    }

    public void displayMembers() { //displays all members on the list
       if(Members.isEmpty()){
           System.out.println("Members List is empty Currently");
        }
       for(Member Mem : Members) {  // basically means thats as long as The Member Mem has members it will continue to print.
        Mem.displayDetails();
       }
    }
    public Member findByID(String memberID){
        for(Member Mem : Members){
            if (Mem.getMemberID().equalsIgnoreCase(memberID)){  //uses the getMemberID getter in the Member class to ensure the entered ID is correct,
                return Mem;                                     //and if it is, it will return the iteration of "Mem" that the list is currently on,
            }                                                   //as it is searching through the list one by one.
        }
        return null;
    }
    public Member removeByID(String memberID) {
        Member found = findByID(memberID);
        if (found != null) {
            Members.remove(found); //calls the memberID search method in order to target the desired Member to be removed
        }
        return found;
    }
}
