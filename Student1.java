/*A small company dealing with transportation has just purchased a computer for its new automated reservations system. 
You have been asked to program the new system. You are to write
a program called Reservation System to assign seats on a vehicle. Your class also requires the
following:
1. a constructor method, which initialise the variables
2. method to assign the capacity of seating.
3. method for assigning seats */
package basicjava_pac.java_prac_quasction;

import java.util.*;

class MySystem {
    Scanner sc = new Scanner(System.in);
    String[] men = new String[10];
    int[] seat = new int[10];

    void inputseats() {
        System.out.print("Enter number of seats availabe = ");
    }

    void avail(int n) {
        System.out.print("Seats available ");
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }
        System.out.println(" ");
    }

    void assign(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.print("\nEnter name = ");
            men[i] = sc.next();
            System.out.print("\nSeat you want to book = ");
            seat[i] = sc.nextInt();
        }
        for (int i = 1; i <= n; i++) {
            System.out.print("\n\nPerson = " + men[i]);
            System.out.print("\nSeat Booked = " + seat[i]);
        }
    }
}

public class Student1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MySystem ob1 = new MySystem();
        ob1.inputseats();
        int n = sc.nextInt();
        ob1.avail(n);
        ob1.assign(n);
    }
}