package Lab3_3;

public class Ex2e {
    public long sumFactorial( int n){
        Ex2d fac= new Ex2d();
        long sum=0;
        for (int i = 1; i <=n ; i++)
            sum+=fac.factorial(i);
            return  sum;

    }
}
