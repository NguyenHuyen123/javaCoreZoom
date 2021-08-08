package lab2_2;

import java.util.Scanner;

public class Ex7 {
    public static void priceTaxi(){
        Scanner sc= new Scanner(System.in);
        System.out.print("Nhập Kilomet Taxi đã chở bạn: ");
       float km= sc.nextInt();
        if (km>0 &&km<=1){
            System.out.println("Số tiền phải trả là "+ km*1500+ " VNĐ");
        }else if (2<=km && km<=5){
            System.out.println( "Số tiền phải trả là "+((1*1500)+(km-2)*13500)+ " VNĐ");
        }else if(km>=6&& km<=120){
            System.out.println("Số tiền phải trả là "+((1*1500)+(5*13500)+ ((km-6)*11000))+ " VNĐ");
        }else {
            System.out.println("Số tiền phải trả là "+((1*1500)+(5*13500)+(120*11000) +(km-121)*11000*0.1)+ " VNĐ");
        }
    }

    public static void main(String[] args) {
        priceTaxi();
    }
}
