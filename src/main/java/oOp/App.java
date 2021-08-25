package oOp;

import java.util.Scanner;

public class App {
    /* Phân số
§ Khai báo kiểu dữ liệu phân số (PHANSO)
§ Nhập/Xuất phân số
§ Rút gọn phân số
§ Tính tổng, hiệu, tích, thương hai phân số
§ Kiểm tra phân số tối giản
§ Quy đồng hai phân số
§ Kiểm tra phân số âm hay dương
§ So sánh hai phân số
 */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tử số: ");
        int numera1 = sc.nextInt();
        System.out.println("Nhập mẫu số: ");
        int denom1 = sc.nextInt();
        System.out.println("Nhập tử số: ");
        int numera2 = sc.nextInt();
        System.out.println("Nhập mẫu số: ");
        int denom2 = sc.nextInt();
        Fraction fc1 = new Fraction(numera1, denom1);
        Fraction fc2 = new Fraction(numera2, denom2);
        fc1.sumFrac(fc2);
        fc1.subFrac(fc2);
        fc1.multipFrac(fc2);
        fc1.diviFrac(fc2);
        System.out.println(fc1.isreduceFrac());
        System.out.println(fc1.lunisolarFrac());
        fc1.compareFraction(fc2);
    }
}
