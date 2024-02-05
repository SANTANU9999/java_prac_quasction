/*Design a Account class with account number, balance and date of last updation. Consider a Transaction class with 
account number, date of transaction, amount and transaction type. Check whether the amount is available or not in 
case of a withdrawal. Transaction object will make necessary updation in the Account class */

package basicjava_pac.java_prac_quasction;

import java.util.*;

class Account {
    int no = 1234;
    int balance = 20000;
}

class Transactons extends Account {
    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter account number");
        int acc = sc.nextInt();
        if (acc == no) {
            System.out.println("Current Balance " + balance);
            System.out.println("*****\t\tTRANSACTION TYPE\t*****");
            System.out.println("Press 1\tforwihtdrwal\nPress 2\tfor deposit\nPress 3\tfor checking balaance ");
            int opt = sc.nextInt();
            switch (opt) {
                case 1:
                    System.out.println("Selected withdraw");
                    System.out.println("Enter withdawl amount");
                    int withamt = sc.nextInt();
                    if (withamt > balance)
                        System.out.println("NOT ENOUGH BALANCE\nCURENT BALANCE = " +
                                balance);
                    else {
                        balance = balance - withamt;
                        System.out.println("Processing\nBalance after withdrawl = " +
                                balance);
                    }
                    break;
                case 2:
                    System.out.println("Selected Deposit");
                    System.out.println("Enter deposit amount");
                    int depamt = sc.nextInt();
                    System.out.println("CURRENT BALANCE = " + balance);
                    balance = balance + depamt;
                    System.out.println("BALANCE AFTER DEPOSIT = " + balance);
                    break;
                case 3:
                    System.out.println("CURRENT BALANCE = " + balance);
                    break;
                default:
                    System.out.println("INVALID INPUT");
            }
        } else
            System.out.println("INVALID ACCOUNT NUMBER");
    }
}

class bank {
    public static void main(String[] args) {
        Transactons obj = new Transactons();
        obj.input();
    }
}