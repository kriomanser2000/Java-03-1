public class Fraction
{
    private int numerator;
    private int denominator;
    public Fraction()
    {
        this.numerator = 0;
        this.denominator = 1;
    }
    public Fraction(int numerator, int denominator)
    {
        this.numerator = numerator;
        setDenominator(denominator);
    }
    public void setNumerator(int numerator)
    {
        this.numerator = numerator;
    }
    public void setDenominator(int denominator)
    {
        if (denominator != 0)
        {
            this.denominator = denominator;
        }
        else
        {
            throw new IllegalArgumentException("The denominator cannot be 0");
        }
    }
    public int getNumerator()
    {
        return numerator;
    }
    public int getDenominator()
    {
        return denominator;
    }
    public void printFraction()
    {
        System.out.println(numerator + "/" + denominator);
    }
    public Fraction add(Fraction other)
    {
        int newNumerator = this.numerator * other.denominator + other.numerator * this.denominator;
        int newDenominator = this.denominator * other.denominator;
        return new Fraction(newNumerator, newDenominator).simplify();
    }
    public Fraction subtract(Fraction other)
    {
        int newNumerator = this.numerator * other.denominator - other.numerator * this.denominator;
        int newDenominator = this.denominator * other.denominator;
        return new Fraction(newNumerator, newDenominator).simplify();
    }
    public Fraction multiply(Fraction other)
    {
        int newNumerator = this.numerator * other.numerator;
        int newDenominator = this.denominator * other.denominator;
        return new Fraction(newNumerator, newDenominator).simplify();
    }
    public Fraction divide(Fraction other)
    {
        if (other.numerator == 0)
        {
            throw new IllegalArgumentException("Cannot be divided by 0");
        }
        int newNumerator = this.numerator * other.denominator;
        int newDenominator = this.denominator * other.numerator;
        return new Fraction(newNumerator, newDenominator).simplify();
    }
    public Fraction simplify()
    {
        int gcd = gcd(numerator, denominator);
        return new Fraction(numerator / gcd, denominator / gcd);
    }
    private int gcd(int a, int b)
    {
        if (b == 0)
        {
            return a;
        }
        return gcd(b, a % b);
    }
    public static void main(String[] args)
    {
        Fraction fraction1 = new Fraction(3, 4);
        Fraction fraction2 = new Fraction(2, 5);
        System.out.print("Addition: ");
        fraction1.add(fraction2).printFraction();
        System.out.print("Subtraction: ");
        fraction1.subtract(fraction2).printFraction();
        System.out.print("Multiplication: ");
        fraction1.multiply(fraction2).printFraction();
        System.out.print("Division: ");
        fraction1.divide(fraction2).printFraction();
    }
}
