/*Define a class Employee having private members – id, name, department, salary. Define default and parameterized constructors. Create a subclass called Manager with private member 
bonus. Define methods display in both the classes. Create n objects of the Manager class and 
display the details of the manager having the maximum total salary (salary+bonus).*/
package basicjava_pac.java_prac_quasction;

import java.util.Scanner;

class Employee {
    private int id;
    private String name;
    private String Department;
    private double salary;

    public Employee() {
        id = 0;
        name = null;
        Department = null;
        salary = 0.0;
    }

    public Employee(int id, String name, String Department, double salary) {
        this.id = id;
        this.name = name;
        this.Department = Department;
        this.salary = salary;
    }

    public void takedata_emp() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter id");
        id = sc.nextInt();
        System.out.println("Enter name");
        name = sc.next();
        System.out.println("Enter Department");
        Department = sc.next();
        System.out.println("Enter salary");
        salary = sc.nextDouble();
    }

    public void display_emp() {
        System.out.println("Employee id = " + id);
        System.out.println("Employee name = " + name);
        System.out.println("Employee Department = " + Department);
        System.out.println("Employee salary = " + salary);
    }

    double salary() {
        return salary;
    }
}

class Manager extends Employee {
    private double bonus;

    public void takedata_Man() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter bonus");
        bonus = s.nextDouble();
    }

    public void display_man() {
        System.out.println("bonus = " + bonus);
    }

    public static int max(Manager m[], int n) {
        double max = 0;
        int t = 0;
        for (int i = 0; i < n; i++) {
            if (max < (m[i].salary() + m[i].bonus)) {
                max = m[i].salary() + m[i].bonus;
                t = i;
            }
        }
        System.out.println("\nMax salary : " + max);
        return t;
    }
}

public class main3 {
    public static void main(String[] args) {
        int n, i, result;
        System.out.println("enter the number of employee");
        Scanner c = new Scanner(System.in);
        n = c.nextInt();
        Manager m[] = new Manager[n];
        for (i = 0; i < n; i++) {
            m[i] = new Manager();
            m[i].takedata_emp();
            m[i].display_emp();
            m[i].takedata_Man();
            m[i].display_man();
        }
        result = Manager.max(m, n);
        m[result].display_emp();
        m[result].display_man();
    }
}
