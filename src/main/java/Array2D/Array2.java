package Array2D;

public class Array2 {
    public static int sumArray2D(int[][] a) {
        int s = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                s += a[i][j];
            }
        }
        return s;

    }

    //=======Bài 2======
//kiểm tra số nguyên tố
    public static boolean isPrimeNumber(int n) {

        if (n < 2) {
            return false;
        }
        int prime = (int) Math.sqrt(n);
        for (int i = 2; i <= prime; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    //kiểm tra toàn mảng có phải số nguyên tố hay không?
    public static boolean isPrimeArr2D(int[][] a) {
        for (int[] x : a) {
            for (int y : x) {
                if (!isPrimeNumber(y)) {
                    return false;
                }
            }
        }
        return true;
    }

    //========Bài 1======
    public boolean findX(int[][] arr, int a) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (a == arr[i][j]) {
                    return true;

                }

            }
        }
        return false;
    }

    //=== Bài 3===
    public int max(int[][] arr) {
        int max = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr[0].length; j++) {
                if (max < arr[i][j])
                    max = arr[i][j];
            }
        }
        return max;
    }

    /*
   Ma trận a, kích thước m x n. Tính tổng các phần tử trên:
   a. Dòng d, cột c
   b. Đường chéo chính, đường chéo phụ (ma trận vuông)
   c. Nửa trên/dưới đường chéo chính (ma trận vuông)
   d. Nửa trên/dưới đường chéo phụ (ma trận vuông)
    */
    //b:
    public static int mainDiagonal(int arr[][]) {

        int sum = 0;
        if (arr.length != arr[0].length) {
            System.out.println("Không phải là ma trận vuông");
            return 0;
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (i == j) {
                    sum += arr[i][j];
                }
            }
        }
        return sum;
    }

    //
    public static int seDiagonal(int arr[][]) {
        int sum = 0;
        if (arr.length != arr[0].length) {
            System.out.println("Không phải là ma trận vuông");
            return 0;
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (i + j == arr.length - 1) {
                    sum += arr[i][j];
                }
            }
        }
        return sum;
    }

    //c:
    public int halfUpperMainDiagonal(int arr[][]) {
        int sumHalUppderfMatrix = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr[0].length; j++) {
                sumHalUppderfMatrix += arr[i][j];

            }
        }
        return sumHalUppderfMatrix;

    }

    public int halfUnderMainDiagonal(int arr[][]) {
        int sumHalUnderfMatrix = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                sumHalUnderfMatrix += arr[i][j];
            }
        }
        return sumHalUnderfMatrix;

    }

    //d:nữa trên phụ
    public int halfUpperSeDiagonal(int arr[][]) {
        int sumHalUpperfMatrix = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length - 1; j++) {
                sumHalUpperfMatrix += arr[i][j];
            }
        }
        return sumHalUpperfMatrix;

    }

    //d:nữa dưới phụ
    public int halfUnderSeDiagonal(int arr[][]) {
        int sumHalUnderfMatrix = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                sumHalUnderfMatrix += arr[i][j];

            }
        }
        return sumHalUnderfMatrix;

    }

    //a:

    public static int sumRow(int arr[][], int a) {
        int sumRow = 0;
        for (int i = 0; i < arr.length; i++) {
            sumRow += arr[a][i];
        }
        return sumRow;
    }

    public static int sumCol(int arr[][], int b) {
        int sumCol = 0;
        for (int i = 0; i < arr.length; i++) {

            sumCol += arr[i][b];

        }
        return sumCol;
    }

    public static int sumRC(int arr[][], int a, int b) {
        int sum = 0;
        sum = sumRow(arr, a) + sumCol(arr, b) - arr[a][b];
        return sum;
    }

}

