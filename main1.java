/*You have to develop one application for managing Students and Teachers information. They 
have some common property, hence you have to define a class Person. Design the 
application maintaining hierarchy of classes. Override the toString method to print the values 
of an object. The students and teachers information should be kept using array of objects.*/
package basicjava_pac.java_prac_quasction;

class person {
    String name;
    String gender;
    String phnum;
}

class student extends person {
    int stuid;

    public String toString() {
        return "student [name " + name + " ,gender " + gender + ", phnum " + phnum + ", stuid "
                + stuid + "]";
    }
}

class teacher extends person {
    int empid;

    public teacher() {
        this.name = name;
        this.gender = gender;
        this.phnum = phnum;
        this.empid = empid;
    }

    public String toString() {
        return "teacher [name " + name + " ,gender " + gender + ", phnum " + phnum + ", empid "
                + empid + "]";
    }
}

public class main1 {
    public static void main(String[] args) {
        student s[] = new student[8];
        for (int i = 0; i < 8; i++) {
            s[i] = new student();
            System.out.println(s[i]);
        }
        teacher t[] = new teacher[7];
        for (int j = 0; j < 7; j++) {
            t[j] = new teacher();
            System.out.println(t[j]);
        }
    }
}