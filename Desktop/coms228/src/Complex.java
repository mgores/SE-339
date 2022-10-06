public class Complex implements Cloneable {
    private int re; // real part
    private int im; // imaginary part

    public Complex(int re, int im) {
        this.re = re;
        this.im = im;
    }

    @Override
    public boolean equals(Object o) {

            return this==o;


    }

    @Override
    public Object clone() {
        try {
            Complex c = (Complex) super.clone();
            return c;

        } catch (CloneNotSupportedException e) {
            System.out.println("fail");

        }
        return null;
    }
}