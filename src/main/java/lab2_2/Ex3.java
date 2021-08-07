package lab2_2;

import java.util.Scanner;

public class Ex3 {
    int a;
    int  b;
    public  void equation1 (){
        float c=(float) (-b)/a;
        if (a==0 && b==0){
            System.out.println("Phương trình vô số nghiệm");
        }else if (a==0 && b!=0){
            System.out.println("Phương trình vô nghiệm");
        }else {
            System.out.println("Phương trình có 1 nghiệm duy nhất: "+ c);
        }

    }

    public static void main(String[] args) {
        Ex3 e3= new Ex3();
        Scanner sc= new Scanner(System.in);
        System.out.println(" Nhập hệ số a:");
         e3.a= sc.nextInt();
        System.out.println(" Nhập hệ số b:");
         e3.b= sc.nextInt();
        try {
            e3.equation1();
        }catch (Exception e){
            System.out.println("vui lòng nhập số");
            e3.equation1();
        }

    }
}
