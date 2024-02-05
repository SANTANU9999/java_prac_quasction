/*
Design a class Time which contains hour, minute and second as instance variables. The class
should have the methods to support the following:
1. A Constructor to 1initialize instance variables with values.
2. A Constructor to initialize instance variables with default values.
3. Take the time as input in 24-hour format.
4. Display the time in AM/PM format
 */

package basicjava_pac.java_prac_quasction;

public class Student {
    public static void main(String[] args) {
        Time t = new Time(20, 30, 40);
        t.print();
    }
}

class Time {
    int hr;
    int min;
    int sec;

    public Time() {
        hr = 0;
        min = 0;
        sec = 0;
    }

    public Time(int hr, int min, int sec) {
        this.hr = hr;
        this.min = min;
        this.sec = sec;
    }

    void print() {
        if (hr >= 12)
            System.out.println((hr - 12) + ":" + min + ":" + sec + "PM");
        else
            System.out.println((hr + 12) + ":" + min + ":" + sec + "AM");
    }
}