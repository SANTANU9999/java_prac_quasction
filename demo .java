/*Write a class, Commission, which has an instance variable, sales; an appropriate constructor; and a method, 
getCommission() that returns the commission. 
Now write a demo class to test the Commission class by reading a sale from the user, using it to create a Commission 
object after validating that the value is not negative. Finally, call the getCommission() method to get and print the 
commission. If the sales are negative, your demo should print the message "Invalid Input". */
package basicjava_pac.java_prac_quasction;

class Commission {
    int sale;

    public Commission(int sale) {
        this.sale = sale;
    }

    public Commission() {
        this.sale = 0;
    }
}

class demo {
    static void getCommission(int sale, double com) {
        if (sale < 0)
            System.out.println("Invalid input");
        else
            System.out.println((sale) * (com / 100));
    }

    public static void main(String as[]) {
        Commission ob1 = new Commission(3000);
        Commission ob2 = new Commission(-3000);
        double comRate = 15;
        getCommission(ob1.sale, comRate);
        getCommission(ob2.sale, 15);
    }
}