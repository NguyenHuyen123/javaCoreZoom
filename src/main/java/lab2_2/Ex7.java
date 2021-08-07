package lab2_2;

import java.util.Scanner;

public class Ex7 {
    public static void priceTaxi(){
        Scanner sc= new Scanner(System.in);
        System.out.print("Nhập Kilomet Taxi đã chở bạn: ");
       float km= sc.nextInt();
        if (km<=1){
            System.out.println("Số tiền phải trả là "+ km*1500+ " VNĐ");
        }else if (2<=km && km<=5){
            System.out.println("Số tiền phải trả là "+ km*13500+ " VNĐ");
        }else if(km>=6&& km<=120){
            System.out.println("Số tiền phải trả là "+ km*11000+ " VNĐ");
        }else {
            System.out.println("Số tiền phải trả là "+ km*11000*0.1+ " VNĐ");
        }
    }

    public static void main(String[] args) {
        priceTaxi();
    }
}
