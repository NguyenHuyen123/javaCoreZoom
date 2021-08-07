package lab2_2;

import java.util.Scanner;

public class Ex8 {
    static  int month;
    public static  void mmyyyy(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Nhập tháng:");
        month= sc.nextInt();
        switch (month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println( month+ " có 31 ngày");

            case 4:
            case 6:
            case 9:
            case 11:

                System.out.println( month+ " có 30 ngày");
                break;
            case 2:
                int year;
                System.out.println("Nhập năm: ");
                year=sc.nextInt();
                if((year%400==0) || (year%4==0 && year%100!=0)){
                    System.out.println("Tháng"+ month+ ", năm "+ year + " có 29 ngày");

                }else {
                    System.out.println("Tháng"+ month+ ", năm "+ year + " có 28 ngày");
                }
        }

    }

    public static void main(String[] args) {
        mmyyyy();
    }
}
