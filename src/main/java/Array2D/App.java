package Array2D;

public class App {
    public static void main(String[] args) {
        Array2 e = new Array2();
        int[][] arr = {{7, 5, 3},
                    {4, 13, 2},
                     {5, 6, 11}};
        System.out.println(e.sumArray2D(arr));
        System.out.println("1-Giá trị x có trong mảng không? " + e.findX(arr, 12));
        System.out.println("2-Mảng có phải toàn số nguyên tố: " + e.isPrimeArr2D(arr));
        System.out.println("3-Số lớn nhất trong Matrix: " + e.max(arr));
        System.out.println("4b- Tổng đường chéo chính: " + e.mainDiagonal(arr));
        System.out.println("4b- Tổng đường chéo phụ: " + e.seDiagonal(arr));
        System.out.println("4c- Tổng nữa trên D/c Chính: " + e.halfUpperMainDiagonal(arr));
        System.out.println("4c- Tổng nữa dưới D/c Chính: " + e.halfUnderMainDiagonal(arr));
        //System.out.println("4d-Tổng nữa trên Đ/c phụ: "+ e.halfUpperSeDiagonal(arr));
        System.out.println("4d-Tổng nữa dưới Đ/c phụ: "+ e.halfUnderSeDiagonal(arr));
        System.out.println("------"+ e.sumRow(arr,1));
        System.out.println("======"+ e.sumCol(arr, 2));
        System.out.println("4a- Tống cột và dòng: "+ e.sumRC(arr,1,2));


    }
}
