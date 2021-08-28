package oOp;

public class Triangle {
    private int a, b, c;

    public Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public boolean isTriang() {
        if (this.a + this.b > this.c || this.a + this.c > this.b || this.b + this.c > this.a) {
            return true;

        } else
            return false;
    }

    public int chuVi() {
        int result = 0;
        if (isTriang() == true)
            result += this.a + this.b + this.c;
        return result;
    }

    public float nuaCV() {
        float p = (float) chuVi() / 2;
        return p;
    }

    public float dienTich() {
        float dt;
        float p = nuaCV();
        dt = (float) Math.sqrt(p * (p - this.a) * (p - this.b) * (p - this.c));
        return dt;

    }

}
