/*
 Design a Complex class, which have two integer values for real and imaginary part (c = x +i y).
The class should have the methods to support the following operations:
1. Addition to calculate c1 = c1+c2
2. Addition to calculate c3 = c1+c2
3. Subtraction to calculate c1 = c1−c2
4. Subtraction to calculate c3 = c1−c2
5. Multiplication to calculate c3 = c1∗c2
 */

package basicjava_pac.java_prac_quasction;

class Complex {
    public int real;
    public int imaginary;

    public Complex() {
        this.real = 0;
        this.imaginary = 0;
    }

    public Complex(int real, int imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public void addition(Complex c2) {
        this.real = this.real + c2.real;
        this.imaginary = this.imaginary + c2.imaginary;
    }

    public void substraction(Complex c2) {
        this.real = this.real - c2.real;
        this.imaginary = this.imaginary - c2.imaginary;
    }

    public void multiplication(Complex c2) {
        this.real = this.real * c2.real;
        this.imaginary = this.imaginary * c2.imaginary;
    }

    public void addition(Complex c1, Complex c2) {
        this.real = c1.real + c2.real;
        this.imaginary = c1.imaginary + c2.imaginary;
    }

    public void substraction(Complex c1, Complex c2) {
        this.real = c1.real - c2.real;
        this.imaginary = c1.imaginary - c2.imaginary;
    }

    public void multiplication(Complex c1, Complex c2) {
        this.real = c1.real * c2.real;
        this.imaginary = c1.imaginary * c2.imaginary;
    }

    public void print() {
        if (this.imaginary < 0) {
            System.out.println(this.real + "" + this.imaginary + "i");
        } else {
            System.out.println(this.real + "+" + this.imaginary + "i");
        }
    }
}

class Testmain {
    public static void main(String[] args) {
        Complex c1 = new Complex(10, 7);
        Complex c2 = new Complex(5, -3);
        Complex c3 = new Complex();
        c1.addition(c2);
        c1.print();
        c3.addition(c1, c2);
        c3.print();
        c1.substraction(c2);
        c1.print();
        c3.substraction(c1, c2);
        c3.print();
        c3.multiplication(c1, c2);
        c3.print();
    }
}
