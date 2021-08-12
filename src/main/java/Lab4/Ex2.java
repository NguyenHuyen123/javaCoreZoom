package Lab4;

public class Ex2 {
    // kiểm tra số nguyên tố
    public boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    //b-kiểm tra mảng toàn số nguyên tố
    public boolean isAllPrime ( int []arr){
        for (int arr1:arr) {
            if (!isPrime(arr1)){
                return false;
            }

        }
        return true;
    }
    // c- kiểm tra mảng tăng dần
    public boolean arrAscending (int []a){
        for(int i=0;i<a.length-1;i++)
            if(a[i]>a[i+1]){
                return false;
            }
        return true;
    }
}

