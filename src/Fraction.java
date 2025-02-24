public class Fraction {
    private long n;
    private long d;

    public Fraction(long d, long n)
    {
        long gcd = Utils.gcd(d, n);
        this.d = d / gcd;
        this.n = n / gcd;
    }
    public static Fraction parse(String s)
    {
        return new Fraction(1,1);
    }
    @Override
    public String toString() {
        return n+"/"+d;
    }

}
