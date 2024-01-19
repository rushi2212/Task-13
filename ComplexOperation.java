public class ComplexOperation {
    public static void main(String[] args) {
        Complex a = new Complex();
        a.SetComplex(2, 1);
        Complex b = new Complex();
        b.SetComplex(3, 2);
        Complex c = new Complex();
        c.ComplexAdd(a, b);
        c.ComplexSub(a, b);
        c.ComplexMul(a, b);
    }
}

class Complex {
    int real;
    int img;

    void SetComplex(int x, int y) {
        real = x;
        img = y;
    }

    void ComplexAdd(Complex a, Complex b) {
        System.out.println("The Addition of Complex No is " + (a.real + b.real) + "+" + (a.img + b.img) + "i");
    }

    void ComplexSub(Complex a, Complex b) {
        System.out.println("The Subtraction of Complex No is " + (a.real - b.real) + "+" + (a.img - b.img) + "i");
    }

    void ComplexMul(Complex a, Complex b) {
        System.out.println("The Multiplication of Complex No is " + ((a.real * b.real) - (a.img * b.img)) + "+"
                + ((a.real * b.img) + (a.img * b.real)) + "i");
    }
}