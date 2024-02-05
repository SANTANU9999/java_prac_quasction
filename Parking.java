/*Design a class (CarParking) to calculate the car parking charge in a Multiplex. Design another
class Car to keep car number, hours of booking etc. The parking charge is collected in hourly
basis at a given rate. The system should have following functionalities:
1. Calculate parking charges of a car.
2. Receive parking charges.
3. Display number of cars present in the parking lot.
4. Display total number of cars parked in this parking lot.
5. Display total parking charge collection. */
package basicjava_pac.java_prac_quasction;

import java.util.*;

class Car {
    void Car() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Number of cars to be parked = ");
        int n = sc.nextInt();
        int[] arr = new int[5];
        int[] b = new int[5];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter car number = ");
            arr[i] = sc.nextInt();
            System.out.print("Hours of booking = ");
            b[i] = sc.nextInt();
        }
        System.out.print("Enter fee per hour = ");
        int fees = sc.nextInt();
        int total = 0;
        for (int i = 0; i < n; i++) {
            total = total + (fees * b[i]);
            System.out.println("\nCar number = " + arr[i] + "\nTotal fee = " + (fees *
                    b[i]));
        }
        System.out.println("\nCars present in Parking lot = " + n);
        System.out.println("\nTotal Cars present in Parking lot = " + n);
        System.out.println("\nTotal parking charge collection = " + total);
    }
}

class Parking extends Car {
    public static void main(String[] args) {
        Car set = new Car();
        set.Car();
    }
}
