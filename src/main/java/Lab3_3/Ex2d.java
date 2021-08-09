package Lab3_3;

public class Ex2d {
    public long factorial( int n){
        long factorial=1;
        if( n==0||n==1){
            return factorial;
        }else {
            for (int i = 2; i <=n ; i++) {
                factorial *=i;
            }
            return factorial;
        }
    }

}
