package Lab3_3;

public class Ex1a {
    public int reverseNumber1(int n){
        int reNum=0;
        int lastNumber;
        while (n>0){
            lastNumber=n%10;
            n/=10;
            reNum= reNum*10 + lastNumber;
        }
        return reNum;

    }
    public boolean isSymmetryNumber(int n){
        int remainder;
       remainder=n;
        if (remainder==reverseNumber1(n)){
            return true;
        }else {
            return false;
        }
   }



}
