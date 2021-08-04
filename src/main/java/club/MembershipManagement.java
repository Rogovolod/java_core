package club;

import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.Scanner;

public class MembershipManagement {

    final private Scanner reader = new Scanner(System.in);

    private int getIntInput() {
        int choice = 0;
        while (choice == 0) {
            try {
                choice = reader.nextInt();
                if (choice == 0) throw new InputMismatchException();
                reader.nextLine();
            } catch (InputMismatchException e) {
                System.out.print("ERROR: INVALID INPUT. Please try again: ");
            }
        }
        return choice;
    }

    private void printClubOptions() {
        System.out.println("1) Club Mercury");
        System.out.println("2) Club Neptune");
        System.out.println("3) Club Jupiter");
        System.out.println("4) Multi Clubs");
    }

    public int getChoice() {
        System.out.println("\nWELCOME TO OZONE FITNESS CENTER\n" +
                "================================\n" +
                "1) Add Member\n" +
                "2) Remove Member\n" +
                "3) Display Full Member Information\n" +
                "4) Display all members info\n" +
                "Please select an option (or Enter -1 to quit):");
        return getIntInput();
    }

    public String addMembers(LinkedList<Member> m) {
        String name, mem;
        int club, memberID;
        double fees;
        Member member;
        Calculator<Integer> cal;
        System.out.print("Input visitor name: ");
        name = reader.nextLine();
        printClubOptions();
        System.out.println("Input club id: ");
        club = getIntInput();
        while (club < 1 || club > 4) {
            System.out.print("Wrong input, please, try again: ");
            club = getIntInput();
        }
        if (m.size() > 0) {
            memberID = m.getLast().getMemberID() + 1;
        } else {
            memberID = 1;
        }
        if (club != 4) {
            cal = (n) -> {
                switch (n) {
                    case 1:
                        return 900;
                    case 2:
                        return 950;
                    case 3:
                        return 1000;
                    default:
                        return -1;
                }
            };
            fees = cal.calculateFees(club);
            member = new SingleClubMember('S', memberID, name, fees, club);
            m.add(member);
            mem = member.toString();
            System.out.println("\nSTATUS: Single Club Member added.\n");
        } else {
            cal = (n) -> {
                switch (n) {
                    case 4:
                        return 1200;
                    default:
                        return -1;
                }
            };
            fees = cal.calculateFees(club);
            member = new MultiClubMember('M', memberID, name, fees, 100);
            m.add(member);
            mem = member.toString();
            System.out.println("\nSTATUS: Multi Club Member added.\n");
        }
        return mem;
    }

    public void removeMember(LinkedList<Member> m) {
        System.out.print("Input visitor's ID for deleting: ");
        int memberID = getIntInput();
        for (int i = 0; i < m.size(); i++) {
            if (m.get(i).getMemberID() == memberID) {
                String name = m.get(i).getName();
                m.remove(i);
                System.out.printf("Successful deleted visitor '{0}', with Id '{1}'!\n", name, memberID);
                return;
            }
            System.out.printf("Can not found visitor with Id = '{0}' !", memberID);
        }
    }

    public void printMemberInfo(LinkedList<Member> m) {
        System.out.print("\nEnter Member ID to display information: ");
        var memberID = getIntInput();
        for (int i = 0; i < m.size(); i++) {
            if (m.get(i).getMemberID() == memberID) {
                var memberInfo = m.get(i).toString().split(", ");
                System.out.println("\n-----------------------");
                System.out.println("Member Type = " + memberInfo[0]);
                System.out.println("Member ID = " + memberInfo[1]);
                System.out.println("Member Name = " + memberInfo[2]);
                System.out.println("Membership Fees = " + memberInfo[3]);
                if (memberInfo[0].equals("S")) {
                    System.out.println("Club ID = " + memberInfo[4]);
                    System.out.println("-----------------------");
                } else {
                    System.out.println("Membership Points = " + memberInfo[4]);
                    System.out.println("-----------------------");
                }
                return;
            }
        }
        System.out.println("\nMember ID not found\n");
    }

    public void printAll(LinkedList<Member> members) {
        System.out.println("\n-----------------------");
        for (int i = 0; i < members.size(); i++) {
            System.out.println("Member Type = " + members.get(i).getMemberType());
            System.out.println("Member ID = " + members.get(i).getMemberID());
            System.out.println("Member Name = " + members.get(i).getName());
            System.out.println("Membership Fees = " + members.get(i).getFees());
            System.out.println("-----------------------");
        }
    }
}