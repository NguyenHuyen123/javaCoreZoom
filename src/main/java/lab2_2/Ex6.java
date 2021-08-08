package lab2_2;

import java.util.Scanner;

public class Ex6 {
    public static void sort (){
        Scanner sc= new Scanner(System.in);
        System.out.println("Nhập số nguyên a");
        int a= sc.nextInt();
        System.out.println("Nhập số nguyên b");
        int b= sc.nextInt();
        System.out.println("Nhập số nguyên c");
        int c= sc.nextInt();
        System.out.println("Nhập số nguyên d");
        int d= sc.nextInt();
        if(a<b && a<c&& a<d){
            System.out.print("Tăng dần: "+ a);
            if (b<c && b<d){
                System.out.print(b);
            }else  if (c<d){
                System.out.print(c);
            }else System.out.println(d);
            //
            if (c<d && c<b){
                System.out.println(c);
            }else if (b<d){
                System.out.println(b);

            }else System.out.println(d);
            if (d<c && b<c){
                System.out.println(d);
            }else if (b<c){
                System.out.println(b);

            }

        }else if (b<a && b<c && b<d){
            System.out.print(b);

        }else if (c<a && c<b && c<d){
            System.out.print(c);

        }else if ( d<a && d<b && d<c){
            System.out.print(d);
        }


    }

    public static void main(String[] args) {
        sort();
    }
}
