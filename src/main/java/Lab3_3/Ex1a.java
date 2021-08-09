package Lab3_3;

public class Ex1a {
    public boolean isSymmetryNumber(int n){
//        int reverse= 0;
        int remainder;
       remainder=n;
//        while (n!=0){
//            remainder= n%10;
//            reverse= reverse*10+ remainder;
//            n/=10;
//        }
        Ex5 e5= new Ex5();
        if (remainder==e5.reverseNumber(n)){
            return true;
        }else {
            return false;
        }
   }



}
