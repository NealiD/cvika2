public class Fraction {
    private long n;
    private long d;

    public Fraction(long n, long d)
    {
        this.n = n;
        this.d = d;
        long gcd = gcd(n, d);
    }


}
