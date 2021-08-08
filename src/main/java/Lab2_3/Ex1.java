package Lab2_3;

import java.util.Scanner;

public class Ex1 {
    public boolean isLeapYear(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Nhập năm để kiểm tra ");
        int year=sc.nextInt();
        if((year%400==0) || (year%4==0 && year%100!=0)){
            return true;
        }else {
            return  false;
        }
    }

    public static void main(String[] args) {
        Ex1 e1= new Ex1();
        System.out.println(e1.isLeapYear());
    }
}
