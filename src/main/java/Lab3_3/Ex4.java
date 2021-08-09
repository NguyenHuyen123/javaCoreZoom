package Lab3_3;

public class Ex4 {
    public boolean isPrimeNumber(int n){

        if (n==0 || n==1){
            return false;
        }
       int prime= (int)Math.sqrt(n);
        for (int i = 2; i <=prime ; i++) {
            if (n%i==0){
                return  false;
            }
        }
        return  true;
    }
    public long sumPrimeNumber(){
        long sumPrime=0;
        for (int i =0; i <50 ; i++)
            if (isPrimeNumber(i)){
                sumPrime+=+i;
            }
        return sumPrime;
    }
}
