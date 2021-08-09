package Lab3_3;

public class Ex1b {
    public boolean isPerfectSquare (double n){
        double sq= Math.sqrt(n);
        double kq= sq-Math.floor(sq);
        if (kq==0){
            return true;
        }
        else {
            return false;
        }
    }
}
