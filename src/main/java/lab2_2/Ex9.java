package lab2_2;

import java.util.Scanner;

public class Ex9 {
    public static void isTriangle(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Nhập cạnh a");
        int a= sc.nextInt();
        System.out.println("Nhập cạnh b");
        int b= sc.nextInt();
        System.out.println("Nhập cạnh c");
        int c= sc.nextInt();
        if (a+b>c|| a+c>b || b+c>a){
            System.out.print("Đây là một tam giác");
        }
        if (a==b && b==c&& c==a){
            System.out.println(" và là tam giác đều");

        }else if ((a==b)|| (b==c) || (c==a)){
            System.out.println(" và là tam giác cân");

        }else  if ((b*b== a*a+ c*c) || (b*b+ a*a==c*c)|| (b*b+ c*c== a*a)){
            System.out.println(" và là tam giác vuông");
        }else {
            System.out.println("Đây không phải tam giác");
        }

    }

    public static void main(String[] args) {
        isTriangle();
    }
}
