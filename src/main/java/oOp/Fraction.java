package oOp;

public class Fraction {
    private int numerator;
    private int denomerator;

    public Fraction(int numerator, int denomerator) {
        this.numerator = numerator;
        this.denomerator = denomerator;
    }

    public void print() {
        System.out.println("phân số:" + this.numerator + "/" + this.denomerator);
    }

    private int USCLN(int a, int b) {
        if (b == 0) return a;
        return USCLN(b, a % b);
    }

    public void reduceFrac() {
        int i = USCLN(numerator, denomerator);
        numerator /= i;
        denomerator /= i;
    }

    public void sumFrac(Fraction ps) {
        int ts = this.numerator * ps.denomerator + ps.numerator * this.denomerator;
        int ms = this.denomerator * ps.denomerator;
        Fraction sumFrac = new Fraction(ts, ms);
        sumFrac.reduceFrac();

        System.out.println("Cộng 2 phân số: " + sumFrac.numerator + "/" + sumFrac.denomerator);
    }

    public void subFrac(Fraction ps) {
        int ts = this.numerator * ps.denomerator - this.denomerator * ps.numerator;
        int ms = this.denomerator * ps.denomerator;
        Fraction subfrac = new Fraction(ts, ms);
        subfrac.reduceFrac();
        System.out.println("Hiệu 2 phân số: " + subfrac.numerator + "/" + subfrac.denomerator);
    }

    public void multipFrac(Fraction ps) {
        int ts = this.numerator * ps.numerator;
        int ms = this.denomerator * ps.denomerator;
        Fraction multiFrac = new Fraction(ts, ms);
        multiFrac.reduceFrac();
        System.out.println("Nhân 2 phân số: " + multiFrac.numerator + "/" + multiFrac.denomerator);
    }

    public void diviFrac(Fraction ps) {

        int ts = this.numerator * ps.denomerator;
        int ms = this.denomerator * ps.numerator;

        Fraction diviFrac = new Fraction(ts, ms);
        diviFrac.reduceFrac();

        System.out.println("Thương 2 phân số: " + diviFrac.numerator + "/" + diviFrac.denomerator);

    }

    public boolean isreduceFrac() {
        if (USCLN(this.numerator, this.denomerator) == 1) {
            return true;
        }
        return false;
    }

    public boolean lunisolarFrac() {
        if (this.numerator / this.denomerator > 0) {
            return true;// là phân số dương
        } else
            return false;//là phân số âm

    }

    public void compareFraction(Fraction ps1) {
        double p1 = (double) this.numerator / (double) this.denomerator;
        double p2 = (double) ps1.numerator / (double) ps1.denomerator;
        if (p1 > p2) {
            System.out.println("Phân số " + this.numerator + "/" + this.denomerator + " lớn hơn " + ps1.numerator + "/" + ps1.denomerator);
        } else {
            System.out.println("Phân số " + ps1.numerator + "/" + ps1.denomerator + " lớn hơn " + this.numerator + "/" + this.denomerator);
        }
    }

}
