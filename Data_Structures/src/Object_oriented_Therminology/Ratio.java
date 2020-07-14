package Object_oriented_Therminology;

public class Ratio {
    protected int numerator;
    protected int denominator;

    public Ratio(int top, int bottom) {
        // pre: bottom != 0
        numerator = top;
        denominator = bottom;
        reduce();
    }

    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }
    public double getValue () {
        return (double)numerator/(double)denominator;
    }
    public Ratio add (Ratio other ) {
        return new Ratio(this.numerator*other.denominator+
                this.denominator*other.numerator, this.denominator*other.denominator);
    }
    protected void reduce () {
        int divisor = gcd(numerator, denominator);
        if (denominator < 0) divisor = -divisor;
        numerator /= divisor;
        denominator /= divisor;
    }
    protected static int gcd (int integer_one, int integer_two) {
        // greatest integer value that divides integer_one and integer_two
        if (integer_one < 0) return gcd(-integer_one, integer_two);
        if (integer_one == 0) {
            if (integer_two == 0) return 1;
            else return integer_two;
        }
        if (integer_two < integer_one) return gcd(integer_two, integer_one);
        return gcd(integer_two%integer_one, integer_one);
    }

    @Override
    public String toString() {
        return getNumerator()+"/"+getDenominator();
    }
}
