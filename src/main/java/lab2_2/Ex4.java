package lab2_2;

import java.util.Scanner;

public class Ex4 {
    public static void equation2() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập hệ số a");
        int a = sc.nextInt();
        System.out.println("Nhập hệ số b");
        int b = sc.nextInt();
        System.out.println("Nhập hệ số c");
        int c = sc.nextInt();
        double delta=(b*b)-(4*a*c);
        double x1= (-b-Math.sqrt(delta))/2*a;
        double x2= (-b+Math.sqrt(delta))/2*a;
        double x3= -b/2*a;

        if( a!=0 && delta>0){
            System.out.println("Phương trình có 2 nghiệm"+ "x1= "+ x1+", x2 "+ x2);
        }else if(a!=0&& delta==0){
            System.out.println("Phương trình có 1 nghiệm"+ "x= "+ x3);

        }else if(a!=0&& delta<0){
            System.out.println("Phương trình vô nghiệm");
        }

    }

    public static void main(String[] args) {
        try {
            equation2();
        } catch (Exception e) {
            System.out.println("Vui lòng nhập số ");
            equation2();
        }
    }
}
