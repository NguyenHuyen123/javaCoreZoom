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

        System.out.print("Nhập tử số: ");
        int numera1 = sc.nextInt();
        System.out.print("Nhập mẫu số: ");
        int denom1 = sc.nextInt();
        System.out.print("Nhập tử số: ");
        int numera2 = sc.nextInt();
        System.out.print("Nhập mẫu số: ");
        int denom2 = sc.nextInt();
        Fraction fc1 = new Fraction(numera1, denom1);
        Fraction fc2 = new Fraction(numera2, denom2);
        fc1.print();
        fc2.print();
        fc1.sumFrac(fc2);
        fc1.subFrac(fc2);
        fc1.multipFrac(fc2);
        fc1.diviFrac(fc2);
        System.out.println(fc1.isreduceFrac());
        System.out.println(fc1.lunisolarFrac());
        fc1.compareFraction(fc2);



        /*Tam giác
        //§ Khai báo kiểu dữ lịêu tam giác (TAMGIAC)
        //§ Nhập/Xuất tam giác
        //§ Tính chu vi, diện tích tam giác

         */

        System.out.println("====Tính chu vi , diện tách tam giác");
        System.out.println("Nhập canh a");
        int a = sc.nextInt();
        System.out.println("Nhập canh b");
        int b = sc.nextInt();
        System.out.println("Nhập canh c");
        int c = sc.nextInt();
        Triangle t = new Triangle(a, b, c);
        System.out.println("Chu vi tam giác là: " + t.chuVi());
        System.out.println("Diện tích tam giác:" + t.dienTich());
        /*Tam giác
       Điểm trong mặt phẳng Oxy
       Khai báo kiểu dữ liệu điểm (DIEM)
       Nhập/Xuất tọa độ điểm
       Tính khoảng cách giữa hai điểm
       Tìm điểm đối xứng qua gốc toạ độ/trục Ox/Oy
§      Kiểm tra điểm thuộc phần tư nào?
         */

        System.out.println("Nhập tọa độ x:");
        int x1 = sc.nextInt();
        System.out.println("Nhập tọa độ y");
        int y1 = sc.nextInt();
        System.out.println("Nhập tọa độ x:");
        int x2 = sc.nextInt();
        System.out.println("Nhập tọa độ y");
        int y2 = sc.nextInt();
        Oxy oxy1 = new Oxy(x1, y1);
        Oxy oxy2 = new Oxy(x2, y2);
        if (oxy1.isOrigin() == true) {
            System.out.println("Là gốc tọa độ");
        } else
            System.out.println("Khoảng cách giữa 2 điểm :" + oxy1.distance(oxy2));
        //
        oxy1.symmetryOx();
        oxy1.symmetryOy();
        oxy1.symmetryO();
        oxy1.quarterOxy();
    }

}
