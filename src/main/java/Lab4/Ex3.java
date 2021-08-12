package Lab4;

public class Ex3 {
    Ex2 e = new Ex2();
    public int[] trave(int arr[]) {
        int kq[] = new int[arr.length];
        int index = 0;
        System.out.print("Số chia hết cho 4 mà không chia hết cho 5: ");
        for (int arr1 : arr) {
            if (arr1 % 4 == 0 && arr1 % 5 != 0) {
                kq[index] = arr1;
                index++;
            }
        }
        return kq;
    }

    public int sumPrimeArr(int[] arrSum) {
        int sumPrime = 0;
        for (int arr2 : arrSum) {
            if (e.isPrime(arr2)) {
                sumPrime += +arr2;
            }
        }
        return sumPrime;
    }
}
