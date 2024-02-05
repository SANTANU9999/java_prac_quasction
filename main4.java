/*Write a Java program to create a super class Vehicle having members, company name and 
price.
Derive two different classes LightMotorVehicle (members – mileage) and 
HeavyMotorVehicle
(members – capacity-in-tons). Accept the information for n vehicles and display the 
information in appropriate form. While taking data, ask the user about the type of vehicle 
first.
Each vehicle should have an unique number starting from 100001. This number should be
generated at the time of instanciation.*/
package basicjava_pac.java_prac_quasction;

import java.util.Scanner;

class Vehicle {
    String company_name;
    double price;
    int vehicle_no;
    static int noGen = 100001;

    public void takedata_vehicle() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter company name : ");
        company_name = s.next();
        System.out.println("Enter price : ");
        price = s.nextDouble();
    }

    public void display_vehicle() {
        vehicle_no = noGen;
        System.out.println("Vehicle number is : " + vehicle_no);
        noGen++;
        System.out.println("company name is : " + company_name);
        System.out.println("vehicle price is : " + price);
    }
}

class lightMotorVehicle extends Vehicle {
    double mileage;

    public void takedata_lmv() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter mileage : ");
        mileage = sc.nextDouble();
    }

    public void display_lmv() {
        System.out.println("mileage is : " + mileage);
    }
}

class heavyMotorVehicle extends Vehicle {
    double capacity_in_ton;

    public void takedata_hmv() {
        Scanner c = new Scanner(System.in);
        System.out.println("Enter capacity_in_ton : ");
        capacity_in_ton = c.nextDouble();
    }

    public void display_hmv() {
        System.out.println("capacity_in_ton is : " + capacity_in_ton);
    }
}

public class main4 {
    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);
        System.out.println("Enter type of vehicle");
        while (true) {
            System.out.println(
                    "Enter '1' for lightMotorVehicle\nEnter '2' for heavyMotorVehicle\nEnter press others key for exit");
            int n = e.nextInt();
            switch (n) {
                case 1:
                    System.out.println("Enter the number of LightMotorVehicle");
                    int k = e.nextInt();
                    lightMotorVehicle l[] = new lightMotorVehicle[k];
                    for (int i = 0; i < k; i++) {
                        l[i] = new lightMotorVehicle();
                        l[i].takedata_vehicle();
                        l[i].takedata_lmv();
                        l[i].display_vehicle();
                        l[i].display_lmv();
                    }
                    break;
                case 2:
                    System.out.println("Enter the number of HeavyMotorVehicle");
                    int t = e.nextInt();
                    heavyMotorVehicle h[] = new heavyMotorVehicle[t];
                    for (int i = 0; i < t; i++) {
                        h[i] = new heavyMotorVehicle();
                        h[i].takedata_vehicle();
                        h[i].takedata_hmv();
                        h[i].display_vehicle();
                        h[i].display_hmv();
                    }
                    break;
                default:
                    System.out.println("thank you!");
                    return;
            }
        }
    }
}
