package Lab2_3;

import java.util.Scanner;

public class Ex1 {
    public void isleapyear(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Nhập năm để kiểm tra ");
        int year=sc.nextInt();
        if((year%400==0) || (year%4==0 && year%100!=0)){
            System.out.println("Là năm nhuận");
        }else {
            System.out.println("không nhuận");
        }
    }

    public static void main(String[] args) {
        Ex1 e1= new Ex1();
        e1.isleapyear();
    }
}
