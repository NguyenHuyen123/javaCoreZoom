package lab2_2;

import java.util.Scanner;

public class Ex5 {
    static int a, b, c, d;
    public static int minNumber() {
        if (a < b && a < c && a < d) {
            return a;
        } else if (b < a && b < c && b < d) {
            return b;
        } else if (c < b && c < a && c < d) {
            return c;
        }else {
            return d;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Nhập lần lượt số nguyên 1");
        a = sc.nextInt();
        System.out.println(" Nhập lần lượt số nguyên 2");
        b = sc.nextInt();
        System.out.println(" Nhập lần lượt số nguyên 3");
        c = sc.nextInt();
        System.out.println(" Nhập lần lượt số nguyên 4");
        d = sc.nextInt();
        try {
            System.out.println("Số nhỏ nhất là: " + minNumber());
        } catch (Exception e) {
            System.out.println(" Vui lòng lại nhập số");
            System.out.println(minNumber());
        }
    }
}

