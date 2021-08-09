package Lab3_3;

public class Ex5 {

    public int reverseNumber(int n){
        int reNum=0;
        int lastNumber;
        while (n>0){
            lastNumber=n%10;
            n/=10;
            reNum= reNum*10 + lastNumber;
        }
        return reNum;

    }


}
